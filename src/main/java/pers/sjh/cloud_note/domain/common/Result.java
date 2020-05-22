package pers.sjh.cloud_note.domain.common;

import java.io.Serializable;
import java.util.List;

/**
 * @author SunJinHang
 * @date 2020-05-18 17:35
 */
public class Result<T> implements Serializable {
    private int code;
    private String msg;
    private List<T> data;
    private int count;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                ", count=" + count +
                '}';
    }
}
