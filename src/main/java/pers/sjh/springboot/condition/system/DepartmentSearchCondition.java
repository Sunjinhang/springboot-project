package pers.sjh.springboot.condition.system;

import pers.sjh.springboot.condition.BaseCondition;
import pers.sjh.springboot.domain.system.Department;

/**
 * @author SunJinHang
 * @date 2020-05-29 15:37
 */
public class DepartmentSearchCondition extends BaseCondition{

    private String deptCode;
    private String deptName;
    private String deptFullName;
    private String searchText;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptFullName() {
        return deptFullName;
    }

    public void setDeptFullName(String deptFullName) {
        this.deptFullName = deptFullName;
    }

    @Override
    public String getSearchText() {
        return searchText;
    }

    @Override
    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }
}
