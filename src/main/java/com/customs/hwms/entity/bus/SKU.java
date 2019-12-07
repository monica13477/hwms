package com.customs.hwms.entity.bus;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SKU extends SKUKey implements Serializable {
    private String skuDesc;

    private String englishName;

    private String skuType;

    private String category;

    private String tariffId;

    private String altSku;

    private String custSku;

    private String manufSku;

    private String retailSku;

    private Integer safetyStock;

    private String putawayRule;

    private String allocateRule01;

    private String allocateRule02;

    private BigDecimal unitPrice;

    private String countryOfOrigin;

    private String defaultLocation;

    private String approvalNo;

    private String hsCode;

    private String isBom;

    private String isActive;

    private String isFragile;

    private String isHazardous;

    private String isSnMgt;

    private String snMode;

    private String style;

    private String color;

    private String size;

    private String seasonCode;

    private String brandCode;

    private String isLifeMgt;

    private Integer lifeCycle;

    private Integer rejectCycle;

    private Integer withdrawCycle;

    private Integer adventCycle;

    private String sudf01;

    private String sudf02;

    private String sudf03;

    private String sudf04;

    private String sudf05;

    private String sudf06;

    private String sudf07;

    private String sudf08;

    private String sudf09;

    private String sudf10;

    private String sudf11;

    private String sudf12;

    private String sudf13;

    private String sudf14;

    private String sudf15;

    private String sudf16;

    private String sudf17;

    private String sudf18;

    private String sudf19;

    private String sudf20;

    private String sudf21;

    private String sudf22;

    private String sudf23;

    private String sudf24;

    private String sudf25;

    private String sudf26;

    private String sudf27;

    private String sudf28;

    private String sudf29;

    private String sudf30;

    private String photoPath;

    private String fileName;

    private String remarks;

    private Integer version;

    private String createBy;

    private Date createDate;

    private String modifyBy;

    private Date modifyDate;

    private String supplierCode;

    private String supplierName;

    private String defaultZone;

    private String defaultAisle;

    private Integer maxQtyL;

    private Integer maxQtyM;

    private Integer maxQtyS;

    private String skuShortDesc;

    private String itemVersion;

    private String isSendAgv;

    private String itemHot;

    private String sudf31;

    private String sudf32;

    private String sudf33;

    private String sudf34;

    private String sudf35;

    private String sudf36;

    private String sudf37;

    private String sudf38;

    private String sudf39;

    private String sudf40;

    private String sudf41;

    private String sudf42;

    private String sudf43;

    private String sudf44;

    private String sudf45;

    private String sudf46;

    private String sudf47;

    private String sudf48;

    private String sudf49;

    private String sudf50;

    private String shopList;

    private String orderSourceList;

    private byte[] timestamp;

    private static final long serialVersionUID = 1L;

    public String getSkuDesc() {
        return skuDesc;
    }

    public void setSkuDesc(String skuDesc) {
        this.skuDesc = skuDesc == null ? null : skuDesc.trim();
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    public String getSkuType() {
        return skuType;
    }

    public void setSkuType(String skuType) {
        this.skuType = skuType == null ? null : skuType.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getTariffId() {
        return tariffId;
    }

    public void setTariffId(String tariffId) {
        this.tariffId = tariffId == null ? null : tariffId.trim();
    }

    public String getAltSku() {
        return altSku;
    }

    public void setAltSku(String altSku) {
        this.altSku = altSku == null ? null : altSku.trim();
    }

    public String getCustSku() {
        return custSku;
    }

    public void setCustSku(String custSku) {
        this.custSku = custSku == null ? null : custSku.trim();
    }

    public String getManufSku() {
        return manufSku;
    }

    public void setManufSku(String manufSku) {
        this.manufSku = manufSku == null ? null : manufSku.trim();
    }

    public String getRetailSku() {
        return retailSku;
    }

    public void setRetailSku(String retailSku) {
        this.retailSku = retailSku == null ? null : retailSku.trim();
    }

    public Integer getSafetyStock() {
        return safetyStock;
    }

    public void setSafetyStock(Integer safetyStock) {
        this.safetyStock = safetyStock;
    }

    public String getPutawayRule() {
        return putawayRule;
    }

    public void setPutawayRule(String putawayRule) {
        this.putawayRule = putawayRule == null ? null : putawayRule.trim();
    }

    public String getAllocateRule01() {
        return allocateRule01;
    }

    public void setAllocateRule01(String allocateRule01) {
        this.allocateRule01 = allocateRule01 == null ? null : allocateRule01.trim();
    }

    public String getAllocateRule02() {
        return allocateRule02;
    }

    public void setAllocateRule02(String allocateRule02) {
        this.allocateRule02 = allocateRule02 == null ? null : allocateRule02.trim();
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin == null ? null : countryOfOrigin.trim();
    }

    public String getDefaultLocation() {
        return defaultLocation;
    }

    public void setDefaultLocation(String defaultLocation) {
        this.defaultLocation = defaultLocation == null ? null : defaultLocation.trim();
    }

    public String getApprovalNo() {
        return approvalNo;
    }

    public void setApprovalNo(String approvalNo) {
        this.approvalNo = approvalNo == null ? null : approvalNo.trim();
    }

    public String getHsCode() {
        return hsCode;
    }

    public void setHsCode(String hsCode) {
        this.hsCode = hsCode == null ? null : hsCode.trim();
    }

    public String getIsBom() {
        return isBom;
    }

    public void setIsBom(String isBom) {
        this.isBom = isBom == null ? null : isBom.trim();
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive == null ? null : isActive.trim();
    }

    public String getIsFragile() {
        return isFragile;
    }

    public void setIsFragile(String isFragile) {
        this.isFragile = isFragile == null ? null : isFragile.trim();
    }

    public String getIsHazardous() {
        return isHazardous;
    }

    public void setIsHazardous(String isHazardous) {
        this.isHazardous = isHazardous == null ? null : isHazardous.trim();
    }

    public String getIsSnMgt() {
        return isSnMgt;
    }

    public void setIsSnMgt(String isSnMgt) {
        this.isSnMgt = isSnMgt == null ? null : isSnMgt.trim();
    }

    public String getSnMode() {
        return snMode;
    }

    public void setSnMode(String snMode) {
        this.snMode = snMode == null ? null : snMode.trim();
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style == null ? null : style.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getSeasonCode() {
        return seasonCode;
    }

    public void setSeasonCode(String seasonCode) {
        this.seasonCode = seasonCode == null ? null : seasonCode.trim();
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode == null ? null : brandCode.trim();
    }

    public String getIsLifeMgt() {
        return isLifeMgt;
    }

    public void setIsLifeMgt(String isLifeMgt) {
        this.isLifeMgt = isLifeMgt == null ? null : isLifeMgt.trim();
    }

    public Integer getLifeCycle() {
        return lifeCycle;
    }

    public void setLifeCycle(Integer lifeCycle) {
        this.lifeCycle = lifeCycle;
    }

    public Integer getRejectCycle() {
        return rejectCycle;
    }

    public void setRejectCycle(Integer rejectCycle) {
        this.rejectCycle = rejectCycle;
    }

    public Integer getWithdrawCycle() {
        return withdrawCycle;
    }

    public void setWithdrawCycle(Integer withdrawCycle) {
        this.withdrawCycle = withdrawCycle;
    }

    public Integer getAdventCycle() {
        return adventCycle;
    }

    public void setAdventCycle(Integer adventCycle) {
        this.adventCycle = adventCycle;
    }

    public String getSudf01() {
        return sudf01;
    }

    public void setSudf01(String sudf01) {
        this.sudf01 = sudf01 == null ? null : sudf01.trim();
    }

    public String getSudf02() {
        return sudf02;
    }

    public void setSudf02(String sudf02) {
        this.sudf02 = sudf02 == null ? null : sudf02.trim();
    }

    public String getSudf03() {
        return sudf03;
    }

    public void setSudf03(String sudf03) {
        this.sudf03 = sudf03 == null ? null : sudf03.trim();
    }

    public String getSudf04() {
        return sudf04;
    }

    public void setSudf04(String sudf04) {
        this.sudf04 = sudf04 == null ? null : sudf04.trim();
    }

    public String getSudf05() {
        return sudf05;
    }

    public void setSudf05(String sudf05) {
        this.sudf05 = sudf05 == null ? null : sudf05.trim();
    }

    public String getSudf06() {
        return sudf06;
    }

    public void setSudf06(String sudf06) {
        this.sudf06 = sudf06 == null ? null : sudf06.trim();
    }

    public String getSudf07() {
        return sudf07;
    }

    public void setSudf07(String sudf07) {
        this.sudf07 = sudf07 == null ? null : sudf07.trim();
    }

    public String getSudf08() {
        return sudf08;
    }

    public void setSudf08(String sudf08) {
        this.sudf08 = sudf08 == null ? null : sudf08.trim();
    }

    public String getSudf09() {
        return sudf09;
    }

    public void setSudf09(String sudf09) {
        this.sudf09 = sudf09 == null ? null : sudf09.trim();
    }

    public String getSudf10() {
        return sudf10;
    }

    public void setSudf10(String sudf10) {
        this.sudf10 = sudf10 == null ? null : sudf10.trim();
    }

    public String getSudf11() {
        return sudf11;
    }

    public void setSudf11(String sudf11) {
        this.sudf11 = sudf11 == null ? null : sudf11.trim();
    }

    public String getSudf12() {
        return sudf12;
    }

    public void setSudf12(String sudf12) {
        this.sudf12 = sudf12 == null ? null : sudf12.trim();
    }

    public String getSudf13() {
        return sudf13;
    }

    public void setSudf13(String sudf13) {
        this.sudf13 = sudf13 == null ? null : sudf13.trim();
    }

    public String getSudf14() {
        return sudf14;
    }

    public void setSudf14(String sudf14) {
        this.sudf14 = sudf14 == null ? null : sudf14.trim();
    }

    public String getSudf15() {
        return sudf15;
    }

    public void setSudf15(String sudf15) {
        this.sudf15 = sudf15 == null ? null : sudf15.trim();
    }

    public String getSudf16() {
        return sudf16;
    }

    public void setSudf16(String sudf16) {
        this.sudf16 = sudf16 == null ? null : sudf16.trim();
    }

    public String getSudf17() {
        return sudf17;
    }

    public void setSudf17(String sudf17) {
        this.sudf17 = sudf17 == null ? null : sudf17.trim();
    }

    public String getSudf18() {
        return sudf18;
    }

    public void setSudf18(String sudf18) {
        this.sudf18 = sudf18 == null ? null : sudf18.trim();
    }

    public String getSudf19() {
        return sudf19;
    }

    public void setSudf19(String sudf19) {
        this.sudf19 = sudf19 == null ? null : sudf19.trim();
    }

    public String getSudf20() {
        return sudf20;
    }

    public void setSudf20(String sudf20) {
        this.sudf20 = sudf20 == null ? null : sudf20.trim();
    }

    public String getSudf21() {
        return sudf21;
    }

    public void setSudf21(String sudf21) {
        this.sudf21 = sudf21 == null ? null : sudf21.trim();
    }

    public String getSudf22() {
        return sudf22;
    }

    public void setSudf22(String sudf22) {
        this.sudf22 = sudf22 == null ? null : sudf22.trim();
    }

    public String getSudf23() {
        return sudf23;
    }

    public void setSudf23(String sudf23) {
        this.sudf23 = sudf23 == null ? null : sudf23.trim();
    }

    public String getSudf24() {
        return sudf24;
    }

    public void setSudf24(String sudf24) {
        this.sudf24 = sudf24 == null ? null : sudf24.trim();
    }

    public String getSudf25() {
        return sudf25;
    }

    public void setSudf25(String sudf25) {
        this.sudf25 = sudf25 == null ? null : sudf25.trim();
    }

    public String getSudf26() {
        return sudf26;
    }

    public void setSudf26(String sudf26) {
        this.sudf26 = sudf26 == null ? null : sudf26.trim();
    }

    public String getSudf27() {
        return sudf27;
    }

    public void setSudf27(String sudf27) {
        this.sudf27 = sudf27 == null ? null : sudf27.trim();
    }

    public String getSudf28() {
        return sudf28;
    }

    public void setSudf28(String sudf28) {
        this.sudf28 = sudf28 == null ? null : sudf28.trim();
    }

    public String getSudf29() {
        return sudf29;
    }

    public void setSudf29(String sudf29) {
        this.sudf29 = sudf29 == null ? null : sudf29.trim();
    }

    public String getSudf30() {
        return sudf30;
    }

    public void setSudf30(String sudf30) {
        this.sudf30 = sudf30 == null ? null : sudf30.trim();
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath == null ? null : photoPath.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy == null ? null : modifyBy.trim();
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode == null ? null : supplierCode.trim();
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public String getDefaultZone() {
        return defaultZone;
    }

    public void setDefaultZone(String defaultZone) {
        this.defaultZone = defaultZone == null ? null : defaultZone.trim();
    }

    public String getDefaultAisle() {
        return defaultAisle;
    }

    public void setDefaultAisle(String defaultAisle) {
        this.defaultAisle = defaultAisle == null ? null : defaultAisle.trim();
    }

    public Integer getMaxQtyL() {
        return maxQtyL;
    }

    public void setMaxQtyL(Integer maxQtyL) {
        this.maxQtyL = maxQtyL;
    }

    public Integer getMaxQtyM() {
        return maxQtyM;
    }

    public void setMaxQtyM(Integer maxQtyM) {
        this.maxQtyM = maxQtyM;
    }

    public Integer getMaxQtyS() {
        return maxQtyS;
    }

    public void setMaxQtyS(Integer maxQtyS) {
        this.maxQtyS = maxQtyS;
    }

    public String getSkuShortDesc() {
        return skuShortDesc;
    }

    public void setSkuShortDesc(String skuShortDesc) {
        this.skuShortDesc = skuShortDesc == null ? null : skuShortDesc.trim();
    }

    public String getItemVersion() {
        return itemVersion;
    }

    public void setItemVersion(String itemVersion) {
        this.itemVersion = itemVersion == null ? null : itemVersion.trim();
    }

    public String getIsSendAgv() {
        return isSendAgv;
    }

    public void setIsSendAgv(String isSendAgv) {
        this.isSendAgv = isSendAgv == null ? null : isSendAgv.trim();
    }

    public String getItemHot() {
        return itemHot;
    }

    public void setItemHot(String itemHot) {
        this.itemHot = itemHot == null ? null : itemHot.trim();
    }

    public String getSudf31() {
        return sudf31;
    }

    public void setSudf31(String sudf31) {
        this.sudf31 = sudf31 == null ? null : sudf31.trim();
    }

    public String getSudf32() {
        return sudf32;
    }

    public void setSudf32(String sudf32) {
        this.sudf32 = sudf32 == null ? null : sudf32.trim();
    }

    public String getSudf33() {
        return sudf33;
    }

    public void setSudf33(String sudf33) {
        this.sudf33 = sudf33 == null ? null : sudf33.trim();
    }

    public String getSudf34() {
        return sudf34;
    }

    public void setSudf34(String sudf34) {
        this.sudf34 = sudf34 == null ? null : sudf34.trim();
    }

    public String getSudf35() {
        return sudf35;
    }

    public void setSudf35(String sudf35) {
        this.sudf35 = sudf35 == null ? null : sudf35.trim();
    }

    public String getSudf36() {
        return sudf36;
    }

    public void setSudf36(String sudf36) {
        this.sudf36 = sudf36 == null ? null : sudf36.trim();
    }

    public String getSudf37() {
        return sudf37;
    }

    public void setSudf37(String sudf37) {
        this.sudf37 = sudf37 == null ? null : sudf37.trim();
    }

    public String getSudf38() {
        return sudf38;
    }

    public void setSudf38(String sudf38) {
        this.sudf38 = sudf38 == null ? null : sudf38.trim();
    }

    public String getSudf39() {
        return sudf39;
    }

    public void setSudf39(String sudf39) {
        this.sudf39 = sudf39 == null ? null : sudf39.trim();
    }

    public String getSudf40() {
        return sudf40;
    }

    public void setSudf40(String sudf40) {
        this.sudf40 = sudf40 == null ? null : sudf40.trim();
    }

    public String getSudf41() {
        return sudf41;
    }

    public void setSudf41(String sudf41) {
        this.sudf41 = sudf41 == null ? null : sudf41.trim();
    }

    public String getSudf42() {
        return sudf42;
    }

    public void setSudf42(String sudf42) {
        this.sudf42 = sudf42 == null ? null : sudf42.trim();
    }

    public String getSudf43() {
        return sudf43;
    }

    public void setSudf43(String sudf43) {
        this.sudf43 = sudf43 == null ? null : sudf43.trim();
    }

    public String getSudf44() {
        return sudf44;
    }

    public void setSudf44(String sudf44) {
        this.sudf44 = sudf44 == null ? null : sudf44.trim();
    }

    public String getSudf45() {
        return sudf45;
    }

    public void setSudf45(String sudf45) {
        this.sudf45 = sudf45 == null ? null : sudf45.trim();
    }

    public String getSudf46() {
        return sudf46;
    }

    public void setSudf46(String sudf46) {
        this.sudf46 = sudf46 == null ? null : sudf46.trim();
    }

    public String getSudf47() {
        return sudf47;
    }

    public void setSudf47(String sudf47) {
        this.sudf47 = sudf47 == null ? null : sudf47.trim();
    }

    public String getSudf48() {
        return sudf48;
    }

    public void setSudf48(String sudf48) {
        this.sudf48 = sudf48 == null ? null : sudf48.trim();
    }

    public String getSudf49() {
        return sudf49;
    }

    public void setSudf49(String sudf49) {
        this.sudf49 = sudf49 == null ? null : sudf49.trim();
    }

    public String getSudf50() {
        return sudf50;
    }

    public void setSudf50(String sudf50) {
        this.sudf50 = sudf50 == null ? null : sudf50.trim();
    }

    public String getShopList() {
        return shopList;
    }

    public void setShopList(String shopList) {
        this.shopList = shopList == null ? null : shopList.trim();
    }

    public String getOrderSourceList() {
        return orderSourceList;
    }

    public void setOrderSourceList(String orderSourceList) {
        this.orderSourceList = orderSourceList == null ? null : orderSourceList.trim();
    }

    public byte[] getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(byte[] timestamp) {
        this.timestamp = timestamp;
    }
}