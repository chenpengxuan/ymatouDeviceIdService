package com.ymatou.deviceid.facade.model.req;

/**
 * Created by zhangyifan on 2016/9/18.
 */
public class BaseMongoRequest extends BaseRequest {

    /**
     * 
     */
    private static final long serialVersionUID = -7227919215928694593L;

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
