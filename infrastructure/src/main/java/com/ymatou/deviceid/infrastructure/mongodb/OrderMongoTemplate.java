package com.ymatou.deviceid.infrastructure.mongodb;

import com.ymatou.deviceid.infrastructure.mongodb.model.OrderMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by zhangyifan on 2016/9/13.
 */
@Component
public class OrderMongoTemplate {
/*
    public static final String ID = "_id";
    public static final String COUNT = "Count";
    public static final String TYPE = "Type";
    public static final String SELLER = "Seller";
    public static final String STATUS = "Status";
    public static final String TRADING_STATUS = "TradingStatus";
    public static final String DOMESTIC_DELIVERED = "DomesticDelivered";
    public static final String PRODUCTS = "Products";
    public static final String LOGISTICS = "Logistics";

    @Autowired
    private MongoTemplate mongoTemplate;

    private static String getCollectionName(long sellerId) {
        long n = sellerId % 100;
        return "Orders_" + n;
    }

    public AggregationResults<OrderMongo> groupByToCount(Criteria criteria, long sellerId, String groupByName) {

        Aggregation agg = Aggregation.newAggregation(
                Aggregation.match(criteria),
                Aggregation.group(groupByName).count().as(COUNT),
                Aggregation.project(COUNT).and(groupByName).previousOperation()
                //Aggregation.sort(Sort.Direction.DESC, COUNT)
        );
        return mongoTemplate.aggregate(agg, getCollectionName(sellerId), OrderMongo.class);
    }

    public List<OrderMongo> find(Criteria criteria, long sellerId) {
        return mongoTemplate.find(new Query(criteria), OrderMongo.class, getCollectionName(sellerId));
    }

    public OrderMongo findOne(Criteria criteria, long sellerId) {
        return mongoTemplate.findOne(new Query(criteria), OrderMongo.class, getCollectionName(sellerId));
    }

    */
}
