package com.ymatou.deviceid.repository;

import com.ymatou.deviceid.facade.model.resp.DeviceInfoResp;
import com.ymatou.deviceid.facade.model.vo.DeviceInfo;
import com.ymatou.deviceid.infrastructure.mongodb.model.OrderMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;


/**
 * Created by liangzhonghua on 2016/9/22.
 */

@Repository("deviceIdRepository")
public class DeviceIdRepositoryImpl implements DeviceIdRepository {

    private final String CollectionName="deviceId";

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void save(HashMap<String, Object> deviceIdInfo) {
        mongoTemplate.insert(deviceIdInfo, CollectionName);
    }

    @Override
    public DeviceInfo getDeviceInfo(String deviceId) {

        Criteria criteria = new Criteria();
        criteria.andOperator(Criteria.where("deviceid").is(deviceId));

        Query query = new Query(criteria).with(new Sort(Sort.Direction.ASC,"activeTime"));

        return mongoTemplate.findOne(query,DeviceInfo.class, CollectionName);


    }
}
