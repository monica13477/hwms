package com.customs.hwms.entity.bus;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class REL_DTL extends REL_DTLKey implements Serializable {
    private String status;

    private String sku;

    private String skuDesc;

    private String skuStatus;

    private String packageCode;

    private BigDecimal packageQty;

    private BigDecimal unitPrice;

    private Date expiryDate;

    private Date manufDate;

    private String allocateRule01;

    private String allocateRule02;

    private BigDecimal releaseQty;

    private BigDecimal relBaseQty;

    private BigDecimal allocatedQty;

    private BigDecimal pickedQty;

    private BigDecimal shippedQty;

    private String lotId;

    private String originalLotId;

    private String location;

    private String cartonNo;

    private String palletNo;

    private Long recLineSeq;

    private String dudf01;

    private String dudf02;

    private String dudf03;

    private String dudf04;

    private String dudf05;

    private String dudf06;

    private String dudf07;

    private String dudf08;

    private String dudf09;

    private String dudf10;

    private String dudf11;

    private String dudf12;

    private String dudf13;

    private String dudf14;

    private String dudf15;

    private String dudf16;

    private String dudf17;

    private String dudf18;

    private String dudf19;

    private String dudf20;

    private String dudf21;

    private String dudf22;

    private String dudf23;

    private String dudf24;

    private String dudf25;

    private String dudf26;

    private String dudf27;

    private String dudf28;

    private String dudf29;

    private String dudf30;

    private String remarks;

    private Integer version;

    private String createBy;

    private Date createDate;

    private String modifyBy;

    private Date modifyDate;

    private String productLot;

    private String productBatch;

    private BigDecimal discrepancyQty;

    private BigDecimal preAllocatedQty;

    private String skuUpc;

    private String preallocateStatus;

    private Long psoLineSeq;

    private static final long serialVersionUID = 1L;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public String getSkuDesc() {
        return skuDesc;
    }

    public void setSkuDesc(String skuDesc) {
        this.skuDesc = skuDesc == null ? null : skuDesc.trim();
    }

    public String getSkuStatus() {
        return skuStatus;
    }

    public void setSkuStatus(String skuStatus) {
        this.skuStatus = skuStatus == null ? null : skuStatus.trim();
    }

    public String getPackageCode() {
        return packageCode;
    }

    public void setPackageCode(String packageCode) {
        this.packageCode = packageCode == null ? null : packageCode.trim();
    }

    public BigDecimal getPackageQty() {
        return packageQty;
    }

    public void setPackageQty(BigDecimal packageQty) {
        this.packageQty = packageQty;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Date getManufDate() {
        return manufDate;
    }

    public void setManufDate(Date manufDate) {
        this.manufDate = manufDate;
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

    public BigDecimal getReleaseQty() {
        return releaseQty;
    }

    public void setReleaseQty(BigDecimal releaseQty) {
        this.releaseQty = releaseQty;
    }

    public BigDecimal getRelBaseQty() {
        return relBaseQty;
    }

    public void setRelBaseQty(BigDecimal relBaseQty) {
        this.relBaseQty = relBaseQty;
    }

    public BigDecimal getAllocatedQty() {
        return allocatedQty;
    }

    public void setAllocatedQty(BigDecimal allocatedQty) {
        this.allocatedQty = allocatedQty;
    }

    public BigDecimal getPickedQty() {
        return pickedQty;
    }

    public void setPickedQty(BigDecimal pickedQty) {
        this.pickedQty = pickedQty;
    }

    public BigDecimal getShippedQty() {
        return shippedQty;
    }

    public void setShippedQty(BigDecimal shippedQty) {
        this.shippedQty = shippedQty;
    }

    public String getLotId() {
        return lotId;
    }

    public void setLotId(String lotId) {
        this.lotId = lotId == null ? null : lotId.trim();
    }

    public String getOriginalLotId() {
        return originalLotId;
    }

    public void setOriginalLotId(String originalLotId) {
        this.originalLotId = originalLotId == null ? null : originalLotId.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getCartonNo() {
        return cartonNo;
    }

    public void setCartonNo(String cartonNo) {
        this.cartonNo = cartonNo == null ? null : cartonNo.trim();
    }

    public String getPalletNo() {
        return palletNo;
    }

    public void setPalletNo(String palletNo) {
        this.palletNo = palletNo == null ? null : palletNo.trim();
    }

    public Long getRecLineSeq() {
        return recLineSeq;
    }

    public void setRecLineSeq(Long recLineSeq) {
        this.recLineSeq = recLineSeq;
    }

    public String getDudf01() {
        return dudf01;
    }

    public void setDudf01(String dudf01) {
        this.dudf01 = dudf01 == null ? null : dudf01.trim();
    }

    public String getDudf02() {
        return dudf02;
    }

    public void setDudf02(String dudf02) {
        this.dudf02 = dudf02 == null ? null : dudf02.trim();
    }

    public String getDudf03() {
        return dudf03;
    }

    public void setDudf03(String dudf03) {
        this.dudf03 = dudf03 == null ? null : dudf03.trim();
    }

    public String getDudf04() {
        return dudf04;
    }

    public void setDudf04(String dudf04) {
        this.dudf04 = dudf04 == null ? null : dudf04.trim();
    }

    public String getDudf05() {
        return dudf05;
    }

    public void setDudf05(String dudf05) {
        this.dudf05 = dudf05 == null ? null : dudf05.trim();
    }

    public String getDudf06() {
        return dudf06;
    }

    public void setDudf06(String dudf06) {
        this.dudf06 = dudf06 == null ? null : dudf06.trim();
    }

    public String getDudf07() {
        return dudf07;
    }

    public void setDudf07(String dudf07) {
        this.dudf07 = dudf07 == null ? null : dudf07.trim();
    }

    public String getDudf08() {
        return dudf08;
    }

    public void setDudf08(String dudf08) {
        this.dudf08 = dudf08 == null ? null : dudf08.trim();
    }

    public String getDudf09() {
        return dudf09;
    }

    public void setDudf09(String dudf09) {
        this.dudf09 = dudf09 == null ? null : dudf09.trim();
    }

    public String getDudf10() {
        return dudf10;
    }

    public void setDudf10(String dudf10) {
        this.dudf10 = dudf10 == null ? null : dudf10.trim();
    }

    public String getDudf11() {
        return dudf11;
    }

    public void setDudf11(String dudf11) {
        this.dudf11 = dudf11 == null ? null : dudf11.trim();
    }

    public String getDudf12() {
        return dudf12;
    }

    public void setDudf12(String dudf12) {
        this.dudf12 = dudf12 == null ? null : dudf12.trim();
    }

    public String getDudf13() {
        return dudf13;
    }

    public void setDudf13(String dudf13) {
        this.dudf13 = dudf13 == null ? null : dudf13.trim();
    }

    public String getDudf14() {
        return dudf14;
    }

    public void setDudf14(String dudf14) {
        this.dudf14 = dudf14 == null ? null : dudf14.trim();
    }

    public String getDudf15() {
        return dudf15;
    }

    public void setDudf15(String dudf15) {
        this.dudf15 = dudf15 == null ? null : dudf15.trim();
    }

    public String getDudf16() {
        return dudf16;
    }

    public void setDudf16(String dudf16) {
        this.dudf16 = dudf16 == null ? null : dudf16.trim();
    }

    public String getDudf17() {
        return dudf17;
    }

    public void setDudf17(String dudf17) {
        this.dudf17 = dudf17 == null ? null : dudf17.trim();
    }

    public String getDudf18() {
        return dudf18;
    }

    public void setDudf18(String dudf18) {
        this.dudf18 = dudf18 == null ? null : dudf18.trim();
    }

    public String getDudf19() {
        return dudf19;
    }

    public void setDudf19(String dudf19) {
        this.dudf19 = dudf19 == null ? null : dudf19.trim();
    }

    public String getDudf20() {
        return dudf20;
    }

    public void setDudf20(String dudf20) {
        this.dudf20 = dudf20 == null ? null : dudf20.trim();
    }

    public String getDudf21() {
        return dudf21;
    }

    public void setDudf21(String dudf21) {
        this.dudf21 = dudf21 == null ? null : dudf21.trim();
    }

    public String getDudf22() {
        return dudf22;
    }

    public void setDudf22(String dudf22) {
        this.dudf22 = dudf22 == null ? null : dudf22.trim();
    }

    public String getDudf23() {
        return dudf23;
    }

    public void setDudf23(String dudf23) {
        this.dudf23 = dudf23 == null ? null : dudf23.trim();
    }

    public String getDudf24() {
        return dudf24;
    }

    public void setDudf24(String dudf24) {
        this.dudf24 = dudf24 == null ? null : dudf24.trim();
    }

    public String getDudf25() {
        return dudf25;
    }

    public void setDudf25(String dudf25) {
        this.dudf25 = dudf25 == null ? null : dudf25.trim();
    }

    public String getDudf26() {
        return dudf26;
    }

    public void setDudf26(String dudf26) {
        this.dudf26 = dudf26 == null ? null : dudf26.trim();
    }

    public String getDudf27() {
        return dudf27;
    }

    public void setDudf27(String dudf27) {
        this.dudf27 = dudf27 == null ? null : dudf27.trim();
    }

    public String getDudf28() {
        return dudf28;
    }

    public void setDudf28(String dudf28) {
        this.dudf28 = dudf28 == null ? null : dudf28.trim();
    }

    public String getDudf29() {
        return dudf29;
    }

    public void setDudf29(String dudf29) {
        this.dudf29 = dudf29 == null ? null : dudf29.trim();
    }

    public String getDudf30() {
        return dudf30;
    }

    public void setDudf30(String dudf30) {
        this.dudf30 = dudf30 == null ? null : dudf30.trim();
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

    public String getProductLot() {
        return productLot;
    }

    public void setProductLot(String productLot) {
        this.productLot = productLot == null ? null : productLot.trim();
    }

    public String getProductBatch() {
        return productBatch;
    }

    public void setProductBatch(String productBatch) {
        this.productBatch = productBatch == null ? null : productBatch.trim();
    }

    public BigDecimal getDiscrepancyQty() {
        return discrepancyQty;
    }

    public void setDiscrepancyQty(BigDecimal discrepancyQty) {
        this.discrepancyQty = discrepancyQty;
    }

    public BigDecimal getPreAllocatedQty() {
        return preAllocatedQty;
    }

    public void setPreAllocatedQty(BigDecimal preAllocatedQty) {
        this.preAllocatedQty = preAllocatedQty;
    }

    public String getSkuUpc() {
        return skuUpc;
    }

    public void setSkuUpc(String skuUpc) {
        this.skuUpc = skuUpc == null ? null : skuUpc.trim();
    }

    public String getPreallocateStatus() {
        return preallocateStatus;
    }

    public void setPreallocateStatus(String preallocateStatus) {
        this.preallocateStatus = preallocateStatus == null ? null : preallocateStatus.trim();
    }

    public Long getPsoLineSeq() {
        return psoLineSeq;
    }

    public void setPsoLineSeq(Long psoLineSeq) {
        this.psoLineSeq = psoLineSeq;
    }
}