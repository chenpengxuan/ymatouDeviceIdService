/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */

package com.ymatou.deviceid.infrastructure.db.model.ext;

import com.ymatou.deviceid.facade.model.PrintFriendliness;

import java.math.BigDecimal;

/**
 * @author luoshiqian 2016/9/5 15:47
 */
public class SalesDetailPo extends PrintFriendliness {

    private String TimeSpan;
    private BigDecimal unpaid_Spot = BigDecimal.ZERO;
    private BigDecimal unpaid_Shangou = BigDecimal.ZERO;
    private BigDecimal unpaid_SellerCoupon = BigDecimal.ZERO;
    private BigDecimal partialPaid_Spot = BigDecimal.ZERO;
    private BigDecimal partialPaid_Shangou = BigDecimal.ZERO;
    private BigDecimal partialPaid_SellerCoupon = BigDecimal.ZERO;
    private BigDecimal fullPaid_Spot = BigDecimal.ZERO;
    private BigDecimal fullPaid_Shangou = BigDecimal.ZERO;
    private BigDecimal fullPaid_SellerCoupon = BigDecimal.ZERO;
    private BigDecimal cancelled_Spot = BigDecimal.ZERO;
    private BigDecimal cancelled_Shangou = BigDecimal.ZERO;
    private BigDecimal cancelled_SellerCoupon = BigDecimal.ZERO;

    public String getTimeSpan() {
        return TimeSpan;
    }

    public void setTimeSpan(String timeSpan) {
        TimeSpan = timeSpan;
    }

    public BigDecimal getUnpaid_Spot() {
        return unpaid_Spot;
    }

    public void setUnpaid_Spot(BigDecimal unpaid_Spot) {
        this.unpaid_Spot = unpaid_Spot;
    }

    public BigDecimal getUnpaid_Shangou() {
        return unpaid_Shangou;
    }

    public void setUnpaid_Shangou(BigDecimal unpaid_Shangou) {
        this.unpaid_Shangou = unpaid_Shangou;
    }

    public BigDecimal getUnpaid_SellerCoupon() {
        return unpaid_SellerCoupon;
    }

    public void setUnpaid_SellerCoupon(BigDecimal unpaid_SellerCoupon) {
        this.unpaid_SellerCoupon = unpaid_SellerCoupon;
    }

    public BigDecimal getPartialPaid_Spot() {
        return partialPaid_Spot;
    }

    public void setPartialPaid_Spot(BigDecimal partialPaid_Spot) {
        this.partialPaid_Spot = partialPaid_Spot;
    }

    public BigDecimal getPartialPaid_Shangou() {
        return partialPaid_Shangou;
    }

    public void setPartialPaid_Shangou(BigDecimal partialPaid_Shangou) {
        this.partialPaid_Shangou = partialPaid_Shangou;
    }

    public BigDecimal getPartialPaid_SellerCoupon() {
        return partialPaid_SellerCoupon;
    }

    public void setPartialPaid_SellerCoupon(BigDecimal partialPaid_SellerCoupon) {
        this.partialPaid_SellerCoupon = partialPaid_SellerCoupon;
    }

    public BigDecimal getFullPaid_Spot() {
        return fullPaid_Spot;
    }

    public void setFullPaid_Spot(BigDecimal fullPaid_Spot) {
        this.fullPaid_Spot = fullPaid_Spot;
    }

    public BigDecimal getFullPaid_Shangou() {
        return fullPaid_Shangou;
    }

    public void setFullPaid_Shangou(BigDecimal fullPaid_Shangou) {
        this.fullPaid_Shangou = fullPaid_Shangou;
    }

    public BigDecimal getFullPaid_SellerCoupon() {
        return fullPaid_SellerCoupon;
    }

    public void setFullPaid_SellerCoupon(BigDecimal fullPaid_SellerCoupon) {
        this.fullPaid_SellerCoupon = fullPaid_SellerCoupon;
    }

    public BigDecimal getCancelled_Spot() {
        return cancelled_Spot;
    }

    public void setCancelled_Spot(BigDecimal cancelled_Spot) {
        this.cancelled_Spot = cancelled_Spot;
    }

    public BigDecimal getCancelled_Shangou() {
        return cancelled_Shangou;
    }

    public void setCancelled_Shangou(BigDecimal cancelled_Shangou) {
        this.cancelled_Shangou = cancelled_Shangou;
    }

    public BigDecimal getCancelled_SellerCoupon() {
        return cancelled_SellerCoupon;
    }

    public void setCancelled_SellerCoupon(BigDecimal cancelled_SellerCoupon) {
        this.cancelled_SellerCoupon = cancelled_SellerCoupon;
    }
}
