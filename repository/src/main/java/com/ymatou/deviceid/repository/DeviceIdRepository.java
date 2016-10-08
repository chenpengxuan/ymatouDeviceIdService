package com.ymatou.deviceid.repository;

import java.util.HashMap;

import com.ymatou.deviceid.facade.model.vo.DeviceInfo;

/**
 * Created by liangzhonghua on 2016/9/22.
 */
public interface DeviceIdRepository {

    void save(HashMap<String, Object> data);

    DeviceInfo getDeviceInfo(String deviceId, int type);


}
