package com.customs.hwms.entity.cfg;

import java.io.Serializable;
import java.util.Date;

public class SYS_User implements Serializable {
    private String userid;

    private String userpwd;

    private String employeeid;

    private String companyid;

    private String defaultckid;

    private Integer status;

    private String remark;

    private Date createdate;

    private Date modifydate;

    private Date expiredate;

    private Date forbidlogindate;

    private Integer enforcepwdpolicy;

    private Integer enforceexpirepolicy;

    private String pwdpolicytype;

    private String ex1;

    private String ex2;

    private Integer ex3;

    private Integer ex4;

    private String pdapwd;

    private String sex;

    private String personname;

    private String idNumber;

    private String cellNumber;

    private String userType;

    private byte[] timestamp;

    private static final long serialVersionUID = 1L;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd == null ? null : userpwd.trim();
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid == null ? null : employeeid.trim();
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid == null ? null : companyid.trim();
    }

    public String getDefaultckid() {
        return defaultckid;
    }

    public void setDefaultckid(String defaultckid) {
        this.defaultckid = defaultckid == null ? null : defaultckid.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public Date getExpiredate() {
        return expiredate;
    }

    public void setExpiredate(Date expiredate) {
        this.expiredate = expiredate;
    }

    public Date getForbidlogindate() {
        return forbidlogindate;
    }

    public void setForbidlogindate(Date forbidlogindate) {
        this.forbidlogindate = forbidlogindate;
    }

    public Integer getEnforcepwdpolicy() {
        return enforcepwdpolicy;
    }

    public void setEnforcepwdpolicy(Integer enforcepwdpolicy) {
        this.enforcepwdpolicy = enforcepwdpolicy;
    }

    public Integer getEnforceexpirepolicy() {
        return enforceexpirepolicy;
    }

    public void setEnforceexpirepolicy(Integer enforceexpirepolicy) {
        this.enforceexpirepolicy = enforceexpirepolicy;
    }

    public String getPwdpolicytype() {
        return pwdpolicytype;
    }

    public void setPwdpolicytype(String pwdpolicytype) {
        this.pwdpolicytype = pwdpolicytype == null ? null : pwdpolicytype.trim();
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

    public Integer getEx3() {
        return ex3;
    }

    public void setEx3(Integer ex3) {
        this.ex3 = ex3;
    }

    public Integer getEx4() {
        return ex4;
    }

    public void setEx4(Integer ex4) {
        this.ex4 = ex4;
    }

    public String getPdapwd() {
        return pdapwd;
    }

    public void setPdapwd(String pdapwd) {
        this.pdapwd = pdapwd == null ? null : pdapwd.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname == null ? null : personname.trim();
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber == null ? null : cellNumber.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public byte[] getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(byte[] timestamp) {
        this.timestamp = timestamp;
    }
}