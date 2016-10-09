package com.ymatou.deviceid.test.infrastructure.db;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ymatou.deviceid.facade.model.vo.DeviceInfo;
import com.ymatou.deviceid.repository.DeviceIdRepository;
import com.ymatou.deviceid.test.BaseTest;

/**
 * Created by liangzhonghua on 2016/9/22.
 */
public class DeviceIdRepositoryTest extends BaseTest {

    @Autowired
    DeviceIdRepository deviceIdRepository;


    @Test
    public void testGetDeviceInfo() throws InterruptedException {
        String deviceId = UUID.randomUUID().toString();
        int userId = 10;

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("deviceid", deviceId);
        map.put("userid", userId);
        map.put("activeTime", new Date());
        map.put("signVerified", 2);
        deviceIdRepository.insert(map);

        Thread.sleep(200);

        DeviceInfo info = deviceIdRepository.getDeviceInfo(deviceId, 0);
        assertNotNull(info);
        assertEquals(userId, info.getUserid());
    }
}
