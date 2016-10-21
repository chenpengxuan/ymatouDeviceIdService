package com.ymatou.deviceid.repository;

import java.util.HashMap;

import com.ymatou.deviceid.facade.model.vo.DeviceInfo;

/**
 * Created by liangzhonghua on 2016/9/22.
 */
public interface DeviceIdRepository {

    void insert(HashMap<String, Object> data);

    void save(DeviceInfo deviceInfo);

    DeviceInfo getDeviceInfo(String deviceId, int type);

    DeviceInfo getFirstDeviceInfo(String deviceId, String did);


}
