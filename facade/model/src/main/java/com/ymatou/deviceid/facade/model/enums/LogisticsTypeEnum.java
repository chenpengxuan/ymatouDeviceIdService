
package com.ymatou.deviceid.facade.model.enums;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */




/**
 * @author zhangyifan 2016/9/1 12:00
 */


public enum LogisticsTypeEnum {


    /**
     * 未知
     */
    Unknown (0),


    /**
     * 国内快递.由国内第三方物流公司配送
     */
    China (1),


    /**
     * 直邮.由非官方认证的第三方国际物流公司进行承运，从海外空运并清关后完成配送
     */
    US (2),


    /**
     * 贝海直邮.由洋码头官方物流贝海国际速递承运，从海外空运并清关后完成配送
     */
    SailProtect (3),


    /**
     * 卖家保税.由非官方认证的第三方国际物流公司进行承运，从国内保税仓发货并清关后完成配送
     */
    BondedDelivery (4),


    /**
     * 贝海保税.由洋码头官方物流贝海国际速递进行承运，从国内保税仓发货并清关后完成配送
     */
    XloboBondedDelivery (5),


    /**
     * 认证直邮.由洋码头官方认证的第三方国际物流公司进行承运，从海外空运并清关后完成配送
     */
    AuthenticatedDirectDelivery (6),


    /**
     * 拼邮.卖家集货后由非官方认证的第三方国际物流公司承运，头程从海外空运并清关后，再在国内分包由国内快递完成二程配送
     */
    PackageDelivery (7),


    ;

    private LogisticsTypeEnum(int code) {
        this.code = code;
    }

    private int code;
    public int getCode() {
        return code;
    }

    public static LogisticsTypeEnum findEnumByCode(int code){
        for (LogisticsTypeEnum logisticsType : LogisticsTypeEnum.values()){
            if (logisticsType.getCode() == code){
                return logisticsType;
            }
        }
        return null;
    }
}

