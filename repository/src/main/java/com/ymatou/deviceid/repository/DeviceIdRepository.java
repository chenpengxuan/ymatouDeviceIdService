package com.ymatou.deviceid.repository;

import java.util.HashMap;
import java.util.List;

import com.ymatou.deviceid.facade.model.vo.DeviceInfo;

/**
 * Created by liangzhonghua on 2016/9/22.
 */
public interface DeviceIdRepository {

    void insert(HashMap<String, Object> data);

    void save(DeviceInfo deviceInfo);

    DeviceInfo getDeviceInfo(String deviceId, int type);

    DeviceInfo getFirstDeviceInfo(String deviceId, String did);

    /**
     * @param userId 用户编号
     * @param type 顺序：0-按照ActiveTime ASC, 1-按照ActiveTime DESC
     * @param limit 取出条数
     * @return
     */
    List<DeviceInfo> getDeviceInfoList(int userId, int type, int limit);
}
