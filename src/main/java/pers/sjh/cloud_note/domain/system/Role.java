package pers.sjh.cloud_note.domain.system;

import pers.sjh.cloud_note.domain.common.BaseModel;

/**
 * @author SunJinHang
 * @date 2020-05-20 09:35
 */
public class Role extends BaseModel {

    private String roleCode;
    private String roleName;
    private String authorities;
    private String memo;
    private Boolean system;

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Boolean getSystem() {
        return system;
    }

    public void setSystem(Boolean system) {
        this.system = system;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleCode='" + roleCode + '\'' +
                ", roleName='" + roleName + '\'' +
                ", authorities='" + authorities + '\'' +
                ", memo='" + memo + '\'' +
                ", system=" + system +
                ", id='" + id + '\'' +
                ", deleted=" + deleted +
                ", creator='" + creator + '\'' +
                ", createTime=" + createTime +
                ", updater='" + updater + '\'' +
                ", updateTime=" + updateTime +
                '}';
    }
}
