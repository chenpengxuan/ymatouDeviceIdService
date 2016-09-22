/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */
package com.ymatou.deviceid.facade.model;

/**
 *
 * 
 * @author tuwenjie
 *
 */
public enum ErrorCode {

    // 请求参数非法
    ILLEGAL_ARGUMENT(100, "请求参数非法"),

    /**
     * 客户端需要知道的具体错误码定义在这里
     */
    ErrOrderNotExists(101, "订单不存在"),

    ERR_STATUS_NOTMATCH(102, "状态不匹配"),

    ERR_NO_PERMISSION(103, "没有权限操作该订单"),

    ERR_PROCESS_EXCEPTION(104, "订单处理异常"),

    ERR_CONDITION_NOTMATCH(105, "处理条件不匹配"),

    ERR_REFUNDBILL_NOTEXISTS(110,"退款单不存在"),

    ErrCouponNotMatch(112, "优惠券不匹配"),

    ERR_ORDERAMOUNT_NOTMATCH(114,"订单金额不匹配"),
    
    ErrDuplicateReq(197, "重复请求"),

    // 明确知道失败原因，但客户端不关心，统一返回请求处理失败
    FAIL(198, "请求处理失败"),

    // 请求处理过程中，出现未知错误
    UNKNOWN(199, "未知错误，系统异常"),

    ;

    private int code;

    private String message;

    private ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    /**
     * 通过错误码获取枚举项
     * 
     * @param code
     * @return
     */
    public static ErrorCode getByCode(int code) {
        for (ErrorCode errorCode : ErrorCode.values()) {
            if (errorCode.getCode() == code) {
                return errorCode;
            }
        }
        return null;
    }
}
