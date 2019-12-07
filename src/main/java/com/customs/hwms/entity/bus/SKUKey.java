package com.customs.hwms.entity.bus;

import java.io.Serializable;

public class SKUKey implements Serializable {
    private String workCenter;

    private String storerId;

    private String sku;

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

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }
}