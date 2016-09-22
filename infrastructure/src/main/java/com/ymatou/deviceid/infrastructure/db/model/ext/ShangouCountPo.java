/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */

package com.ymatou.deviceid.infrastructure.db.model.ext;

import com.ymatou.deviceid.facade.model.PrintFriendliness;

/**
 * @author zhangyifan 2016/9/14 15:23
 */
public class ShangouCountPo extends PrintFriendliness {

    private boolean shangou;
    private int count;

    public boolean isShangou() {
        return shangou;
    }

    public void setShangou(boolean shangou) {
        this.shangou = shangou;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
