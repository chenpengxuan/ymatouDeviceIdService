
package com.ymatou.deviceid.facade.model.req;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import com.ymatou.deviceid.facade.model.enums.OrderDateEnum;
import com.ymatou.deviceid.facade.model.vo.PackageDeliveryDomesticStatusFilter;

import java.util.Date;
import java.util.HashMap;
import java.util.List;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class ExistsSellerOrderListReq extends BaseRequest {


    /**
     * 卖家id
     */
    private int sellerId;



    /**
     * 是否为闪购订单
     */
    private Boolean isShangouOrder;



    /**
     * 交易状态列表
     */
    private List<Integer> orderStatusList;



    /**
     * 订单创建日期查询的开始日期
     */
    private Date beginTime;



    /**
     * 订单创建日期查询的结束日期
     */
    private Date endTime;



    /**
     * 物流类型列表
     */
    private List<Integer> logisticsTypeList;



    /**
     * 订单类型列表
     */
    private List<Integer> orderTypeList;



    /**
     * 订单日期
     */
    private OrderDateEnum orderDateEnum;



    /**
     * 查询关键字
     */
    private String searchKeyWord;



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
	*注意:
	*1.仅在做拼邮筛选时才需要赋值.
	*2.PackageDeliveryDomesticStatusFilter.DomesticUndelivered=false(默认)andPackageDeliveryDomesticStatusFilter.DomesticDelivered=false(默认)表示排除拼邮订单
     */
    private PackageDeliveryDomesticStatusFilter packageDeliveryDomesticStatusFilter;




}

