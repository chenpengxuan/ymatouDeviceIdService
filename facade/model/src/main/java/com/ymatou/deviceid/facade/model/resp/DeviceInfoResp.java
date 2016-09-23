package com.ymatou.deviceid.facade.model.resp;

import java.util.Date;

/**
 * Created by liangzhonghua on 2016/9/23.
 */
public class DeviceInfoResp extends  BaseResponse {

    private Date activeTime;
    private int userId;


    private boolean signVerified;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }




    public boolean isSignVerified() {
        return signVerified;
    }

    public void setSignVerified(boolean signVerified) {
        this.signVerified = signVerified;
    }

    public Date getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }
}
