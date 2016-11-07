/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 * All rights reserved.
 *
 */
package com.ymatou.deviceid.facade.rest;


import com.ymatou.deviceid.facade.model.PrintFriendliness;

/**
 * 与.NET http客户端适配的响应
 * 
 * @author tuwenjie 2016年5月17日 下午3:08:20
 *
 */
public class BaseNetCompatibleResp extends PrintFriendliness {

    private static final long serialVersionUID = 256845177242093093L;

    // http响应码
    private int code;

    private int bcode;

    // 业务错误码描述
    private String msg;

    // 业务报文体
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


    public int getBcode() {
        return bcode;
    }

    public void setBcode(int bcode) {
        this.bcode = bcode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
