package com.ymatou.deviceid.infrastructure.db.model;

import java.math.BigDecimal;
import java.util.Date;

public class OrderInfoPo {
    /**
     * sOrderInfoId VARCHAR(36) 必填<br>
     * 
     */
    private String orderInfoId;

    /**
     * iOrderId INTEGER(10) 必填<br>
     * 
     */
    private Long orderId;

    /**
     * iType INTEGER(10) 默认值[((0))] 必填<br>
     * 
     */
    private Integer type;

    /**
     * sCatalogId VARCHAR(36)<br>
     * 
     */
    private String catalogId;

    /**
     * sPropertyInfo VARCHAR(2147483647)<br>
     * 
     */
    private String propertyInfo;

    /**
     * sTitle VARCHAR(500)<br>
     * 
     */
    private String title;

    /**
     * sPictureUrl VARCHAR(1024)<br>
     * 
     */
    private String pictureUrl;

    /**
     * sReferenceUrl VARCHAR(1024)<br>
     * 
     */
    private String referenceUrl;

    /**
     * fOriginalPrice DECIMAL(18,2) 必填<br>
     * 
     */
    private BigDecimal originalPrice;

    /**
     * fDiscount DECIMAL(18,2) 默认值[((0))]<br>
     * 
     */
    private BigDecimal discount;

    /**
     * iAmount INTEGER(10)<br>
     * 
     */
    private Integer amount;

    /**
     * fTotalPrice DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal totalPrice;

    /**
     * iSailProtected INTEGER(10)<br>
     * 
     */
    private Integer sailProtected;

    /**
     * sSKU VARCHAR(300)<br>
     * 
     */
    private String SKU;

    /**
     * bForVip BIT(1) 默认值[((0))] 必填<br>
     * 
     */
    private Boolean forVip;

    /**
     * iCatalogType INTEGER(10) 默认值[((0))] 必填<br>
     * 
     */
    private Integer catalogType;

    /**
     * iCatalogStatus INTEGER(10) 默认值[((0))] 必填<br>
     * 
     */
    private Integer catalogStatus;

    /**
     * iProductType INTEGER(10) 默认值[((0))] 必填<br>
     * 
     */
    private Integer productType;

    /**
     * sProductId VARCHAR(36)<br>
     * 
     */
    private String productId;

    /**
     * iProductMainCategoryId INTEGER(10) 默认值[((0))] 必填<br>
     * 
     */
    private Long productMainCategoryId;

    /**
     * iProductSubCategoryId INTEGER(10) 默认值[((0))] 必填<br>
     * 
     */
    private Long productSubCategoryId;

    /**
     * iProductThirdCategoryId INTEGER(10) 默认值[((0))] 必填<br>
     * 
     */
    private Long productThirdCategoryId;

    /**
     * iProductBrandId INTEGER(10) 默认值[((0))] 必填<br>
     * 
     */
    private Long productBrandId;

    /**
     * iBondedArea INTEGER(10)<br>
     * 
     */
    private Integer bondedArea;

    /**
     * sProductCode VARCHAR(50)<br>
     * 
     */
    private String productCode;

    /**
     * iTariffType INTEGER(10)<br>
     * 
     */
    private Integer tariffType;

    /**
     * fFlight DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal flight;

    /**
     * iPriceType INTEGER(10) 默认值[((0))]<br>
     * 
     */
    private Integer priceType;

    /**
     * sPackageNo VARCHAR(50)<br>
     * 
     */
    private String packageNo;

    /**
     * iProductRefundChannel INTEGER(10)<br>
     * 
     */
    private Integer productRefundChannel;

    /**
     * iProductRefundStatus INTEGER(10)<br>
     * 
     */
    private Integer productRefundStatus;

    /**
     * fProductPrice DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal productPrice;

    /**
     * fSubsidyAmount DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal subsidyAmount;

    /**
     * sProductInfo VARCHAR(500)<br>
     * 
     */
    private String productInfo;

