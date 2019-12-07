package com.customs.hwms.entity.bus;

import java.io.Serializable;
import java.util.Date;

public class REL_HDR extends REL_HDRKey implements Serializable {
    private String status;

    private String orderType;

    private String orderFlag;

    private String orderSource;

    private String warehouse;

    private String sopType;

    private Date releaseDate;

    private Date allocatedDate;

    private Date pickedDate;

    private Date packedDate;

    private Date shippedDate;

    private Date deliveryDate;

    private String isCharge;

    private String poNo;

    private String invNo;

    private String soNo;

    private String carrier;

    private String trackingNo;

    private String custodian;

    private String brand;

    private Integer skuCount;

    private Integer goodsCount;

    private String waveId;

    private String consignee;

    private String conName;

    private String conAddress;

    private String conDivision;

    private String conTown;

    private String conZone;

    private String conCity;

    private String conProvince;

    private String conCountry;

    private String conZip;

    private String conContactName;

    private String conContactPhone;

    private String conContactFax;

    private String conContactEmail;

    private String conRemarks;

    private String shipTo;

    private String stName;

    private String stAddress;

    private String stDivision;

    private String stTown;

    private String stZone;

    private String stCity;

    private String stProvince;

    private String stCountry;

    private String stZip;

    private String stContactName;

    private String stContactPhone;

    private String stContactFax;

    private String stContactEmail;

    private String stRemarks;

    private String recId;

    private Integer recBatchNo;

    private String isSentSc;

    private String ediUpId;

    private String ediBackId;

    private String fileName;

    private String hudf01;

    private String hudf02;

    private String hudf03;

    private String hudf04;

    private String hudf05;

    private String hudf06;

    private String hudf07;

    private String hudf08;

    private String hudf09;

    private String hudf10;

    private String hudf11;

    private String hudf12;

    private String hudf13;

    private String hudf14;

    private String hudf15;

    private String hudf16;

    private String hudf17;

    private String hudf18;

    private String hudf19;

    private String hudf20;

    private String hudf21;

    private String hudf22;

    private String hudf23;

    private String hudf24;

    private String hudf25;

    private String hudf26;

    private String hudf27;

    private String hudf28;

    private String hudf29;

    private String hudf30;

    private String remarks;

    private Integer version;

    private String createBy;

    private Date createDate;

    private String modifyBy;

    private Date modifyDate;

    private String shopCode;

    private String shopNick;

    private String memo;

    private String carrierOrigin;

    private String analysisSku;

    private String analysisZone;

    private String analysisAisle;

    private Date preAllocatedDate;

    private String customType;

    private String businessType;

    private String isAudit;

    private String trackingNoEdi;

    private String analysisLocation;

    private String isSendXb;

    private String sendStatus;

    private String serviceRemarks;

    private String mxtId;

    private String preallocateStatus;

    private Date platPayDate;

    private Date platAddDate;

    private static final long serialVersionUID = 1L;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getOrderFlag() {
        return orderFlag;
    }

