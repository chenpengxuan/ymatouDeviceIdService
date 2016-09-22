package com.ymatou.deviceid.test.facade.impl;

import com.google.common.collect.Lists;
import com.ymatou.deviceid.facade.model.req.ExistsSellerExportedOrderInfosReq;
import com.ymatou.deviceid.facade.model.req.ExportSellerOrderInfosReq;
import com.ymatou.deviceid.facade.model.req.ExportSellerProductInfosReq;
import com.ymatou.deviceid.facade.model.resp.ExistsResp;
import com.ymatou.deviceid.facade.model.resp.ExportSellerOrderInfosResp;
import com.ymatou.deviceid.facade.model.resp.ExportSellerProductInfosResp;
import com.ymatou.deviceid.facade.model.vo.TimeRange;
import com.ymatou.deviceid.infrastructure.constants.Constants;
import com.ymatou.deviceid.test.WithoutDubboBaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by zhangzhiqiang on 2016/9/9.
 */
public class OrderExportResourceImplTest extends WithoutDubboBaseTest {

    /*
    @Autowired
    private OrderExportFacade orderExportFacade;

    @Test
    public void testIsExistsSellerExportedOrderInfos(){
        ExistsSellerExportedOrderInfosReq request = new ExistsSellerExportedOrderInfosReq();
        request.setSellerId(3383);
        request.setOrderId(105911915L);
        List<Integer> orderStatusList = Lists.newArrayList(0);
        request.setOrderStatus(orderStatusList);
        TimeRange createTime = new TimeRange(Constants.FORMATTER_YYYYMMDDHHMMSS.parseDateTime("2016-05-01 12:33:55")
                ,Constants.FORMATTER_YYYYMMDDHHMMSS.parseDateTime("2016-05-05 12:33:54"));
        request.setCreatedTime(createTime);

        TimeRange deliveredTime = new TimeRange(null
                ,null);
        request.setDeliveredTime(deliveredTime);

        TimeRange paidTime = new TimeRange(Constants.FORMATTER_YYYYMMDDHHMMSS.parseDateTime("2016-05-05 10:42:34")
                ,Constants.FORMATTER_YYYYMMDDHHMMSS.parseDateTime("2016-05-05 10:42:35"));
        request.setPaidTime(paidTime);

        TimeRange postpayAppliedTime = new TimeRange(Constants.FORMATTER_YYYYMMDDHHMMSS.parseDateTime("2016-05-05 10:42:05")
                ,Constants.FORMATTER_YYYYMMDDHHMMSS.parseDateTime("2016-05-05 10:42:06"));
        request.setPostpayAppliedTime(postpayAppliedTime);

        String jsonReq = com.alibaba.fastjson.JSON.toJSONString(request);
        ExistsResp resp = orderExportFacade.isExistsSellerExportedOrderInfos(request);
        Assert.assertTrue(resp.isSuccess());
        Assert.assertEquals(true,resp.isExists());
    }

    @Test
    public void testExportSellerOrderInfos(){
        ExportSellerOrderInfosReq request = new ExportSellerOrderInfosReq();
        request.setSellerId(3383);
        //request.setOrderId(105408232L);
        List<Integer> orderStatusList = Lists.newArrayList(0,2,3);
        request.setOrderStatus(orderStatusList);
        TimeRange createTime = new TimeRange(Constants.FORMATTER_YYYYMMDDHHMMSS.parseDateTime("2016-05-01 00:00:00")
                ,Constants.FORMATTER_YYYYMMDDHHMMSS.parseDateTime("2016-07-01 00:00:00"));
        request.setCreatedTime(createTime);
        //request.setProductName("单测试请勿用");
        //request.setPartitionKey("107845379");
//        TimeRange deliveredTime = new TimeRange(null
//                ,null);
//        request.setDeliveredTime(deliveredTime);
//
//        TimeRange paidTime = new TimeRange(Constants.FORMATTER_YYYYMMDDHHMMSS.parseDateTime("2016-05-05 10:42:34")
//                ,Constants.FORMATTER_YYYYMMDDHHMMSS.parseDateTime("2016-05-05 10:42:35"));
//        request.setPaidTime(paidTime);
//
//        TimeRange postpayAppliedTime = new TimeRange(Constants.FORMATTER_YYYYMMDDHHMMSS.parseDateTime("2016-05-05 10:42:05")
//                ,Constants.FORMATTER_YYYYMMDDHHMMSS.parseDateTime("2016-05-05 10:42:06"));
//        request.setPostpayAppliedTime(postpayAppliedTime);

        ExportSellerOrderInfosResp resp = orderExportFacade.exportSellerOrderInfos(request);
        Assert.assertTrue(resp.isSuccess());
        Assert.assertEquals(true,resp.getSellerExportedPartialOrderInfos() != null);
    }

    @Test
    public void testExportSellerProductInfos(){
        ExportSellerProductInfosReq request = new ExportSellerProductInfosReq();
        request.setSellerId(3383);
        //request.setOrderId(105408232L);
        List<Integer> orderStatusList = Lists.newArrayList(0,2,3);
        request.setOrderStatus(orderStatusList);
        TimeRange createTime = new TimeRange(Constants.FORMATTER_YYYYMMDDHHMMSS.parseDateTime("2016-05-01 00:00:00")
                ,Constants.FORMATTER_YYYYMMDDHHMMSS.parseDateTime("2016-07-01 00:00:00"));
        request.setCreatedTime(createTime);
        //request.setProductName("单测试请勿用");
        //request.setPartitionKey("107845379");
//        TimeRange deliveredTime = new TimeRange(null
//                ,null);
//        request.setDeliveredTime(deliveredTime);
//
//        TimeRange paidTime = new TimeRange(Constants.FORMATTER_YYYYMMDDHHMMSS.parseDateTime("2016-05-05 10:42:34")
//                ,Constants.FORMATTER_YYYYMMDDHHMMSS.parseDateTime("2016-05-05 10:42:35"));
//        request.setPaidTime(paidTime);
//
//        TimeRange postpayAppliedTime = new TimeRange(Constants.FORMATTER_YYYYMMDDHHMMSS.parseDateTime("2016-05-05 10:42:05")
//                ,Constants.FORMATTER_YYYYMMDDHHMMSS.parseDateTime("2016-05-05 10:42:06"));
//        request.setPostpayAppliedTime(postpayAppliedTime);

        ExportSellerProductInfosResp resp = orderExportFacade.exportSellerProductInfos(request);
        Assert.assertTrue(resp.isSuccess());
        Assert.assertEquals(true,resp.getSellerExportedPartialProductInfos() != null);
    }

    */
}