    /**
     * fProductOriginalPrice DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal productOriginalPrice;

    /**
     * fCommission DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal commission;

    /**
     * fSellerCouponAmount DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal sellerCouponAmount;

    /**
     * fYmtCouponAmount DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal ymtCouponAmount;

    /**
     * dAddTime TIMESTAMP(23,3)<br>
     * 
     */
    private Date addTime;

    /**
     * dUpdateTime TIMESTAMP(23,3)<br>
     * 
     */
    private Date updateTime;

    /**
     * fFreight DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal freight;

    /**
     * iSalesType INTEGER(10)<br>
     * 
     */
    private Integer salesType;

    /**
     * bFreightFree BIT(1)<br>
     * 
     */
    private Boolean freightFree;

    /**
     * fSellerPromotionAmount DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal sellerPromotionAmount;

    /**
     * bSupportRtnWithoutReason BIT(1)<br>
     * 
     */
    private Boolean supportRtnWithoutReason;

    /**
     * sDescription CLOB(1073741823)<br>
     * 
     */
    private String description;

    /**
     * sOrderInfoId VARCHAR(36) 必填<br>
     */
    public String getOrderInfoId() {
        return orderInfoId;
    }

    /**
     * sOrderInfoId VARCHAR(36) 必填<br>
     */
    public void setOrderInfoId(String orderInfoId) {
        this.orderInfoId = orderInfoId == null ? null : orderInfoId.trim();
    }

    /**
     * iOrderId INTEGER(10) 必填<br>
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * iOrderId INTEGER(10) 必填<br>
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * iType INTEGER(10) 默认值[((0))] 必填<br>
     */
    public Integer getType() {
        return type;
    }

    /**
     * iType INTEGER(10) 默认值[((0))] 必填<br>
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * sCatalogId VARCHAR(36)<br>
     */
    public String getCatalogId() {
        return catalogId;
    }

