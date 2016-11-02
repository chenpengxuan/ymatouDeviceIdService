package com.ymatou.deviceid.facade.model.vo;

import com.ymatou.deviceid.facade.model.PrintFriendliness;

import java.util.Date;

import org.springframework.data.annotation.Id;

/**
 * Created by liangzhonghua on 2016/9/23.
 */
public class DeviceInfo extends PrintFriendliness {
    /**
     * 
     */
    private static final long serialVersionUID = 6991284983287959677L;

    @Id
    private String id;
    private String appid;
    private String deviceid;
    private int clienttype;
    private String appversion;
    private String packageid;
    private String ip;
    private int userid;
    private String ccid;
    private String ckid;
    private String osversion;
    private String network;
    private String yid;
    private String did;
    private Boolean isupdate;
    private String power;
    private String appkey;
    private String timestamp;
    private String acceptversion;
    private String mac;
    private int signVerified;
    private String appname;
    private Date activeTime;
    private Date updateTime;


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

    /**
     * @return the appid
     */
    public String getAppid() {
        return appid;
    }

    /**
     * @param appid the appid to set
     */
    public void setAppid(String appid) {
        this.appid = appid;
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
     * @return the appversion
     */
    public String getAppversion() {
        return appversion;
    }

    /**
     * @param appversion the appversion to set
     */
    public void setAppversion(String appversion) {
        this.appversion = appversion;
    }

    /**
     * @return the packageid
     */
    public String getPackageid() {
        return packageid;
    }

    /**
     * @param packageid the packageid to set
     */
    public void setPackageid(String packageid) {
        this.packageid = packageid;
    }

    /**
     * @return the ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip the ip to set
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * @return the ccid
     */
    public String getCcid() {
        return ccid;
    }

    /**
     * @param ccid the ccid to set
     */
    public void setCcid(String ccid) {
        this.ccid = ccid;
    }

    /**
     * @return the ckid
     */
    public String getCkid() {
        return ckid;
    }

    /**
     * @param ckid the ckid to set
     */
    public void setCkid(String ckid) {
        this.ckid = ckid;
    }

    /**
     * @return the network
     */
    public String getNetwork() {
        return network;
    }

    /**
     * @param network the network to set
     */
    public void setNetwork(String network) {
        this.network = network;
    }

    /**
     * @return the yid
     */
    public String getYid() {
        return yid;
    }

    /**
     * @param yid the yid to set
     */
    public void setYid(String yid) {
        this.yid = yid;
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
     * @return the isupdate
     */
    public Boolean getIsupdate() {
        return isupdate;
    }

    /**
     * @param isupdate the isupdate to set
     */
    public void setIsupdate(Boolean isupdate) {
        this.isupdate = isupdate;
    }

    /**
     * @return the power
     */
    public String getPower() {
        return power;
    }

    /**
     * @param power the power to set
     */
    public void setPower(String power) {
        this.power = power;
    }

    /**
     * @return the appkey
     */
    public String getAppkey() {
        return appkey;
    }

    /**
     * @param appkey the appkey to set
     */
    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    /**
     * @return the timestamp
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * @param timestamp the timestamp to set
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * @return the acceptversion
     */
    public String getAcceptversion() {
        return acceptversion;
    }

    /**
     * @param acceptversion the acceptversion to set
     */
    public void setAcceptversion(String acceptversion) {
        this.acceptversion = acceptversion;
    }

    /**
     * @return the mac
     */
    public String getMac() {
        return mac;
    }

    /**
     * @param mac the mac to set
     */
    public void setMac(String mac) {
        this.mac = mac;
    }

    /**
     * @return the appname
     */
    public String getAppname() {
        return appname;
    }

    /**
     * @param appname the appname to set
     */
    public void setAppname(String appname) {
        this.appname = appname;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the updateTime
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime the updateTime to set
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
