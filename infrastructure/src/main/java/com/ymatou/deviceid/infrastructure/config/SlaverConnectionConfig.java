package com.ymatou.deviceid.infrastructure.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by liangzhonghua on 2016/9/21.
 */
@Component
public class SlaverConnectionConfig {

    @Value("${slaverdb.Url}")
    private String dbUrl;
    @Value("${slaverdb.User}")
    private String dbUser;
    @Value("${slaverdb.Password}")
    private String dbPassword;

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }
}
