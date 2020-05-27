package pers.sjh.cloud_note.condition.system;

import pers.sjh.cloud_note.condition.BaseCondition;

/**
 * @author SunJinHang
 * @date 2020-05-27 13:13
 */
public class UserSearchCondition extends BaseCondition {

    private String loginName;
    private String userCode;
    private String realName;


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

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
