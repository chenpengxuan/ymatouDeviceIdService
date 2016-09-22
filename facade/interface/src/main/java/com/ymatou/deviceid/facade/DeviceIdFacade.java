package com.ymatou.deviceid.facade;

import com.ymatou.deviceid.facade.model.resp.BaseResponse;

import java.util.HashMap;

/**
 * Created by liangzhonghua on 2016/9/22.
 */
public interface DeviceIdFacade {

    BaseResponse saveDeviceId(HashMap<String,String> dataMap);
}
