package com.ymatou.deviceid.test.infrastructure.db;

import com.ymatou.deviceid.facade.model.vo.DeviceInfo;
import com.ymatou.deviceid.repository.DeviceIdRepository;
import com.ymatou.deviceid.test.WithoutDubboBaseTest;
import org.eclipse.core.runtime.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.HashMap;

/**
 * Created by liangzhonghua on 2016/9/22.
 */
public class DeviceIdRepositoryTest extends WithoutDubboBaseTest {

    @Autowired
    DeviceIdRepository deviceIdRepository;



    @Test
    public void testSaveDeviceId() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("deviceid", "testid");
        map.put("userid", 112132);

        deviceIdRepository.save(map);
    }

    @Test
    public void testGetDeviceInfo() {

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("deviceid", "testid4");
        map.put("userid", 213552);
        map.put("activeTime", new Date());
        map.put("signVerified", true);
        deviceIdRepository.save(map);
        DeviceInfo info = deviceIdRepository.getDeviceInfo("testid4", 0);

        println(info);
        Assert.isNotNull(info);
    }
}
