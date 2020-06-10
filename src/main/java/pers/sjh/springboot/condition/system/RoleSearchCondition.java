package pers.sjh.springboot.condition.system;

import pers.sjh.springboot.condition.BaseCondition;

/**
 * @author SunJinHang
 * @date 2020-06-05 09:50
 */
public class RoleSearchCondition extends BaseCondition {

    private String roleCode;
    private String roleName;

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
}
