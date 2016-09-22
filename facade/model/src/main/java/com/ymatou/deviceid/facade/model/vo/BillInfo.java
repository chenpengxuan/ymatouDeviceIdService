
package com.ymatou.deviceid.facade.model.vo;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */




/**
 * @author zhangyifan 2016/9/1 12:00
 */


import java.util.Date;
import java.math.BigDecimal;

import com.ymatou.deviceid.facade.model.PrintFriendliness;

public class BillInfo extends PrintFriendliness {


    /**
     * 运单小票
     */
    private String smallTicket;


    /**
     * 货站id
     */
    private int logisticId;


    /**
     * 签收货站id
     */
    private int signLogisticId;


    /**
     * 货运服务类型对应TranportServiceType枚举（码头这边为冗余的值，具体类型以xlobo那边的为准）
     */
    private int transportServiceType;


    /**
     * 货站打包服务费
     */
    private BigDecimal serviceCost;


    /**
     * 身份证check日期
     */
    private Date matchIdPicTime;


    /**
     * 运单是否被下载
     */
    private boolean downloaded;


    /**
     * 运单id
     */
    private String billId;


    /**
     * 运单code
     */
    private String billCode;


    /**
     * 物流商
     */
    private String billSupplier;


    /**
     * 发货人用户id
     */
    private Integer fromUserId;


    /**
     * 接收人用户id
     */
    private Integer toUserId;


    /**
     * 物流类型
     */
    private int logisticsStatu;


    /**
     * 运单价格
     */
    private BigDecimal billFee;


    /**
     * 申报货品重量
     */
    private BigDecimal declareWeight;


    /**
     * 申报价格
     */
    private BigDecimal declarePrice;


    /**
     * 重量变更状态
     */
    private int weightChargeStatu;


    /**
     * 重量运费
     */
    private BigDecimal weightFee;


    /**
     * 关税变更状态
     */
    private int txtChargeStatu;


    /**
     * 关税
     */
    private BigDecimal txtFee;


    /**
     * 实际重量
     */
    private BigDecimal realWeight;


    /**
     * 中转站
     */
    private String transferCenter;


    /**
     * 运单url
     */
    private String billUrl;


    /**
     * 保险费率
     */
    private BigDecimal insure;


    /**
     * 发货人地址
     */
    private String senderAddress;


    /**
     * 发货人姓名
     */
    private String senderName;


    /**
     * 发货人手机
     */
    private String senderPhone;


    /**
     * 收货人地址
     */
    private String receiveAddress;


    /**
     * 收货人所在城市
     */
    private String receiveCity;


    /**
     * 收货人所在省份
     */
    private String receiveProvince;


    /**
     * 收货人所在区
     */
    private String receiveRegion;


    /**
     * 收货人email
     */
    private String receiveEmail;


    /**
     * 收货人姓名
     */
    private String receiveName;


    /**
     * 收货人手机
     */
    private String receivePhone;


    /**
     * 收货地邮编
     */
    private String receivePostcode;


    /**
     * 运单创建日期
     */
    private Date addTime;


    /**
     * 运单状态
     */
    private int action;


    /**
     * 货物名称
     */
    private String goodName;


    /**
     * 运单删除原因
     */
    private String delReason;


    /**
     * 运单拒绝原因
     */
    private String declineReason;


    /**
     * 口岸编号
     */
    private String transPortNo;


    /**
     * 贝海称重后通知给码头的时间
     */
    private Date weightNotifyDateTime;


    /**
     * 身份证照片url
     */
    private String idCardPic;



}

