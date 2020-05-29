package pers.sjh.springboot.domain.system;

import java.io.Serializable;

/**
 * @author SunJinHang
 * @date 2020-05-20 09:39
 */
public class Authority implements Serializable {

    private  String authNo;
    private  String name;
    private  String desc;
    private  String parent;


    public String getAuthNo() {
        return authNo;
    }

    public void setAuthNo(String authNo) {
        this.authNo = authNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Authority{" +
                "authNo='" + authNo + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", parent='" + parent + '\'' +
                '}';
    }
}
