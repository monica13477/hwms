package com.customs.hwms.entity.bus;

import java.io.Serializable;

public class ASN_HDRKey implements Serializable {
    private String workCenter;

    private String storerId;

    private String asnId;

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

    public String getAsnId() {
        return asnId;
    }

    public void setAsnId(String asnId) {
        this.asnId = asnId == null ? null : asnId.trim();
    }
}