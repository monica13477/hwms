package com.customs.hwms.entity.bus;

import java.io.Serializable;
import java.util.Date;

public class ASN_HDR extends ASN_HDRKey implements Serializable {
    private String status;

    private String warehouse;

    private String orderType;

    private String orderFlag;

    private String orderSource;

    private Date expRecDate;

    private Date receiveDate;

    private String isCharge;

    private String poNo;

    private String invNo;

    private String soNo;

    private String carrier;

    private String trackingNo;

    private String relId;

    private Integer relBatchNo;

    private String custodian;

    private String brand;

    private String supCode;

    private String supName;

    private String supAddress;

    private String supDivision;

    private String supTown;

    private String supZone;

    private String supCity;

    private String supProvince;

    private String supCountry;

    private String supZip;

    private String supContactName;

    private String supContactPhone;

    private String supContactFax;

    private String supContactEmail;

    private String supRemarks;

    private String custCode;

    private String custName;

    private String custAddress;

    private String custDivision;

    private String custTown;

    private String custZone;

    private String custCity;

    private String custProvince;

    private String custCountry;

    private String custZip;

    private String custContactName;

    private String custContactPhone;

    private String custContactFax;

    private String custContactEmail;

    private String custRemarks;

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

    private String customType;

    private String businessType;

    private String sendStatus;

    private String isAudit;

    private static final long serialVersionUID = 1L;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse == null ? null : warehouse.trim();
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

    public Date getExpRecDate() {
        return expRecDate;
    }

    public void setExpRecDate(Date expRecDate) {
        this.expRecDate = expRecDate;
    }

    public Date getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
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

    public String getRelId() {
        return relId;
    }

    public void setRelId(String relId) {
        this.relId = relId == null ? null : relId.trim();
    }

    public Integer getRelBatchNo() {
        return relBatchNo;
    }

    public void setRelBatchNo(Integer relBatchNo) {
        this.relBatchNo = relBatchNo;
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

    public String getSupCode() {
        return supCode;
    }

    public void setSupCode(String supCode) {
        this.supCode = supCode == null ? null : supCode.trim();
    }

    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName == null ? null : supName.trim();
    }

    public String getSupAddress() {
        return supAddress;
    }

    public void setSupAddress(String supAddress) {
        this.supAddress = supAddress == null ? null : supAddress.trim();
    }

    public String getSupDivision() {
        return supDivision;
    }

    public void setSupDivision(String supDivision) {
        this.supDivision = supDivision == null ? null : supDivision.trim();
    }

    public String getSupTown() {
        return supTown;
    }

    public void setSupTown(String supTown) {
        this.supTown = supTown == null ? null : supTown.trim();
    }

    public String getSupZone() {
        return supZone;
    }

    public void setSupZone(String supZone) {
        this.supZone = supZone == null ? null : supZone.trim();
    }

    public String getSupCity() {
        return supCity;
    }

    public void setSupCity(String supCity) {
        this.supCity = supCity == null ? null : supCity.trim();
    }

    public String getSupProvince() {
        return supProvince;
    }

    public void setSupProvince(String supProvince) {
        this.supProvince = supProvince == null ? null : supProvince.trim();
    }

    public String getSupCountry() {
        return supCountry;
    }

    public void setSupCountry(String supCountry) {
        this.supCountry = supCountry == null ? null : supCountry.trim();
    }

    public String getSupZip() {
        return supZip;
    }

    public void setSupZip(String supZip) {
        this.supZip = supZip == null ? null : supZip.trim();
    }

    public String getSupContactName() {
        return supContactName;
    }

    public void setSupContactName(String supContactName) {
        this.supContactName = supContactName == null ? null : supContactName.trim();
    }

    public String getSupContactPhone() {
        return supContactPhone;
    }

    public void setSupContactPhone(String supContactPhone) {
        this.supContactPhone = supContactPhone == null ? null : supContactPhone.trim();
    }

    public String getSupContactFax() {
        return supContactFax;
    }

    public void setSupContactFax(String supContactFax) {
        this.supContactFax = supContactFax == null ? null : supContactFax.trim();
    }

    public String getSupContactEmail() {
        return supContactEmail;
    }

    public void setSupContactEmail(String supContactEmail) {
        this.supContactEmail = supContactEmail == null ? null : supContactEmail.trim();
    }

    public String getSupRemarks() {
        return supRemarks;
    }

    public void setSupRemarks(String supRemarks) {
        this.supRemarks = supRemarks == null ? null : supRemarks.trim();
    }

    public String getCustCode() {
        return custCode;
    }

    public void setCustCode(String custCode) {
        this.custCode = custCode == null ? null : custCode.trim();
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress == null ? null : custAddress.trim();
    }

    public String getCustDivision() {
        return custDivision;
    }

    public void setCustDivision(String custDivision) {
        this.custDivision = custDivision == null ? null : custDivision.trim();
    }

    public String getCustTown() {
        return custTown;
    }

    public void setCustTown(String custTown) {
        this.custTown = custTown == null ? null : custTown.trim();
    }

    public String getCustZone() {
        return custZone;
    }

    public void setCustZone(String custZone) {
        this.custZone = custZone == null ? null : custZone.trim();
    }

    public String getCustCity() {
        return custCity;
    }

    public void setCustCity(String custCity) {
        this.custCity = custCity == null ? null : custCity.trim();
    }

    public String getCustProvince() {
        return custProvince;
    }

    public void setCustProvince(String custProvince) {
        this.custProvince = custProvince == null ? null : custProvince.trim();
    }

    public String getCustCountry() {
        return custCountry;
    }

    public void setCustCountry(String custCountry) {
        this.custCountry = custCountry == null ? null : custCountry.trim();
    }

    public String getCustZip() {
        return custZip;
    }

    public void setCustZip(String custZip) {
        this.custZip = custZip == null ? null : custZip.trim();
    }

    public String getCustContactName() {
        return custContactName;
    }

    public void setCustContactName(String custContactName) {
        this.custContactName = custContactName == null ? null : custContactName.trim();
    }

    public String getCustContactPhone() {
        return custContactPhone;
    }

    public void setCustContactPhone(String custContactPhone) {
        this.custContactPhone = custContactPhone == null ? null : custContactPhone.trim();
    }

    public String getCustContactFax() {
        return custContactFax;
    }

    public void setCustContactFax(String custContactFax) {
        this.custContactFax = custContactFax == null ? null : custContactFax.trim();
    }

    public String getCustContactEmail() {
        return custContactEmail;
    }

    public void setCustContactEmail(String custContactEmail) {
        this.custContactEmail = custContactEmail == null ? null : custContactEmail.trim();
    }

    public String getCustRemarks() {
        return custRemarks;
    }

    public void setCustRemarks(String custRemarks) {
        this.custRemarks = custRemarks == null ? null : custRemarks.trim();
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

    public String getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus == null ? null : sendStatus.trim();
    }

    public String getIsAudit() {
        return isAudit;
    }

    public void setIsAudit(String isAudit) {
        this.isAudit = isAudit == null ? null : isAudit.trim();
    }
}