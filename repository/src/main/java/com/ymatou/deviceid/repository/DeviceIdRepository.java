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
     * 根据用户Id获取设备号信息
     * 
     * @param userId 用户编号
     * @param type 顺序：0-按照ActiveTime ASC, 1-按照ActiveTime DESC
     * @param limit 取出条数
     * @return
     */
    List<DeviceInfo> getDeviceInfoList(int userId, int type, int limit);

    /**
     * 根据物理设备号获取设备号信息
     * 
     * @param did
     * @param type
     * @return
     */
    DeviceInfo getDeviceInfoByDid(String did, int type);


    /**
     * 获取到已经验证的设备号信息
     * 
     * @param deviceId
     * @param did
     * @return
     */
    DeviceInfo getValidateDeviceInfo(String deviceId, String did);

    /**
     * 根据设备号获取到设备号列表
     * 
     * @param deviceId 设备号
     * @param type 排序类型
     * @param limit 返回数据的最大条数
     * @return
     */
    List<DeviceInfo> getDeviceInfoList(String deviceId, int type, int limit);
}
