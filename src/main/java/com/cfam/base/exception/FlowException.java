package com.cfam.base.exception;

public class FlowException extends RuntimeException {
    private String msg;

    private Integer code;



    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public FlowException(String msg, Integer code) {
        this.msg = msg;
        this.code = code;
    }

}
