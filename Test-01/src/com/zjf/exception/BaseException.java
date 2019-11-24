package com.zjf.exception;

/**
 * className:BaseException
 * package:com.zjf.exception
 * Description:简单描述
 *
 * @date: 2019/11/17 21:53
 * @Author: ASUS
 */
public class BaseException extends Exception {

    private static final long serialVersionUID = 4359709211352400087L;
    private String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public BaseException setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    public BaseException() {
        super();
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    protected BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
