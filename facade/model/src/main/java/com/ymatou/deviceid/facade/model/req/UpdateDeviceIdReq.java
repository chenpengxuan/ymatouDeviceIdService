/**
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *
 * All rights reserved.
 */
package com.ymatou.deviceid.facade.model.req;

/**
 * 更新设备号信息
 * 
 * @author wangxudong 2016年10月9日 上午11:14:17
 *
 */
public class UpdateDeviceIdReq extends BaseRequest {

    /**
     * 
     */
    private static final long serialVersionUID = -819423853471346716L;

    private String deviceid;

    private String did;

    private int userid;

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

    /**
     * @return the userid
     */
    public int getUserid() {
        return userid;
    }

    /**
     * @param userid the userid to set
     */
    public void setUserid(int userid) {
        this.userid = userid;
    }
}
