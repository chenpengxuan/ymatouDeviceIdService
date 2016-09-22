/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */

package com.ymatou.deviceid.util;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.ymatou.deviceid.facade.model.enums.*;
import com.ymatou.deviceid.facade.model.vo.ProductPromotion;
import com.ymatou.deviceid.infrastructure.Utils;
import com.ymatou.deviceid.infrastructure.config.BizConfig;
import com.ymatou.deviceid.infrastructure.db.model.OrderInfoPo;
import com.ymatou.deviceid.infrastructure.db.model.OrderPostPayPo;
import com.ymatou.deviceid.infrastructure.db.model.OrderStatePo;
import com.ymatou.deviceid.infrastructure.db.model.OrdersPo;
import com.ymatou.deviceid.infrastructure.db.model.ext.OrderInfoExtPo;
import com.ymatou.deviceid.infrastructure.util.SpringContextHolder;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author luoshiqian 2016/9/6 13:56
 */
public class OrderHelper {

    public static List<OrderStatusEnum> orderAvailiableStatusWithoutOrderEstablish = Lists.newArrayList(
            OrderStatusEnum.ACCOUNT_PAID, OrderStatusEnum.SHIPPED, OrderStatusEnum.RECEIVED,
            OrderStatusEnum.SELLER_ACCEPT, OrderStatusEnum.APPLY_FOR_POSTPAY);

    public static List<OrderStatusEnum> orderAvailiableStatus = Lists.newArrayList(OrderStatusEnum.ORDER_ESTABLISH);

    /**
     * @param originStatusList
     * @param autoFillIfEmpty
     * @return key: paidInfull Boolean
     * statusList List<Integer>
     */
    public static Map<String, Object> getSellerOrderStatus(List<Integer> originStatusList, boolean autoFillIfEmpty) {
        Boolean paidInfull = null;
        Map<String, Object> result = Maps.newHashMap();
        result.put("paidInfull", null);
        result.put("statusList", originStatusList);
        List<Integer> statusList;
        if (CollectionUtils.isEmpty(originStatusList)) {
            if (autoFillIfEmpty) {
                statusList = orderAvailiableStatus.stream().map(OrderStatusEnum::getCode).collect(Collectors.toList());
            } else {
                return result;
            }
        } else {
            statusList = originStatusList;
        }

        //只要补款完成不要等待发起补款
        if (statusList.contains(OrderStatusEnum.SELLER_ACCEPT.getCode()) && !statusList.contains(OrderStatusEnum.ORDER_POST_PAY)) {
            statusList.remove((Integer) OrderStatusEnum.SELLER_ACCEPT.getCode());
            paidInfull = true;
            result.put("paidInfull", paidInfull);
        }

        //只要等待发起补款不要补款完成
        if (!statusList.contains(OrderStatusEnum.SELLER_ACCEPT.getCode()) && statusList.contains(OrderStatusEnum.ORDER_POST_PAY)) {
            statusList.remove((Integer) OrderStatusEnum.ORDER_POST_PAY.getCode());
            paidInfull = false;
            result.put("paidInfull", paidInfull);
        }

        return result;

    }

    /**
     * 计算优惠券总金额
     *
     * @param ymtCouponAmount
     * @param sellerCouponAmount
     * @return
     */
    public static BigDecimal getTotalAmountOfCoupon(BigDecimal ymtCouponAmount, BigDecimal sellerCouponAmount) {
        BigDecimal ymtAmount = Utils.zeroIfNull(ymtCouponAmount);
        BigDecimal sellerAmount = Utils.zeroIfNull(sellerCouponAmount);
        return ymtAmount.add(sellerAmount);
    }

    /**
     * 订单付款（预付款）时，应付的现金金额
     *
     * @param ordersPo
     * @return
     */
    public static BigDecimal getNeedPrePayAmountOfCash(OrdersPo ordersPo) {

        //订单应付金额 = 金额(M全款C定金,补款不再调整) + 调整金额 + 运费 - 红包抵扣金额 - 优惠券金额 - 商家优惠
        BigDecimal amount = Utils.zeroIfNull(ordersPo.getOrderPrice())
                .add(Utils.zeroIfNull(ordersPo.getOrderDiscount()))
                .add(Utils.zeroIfNull(ordersPo.getFreight()))
                .subtract(getTotalAmountOfCoupon(ordersPo.getYmtCouponAmount(), ordersPo.getSellerCouponAmount()))
                .subtract(Utils.zeroIfNull(ordersPo.getUseGiftAmount()))
                .subtract(Utils.zeroIfNull(ordersPo.getSellerPromotionAmount()));

        return amount;
    }

