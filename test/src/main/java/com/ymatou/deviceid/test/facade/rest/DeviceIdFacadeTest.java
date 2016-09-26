package com.ymatou.deviceid.test.facade.rest;

import com.ymatou.deviceid.facade.DeviceIdFacade;
import com.ymatou.deviceid.facade.rest.BaseNetCompatibleResp;
import com.ymatou.deviceid.facade.rest.DeviceIdResource;
import com.ymatou.deviceid.test.WithoutDubboBaseTest;
import junit.framework.Assert;
import org.junit.Test;
import org.springframework.aop.config.AspectComponentDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;

import java.util.Date;
import java.util.HashMap;

/**
 * Created by liangzhonghua on 2016/9/26.
 */
public class DeviceIdFacadeTest extends WithoutDubboBaseTest {

    @Autowired
    DeviceIdResource deviceIdResource;
    @Test
    public void TestSave()
    {
        HashMap<String,Object> map =new HashMap<String,Object>();
        map.put("deviceid","testid5");
        map.put("userid",213552);
        map.put("activeTime",new Date());
        map.put("signVerified",1);

        BaseNetCompatibleResp resp= deviceIdResource.saveDeviceId(map);

        System.out.println(resp);
        Assert.assertEquals(0,resp.getCode());

        resp=deviceIdResource.get("testid5");
        System.out.println(resp);

        Assert.assertEquals(0,resp.getCode());
        Assert.assertNotNull(resp.getData());


    }
}
