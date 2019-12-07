package com.customs.hwms.entity.bus;

import java.io.Serializable;

public class REL_DTLKey implements Serializable {
    private String workCenter;

    private String storerId;

    private String relId;

    private Integer batchNo;

    private Long relLineSeq;

    private static final long serialVersionUID = 1L;

    public String getWorkCenter() {
        return workCenter;
    }

    public void setWorkCenter(String workCenter) {
        this.workCenter = workCenter == null ? null : workCenter.trim();
    }

    public String getStorerId() {
        return storerId;
    }

    public void setStorerId(String storerId) {
        this.storerId = storerId == null ? null : storerId.trim();
    }

    public String getRelId() {
        return relId;
    }

    public void setRelId(String relId) {
        this.relId = relId == null ? null : relId.trim();
    }

    public Integer getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(Integer batchNo) {
        this.batchNo = batchNo;
    }

    public Long getRelLineSeq() {
        return relLineSeq;
    }

    public void setRelLineSeq(Long relLineSeq) {
        this.relLineSeq = relLineSeq;
    }
}