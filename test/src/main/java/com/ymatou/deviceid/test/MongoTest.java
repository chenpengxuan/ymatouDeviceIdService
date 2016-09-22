package com.ymatou.deviceid.test;

import com.ymatou.deviceid.infrastructure.mongodb.OrderMongoTemplate;
import com.ymatou.deviceid.infrastructure.mongodb.model.OrderMongo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

/**
 * Created by zhangyifan on 2016/9/13.
 */
public class MongoTest extends WithoutDubboBaseTest {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    public void testMongo() {
        System.out.println("start test");
        Criteria criteria = new Criteria();
        criteria.andOperator(Criteria.where("_id").is(100049123));

        Query query = new Query(criteria);
        //mongoTemplate.findOne()
        boolean b = mongoTemplate.collectionExists("Orders_013");
        List<OrderMongo> o = mongoTemplate.find(query, OrderMongo.class, "Orders_0");

        System.out.println("end test "+b);
    }


}
