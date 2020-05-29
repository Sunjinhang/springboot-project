package pers.sjh.springboot.domain.system;

import pers.sjh.springboot.domain.common.BaseModel;

import java.math.BigInteger;
import java.util.Date;

/**
 * @author SunJinHang
 * @date 2020-05-18 16:12
 */
public class User extends BaseModel {

    private String loginName;
    private String userCode;
    private String password;
    private String email;
    private String realName;
    private String mobileNo;
    private BigInteger departmentId;
    private String roles;
    private String authorities;
    private Boolean enabled;
    private int failedLogins;
    private Date lockedOutUntil;
    private Date lastAccess;


    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public BigInteger getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(BigInteger departmentId) {
        this.departmentId = departmentId;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public int getFailedLogins() {
        return failedLogins;
    }

    public void setFailedLogins(int failedLogins) {
        this.failedLogins = failedLogins;
    }

    public Date getLockedOutUntil() {
        return lockedOutUntil;
    }

    public void setLockedOutUntil(Date lockedOutUntil) {
        this.lockedOutUntil = lockedOutUntil;
    }

    public Date getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(Date lastAccess) {
        this.lastAccess = lastAccess;
    }

    @Override
    public String toString() {
        return "User{" +
                "loginName='" + loginName + '\'' +
                ", userCode='" + userCode + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", realName='" + realName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", departmentId=" + departmentId +
                ", roles='" + roles + '\'' +
                ", authorities='" + authorities + '\'' +
                ", enabled=" + enabled +
                ", failedLogins=" + failedLogins +
                ", lockedOutUntil=" + lockedOutUntil +
                ", lastAccess=" + lastAccess +
                ", id='" + id + '\'' +
                ", deleted=" + deleted +
                ", creator='" + creator + '\'' +
                ", createTime=" + createTime +
                ", updater='" + updater + '\'' +
                ", updateTime=" + updateTime +
                '}';
    }
}