    public static BigDecimal getTotalAmountOfCoupon(OrderStatePo os) {
        return Utils.zeroIfNull(os.getPaidAmountOfYmtCoupon())
                .add(Utils.zeroIfNull(os.getPaidAmountOfSellerCoupon()))
                .subtract(Utils.zeroIfNull(os.getRefundedAmountOfCoupon()));
    }

    //获取订单中支付的现金金额
    public static BigDecimal getAmountOfCash(OrderStatePo os) {
        return os.getPaidAmountOfCash().add(os.getPostPaidAmountOfCash()).subtract(os.getRefundedAmountOfCash());
    }

    //获取订单中支付的红包金额
    public static BigDecimal getAmountOfGift(OrderStatePo os) {
        return os.getPaidAmountOfGift().add(os.getPostPaidAmountOfGift()).subtract(os.getRefundedAmountOfGift());
    }

    //获取订单当前金额
    public static BigDecimal getOrderCurrentAmount(OrderStatePo os) {
        return getAmountOfCash(os).add(getAmountOfGift(os)).add(getTotalAmountOfCoupon(os))
                .add(Utils.zeroIfNull(os.getPaidAmountOfFreeCard()));
    }

    //获取退款总金额

    public static BigDecimal getRefundedAmount(OrderStatePo statePo) {
        if (statePo == null) {
            return BigDecimal.ZERO;
        }
        return Utils.zeroIfNull(statePo.getRefundedAmountOfCash()).add(
                Utils.zeroIfNull(statePo.getRefundedAmountOfGift())).add(
                Utils.zeroIfNull(statePo.getRefundedAmountOfCoupon()));
    }

    public static BigDecimal getPrePaidAmount(OrderStatePo statePo) {
        if (statePo == null) {
            return BigDecimal.ZERO;
        }
        return Utils.zeroIfNull(statePo.getPaidAmountOfCash()).add(
                Utils.zeroIfNull(statePo.getPaidAmountOfGift())).add(
                Utils.zeroIfNull(statePo.getPaidAmountOfFreeCard())).add(
                (BigDecimalUtil.isBiggerThanZero(statePo.getPaidAmountOfYmtCoupon()) || BigDecimalUtil.isBiggerThanZero(statePo.getPaidAmountOfSellerCoupon()))
                        ? (Utils.zeroIfNull(statePo.getPaidAmountOfYmtCoupon()).add(Utils.zeroIfNull(statePo.getPaidAmountOfSellerCoupon())))
                        : Utils.zeroIfNull(statePo.getPaidAmountOfCoupon()));
    }

    public static BigDecimal getPostPaidAmount(OrderStatePo statePo) {
        if (statePo == null) {
            return BigDecimal.ZERO;
        }
        return Utils.zeroIfNull(statePo.getPostPaidAmountOfCash()).add(
                Utils.zeroIfNull(statePo.getPostPaidAmountOfGift())).add(
                Utils.zeroIfNull(statePo.getPostPadiAmountOfCoupon()));
    }

    public static BigDecimal getAmountOfRealPay(OrderStatePo statePo) {
        if (statePo == null) {
            return BigDecimal.ZERO;
        }
        return Utils.zeroIfNull(getPrePaidAmount(statePo)).add(
                Utils.zeroIfNull(getPostPaidAmount(statePo))).subtract(
                Utils.zeroIfNull(getRefundedAmount(statePo)));
    }

    public static BigDecimal getCashAmountOfRealPay(OrderStatePo statePo) {
        if (statePo == null) {
            return BigDecimal.ZERO;
        }
        return Utils.zeroIfNull(statePo.getPaidAmountOfCash()).add(
                Utils.zeroIfNull(statePo.getPostPaidAmountOfCash())).subtract(
                Utils.zeroIfNull(statePo.getRefundedAmountOfCash()));
    }

