package com.ymatou.deviceid.test.facade.rest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ymatou.deviceid.facade.model.req.UpdateDeviceIdReq;
import com.ymatou.deviceid.facade.model.resp.DeviceInfoResp;
import com.ymatou.deviceid.facade.rest.BaseNetCompatibleResp;
import com.ymatou.deviceid.facade.rest.DeviceIdResource;
import com.ymatou.deviceid.test.BaseTest;

/**
 * Created by liangzhonghua on 2016/9/26.
 */
public class DeviceIdFacadeTest extends BaseTest {

    @Autowired
    DeviceIdResource deviceIdResource;

    @Test
    public void testSaveDeviceId() throws InterruptedException {
        String deviceId = UUID.randomUUID().toString();
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("deviceid", deviceId);
        map.put("userid", 10);
        map.put("activeTime", new Date());
        map.put("signVerified", 1);

        BaseNetCompatibleResp resp = deviceIdResource.saveDeviceId(map);

        System.out.println(resp);
        assertEquals(0, resp.getCode());


        Thread.sleep(100);

        resp = deviceIdResource.get(deviceId, 0);
        println(resp);

        assertEquals(0, resp.getCode());
        assertNotNull(resp.getData());
    }

    @Test
    public void testUpdateDeviceId() throws InterruptedException {
        String deviceId = UUID.randomUUID().toString();
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("deviceid", deviceId);
        map.put("userid", 10);
        map.put("clienttype", 1);
        map.put("acceptversion", "1.0.0");
        map.put("network", "wifi");
        map.put("appname", "buyer");
        map.put("osversion", "ios10.1");

        BaseNetCompatibleResp resp = deviceIdResource.saveDeviceId(map);
        assertEquals(0, resp.getCode());

        resp = deviceIdResource.get(deviceId, 1);
        assertEquals(0, resp.getCode());
        assertNotNull(resp.getData());

        DeviceInfoResp deviceInfoBefore = (DeviceInfoResp) resp.getData();
        assertNotNull(deviceInfoBefore);
        assertEquals(10, deviceInfoBefore.getUserId());


        UpdateDeviceIdReq updateDeviceIdReq = new UpdateDeviceIdReq();
        updateDeviceIdReq.setDeviceid(deviceId);
        updateDeviceIdReq.setDid(UUID.randomUUID().toString());
        updateDeviceIdReq.setUserid(20);
        BaseNetCompatibleResp updateResp = deviceIdResource.updateDeviceId(updateDeviceIdReq);

        assertNotNull(updateResp);
        assertEquals(0, updateResp.getCode());

        Thread.sleep(300);

        BaseNetCompatibleResp respAfter = deviceIdResource.get(deviceId, 1);
        assertEquals(0, respAfter.getCode());
        assertNotNull(respAfter.getData());

        DeviceInfoResp deviceInfoAfter = (DeviceInfoResp) respAfter.getData();
        assertNotNull(deviceInfoAfter);
        assertEquals(1, deviceInfoAfter.getSignVerified());
        assertEquals(20, deviceInfoAfter.getUserId());
        assertEquals("ios10.1", deviceInfoAfter.getOsversion());
    }

    @Test
    public void testUpdateDeviceId1() throws InterruptedException {
        String deviceId = UUID.randomUUID().toString();
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("deviceid", deviceId);
        map.put("userid", 0);
        map.put("clienttype", 1);
        map.put("acceptversion", "1.0.0");
        map.put("network", "wifi");
        map.put("appname", "buyer");
        map.put("osversion", "ios10.0");

        BaseNetCompatibleResp resp = deviceIdResource.saveDeviceId(map);
        assertEquals(0, resp.getCode());

        Thread.sleep(100);

        resp = deviceIdResource.get(deviceId, 1);
        assertEquals(0, resp.getCode());
        assertNotNull(resp.getData());

        DeviceInfoResp deviceInfoBefore = (DeviceInfoResp) resp.getData();
        assertNotNull(deviceInfoBefore);
        assertEquals(0, deviceInfoBefore.getUserId());


        UpdateDeviceIdReq updateDeviceIdReq = new UpdateDeviceIdReq();
        updateDeviceIdReq.setDeviceid(deviceId);
        updateDeviceIdReq.setDid(UUID.randomUUID().toString());
        updateDeviceIdReq.setUserid(20);
        BaseNetCompatibleResp updateResp = deviceIdResource.updateDeviceId(updateDeviceIdReq);

        assertNotNull(updateResp);
        assertEquals(0, updateResp.getCode());

        Thread.sleep(100);

        BaseNetCompatibleResp respAfter = deviceIdResource.get(deviceId, 1);
        assertEquals(0, respAfter.getCode());
        assertNotNull(respAfter.getData());

        DeviceInfoResp deviceInfoAfter = (DeviceInfoResp) respAfter.getData();
        assertNotNull(deviceInfoAfter);
        assertEquals(1, deviceInfoAfter.getSignVerified());
        assertEquals(20, deviceInfoAfter.getUserId());
    }

