/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 * All rights reserved.
 *
 */
package com.ymatou.deviceid.facade.model.resp;


/**
 * 响应基类. <em>其所有子类必须有默认的构造函数</em>
 *
 * @author tuwenjie
 */
public class BaseMongoResponse extends BaseResponse {

    /**
     * 
     */
    private static final long serialVersionUID = -1408553406457778488L;
    /**
     * 是否通过Mongo逻辑
     */
    private Boolean isRanMongo;

    public Boolean getRanMongo() {
        return isRanMongo;
    }

    public void setRanMongo(Boolean ranMongo) {
        isRanMongo = ranMongo;
    }
}
