package com.customs.hwms.entity.cfg;

import java.io.Serializable;

public class Sys_Config implements Serializable {
    private String cfgid;

    private String workCenter;

    private String cfgname;

    private Integer connectmode;

    private String dbtype;

    private String busconnectstring;

    private String configconnectstring;

    private String logconnectstring;

    private String webconnectstring;

    private String url;

    private String remoteurl;

    private Integer status;

    private String memo;

    private String systemVersion;

    private String newUrl;

    private String newRemoteurl;

    private static final long serialVersionUID = 1L;

    public String getCfgid() {
        return cfgid;
    }

    public void setCfgid(String cfgid) {
        this.cfgid = cfgid == null ? null : cfgid.trim();
    }

    public String getWorkCenter() {
        return workCenter;
    }

    public void setWorkCenter(String workCenter) {
        this.workCenter = workCenter == null ? null : workCenter.trim();
    }

    public String getCfgname() {
        return cfgname;
    }

    public void setCfgname(String cfgname) {
        this.cfgname = cfgname == null ? null : cfgname.trim();
    }

    public Integer getConnectmode() {
        return connectmode;
    }

    public void setConnectmode(Integer connectmode) {
        this.connectmode = connectmode;
    }

    public String getDbtype() {
        return dbtype;
    }

    public void setDbtype(String dbtype) {
        this.dbtype = dbtype == null ? null : dbtype.trim();
    }

    public String getBusconnectstring() {
        return busconnectstring;
    }

    public void setBusconnectstring(String busconnectstring) {
        this.busconnectstring = busconnectstring == null ? null : busconnectstring.trim();
    }

    public String getConfigconnectstring() {
        return configconnectstring;
    }

    public void setConfigconnectstring(String configconnectstring) {
        this.configconnectstring = configconnectstring == null ? null : configconnectstring.trim();
    }

    public String getLogconnectstring() {
        return logconnectstring;
    }

    public void setLogconnectstring(String logconnectstring) {
        this.logconnectstring = logconnectstring == null ? null : logconnectstring.trim();
    }

    public String getWebconnectstring() {
        return webconnectstring;
    }

    public void setWebconnectstring(String webconnectstring) {
        this.webconnectstring = webconnectstring == null ? null : webconnectstring.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getRemoteurl() {
        return remoteurl;
    }

    public void setRemoteurl(String remoteurl) {
        this.remoteurl = remoteurl == null ? null : remoteurl.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getSystemVersion() {
        return systemVersion;
    }

    public void setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion == null ? null : systemVersion.trim();
    }

    public String getNewUrl() {
        return newUrl;
    }

    public void setNewUrl(String newUrl) {
        this.newUrl = newUrl == null ? null : newUrl.trim();
    }

    public String getNewRemoteurl() {
        return newRemoteurl;
    }

    public void setNewRemoteurl(String newRemoteurl) {
        this.newRemoteurl = newRemoteurl == null ? null : newRemoteurl.trim();
    }
}