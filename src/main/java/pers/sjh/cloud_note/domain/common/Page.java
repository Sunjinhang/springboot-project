package pers.sjh.cloud_note.domain.common;

import java.io.Serializable;
import java.util.List;

/**
 * @author SunJinHang
 * @date 2020-05-18 17:13
 */
public class Page<T> implements Serializable {
    private List<T> results;
    private Integer total;
    private Integer pageNo;
    private Integer pageNum;

    public Page() {
    }

    public Page(List<T> results, int total) {
        this.results = results;
        this.total = total;
    }

    public Integer getTotal() {
        return this.total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getResults() {
        return this.results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }
}
