

package com.ymatou.deviceid.facade.model.resp;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class ExistsResp extends BaseResponse {


    /**
     * 
     */
    private static final long serialVersionUID = -7987887646381810886L;

    /**
     * 是否存在
     */
    private boolean exists;

    public boolean isExists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }
}

