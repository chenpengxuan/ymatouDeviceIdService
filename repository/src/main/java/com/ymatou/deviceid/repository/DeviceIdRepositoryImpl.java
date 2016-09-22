package com.ymatou.deviceid.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;


/**
 * Created by liangzhonghua on 2016/9/22.
 */

@Repository("deviceIdRepository")
public class DeviceIdRepositoryImpl implements DeviceIdRepository {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void save(HashMap<String, Object> deviceIdInfo) {
        mongoTemplate.insert(deviceIdInfo, "deviceId");
    }
}
