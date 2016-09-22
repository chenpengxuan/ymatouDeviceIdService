/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */
package com.ymatou.deviceid.test.infrastructure.db.query;


import javax.annotation.Resource;

import com.ymatou.deviceid.infrastructure.db.model.CreditDetailPo;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import org.joda.time.format.DateTimeFormat;
import org.junit.Test;

import com.ymatou.deviceid.infrastructure.db.query.CreditDetailQuery;
import com.ymatou.deviceid.test.WithoutDubboBaseTest;

import java.util.List;


/**
 * @author tuwenjie 2016年5月12日 上午11:23:25
 *
 */
public class CreditDetailQueryTest extends WithoutDubboBaseTest {

    @Resource
    private CreditDetailQuery creditDetailQuery;


    @Test
    public void testGetOrderCreditList() {
        List<CreditDetailPo> poList = creditDetailQuery.getOrderCreditList("100007778");
        System.out.println(poList);
    }

    @Test
    public void jodaTest(){
        System.out.println(Minutes.minutesBetween(DateTime.parse("2016-09-02 11:28:01", DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")),
                DateTime.parse("2016-09-02 11:29:59", DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss"))).getMinutes());
    }
}
