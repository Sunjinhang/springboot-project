package pers.sjh.springboot.domain.common.tree;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

/**
 * @author SunJinHang
 * @date 2020-05-21 11:59
 */
public class AreaTree implements Serializable {

    private BigInteger id;
    private String label;
    private Boolean isLeaf;
    private List<AreaTree> data;


    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
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

    public List<AreaTree> getData() {
        return data;
    }

    public void setData(List<AreaTree> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "AreaTree{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", isLeaf=" + isLeaf +
                ", data=" + data +
                '}';
    }
}
