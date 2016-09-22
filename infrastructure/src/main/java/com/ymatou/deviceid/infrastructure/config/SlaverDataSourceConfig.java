package com.ymatou.deviceid.infrastructure.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.baidu.disconf.client.DisconfMgrBeanSecond;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;
import java.util.Properties;




@Configuration
@MapperScan(
        basePackages = {"com.ymatou.deviceid.infrastructure.db.mapper","com.ymatou.deviceid.infrastructure.db.query"},
        sqlSessionTemplateRef = "slaverSqlSessionTemplate"
)
//@EnableTransactionManagement(proxyTargetClass = true)
public class SlaverDataSourceConfig  {
    @Autowired
    private SlaverConnectionConfig slaverConnectionConfig;

    //加上这个隐性依赖
    @Autowired
    private DisconfMgrBeanSecond disconfMgrBeanSecond;

    @Bean
    public DataSource slaverDataSource() {

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(slaverConnectionConfig.getDbUrl());
        dataSource.setUsername(slaverConnectionConfig.getDbUser());
        dataSource.setPassword(slaverConnectionConfig.getDbPassword());

        dataSource.setInitialSize(Integer.valueOf(DataSourceSettingEnum.initialSize.getValue()));
        dataSource.setMinIdle(Integer.valueOf(DataSourceSettingEnum.minIdle.getValue()));
        dataSource.setMaxActive(Integer.valueOf(DataSourceSettingEnum.maxActive.getValue()));

        dataSource.setTimeBetweenConnectErrorMillis(Integer.valueOf(DataSourceSettingEnum.timeBetweenEvictionRunsMillis.getValue()));
        dataSource.setMinEvictableIdleTimeMillis(Integer.valueOf(DataSourceSettingEnum.minEvictableIdleTimeMillis.getValue()));
        dataSource.setValidationQuery(DataSourceSettingEnum.validationQuery.getValue());
        dataSource.setTestWhileIdle(Boolean.valueOf(DataSourceSettingEnum.testWhileIdle.getValue()));
        dataSource.setTestOnBorrow(Boolean.valueOf(DataSourceSettingEnum.testOnBorrow.getValue()));
        dataSource.setDefaultAutoCommit(false);

        dataSource.setQueryTimeout(Integer.valueOf(DataSourceSettingEnum.queryTimeout.getValue()));
        dataSource.setTransactionQueryTimeout(Integer.valueOf(DataSourceSettingEnum.queryTimeout.getValue()));

        return dataSource;
    }

    @Bean
    public SqlSessionFactory slaverSqlSessionFactory()  {

        try {
            SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();

            // 获取properties中的对应配置信息
            String mapperLocation = "classpath*:sqlmap/**/*.xml";
            String configLocation = "classpath:mybatis-settings.xml";
            String dialect = "mysql";

            Properties properties = new Properties();
            properties.setProperty("dialect", dialect);

            sessionFactory.setDataSource(slaverDataSource());
            sessionFactory.setConfigurationProperties(properties);

            // 设置MapperLocations configLocation路径
            ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
            sessionFactory.setMapperLocations(resourcePatternResolver.getResources(mapperLocation));
            sessionFactory.setConfigLocation(resourcePatternResolver.getResource(configLocation));

            // PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
            // Properties pageProp = new Properties();
            // pageProp.setProperty("dialect", dialect);
            // paginationInterceptor.setProperties(pageProp);

            // 设置插件
            // sessionFactory.setPlugins(new Interceptor[] {paginationInterceptor});

            // sessionFactory.setTypeHandlers(new TypeHandler[]{new SerializableTypeHandler()});

            return sessionFactory.getObject();
        }catch(Exception e)
        {

            return null;
        }

    }

    /*
    @Bean(name = "slaverSqlSessionTemplate")
    public SqlSessionTemplate slaverSqlSessionTemplate(SqlSessionFactory sqlSessionFactory){
        SqlSessionTemplate sqlSession = new SqlSessionTemplate(sqlSessionFactory);
        return sqlSession;
    }*/

    @Bean(name = "slaverSqlSessionTemplate")
    public SqlSessionTemplate slaverSqlSessionTemplate(){
        SqlSessionTemplate sqlSession = new SqlSessionTemplate(slaverSqlSessionFactory());
        return sqlSession;
    }

   // @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return slaverTransactionManager();
    }

    @Bean(name = "slaverTransactionManager")
    public PlatformTransactionManager slaverTransactionManager() {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(slaverDataSource());
        transactionManager.setDefaultTimeout(1);
        return transactionManager;
    }

}
