
package com.ymatou.deviceid.facade.model.req;

/*
 *
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 *
 */


import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.List;


/**
 * @author zhangyifan 2016/9/1 12:00
 */


public class GetOrderProductAmountInfosReq extends BaseRequest {


    /**
     * 商品ID（数量超过100会报错）
     */
    @NotEmpty
    @NotNull
    private List<String> productIds;


    public List<String> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<String> productIds) {
        this.productIds = productIds;
    }
}

