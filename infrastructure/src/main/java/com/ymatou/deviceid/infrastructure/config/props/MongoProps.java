package com.ymatou.deviceid.infrastructure.config.props;

/**
 * Created by zhangyifan on 2016/9/13.
 */

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DisconfFile(fileName = "mongo.properties")
public class MongoProps {


    private String mongoAddress;


    private String mongoDatabaseName;

    @DisconfFileItem(name = "mongo.address")
    public String getMongoAddress() {
        return mongoAddress;
    }

    public void setMongoAddress(String mongoAddress) {
        this.mongoAddress = mongoAddress;
    }

    @DisconfFileItem(name = "mongo.databaseName")
    public String getMongoDatabaseName() {
        return mongoDatabaseName;
    }

    public void setMongoDatabaseName(String mongoDatabaseName) {
        this.mongoDatabaseName = mongoDatabaseName;
    }
}
