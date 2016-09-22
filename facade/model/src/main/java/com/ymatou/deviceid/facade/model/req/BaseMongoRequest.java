package com.ymatou.deviceid.facade.model.req;

/**
 * Created by zhangyifan on 2016/9/18.
 */
public class BaseMongoRequest extends BaseRequest {

    /**
     * 是否强制Mongo逻辑
     */
    private Boolean isRunMongo;

    public Boolean getRunMongo() {
        return isRunMongo;
    }

    public void setRunMongo(Boolean runMongo) {
        isRunMongo = runMongo;
    }
}