    /**
     * sCatalogId VARCHAR(36)<br>
     */
    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId == null ? null : catalogId.trim();
    }

    /**
     * sPropertyInfo VARCHAR(2147483647)<br>
     */
    public String getPropertyInfo() {
        return propertyInfo;
    }

    /**
     * sPropertyInfo VARCHAR(2147483647)<br>
     */
    public void setPropertyInfo(String propertyInfo) {
        this.propertyInfo = propertyInfo == null ? null : propertyInfo.trim();
    }

    /**
     * sTitle VARCHAR(500)<br>
     */
    public String getTitle() {
        return title;
    }

    /**
     * sTitle VARCHAR(500)<br>
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * sPictureUrl VARCHAR(1024)<br>
     */
    public String getPictureUrl() {
        return pictureUrl;
    }

    /**
     * sPictureUrl VARCHAR(1024)<br>
     */
    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl == null ? null : pictureUrl.trim();
    }

    /**
     * sReferenceUrl VARCHAR(1024)<br>
     */
    public String getReferenceUrl() {
        return referenceUrl;
    }

    /**
     * sReferenceUrl VARCHAR(1024)<br>
     */
    public void setReferenceUrl(String referenceUrl) {
        this.referenceUrl = referenceUrl == null ? null : referenceUrl.trim();
    }

    /**
     * fOriginalPrice DECIMAL(18,2) 必填<br>
     */
    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    /**
     * fOriginalPrice DECIMAL(18,2) 必填<br>
     */
    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     * fDiscount DECIMAL(18,2) 默认值[((0))]<br>
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * fDiscount DECIMAL(18,2) 默认值[((0))]<br>
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * iAmount INTEGER(10)<br>
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * iAmount INTEGER(10)<br>
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * fTotalPrice DECIMAL(18,2)<br>
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * fTotalPrice DECIMAL(18,2)<br>
     */
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * iSailProtected INTEGER(10)<br>
     */
    public Integer getSailProtected() {
        return sailProtected;
    }

    /**
     * iSailProtected INTEGER(10)<br>
     */
    public void setSailProtected(Integer sailProtected) {
        this.sailProtected = sailProtected;
    }

    /**
     * sSKU VARCHAR(300)<br>
     */
    public String getSKU() {
        return SKU;
    }

    /**
     * sSKU VARCHAR(300)<br>
     */
    public void setSKU(String SKU) {
        this.SKU = SKU == null ? null : SKU.trim();
    }

    /**
     * bForVip BIT(1) 默认值[((0))] 必填<br>
     */
    public Boolean getForVip() {
        return forVip;
    }

    /**
     * bForVip BIT(1) 默认值[((0))] 必填<br>
     */
    public void setForVip(Boolean forVip) {
        this.forVip = forVip;
    }

    /**
     * iCatalogType INTEGER(10) 默认值[((0))] 必填<br>
     */
    public Integer getCatalogType() {
        return catalogType;
    }

    /**
     * iCatalogType INTEGER(10) 默认值[((0))] 必填<br>
     */
    public void setCatalogType(Integer catalogType) {
        this.catalogType = catalogType;
    }

    /**
     * iCatalogStatus INTEGER(10) 默认值[((0))] 必填<br>
     */
    public Integer getCatalogStatus() {
        return catalogStatus;
    }

    /**
     * iCatalogStatus INTEGER(10) 默认值[((0))] 必填<br>
     */
    public void setCatalogStatus(Integer catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    /**
     * iProductType INTEGER(10) 默认值[((0))] 必填<br>
     */
    public Integer getProductType() {
        return productType;
    }

    /**
     * iProductType INTEGER(10) 默认值[((0))] 必填<br>
     */
    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    /**
     * sProductId VARCHAR(36)<br>
     */
    public String getProductId() {
        return productId;
    }

    /**
     * sProductId VARCHAR(36)<br>
     */
    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    /**
     * iProductMainCategoryId INTEGER(10) 默认值[((0))] 必填<br>
     */
    public Long getProductMainCategoryId() {
        return productMainCategoryId;
    }

    /**
     * iProductMainCategoryId INTEGER(10) 默认值[((0))] 必填<br>
     */
    public void setProductMainCategoryId(Long productMainCategoryId) {
        this.productMainCategoryId = productMainCategoryId;
    }

    /**
     * iProductSubCategoryId INTEGER(10) 默认值[((0))] 必填<br>
     */
    public Long getProductSubCategoryId() {
        return productSubCategoryId;
    }

    /**
     * iProductSubCategoryId INTEGER(10) 默认值[((0))] 必填<br>
     */
    public void setProductSubCategoryId(Long productSubCategoryId) {
        this.productSubCategoryId = productSubCategoryId;
    }

    /**
     * iProductThirdCategoryId INTEGER(10) 默认值[((0))] 必填<br>
     */
    public Long getProductThirdCategoryId() {
        return productThirdCategoryId;
    }

    /**
     * iProductThirdCategoryId INTEGER(10) 默认值[((0))] 必填<br>
     */
    public void setProductThirdCategoryId(Long productThirdCategoryId) {
        this.productThirdCategoryId = productThirdCategoryId;
    }

    /**
     * iProductBrandId INTEGER(10) 默认值[((0))] 必填<br>
     */
    public Long getProductBrandId() {
        return productBrandId;
    }

    /**
     * iProductBrandId INTEGER(10) 默认值[((0))] 必填<br>
     */
    public void setProductBrandId(Long productBrandId) {
        this.productBrandId = productBrandId;
    }

    /**
     * iBondedArea INTEGER(10)<br>
     */
    public Integer getBondedArea() {
        return bondedArea;
    }

    /**
     * iBondedArea INTEGER(10)<br>
     */
    public void setBondedArea(Integer bondedArea) {
        this.bondedArea = bondedArea;
    }

    /**
     * sProductCode VARCHAR(50)<br>
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * sProductCode VARCHAR(50)<br>
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    /**
     * iTariffType INTEGER(10)<br>
     */
    public Integer getTariffType() {
        return tariffType;
    }

    /**
     * iTariffType INTEGER(10)<br>
     */
    public void setTariffType(Integer tariffType) {
        this.tariffType = tariffType;
    }

    /**
     * fFlight DECIMAL(18,2)<br>
     */
    public BigDecimal getFlight() {
        return flight;
    }

    /**
     * fFlight DECIMAL(18,2)<br>
     */
    public void setFlight(BigDecimal flight) {
        this.flight = flight;
    }

    /**
     * iPriceType INTEGER(10) 默认值[((0))]<br>
     */
    public Integer getPriceType() {
        return priceType;
    }

    /**
     * iPriceType INTEGER(10) 默认值[((0))]<br>
     */
    public void setPriceType(Integer priceType) {
        this.priceType = priceType;
    }

    /**
     * sPackageNo VARCHAR(50)<br>
     */
    public String getPackageNo() {
        return packageNo;
    }

    /**
     * sPackageNo VARCHAR(50)<br>
     */
    public void setPackageNo(String packageNo) {
        this.packageNo = packageNo == null ? null : packageNo.trim();
    }

    /**
     * iProductRefundChannel INTEGER(10)<br>
     */
    public Integer getProductRefundChannel() {
        return productRefundChannel;
    }

    /**
     * iProductRefundChannel INTEGER(10)<br>
     */
    public void setProductRefundChannel(Integer productRefundChannel) {
        this.productRefundChannel = productRefundChannel;
    }

    /**
     * iProductRefundStatus INTEGER(10)<br>
     */
    public Integer getProductRefundStatus() {
        return productRefundStatus;
    }

    /**
     * iProductRefundStatus INTEGER(10)<br>
     */
    public void setProductRefundStatus(Integer productRefundStatus) {
        this.productRefundStatus = productRefundStatus;
    }

    /**
     * fProductPrice DECIMAL(18,2)<br>
     */
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    /**
     * fProductPrice DECIMAL(18,2)<br>
     */
    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * fSubsidyAmount DECIMAL(18,2)<br>
     */
    public BigDecimal getSubsidyAmount() {
        return subsidyAmount;
    }

    /**
     * fSubsidyAmount DECIMAL(18,2)<br>
     */
    public void setSubsidyAmount(BigDecimal subsidyAmount) {
        this.subsidyAmount = subsidyAmount;
    }

    /**
     * sProductInfo VARCHAR(500)<br>
     */
    public String getProductInfo() {
        return productInfo;
    }

    /**
     * sProductInfo VARCHAR(500)<br>
     */
    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo == null ? null : productInfo.trim();
    }

    /**
     * fProductOriginalPrice DECIMAL(18,2)<br>
     */
    public BigDecimal getProductOriginalPrice() {
        return productOriginalPrice;
    }

    /**
     * fProductOriginalPrice DECIMAL(18,2)<br>
     */
    public void setProductOriginalPrice(BigDecimal productOriginalPrice) {
        this.productOriginalPrice = productOriginalPrice;
    }

    /**
     * fCommission DECIMAL(18,2)<br>
     */
    public BigDecimal getCommission() {
        return commission;
    }

    /**
     * fCommission DECIMAL(18,2)<br>
     */
    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    /**
     * fSellerCouponAmount DECIMAL(18,2)<br>
     */
    public BigDecimal getSellerCouponAmount() {
        return sellerCouponAmount;
    }

    /**
     * fSellerCouponAmount DECIMAL(18,2)<br>
     */
    public void setSellerCouponAmount(BigDecimal sellerCouponAmount) {
        this.sellerCouponAmount = sellerCouponAmount;
    }

    /**
     * fYmtCouponAmount DECIMAL(18,2)<br>
     */
    public BigDecimal getYmtCouponAmount() {
        return ymtCouponAmount;
    }

    /**
     * fYmtCouponAmount DECIMAL(18,2)<br>
     */
    public void setYmtCouponAmount(BigDecimal ymtCouponAmount) {
        this.ymtCouponAmount = ymtCouponAmount;
    }

    /**
     * dAddTime TIMESTAMP(23,3)<br>
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * dAddTime TIMESTAMP(23,3)<br>
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * dUpdateTime TIMESTAMP(23,3)<br>
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * dUpdateTime TIMESTAMP(23,3)<br>
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * fFreight DECIMAL(18,2)<br>
     */
    public BigDecimal getFreight() {
        return freight;
    }

    /**
     * fFreight DECIMAL(18,2)<br>
     */
    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    /**
     * iSalesType INTEGER(10)<br>
     */
    public Integer getSalesType() {
        return salesType;
    }

    /**
     * iSalesType INTEGER(10)<br>
     */
    public void setSalesType(Integer salesType) {
        this.salesType = salesType;
    }

    /**
     * bFreightFree BIT(1)<br>
     */
    public Boolean getFreightFree() {
        return freightFree;
    }

    /**
     * bFreightFree BIT(1)<br>
     */
    public void setFreightFree(Boolean freightFree) {
        this.freightFree = freightFree;
    }

    /**
     * fSellerPromotionAmount DECIMAL(18,2)<br>
     */
    public BigDecimal getSellerPromotionAmount() {
        return sellerPromotionAmount;
    }

    /**
     * fSellerPromotionAmount DECIMAL(18,2)<br>
     */
    public void setSellerPromotionAmount(BigDecimal sellerPromotionAmount) {
        this.sellerPromotionAmount = sellerPromotionAmount;
    }

    /**
     * bSupportRtnWithoutReason BIT(1)<br>
     */
    public Boolean getSupportRtnWithoutReason() {
        return supportRtnWithoutReason;
    }

    /**
     * bSupportRtnWithoutReason BIT(1)<br>
     */
    public void setSupportRtnWithoutReason(Boolean supportRtnWithoutReason) {
        this.supportRtnWithoutReason = supportRtnWithoutReason;
    }

    /**
     * sDescription CLOB(1073741823)<br>
     */
    public String getDescription() {
        return description;
    }

    /**
     * sDescription CLOB(1073741823)<br>
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderInfoId=").append(orderInfoId);
        sb.append(", orderId=").append(orderId);
        sb.append(", type=").append(type);
        sb.append(", catalogId=").append(catalogId);
        sb.append(", propertyInfo=").append(propertyInfo);
        sb.append(", title=").append(title);
        sb.append(", pictureUrl=").append(pictureUrl);
        sb.append(", referenceUrl=").append(referenceUrl);
        sb.append(", originalPrice=").append(originalPrice);
        sb.append(", discount=").append(discount);
        sb.append(", amount=").append(amount);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", sailProtected=").append(sailProtected);
        sb.append(", SKU=").append(SKU);
        sb.append(", forVip=").append(forVip);
        sb.append(", catalogType=").append(catalogType);
        sb.append(", catalogStatus=").append(catalogStatus);
        sb.append(", productType=").append(productType);
        sb.append(", productId=").append(productId);
        sb.append(", productMainCategoryId=").append(productMainCategoryId);
        sb.append(", productSubCategoryId=").append(productSubCategoryId);
        sb.append(", productThirdCategoryId=").append(productThirdCategoryId);
        sb.append(", productBrandId=").append(productBrandId);
        sb.append(", bondedArea=").append(bondedArea);
        sb.append(", productCode=").append(productCode);
        sb.append(", tariffType=").append(tariffType);
        sb.append(", flight=").append(flight);
        sb.append(", priceType=").append(priceType);
        sb.append(", packageNo=").append(packageNo);
        sb.append(", productRefundChannel=").append(productRefundChannel);
        sb.append(", productRefundStatus=").append(productRefundStatus);
        sb.append(", productPrice=").append(productPrice);
        sb.append(", subsidyAmount=").append(subsidyAmount);
        sb.append(", productInfo=").append(productInfo);
        sb.append(", productOriginalPrice=").append(productOriginalPrice);
        sb.append(", commission=").append(commission);
        sb.append(", sellerCouponAmount=").append(sellerCouponAmount);
        sb.append(", ymtCouponAmount=").append(ymtCouponAmount);
        sb.append(", addTime=").append(addTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", freight=").append(freight);
        sb.append(", salesType=").append(salesType);
        sb.append(", freightFree=").append(freightFree);
        sb.append(", sellerPromotionAmount=").append(sellerPromotionAmount);
        sb.append(", supportRtnWithoutReason=").append(supportRtnWithoutReason);
        sb.append(", description=").append(description);
        sb.append("]");
        return sb.toString();
    }
}