package pers.sjh.springboot.domain.common.tree;

import java.util.List;

/**
 * @author SunJinHang
 * @date 2020-05-20 15:20
 */
public class MenuTree {

    private String title;

    private String icon;

    private String href;

    private String target;

    private List<MenuTree> child;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public List<MenuTree> getChild() {
        return child;
    }

    public void setChild(List<MenuTree> child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "MenuTree{" +
                "title='" + title + '\'' +
                ", icon='" + icon + '\'' +
                ", href='" + href + '\'' +
                ", target='" + target + '\'' +
                ", child=" + child +
                '}';
    }
}
