package pers.sjh.cloud_note.domain.system;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * @author SunJinHang
 * @date 2020-05-20 09:54
 */
public class Area implements Serializable {

    private BigInteger id;
    private BigInteger parentId;
    private String areaCode;
    private String areaName;
    private String memo;
    private String deleted;
    private String level;
    private Boolean leaf;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getParentId() {
        return parentId;
    }

    public void setParentId(BigInteger parentId) {
        this.parentId = parentId;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Boolean getLeaf() {
        return leaf;
    }

    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
    }

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", areaCode='" + areaCode + '\'' +
                ", areaName='" + areaName + '\'' +
                ", memo='" + memo + '\'' +
                ", deleted='" + deleted + '\'' +
                ", level='" + level + '\'' +
                ", leaf=" + leaf +
                '}';
    }
}
