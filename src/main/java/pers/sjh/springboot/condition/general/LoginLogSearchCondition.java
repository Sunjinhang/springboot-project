package pers.sjh.springboot.condition.general;

import pers.sjh.springboot.condition.BaseCondition;

import java.util.Date;

/**
 * @author SunJinHang
 * @date 2020-06-01 17:21
 */
public class LoginLogSearchCondition extends BaseCondition {

    private Date loginTimeFrom;
    private Date loginTimeTo;


    public Date getLoginTimeFrom() {
        return loginTimeFrom;
    }

    public void setLoginTimeFrom(Date loginTimeFrom) {
        this.loginTimeFrom = loginTimeFrom;
    }

    public Date getLoginTimeTo() {
        return loginTimeTo;
    }

    public void setLoginTimeTo(Date loginTimeTo) {
        this.loginTimeTo = loginTimeTo;
    }

    @Override
    public String toString() {
        return "LoginLogSearchCondition{" +
                "loginTimeFrom=" + loginTimeFrom +
                ", loginTimeTo=" + loginTimeTo +
                '}';
    }
}
