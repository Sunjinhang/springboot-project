package pers.sjh.springboot.domain.system;

import pers.sjh.springboot.domain.common.BaseModel;


/**
 * @author SunJinHang
 * @date 2020-05-20 09:36
 */
public class Department extends BaseModel {

    private  String deptCode;
    private  String deptName;
    private  String deptFullName;
    private  String deptNameEn;
    private  String deptFullNameEn;
    private  String memo;
    private  Integer priority;
    private  String parentId;


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

    public String getDeptNameEn() {
        return deptNameEn;
    }

    public void setDeptNameEn(String deptNameEn) {
        this.deptNameEn = deptNameEn;
    }

    public String getDeptFullNameEn() {
        return deptFullNameEn;
    }

    public void setDeptFullNameEn(String deptFullNameEn) {
        this.deptFullNameEn = deptFullNameEn;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }


    @Override
    public String toString() {
        return "Department{" +
                "deptCode='" + deptCode + '\'' +
                ", deptName='" + deptName + '\'' +
                ", deptFullName='" + deptFullName + '\'' +
                ", deptNameEn='" + deptNameEn + '\'' +
                ", deptFullNameEn='" + deptFullNameEn + '\'' +
                ", memo='" + memo + '\'' +
                ", priority=" + priority +
                ", parentId='" + parentId + '\'' +
                '}';
    }
}
