package pers.sjh.springboot.domain.common.tree;

import java.util.List;

/**
 * @author SunJinHang
 * @date 2020-05-20 17:30
 */
public class DepartmentTree {

    private String id;
    private String label;
    private Boolean isLeaf;
    private List<DepartmentTree> data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Boolean getLeaf() {
        return isLeaf;
    }

    public void setLeaf(Boolean leaf) {
        isLeaf = leaf;
    }

    public List<DepartmentTree> getData() {
        return data;
    }

    public void setData(List<DepartmentTree> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DepartmentTree{" +
                "id='" + id + '\'' +
                ", label='" + label + '\'' +
                ", isLeaf=" + isLeaf +
                ", data=" + data +
                '}';
    }
}
