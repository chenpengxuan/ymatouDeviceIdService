/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */
package com.ymatou.deviceid.test.infrastructure.db.mapper;

import javax.annotation.Resource;

import com.ymatou.deviceid.infrastructure.db.model.CreditDetailPo;

import com.ymatou.deviceid.repository.CreditDetailRepository;
import org.junit.Assert;
import org.junit.Test;

import com.ymatou.deviceid.infrastructure.db.mapper.CreditDetailMapper;
import com.ymatou.deviceid.test.WithoutDubboBaseTest;


public class CreditDetailMapperTest extends WithoutDubboBaseTest {

    @Resource
    private CreditDetailMapper mapper;
    @Resource
    private CreditDetailRepository repository;


    @Test
    public void testSelect() {

        CreditDetailPo creditDetailPo = mapper.selectByPrimaryKey(418L);

        Assert.assertNotNull(creditDetailPo);

        CreditDetailPo po = repository.findById(418L);

        Assert.assertNotNull(po);

    }

}
