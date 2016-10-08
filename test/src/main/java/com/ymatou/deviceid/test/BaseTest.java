/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 * All rights reserved.
 *
 */

package com.ymatou.deviceid.test;

/**
 * 
 * @author tuwenjie
 *
 */

public class BaseTest {


    protected void println(Object obj) {
        System.out.println(obj);
    }
    /**
     * 方便测试用例做些临时的数据库操作
     */
    /*
     * protected JdbcTemplate jdbcTemplate;
     * 
     * @Resource(name = "dataSource")
     * private DataSource dataSource;
     * 
     * @Before
     * public void prepare() {
     * jdbcTemplate = new JdbcTemplate(dataSource);
     * }
     */
}
