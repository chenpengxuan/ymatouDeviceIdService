package com.ymatou.deviceid.facade.model.vo;

import com.ymatou.deviceid.facade.model.PrintFriendliness;

import java.util.Date;

/**
 * Created by liangzhonghua on 2016/9/23.
 */
public class DeviceInfo extends PrintFriendliness {
    /**
     * 
     */
    private static final long serialVersionUID = 6991284983287959677L;

    private Date activeTime;
    private int userid;
    private int signVerified;
    private String osversion;
    private int clienttype;


    public int getSignVerified() {
        return signVerified;
    }

    public void setSignVerified(int signVerified) {
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

    /**
     * @return the osversion
     */
    public String getOsversion() {
        return osversion;
    }

    /**
     * @param osversion the osversion to set
     */
    public void setOsversion(String osversion) {
        this.osversion = osversion;
    }

    /**
     * @return the clienttype
     */
    public int getClienttype() {
        return clienttype;
    }

    /**
     * @param clienttype the clienttype to set
     */
    public void setClienttype(int clienttype) {
        this.clienttype = clienttype;
    }
}
