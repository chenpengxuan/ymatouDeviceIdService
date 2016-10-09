package com.ymatou.deviceid.facade.model.resp;

import java.util.Date;

/**
 * Created by liangzhonghua on 2016/9/23.
 */
public class DeviceInfoResp extends BaseResponse {

    /**
     * 
     */
    private static final long serialVersionUID = 7083032286242002956L;

    private Date activeTime;
    private int userId;
    private int signVerified;
    private String osversion;
    private int clienttype;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    public int getSignVerified() {
        return signVerified;
    }

    public void setSignVerified(int signVerified) {
        this.signVerified = signVerified;
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
