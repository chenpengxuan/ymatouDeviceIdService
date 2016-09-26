/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */

package com.ymatou.deviceid.infrastructure.config;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;
import org.springframework.stereotype.Component;

/**
 * 由Disconf托管，变更能立即生效的业务配置
 *
 * @author tuwenjie
 */
@Component
@DisconfFile(fileName = "biz.properties")
public class BizConfig {

    private String md5key;

    @DisconfFileItem(name = "md5key")
    public String getMd5key() {
        return md5key;
    }

    public void setMd5key(String md5key) {
        this.md5key = md5key;
    }

}
