package com.ymatou.deviceid.facade.rest;

import java.util.HashMap;

import com.ymatou.deviceid.facade.model.req.UpdateDeviceIdReq;

/**
 * Created by liangzhonghua on 2016/9/22.
 */
public interface DeviceIdResource {
    /**
     * 插入设备号信息
     * 
     * @param dataMap
     * @return
     */
    BaseNetCompatibleResp saveDeviceId(HashMap<String, Object> dataMap);

    /**
     * 根据deviceid获取deviceinfo
     * 
     * @param deviceId
     * @param type
     * @return
     */
    BaseNetCompatibleResp get(String deviceId, int type);

    /**
     * 获取最早的DeviceId信息
     * 
     * @param deviceId
     * @param did
     * @return
     */
    BaseNetCompatibleResp getFirst(String deviceId, String did);

    /**
     * 根据UserId获取一组DeviceId信息
     * 
     * @param userid
     * @param type
     * @param limit
     * @return
     */
    BaseNetCompatibleResp getList(int userid, int type, int limit);

    /**
     * 更新设备信息
     * 
     * @param req
     * @return
     */
    BaseNetCompatibleResp updateDeviceId(UpdateDeviceIdReq req);

    /**
     * 根据设备号获取用户列表
     * 
     * @param deviceId
     * @param type
     * @param limit
     * @return
     */
    BaseNetCompatibleResp getUserIdList(String deviceId, int type, int limit);
}
