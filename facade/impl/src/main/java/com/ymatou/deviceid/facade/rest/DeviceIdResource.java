package com.ymatou.deviceid.facade.rest;

import java.util.HashMap;

/**
 * Created by liangzhonghua on 2016/9/22.
 */
public interface DeviceIdResource {
    BaseNetCompatibleResp saveDeviceId(HashMap<String, Object> dataMap);

    BaseNetCompatibleResp get(String deviceId, int type);
}
