package com.ymatou.deviceid.infrastructure.config.props;

/**
 * Created by zhangyifan on 2016/9/13.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MongoProps {
    @Value("${mongo.address}")
    private String mongoAddress;
    @Value("${mongo.databaseName}")
    private String mongoDatabaseName;


    public String getMongoAddress() {
        return mongoAddress;
    }

    public void setMongoAddress(String mongoAddress) {
        this.mongoAddress = mongoAddress;
    }

    public String getMongoDatabaseName() {
        return mongoDatabaseName;
    }

    public void setMongoDatabaseName(String mongoDatabaseName) {
        this.mongoDatabaseName = mongoDatabaseName;
    }
}
