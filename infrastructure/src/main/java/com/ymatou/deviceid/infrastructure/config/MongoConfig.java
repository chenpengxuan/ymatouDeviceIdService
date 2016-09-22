package com.ymatou.deviceid.infrastructure.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoClientURI;
import com.ymatou.deviceid.infrastructure.config.props.MongoProps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import javax.annotation.PreDestroy;
import java.net.UnknownHostException;


/**
 * Created by zhangyifan on 2016/9/13.
 */
@Configuration
public class MongoConfig extends AbstractMongoConfiguration {

    @Autowired
    private MongoProps mongoProps;

    @Autowired(required = false)
    private MongoClientOptions options;
    private MongoClient mongo;

    @PreDestroy
    public void close() {
        if (this.mongo != null) {
            this.mongo.close();
        }
    }

    @Override
    public String getDatabaseName()
    {
        return mongoProps.getMongoDatabaseName();
    }

    @Override
    @Bean
    public MongoClient mongo() throws UnknownHostException {

        MongoClientURI uri = new MongoClientURI(mongoProps.getMongoAddress());
        this.mongo = new MongoClient(uri);
        return this.mongo;
    }

    @Bean
    public MongoDbFactory mongoDbFactory(MongoClient mongo) throws Exception {
        return new SimpleMongoDbFactory(mongo, mongoProps.getMongoDatabaseName());
    }

    @Override
    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongo(), mongoProps.getMongoDatabaseName());
    }

}