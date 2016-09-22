
package com.ymatou.deviceid.facade.model.vo;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


/**
 * @author zhangyifan 2016/9/1 12:00
 */

import com.ymatou.deviceid.facade.model.PrintFriendliness;

public class OrderSellerInfo extends PrintFriendliness {


    /**
     * 卖家备注
     */
    private String comment;


    /**
     * 用户ID
     */
    private String iD;


    /**
     * 登录名
     */
    private String loginId;


    /**
     * 买家邮箱
     */
    private String email;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

