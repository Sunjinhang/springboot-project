package pers.sjh.cloud_note.domain.system;

import java.io.Serializable;

/**
 * @author SunJinHang
 * @date 2020-05-20 09:39
 */
public class Menu implements Serializable {


    private  String menuNo;
    private  String text;
    private  String authorities;
    private  String routeId;
    private  String iconCls;
    private  String rowCls;
    private  String parent;


    public String getMenuNo() {
        return menuNo;
    }

    public void setMenuNo(String menuNo) {
        this.menuNo = menuNo;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public String getRowCls() {
        return rowCls;
    }

    public void setRowCls(String rowCls) {
        this.rowCls = rowCls;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuNo='" + menuNo + '\'' +
                ", text='" + text + '\'' +
                ", authorities='" + authorities + '\'' +
                ", routeId='" + routeId + '\'' +
                ", iconCls='" + iconCls + '\'' +
                ", rowCls='" + rowCls + '\'' +
                ", parent='" + parent + '\'' +
                '}';
    }
}
