package com.ymatou.deviceid.test.facade.rest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.HashMap;
import java.util.Random;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ymatou.deviceid.facade.rest.BaseNetCompatibleResp;
import com.ymatou.deviceid.facade.rest.DeviceIdResource;
import com.ymatou.deviceid.test.WithoutDubboBaseTest;

/**
 * Created by liangzhonghua on 2016/9/26.
 */
public class DeviceIdFacadeTest extends WithoutDubboBaseTest {

    @Autowired
    DeviceIdResource deviceIdResource;

    @Test
    public void TestSave() {
        Random rd = new Random();
        String deviceId = "deviceid" + rd.nextInt(999999);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("deviceid", deviceId);
        map.put("userid", rd.nextInt(999999));
        map.put("activeTime", new Date());
        map.put("signVerified", 1);

        BaseNetCompatibleResp resp = deviceIdResource.saveDeviceId(map);

        System.out.println(resp);
        assertEquals(0, resp.getCode());

        resp = deviceIdResource.get(deviceId, 0);
        System.out.println(resp);

        assertEquals(0, resp.getCode());
        assertNotNull(resp.getData());


    }
}
