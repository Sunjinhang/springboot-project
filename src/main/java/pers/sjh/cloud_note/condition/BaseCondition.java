package pers.sjh.cloud_note.condition;

import java.io.Serializable;

/**
 * @author SunJinHang
 * @date 2020-05-22 11:30
 */
public class BaseCondition implements Serializable {

    private Integer page;
    private Integer start;
    private Integer limit;
    private String searchText;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }
}
