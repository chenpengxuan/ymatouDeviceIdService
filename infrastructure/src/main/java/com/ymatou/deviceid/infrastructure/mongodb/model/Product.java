package com.ymatou.deviceid.infrastructure.mongodb.model;

import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by zhangyifan on 2016/9/13.
 */
public class Product {

    @Field("PrdId")
    private String prdId;
    @Field("Logistics")
    private int logistics;

    public String getPrdId() {
        return prdId;
    }

    public void setPrdId(String prdId) {
        this.prdId = prdId;
    }

    public int getLogistics() {
        return logistics;
    }

    public void setLogistics(int logistics) {
        this.logistics = logistics;
    }
}
