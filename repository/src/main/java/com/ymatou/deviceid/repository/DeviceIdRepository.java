package com.ymatou.deviceid.repository;

import java.util.HashMap;

/**
 * Created by liangzhonghua on 2016/9/22.
 */
public interface DeviceIdRepository {

    void save(HashMap<String,Object> data);
}
