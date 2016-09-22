package com.ymatou.deviceid.infrastructure.db.mapper;

import com.ymatou.deviceid.infrastructure.db.model.CreditDetailExample;
import com.ymatou.deviceid.infrastructure.db.model.CreditDetailPo;
import java.util.List;

public interface CreditDetailMapper {
    int countByExample(CreditDetailExample example);

    List<CreditDetailPo> selectByExample(CreditDetailExample example);

    CreditDetailPo selectByPrimaryKey(Long creditDetailId);
}