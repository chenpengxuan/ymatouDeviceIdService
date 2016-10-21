package com.ymatou.deviceid.facade.rest;

import java.util.HashMap;

import com.ymatou.deviceid.facade.model.req.UpdateDeviceIdReq;

/**
 * Created by liangzhonghua on 2016/9/22.
 */
public interface DeviceIdResource {
    BaseNetCompatibleResp saveDeviceId(HashMap<String, Object> dataMap);

    BaseNetCompatibleResp get(String deviceId, int type);

    BaseNetCompatibleResp getFirst(String deviceId, String did);

    BaseNetCompatibleResp updateDeviceId(UpdateDeviceIdReq req);
}
