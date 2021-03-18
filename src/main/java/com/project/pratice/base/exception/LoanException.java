package com.project.pratice.base.exception;

public class LoanException extends Exception{

    private int code;

    private Exception exception;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public LoanException(int code, Exception exception) {

        this.code = code;
        this.exception = exception;
    }
}