    public static BigDecimal getGiftAmountOfRealPay(OrderStatePo statePo) {
        if (statePo == null) {
            return BigDecimal.ZERO;
        }
        return Utils.zeroIfNull(statePo.getPaidAmountOfGift()).add(
                Utils.zeroIfNull(statePo.getPostPaidAmountOfGift())).subtract(
                Utils.zeroIfNull(statePo.getRefundedAmountOfGift()));
    }

    public static BigDecimal getNeedPostPayAmount(List<OrderPostPayPo> postPayPos) {
        if (postPayPos == null) {
            return BigDecimal.ZERO;
        }
        OrderPostPayPo po = postPayPos.stream()
                .filter(o -> Utils.zeroIfNull(o.getAction()) == PostPayEnum.APPLYING.getCode())
                .findFirst().orElse(null);
        return po == null ? BigDecimal.ZERO : Utils.zeroIfNull(po.getAmount()).subtract(Utils.zeroIfNull(po.getUseGiftAmount()));
    }

    public static BigDecimal getDiscount(OrdersPo order, List<OrderPostPayPo> postPayPos) {
        BigDecimal discount = BigDecimal.ZERO;
        if (order.getPaidInFull()) {
            discount = order.getDiscount();
        } else {
            BigDecimal postAmount = null;
            if (postPayPos != null) {
                OrderPostPayPo po = postPayPos.stream()
                        .filter(o -> Utils.zeroIfNull(o.getAction()) == PostPayEnum.APPLYING.getCode())
                        .findFirst().orElse(null);
                if (po != null) {
                    postAmount = po.getAmount();
                }
            }
            if (postAmount != null) {
                discount = Utils.zeroIfNull(order.getOrderPrice()).add(
                        postAmount).subtract(
                        order.getTotalPrice());
            }
        }
        return Utils.zeroIfNull(order.getOrderDiscount()).add(discount);
    }

    /**
     * 获取自动确认收货日期
     *
     * @param orderInfoPo
     * @return
     */
    public static int getAutoReceiveDay(OrderInfoPo orderInfoPo) {
       return 0;
    }

    public static PlatformEnum getPlatformEnumInfo(OrderTypeEnum orderType, String orderSource) {
        String source = orderSource == null ? "" : orderSource.toUpperCase();

        switch (orderType) {
            case FullPay:  //M2C订单
                switch (source) {
                    case "APP":
                        return PlatformEnum.Ymt_APP;
                    case "PC":
                        return PlatformEnum.Ymt_PC;
                    case "WAP":
                        return PlatformEnum.Ymt_WAP;
                    case "C2CAPP":
                        return PlatformEnum.Ymt_C2CAPP;
                    case "C2CWAP":
                        return PlatformEnum.Ymt_C2CWAP;
                    case "C2CWechat":
                        return PlatformEnum.Ymt_C2CWechat;
                    case "Wechat":
                        return PlatformEnum.Ymt_Wechat;
                    default:
                        return PlatformEnum.Ymt_Other;
                }
            case AdvAndRestPay:    //C2C订单
                switch (source) {
                    case "APP":
                        return PlatformEnum.Shangou_APP;
                    case "WAP":
                        return PlatformEnum.Shangou_WAP;
                    case "PC":
                        return PlatformEnum.Shangou_PC;
                    case "Wechat":
                        return PlatformEnum.Shangou_Wechat;
                    default:
                        return PlatformEnum.Shangou_Other;
                }
        }

        return PlatformEnum.Unknown;
    }


    public static ProductPromotion getProductPromotionFromOrderInfoExtPo(OrderInfoExtPo o) {
        ProductPromotion p = null;
        if (o != null && o.getPromotionId() != null && o.getPromotionId() > 0L) {
            p = new ProductPromotion();
            p.setCondition(o.getMatchCondition());
            p.setiD(o.getPromotionId());
            p.setName(o.getPromotionName());
            p.setReducedAmount(o.getReducedAmount());
            p.setType(o.getPromotionType());
            p.setContent(o.getPromotionValue());
            p.setPartialReducedAmount(o.getSellerPromotionAmount());
        }
        return p;
    }
}
