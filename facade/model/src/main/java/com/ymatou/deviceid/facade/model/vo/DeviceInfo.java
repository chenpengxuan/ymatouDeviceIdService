package com.ymatou.deviceid.facade.model.vo;

import com.ymatou.deviceid.facade.model.PrintFriendliness;

import java.util.Date;

/**
 * Created by liangzhonghua on 2016/9/23.
 */
public class DeviceInfo extends PrintFriendliness {
    private Date activeTime;
    private int userid;
    private boolean signVerified;


    public boolean isSignVerified() {
        return signVerified;
    }

    public void setSignVerified(boolean signVerified) {
        this.signVerified = signVerified;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }



    public Date getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }
}
