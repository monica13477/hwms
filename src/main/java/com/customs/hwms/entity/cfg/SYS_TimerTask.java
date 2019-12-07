package com.customs.hwms.entity.cfg;

import java.io.Serializable;
import java.util.Date;

public class SYS_TimerTask implements Serializable {
    private String taskid;

    private String taskname;

    private String dllfile;

    private String runobj;

    private String param1;

    private String param2;

    private Integer status;

    private Integer freqtype;

    private Integer freqinterval;

    private String freqvalue;

    private Integer freqsubtype;

    private String freqsubinterval;

    private Date substarttime;

    private Date subendtime;

    private Date startday;

    private Date endday;

    private Boolean isinfinite;

    private String creator;

    private Date createdate;

    private String lastmodify;

    private Date modifydate;

    private String memo;

    private String ex1;

    private String ex2;

    private String origsystem;

    private static final long serialVersionUID = 1L;

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid == null ? null : taskid.trim();
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname == null ? null : taskname.trim();
    }

    public String getDllfile() {
        return dllfile;
    }

    public void setDllfile(String dllfile) {
        this.dllfile = dllfile == null ? null : dllfile.trim();
    }

    public String getRunobj() {
        return runobj;
    }

    public void setRunobj(String runobj) {
        this.runobj = runobj == null ? null : runobj.trim();
    }

    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1 == null ? null : param1.trim();
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2 == null ? null : param2.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFreqtype() {
        return freqtype;
    }

    public void setFreqtype(Integer freqtype) {
        this.freqtype = freqtype;
    }

    public Integer getFreqinterval() {
        return freqinterval;
    }

    public void setFreqinterval(Integer freqinterval) {
        this.freqinterval = freqinterval;
    }

    public String getFreqvalue() {
        return freqvalue;
    }

    public void setFreqvalue(String freqvalue) {
        this.freqvalue = freqvalue == null ? null : freqvalue.trim();
    }

    public Integer getFreqsubtype() {
        return freqsubtype;
    }

    public void setFreqsubtype(Integer freqsubtype) {
        this.freqsubtype = freqsubtype;
    }

    public String getFreqsubinterval() {
        return freqsubinterval;
    }

    public void setFreqsubinterval(String freqsubinterval) {
        this.freqsubinterval = freqsubinterval == null ? null : freqsubinterval.trim();
    }

    public Date getSubstarttime() {
        return substarttime;
    }

    public void setSubstarttime(Date substarttime) {
        this.substarttime = substarttime;
    }

    public Date getSubendtime() {
        return subendtime;
    }

    public void setSubendtime(Date subendtime) {
        this.subendtime = subendtime;
    }

    public Date getStartday() {
        return startday;
    }

    public void setStartday(Date startday) {
        this.startday = startday;
    }

    public Date getEndday() {
        return endday;
    }

    public void setEndday(Date endday) {
        this.endday = endday;
    }

    public Boolean getIsinfinite() {
        return isinfinite;
    }

    public void setIsinfinite(Boolean isinfinite) {
        this.isinfinite = isinfinite;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getLastmodify() {
        return lastmodify;
    }

    public void setLastmodify(String lastmodify) {
        this.lastmodify = lastmodify == null ? null : lastmodify.trim();
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getEx1() {
        return ex1;
    }

    public void setEx1(String ex1) {
        this.ex1 = ex1 == null ? null : ex1.trim();
    }

    public String getEx2() {
        return ex2;
    }

    public void setEx2(String ex2) {
        this.ex2 = ex2 == null ? null : ex2.trim();
    }

    public String getOrigsystem() {
        return origsystem;
    }

    public void setOrigsystem(String origsystem) {
        this.origsystem = origsystem == null ? null : origsystem.trim();
    }
}