package com.customs.hwms.entity.cfg;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;
import java.util.Date;

public class SYS_Menu implements Serializable {
    private String mid;

    private String pid;

    private Date modifydate;

    private String mcode;

    private String mname;

    private Integer islastlevel;

    private String openname;

    private String filename;

    private String filetype;

    private String paramlist;

    private Integer layer;

    private Integer morder;

    private String shortcut;

    private Integer subsystem;

    private Integer issystem;

    private String memo;



    private static final long serialVersionUID = 1L;

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid == null ? null : mid.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public String getMcode() {
        return mcode;
    }

    public void setMcode(String mcode) {
        this.mcode = mcode == null ? null : mcode.trim();
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public Integer getIslastlevel() {
        return islastlevel;
    }

    public void setIslastlevel(Integer islastlevel) {
        this.islastlevel = islastlevel;
    }

    public String getOpenname() {
        return openname;
    }

    public void setOpenname(String openname) {
        this.openname = openname == null ? null : openname.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }

    public String getParamlist() {
        return paramlist;
    }

    public void setParamlist(String paramlist) {
        this.paramlist = paramlist == null ? null : paramlist.trim();
    }

    public Integer getLayer() {
        return layer;
    }

    public void setLayer(Integer layer) {
        this.layer = layer;
    }

    public Integer getMorder() {
        return morder;
    }

    public void setMorder(Integer morder) {
        this.morder = morder;
    }

    public String getShortcut() {
        return shortcut;
    }

    public void setShortcut(String shortcut) {
        this.shortcut = shortcut == null ? null : shortcut.trim();
    }

    public Integer getSubsystem() {
        return subsystem;
    }

    public void setSubsystem(Integer subsystem) {
        this.subsystem = subsystem;
    }

    public Integer getIssystem() {
        return issystem;
    }

    public void setIssystem(Integer issystem) {
        this.issystem = issystem;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }


}