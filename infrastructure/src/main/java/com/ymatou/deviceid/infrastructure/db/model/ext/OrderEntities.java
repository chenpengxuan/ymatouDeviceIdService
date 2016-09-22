package com.ymatou.deviceid.infrastructure.db.model.ext;

import com.ymatou.deviceid.facade.model.PrintFriendliness;
import com.ymatou.deviceid.infrastructure.db.model.*;

import java.util.List;

/**
 * Created by zhangyifan on 2016/9/9.
 */
public class OrderEntities extends PrintFriendliness {
    private List<OrdersPo> ordersPos;

    private List<OrderExtPo> orderExtPos;

    private List<OrderNotePo> orderNotePos;

    private List<OrderStatePo> orderStatePos;

    private List<OrderPostPayPo> orderPostPayPos;

    private List<OrderInfoExtExtPo> orderInfoExtExtPos;

    private List<OrderSummaryPo> orderSummaryPos;

    private List<OrderFrozenPo> orderFrozenPos;

    private List<TradingItemPo> tradingItemPos;

    private List<CreditDetailPo> creditDetailPos;


    public List<OrdersPo> getOrdersPos() {
        return ordersPos;
    }

    public void setOrdersPos(List<OrdersPo> ordersPos) {
        this.ordersPos = ordersPos;
    }

    public List<OrderExtPo> getOrderExtPos() {
        return orderExtPos;
    }

    public void setOrderExtPos(List<OrderExtPo> orderExtPos) {
        this.orderExtPos = orderExtPos;
    }

    public List<OrderNotePo> getOrderNotePos() {
        return orderNotePos;
    }

    public void setOrderNotePos(List<OrderNotePo> orderNotePos) {
        this.orderNotePos = orderNotePos;
    }

    public List<OrderStatePo> getOrderStatePos() {
        return orderStatePos;
    }

    public void setOrderStatePos(List<OrderStatePo> orderStatePos) {
        this.orderStatePos = orderStatePos;
    }

    public List<OrderPostPayPo> getOrderPostPayPos() {
        return orderPostPayPos;
    }

    public void setOrderPostPayPos(List<OrderPostPayPo> orderPostPayPos) {
        this.orderPostPayPos = orderPostPayPos;
    }

    public List<OrderInfoExtExtPo> getOrderInfoExtExtPos() {
        return orderInfoExtExtPos;
    }

    public void setOrderInfoExtExtPos(List<OrderInfoExtExtPo> orderInfoExtExtPos) {
        this.orderInfoExtExtPos = orderInfoExtExtPos;
    }

    public List<OrderSummaryPo> getOrderSummaryPos() {
        return orderSummaryPos;
    }

    public void setOrderSummaryPos(List<OrderSummaryPo> orderSummaryPos) {
        this.orderSummaryPos = orderSummaryPos;
    }

    public List<OrderFrozenPo> getOrderFrozenPos() {
        return orderFrozenPos;
    }

    public void setOrderFrozenPos(List<OrderFrozenPo> orderFrozenPos) {
        this.orderFrozenPos = orderFrozenPos;
    }

    public List<TradingItemPo> getTradingItemPos() {
        return tradingItemPos;
    }

    public void setTradingItemPos(List<TradingItemPo> tradingItemPos) {
        this.tradingItemPos = tradingItemPos;
    }

    public List<CreditDetailPo> getCreditDetailPos() {
        return creditDetailPos;
    }

    public void setCreditDetailPos(List<CreditDetailPo> creditDetailPos) {
        this.creditDetailPos = creditDetailPos;
    }
}
