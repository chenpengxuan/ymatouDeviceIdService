package com.ymatou.deviceid.repository;

import com.ymatou.deviceid.facade.model.resp.BaseResponse;
import com.ymatou.deviceid.facade.model.resp.DeviceInfoResp;
import com.ymatou.deviceid.facade.model.vo.DeviceInfo;

import java.util.HashMap;

/**
 * Created by liangzhonghua on 2016/9/22.
 */
public interface DeviceIdRepository {

    void save(HashMap<String,Object> data);
    DeviceInfo getDeviceInfo(String deviceId);


}
