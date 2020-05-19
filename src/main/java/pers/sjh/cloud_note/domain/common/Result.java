package pers.sjh.cloud_note.domain.common;

import java.io.Serializable;

/**
 * @author SunJinHang
 * @date 2020-05-18 17:35
 */
public class Result<T> implements Serializable {
    private int status;
    private String msg;
    private T data;
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "NoteResult [status=" + status + ", msg=" + msg + ", data=" + data + "]";
    }
}