    public void setOrderFlag(String orderFlag) {
        this.orderFlag = orderFlag == null ? null : orderFlag.trim();
    }

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource == null ? null : orderSource.trim();
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse == null ? null : warehouse.trim();
    }

    public String getSopType() {
        return sopType;
    }

    public void setSopType(String sopType) {
        this.sopType = sopType == null ? null : sopType.trim();
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Date getAllocatedDate() {
        return allocatedDate;
    }

    public void setAllocatedDate(Date allocatedDate) {
        this.allocatedDate = allocatedDate;
    }

    public Date getPickedDate() {
        return pickedDate;
    }

    public void setPickedDate(Date pickedDate) {
        this.pickedDate = pickedDate;
    }

    public Date getPackedDate() {
        return packedDate;
    }

    public void setPackedDate(Date packedDate) {
        this.packedDate = packedDate;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getIsCharge() {
        return isCharge;
    }

    public void setIsCharge(String isCharge) {
        this.isCharge = isCharge == null ? null : isCharge.trim();
    }

    public String getPoNo() {
        return poNo;
    }

    public void setPoNo(String poNo) {
        this.poNo = poNo == null ? null : poNo.trim();
    }

    public String getInvNo() {
        return invNo;
    }

    public void setInvNo(String invNo) {
        this.invNo = invNo == null ? null : invNo.trim();
    }

    public String getSoNo() {
        return soNo;
    }

    public void setSoNo(String soNo) {
        this.soNo = soNo == null ? null : soNo.trim();
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier == null ? null : carrier.trim();
    }

    public String getTrackingNo() {
        return trackingNo;
    }

    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo == null ? null : trackingNo.trim();
    }

    public String getCustodian() {
        return custodian;
    }

    public void setCustodian(String custodian) {
        this.custodian = custodian == null ? null : custodian.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public Integer getSkuCount() {
        return skuCount;
    }

    public void setSkuCount(Integer skuCount) {
        this.skuCount = skuCount;
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    public String getWaveId() {
        return waveId;
    }

    public void setWaveId(String waveId) {
        this.waveId = waveId == null ? null : waveId.trim();
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getConName() {
        return conName;
    }

    public void setConName(String conName) {
        this.conName = conName == null ? null : conName.trim();
    }

    public String getConAddress() {
        return conAddress;
    }

    public void setConAddress(String conAddress) {
        this.conAddress = conAddress == null ? null : conAddress.trim();
    }

    public String getConDivision() {
        return conDivision;
    }

    public void setConDivision(String conDivision) {
        this.conDivision = conDivision == null ? null : conDivision.trim();
    }

    public String getConTown() {
        return conTown;
    }

    public void setConTown(String conTown) {
        this.conTown = conTown == null ? null : conTown.trim();
    }

    public String getConZone() {
        return conZone;
    }

    public void setConZone(String conZone) {
        this.conZone = conZone == null ? null : conZone.trim();
    }

    public String getConCity() {
        return conCity;
    }

    public void setConCity(String conCity) {
        this.conCity = conCity == null ? null : conCity.trim();
    }

    public String getConProvince() {
        return conProvince;
    }

    public void setConProvince(String conProvince) {
        this.conProvince = conProvince == null ? null : conProvince.trim();
    }

    public String getConCountry() {
        return conCountry;
    }

    public void setConCountry(String conCountry) {
        this.conCountry = conCountry == null ? null : conCountry.trim();
    }

    public String getConZip() {
        return conZip;
    }

    public void setConZip(String conZip) {
        this.conZip = conZip == null ? null : conZip.trim();
    }

    public String getConContactName() {
        return conContactName;
    }

    public void setConContactName(String conContactName) {
        this.conContactName = conContactName == null ? null : conContactName.trim();
    }

    public String getConContactPhone() {
        return conContactPhone;
    }

    public void setConContactPhone(String conContactPhone) {
        this.conContactPhone = conContactPhone == null ? null : conContactPhone.trim();
    }

    public String getConContactFax() {
        return conContactFax;
    }

    public void setConContactFax(String conContactFax) {
        this.conContactFax = conContactFax == null ? null : conContactFax.trim();
    }

    public String getConContactEmail() {
        return conContactEmail;
    }

    public void setConContactEmail(String conContactEmail) {
        this.conContactEmail = conContactEmail == null ? null : conContactEmail.trim();
    }

    public String getConRemarks() {
        return conRemarks;
    }

    public void setConRemarks(String conRemarks) {
        this.conRemarks = conRemarks == null ? null : conRemarks.trim();
    }

    public String getShipTo() {
        return shipTo;
    }

    public void setShipTo(String shipTo) {
        this.shipTo = shipTo == null ? null : shipTo.trim();
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName == null ? null : stName.trim();
    }

    public String getStAddress() {
        return stAddress;
    }

    public void setStAddress(String stAddress) {
        this.stAddress = stAddress == null ? null : stAddress.trim();
    }

    public String getStDivision() {
        return stDivision;
    }

    public void setStDivision(String stDivision) {
        this.stDivision = stDivision == null ? null : stDivision.trim();
    }

    public String getStTown() {
        return stTown;
    }

    public void setStTown(String stTown) {
        this.stTown = stTown == null ? null : stTown.trim();
    }

    public String getStZone() {
        return stZone;
    }

    public void setStZone(String stZone) {
        this.stZone = stZone == null ? null : stZone.trim();
    }

    public String getStCity() {
        return stCity;
    }

    public void setStCity(String stCity) {
        this.stCity = stCity == null ? null : stCity.trim();
    }

    public String getStProvince() {
        return stProvince;
    }

    public void setStProvince(String stProvince) {
        this.stProvince = stProvince == null ? null : stProvince.trim();
    }

    public String getStCountry() {
        return stCountry;
    }

    public void setStCountry(String stCountry) {
        this.stCountry = stCountry == null ? null : stCountry.trim();
    }

    public String getStZip() {
        return stZip;
    }

    public void setStZip(String stZip) {
        this.stZip = stZip == null ? null : stZip.trim();
    }

    public String getStContactName() {
        return stContactName;
    }

    public void setStContactName(String stContactName) {
        this.stContactName = stContactName == null ? null : stContactName.trim();
    }

    public String getStContactPhone() {
        return stContactPhone;
    }

    public void setStContactPhone(String stContactPhone) {
        this.stContactPhone = stContactPhone == null ? null : stContactPhone.trim();
    }

    public String getStContactFax() {
        return stContactFax;
    }

    public void setStContactFax(String stContactFax) {
        this.stContactFax = stContactFax == null ? null : stContactFax.trim();
    }

    public String getStContactEmail() {
        return stContactEmail;
    }

    public void setStContactEmail(String stContactEmail) {
        this.stContactEmail = stContactEmail == null ? null : stContactEmail.trim();
    }

    public String getStRemarks() {
        return stRemarks;
    }

    public void setStRemarks(String stRemarks) {
        this.stRemarks = stRemarks == null ? null : stRemarks.trim();
    }

    public String getRecId() {
        return recId;
    }

    public void setRecId(String recId) {
        this.recId = recId == null ? null : recId.trim();
    }

    public Integer getRecBatchNo() {
        return recBatchNo;
    }

    public void setRecBatchNo(Integer recBatchNo) {
        this.recBatchNo = recBatchNo;
    }

    public String getIsSentSc() {
        return isSentSc;
    }

    public void setIsSentSc(String isSentSc) {
        this.isSentSc = isSentSc == null ? null : isSentSc.trim();
    }

    public String getEdiUpId() {
        return ediUpId;
    }

    public void setEdiUpId(String ediUpId) {
        this.ediUpId = ediUpId == null ? null : ediUpId.trim();
    }

    public String getEdiBackId() {
        return ediBackId;
    }

    public void setEdiBackId(String ediBackId) {
        this.ediBackId = ediBackId == null ? null : ediBackId.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getHudf01() {
        return hudf01;
    }

    public void setHudf01(String hudf01) {
        this.hudf01 = hudf01 == null ? null : hudf01.trim();
    }

    public String getHudf02() {
        return hudf02;
    }

    public void setHudf02(String hudf02) {
        this.hudf02 = hudf02 == null ? null : hudf02.trim();
    }

    public String getHudf03() {
        return hudf03;
    }

    public void setHudf03(String hudf03) {
        this.hudf03 = hudf03 == null ? null : hudf03.trim();
    }

    public String getHudf04() {
        return hudf04;
    }

    public void setHudf04(String hudf04) {
        this.hudf04 = hudf04 == null ? null : hudf04.trim();
    }

    public String getHudf05() {
        return hudf05;
    }

    public void setHudf05(String hudf05) {
        this.hudf05 = hudf05 == null ? null : hudf05.trim();
    }

    public String getHudf06() {
        return hudf06;
    }

    public void setHudf06(String hudf06) {
        this.hudf06 = hudf06 == null ? null : hudf06.trim();
    }

    public String getHudf07() {
        return hudf07;
    }

    public void setHudf07(String hudf07) {
        this.hudf07 = hudf07 == null ? null : hudf07.trim();
    }

    public String getHudf08() {
        return hudf08;
    }

    public void setHudf08(String hudf08) {
        this.hudf08 = hudf08 == null ? null : hudf08.trim();
    }

    public String getHudf09() {
        return hudf09;
    }

    public void setHudf09(String hudf09) {
        this.hudf09 = hudf09 == null ? null : hudf09.trim();
    }

    public String getHudf10() {
        return hudf10;
    }

    public void setHudf10(String hudf10) {
        this.hudf10 = hudf10 == null ? null : hudf10.trim();
    }

    public String getHudf11() {
        return hudf11;
    }

    public void setHudf11(String hudf11) {
        this.hudf11 = hudf11 == null ? null : hudf11.trim();
    }

    public String getHudf12() {
        return hudf12;
    }

    public void setHudf12(String hudf12) {
        this.hudf12 = hudf12 == null ? null : hudf12.trim();
    }

    public String getHudf13() {
        return hudf13;
    }

    public void setHudf13(String hudf13) {
        this.hudf13 = hudf13 == null ? null : hudf13.trim();
    }

    public String getHudf14() {
        return hudf14;
    }

    public void setHudf14(String hudf14) {
        this.hudf14 = hudf14 == null ? null : hudf14.trim();
    }

    public String getHudf15() {
        return hudf15;
    }

    public void setHudf15(String hudf15) {
        this.hudf15 = hudf15 == null ? null : hudf15.trim();
    }

    public String getHudf16() {
        return hudf16;
    }

    public void setHudf16(String hudf16) {
        this.hudf16 = hudf16 == null ? null : hudf16.trim();
    }

    public String getHudf17() {
        return hudf17;
    }

    public void setHudf17(String hudf17) {
        this.hudf17 = hudf17 == null ? null : hudf17.trim();
    }

    public String getHudf18() {
        return hudf18;
    }

    public void setHudf18(String hudf18) {
        this.hudf18 = hudf18 == null ? null : hudf18.trim();
    }

    public String getHudf19() {
        return hudf19;
    }

    public void setHudf19(String hudf19) {
        this.hudf19 = hudf19 == null ? null : hudf19.trim();
    }

    public String getHudf20() {
        return hudf20;
    }

    public void setHudf20(String hudf20) {
        this.hudf20 = hudf20 == null ? null : hudf20.trim();
    }

    public String getHudf21() {
        return hudf21;
    }

    public void setHudf21(String hudf21) {
        this.hudf21 = hudf21 == null ? null : hudf21.trim();
    }

    public String getHudf22() {
        return hudf22;
    }

    public void setHudf22(String hudf22) {
        this.hudf22 = hudf22 == null ? null : hudf22.trim();
    }

    public String getHudf23() {
        return hudf23;
    }

    public void setHudf23(String hudf23) {
        this.hudf23 = hudf23 == null ? null : hudf23.trim();
    }

    public String getHudf24() {
        return hudf24;
    }

    public void setHudf24(String hudf24) {
        this.hudf24 = hudf24 == null ? null : hudf24.trim();
    }

    public String getHudf25() {
        return hudf25;
    }

    public void setHudf25(String hudf25) {
        this.hudf25 = hudf25 == null ? null : hudf25.trim();
    }

    public String getHudf26() {
        return hudf26;
    }

    public void setHudf26(String hudf26) {
        this.hudf26 = hudf26 == null ? null : hudf26.trim();
    }

    public String getHudf27() {
        return hudf27;
    }

    public void setHudf27(String hudf27) {
        this.hudf27 = hudf27 == null ? null : hudf27.trim();
    }

    public String getHudf28() {
        return hudf28;
    }

    public void setHudf28(String hudf28) {
        this.hudf28 = hudf28 == null ? null : hudf28.trim();
    }

    public String getHudf29() {
        return hudf29;
    }

    public void setHudf29(String hudf29) {
        this.hudf29 = hudf29 == null ? null : hudf29.trim();
    }

    public String getHudf30() {
        return hudf30;
    }

    public void setHudf30(String hudf30) {
        this.hudf30 = hudf30 == null ? null : hudf30.trim();
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

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode == null ? null : shopCode.trim();
    }

    public String getShopNick() {
        return shopNick;
    }

    public void setShopNick(String shopNick) {
        this.shopNick = shopNick == null ? null : shopNick.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getCarrierOrigin() {
        return carrierOrigin;
    }

    public void setCarrierOrigin(String carrierOrigin) {
        this.carrierOrigin = carrierOrigin == null ? null : carrierOrigin.trim();
    }

    public String getAnalysisSku() {
        return analysisSku;
    }

    public void setAnalysisSku(String analysisSku) {
        this.analysisSku = analysisSku == null ? null : analysisSku.trim();
    }

    public String getAnalysisZone() {
        return analysisZone;
    }

    public void setAnalysisZone(String analysisZone) {
        this.analysisZone = analysisZone == null ? null : analysisZone.trim();
    }

    public String getAnalysisAisle() {
        return analysisAisle;
    }

    public void setAnalysisAisle(String analysisAisle) {
        this.analysisAisle = analysisAisle == null ? null : analysisAisle.trim();
    }

    public Date getPreAllocatedDate() {
        return preAllocatedDate;
    }

    public void setPreAllocatedDate(Date preAllocatedDate) {
        this.preAllocatedDate = preAllocatedDate;
    }

    public String getCustomType() {
        return customType;
    }

    public void setCustomType(String customType) {
        this.customType = customType == null ? null : customType.trim();
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    public String getIsAudit() {
        return isAudit;
    }

    public void setIsAudit(String isAudit) {
        this.isAudit = isAudit == null ? null : isAudit.trim();
    }

    public String getTrackingNoEdi() {
        return trackingNoEdi;
    }

    public void setTrackingNoEdi(String trackingNoEdi) {
        this.trackingNoEdi = trackingNoEdi == null ? null : trackingNoEdi.trim();
    }

    public String getAnalysisLocation() {
        return analysisLocation;
    }

    public void setAnalysisLocation(String analysisLocation) {
        this.analysisLocation = analysisLocation == null ? null : analysisLocation.trim();
    }

    public String getIsSendXb() {
        return isSendXb;
    }

    public void setIsSendXb(String isSendXb) {
        this.isSendXb = isSendXb == null ? null : isSendXb.trim();
    }

    public String getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus == null ? null : sendStatus.trim();
    }

    public String getServiceRemarks() {
        return serviceRemarks;
    }

    public void setServiceRemarks(String serviceRemarks) {
        this.serviceRemarks = serviceRemarks == null ? null : serviceRemarks.trim();
    }

    public String getMxtId() {
        return mxtId;
    }

    public void setMxtId(String mxtId) {
        this.mxtId = mxtId == null ? null : mxtId.trim();
    }

    public String getPreallocateStatus() {
        return preallocateStatus;
    }

    public void setPreallocateStatus(String preallocateStatus) {
        this.preallocateStatus = preallocateStatus == null ? null : preallocateStatus.trim();
    }

    public Date getPlatPayDate() {
        return platPayDate;
    }

    public void setPlatPayDate(Date platPayDate) {
        this.platPayDate = platPayDate;
    }

    public Date getPlatAddDate() {
        return platAddDate;
    }

    public void setPlatAddDate(Date platAddDate) {
        this.platAddDate = platAddDate;
    }
}