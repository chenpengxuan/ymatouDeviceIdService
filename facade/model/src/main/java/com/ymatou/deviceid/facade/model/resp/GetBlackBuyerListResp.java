

package com.ymatou.deviceid.facade.model.resp;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import java.util.List;

import com.google.common.collect.Lists;
import com.ymatou.deviceid.facade.model.vo.BlackBuyerInfo;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetBlackBuyerListResp extends BaseResponse {


    /**
     * 黑名单用户列表
     */
    private List<BlackBuyerInfo> blackBuyerList = Lists.newArrayList();


    public List<BlackBuyerInfo> getBlackBuyerList() {
        return blackBuyerList;
    }

    public void setBlackBuyerList(List<BlackBuyerInfo> blackBuyerList) {
        this.blackBuyerList = blackBuyerList;
    }
}