    @Test
    public void testUpdateDeviceId2() throws InterruptedException {
        String deviceId = UUID.randomUUID().toString();
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("deviceid", deviceId);
        map.put("userid", 20);
        map.put("clienttype", 1);
        map.put("acceptversion", "1.0.0");
        map.put("network", "wifi");
        map.put("appname", "buyer");
        map.put("osversion", "ios10.0");

        BaseNetCompatibleResp resp = deviceIdResource.saveDeviceId(map);
        assertEquals(0, resp.getCode());

        Thread.sleep(100);

        resp = deviceIdResource.get(deviceId, 1);
        assertEquals(0, resp.getCode());
        assertNotNull(resp.getData());

        DeviceInfoResp deviceInfoBefore = (DeviceInfoResp) resp.getData();
        assertNotNull(deviceInfoBefore);
        assertEquals(20, deviceInfoBefore.getUserId());


        UpdateDeviceIdReq updateDeviceIdReq = new UpdateDeviceIdReq();
        updateDeviceIdReq.setDeviceid(deviceId);
        updateDeviceIdReq.setDid(UUID.randomUUID().toString());
        updateDeviceIdReq.setUserid(20);
        BaseNetCompatibleResp updateResp = deviceIdResource.updateDeviceId(updateDeviceIdReq);

        assertNotNull(updateResp);
        assertEquals(0, updateResp.getCode());

        Thread.sleep(100);

        BaseNetCompatibleResp respAfter = deviceIdResource.get(deviceId, 1);
        assertEquals(0, respAfter.getCode());
        assertNotNull(respAfter.getData());

        DeviceInfoResp deviceInfoAfter = (DeviceInfoResp) respAfter.getData();
        assertNotNull(deviceInfoAfter);
        assertEquals(1, deviceInfoAfter.getSignVerified());
        assertEquals(20, deviceInfoAfter.getUserId());
    }

    @Test
    public void testUpdateDeviceId3() throws InterruptedException {
        String deviceId = UUID.randomUUID().toString();

        UpdateDeviceIdReq updateDeviceIdReq = new UpdateDeviceIdReq();
        updateDeviceIdReq.setDeviceid(deviceId);
        updateDeviceIdReq.setDid(UUID.randomUUID().toString());
        updateDeviceIdReq.setUserid(20);
        BaseNetCompatibleResp updateResp = deviceIdResource.updateDeviceId(updateDeviceIdReq);

        assertNotNull(updateResp);
        assertEquals(0, updateResp.getCode());

        Thread.sleep(100);

        BaseNetCompatibleResp respAfter = deviceIdResource.get(deviceId, 1);
        assertEquals(0, respAfter.getCode());
        assertNotNull(respAfter.getData());

        DeviceInfoResp deviceInfoAfter = (DeviceInfoResp) respAfter.getData();
        assertNotNull(deviceInfoAfter);
        assertEquals(1, deviceInfoAfter.getSignVerified());
        assertEquals(20, deviceInfoAfter.getUserId());
    }


    @Test
    public void testUpdateDeviceId4() throws InterruptedException {
        UpdateDeviceIdReq updateDeviceIdReq = new UpdateDeviceIdReq();
        updateDeviceIdReq.setDid(UUID.randomUUID().toString());
        updateDeviceIdReq.setUserid(20);
        BaseNetCompatibleResp updateResp = deviceIdResource.updateDeviceId(updateDeviceIdReq);

        assertNotNull(updateResp);
        assertEquals(100, updateResp.getCode());
    }

}
