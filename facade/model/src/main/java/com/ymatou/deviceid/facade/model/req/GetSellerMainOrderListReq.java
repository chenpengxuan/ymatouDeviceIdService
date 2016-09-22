
package com.ymatou.deviceid.facade.model.req;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.ymatou.deviceid.facade.model.vo.PackageDeliveryDomesticStatusFilter;

import java.util.Date;
import java.util.HashMap;
import java.util.List;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetSellerMainOrderListReq extends BaseRequest {


    /**
     * 卖家ID
     */
    private int sellerId;


    /**
     * 主订单号
     */
    private Integer mainOrderId;


    /**
     * 订单号
     */
    private Integer orderId;


    /**
     * 买家昵称
     */
    private String buyerNickName;


    /**
     * 商品名称
     */
    private String productName;


    /**
     * 是否闪购订单这里只是为了兼容性暂时保留原因为商家后台处订单维度重新定义为商品订单和代购扫货订单后期要去除cpx2014年10月11日
     */
    private Boolean isShangouOrder;


    /**
     * 是否已全额付款
     */
    private Boolean isPaidInFull;


    /**
     * 订单状态列表
     */
    private List<Integer> orderStatusList;


    /**
     * 下单开始时间
     */
    private Date addBeginTime;


    /**
     * 下单结束时间
     */
    private Date addEndTime;


    /**
     * 付款开始时间
     */
    private Date paidBeginTime;


    /**
     * 付款结束时间
     */
    private Date paidEndTime;


    /**
     * 当前页码
     */
    private int currentPageNum;


    /**
     * 每页行数
     */
    private int pageSize;


    /**
     * 物流类型列表
     */
    private List<Integer> logisticsTypeList;


    /**
     * 订单类型列表
     */
    private List<Integer> orderTypeList;


    /**
     * 订单状态对应的超时时间
     */
    private HashMap<Integer,String> overTimeLimitDic;


    /**
     * 仅查询退货退款的订单
     */
    private boolean salesRefundOrderOnly;


    /**
     * 海外已发货后的拼邮商品在国内的配送状态筛选
	 * 注意:
	 * 1.仅在做拼邮筛选时才需要赋值.
	 * 2.PackageDeliveryDomesticStatusFilter.DomesticUndelivered=false(默认)andPackageDeliveryDomesticStatusFilter.DomesticDelivered=false(默认)表示排除拼邮订单
     */
    private PackageDeliveryDomesticStatusFilter packageDeliveryDomesticStatusFilter;


    /**
     * 备注等级
     */
    private Integer remarkLevel;



}

