package com.ymatou.deviceid.facade.model.resp;

import java.util.Date;

/**
 * Created by liangzhonghua on 2016/9/23.
 */
public class DeviceInfoSimple extends BaseResponse {

    /**
     * 
     */
    private static final long serialVersionUID = 7083032286242002956L;

    private Date activeTime;
    private int signVerified;
    private String deviceid;
    private String did;

    /**
     * @return the activeTime
     */
    public Date getActiveTime() {
        return activeTime;
    }

    /**
     * @param activeTime the activeTime to set
     */
    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

    /**
     * @return the signVerified
     */
    public int getSignVerified() {
        return signVerified;
    }

    /**
     * @param signVerified the signVerified to set
     */
    public void setSignVerified(int signVerified) {
        this.signVerified = signVerified;
    }

    /**
     * @return the deviceid
     */
    public String getDeviceid() {
        return deviceid;
    }

    /**
     * @param deviceid the deviceid to set
     */
    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    /**
     * @return the did
     */
    public String getDid() {
        return did;
    }

    /**
     * @param did the did to set
     */
    public void setDid(String did) {
        this.did = did;
    }


}
