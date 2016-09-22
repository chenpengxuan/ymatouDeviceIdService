/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */

package com.ymatou.deviceid.infrastructure.db.query;

import com.ymatou.deviceid.infrastructure.db.model.CreditDetailPo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CreditDetailQuery {

    /**
     * @param targetId
     */
    List<CreditDetailPo> getOrderCreditList(@Param("targetId") String targetId);

}
