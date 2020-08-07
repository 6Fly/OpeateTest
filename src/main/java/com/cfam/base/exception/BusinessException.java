package com.cfam.base.exception;
/**
 * 基本逻辑异常处理
 * @author L
 */
public class BusinessException extends RuntimeException{
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

    public BusinessException(Integer code,String msg) {
        this.msg = msg;
        this.code = code;
    }
}
