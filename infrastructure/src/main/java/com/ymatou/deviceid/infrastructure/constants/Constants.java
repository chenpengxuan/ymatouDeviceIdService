/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */

package com.ymatou.deviceid.infrastructure.constants;

import com.ymatou.deviceid.infrastructure.holder.ShutdownLatch;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author luoshiqian 2016/5/11 11:47
 */
public class Constants {

    public static final String APP_ID = "sellerquery.trading.iapi.ymatou.com";
    
    public static final String LOG_PREFIX = "logPrefix";

    public static ShutdownLatch shutdownLatch = new ShutdownLatch(APP_ID);
    public static ConfigurableApplicationContext ctx;

    public static final DateTimeFormatter FORMATTER_YYYYMMDDHHMMSS = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
    public static final DateTimeFormatter FORMATTER_YYYYMMDD = DateTimeFormat.forPattern("yyyy-MM-dd");

    public static  final int MAX_PER_QUERY_COUNT = 1000;
}
