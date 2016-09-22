/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */

package com.ymatou.deviceid.infrastructure;


import com.ymatou.deviceid.facade.model.ErrorCode;

/**
 * 业务异常
 * @author tuwenjie
 *
 */
public class BizException extends RuntimeException {
    private static final long serialVersionUID = 1857440708804128584L;
    private ErrorCode errorCode;

    public BizException(ErrorCode errorCode, String msg) {

        this(errorCode, msg, null);
    }

    public BizException(String msg) {
        this(ErrorCode.FAIL, msg);
    }

    public BizException(ErrorCode errorCode) {
        this(errorCode,errorCode.getMessage(),null);
    }
    
    public BizException(String msg, Throwable cause ) {
        this(ErrorCode.FAIL, msg, cause );
    }

    public BizException(ErrorCode errorCode, String msg, Throwable cause) {
        super(msg, cause);
        if (errorCode == null) {
            throw new IllegalArgumentException("errorCode is null");
        }
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public static void throwBizException(ErrorCode errorCode,String message,Throwable cause){
        throw new BizException(errorCode,message,cause);
    }

    public static void throwBizException(ErrorCode errorCode,String message){
        throwBizException(errorCode,message,null);
    }
}
