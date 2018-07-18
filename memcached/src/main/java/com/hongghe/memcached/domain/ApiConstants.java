package com.hongghe.memcached.domain;

/**
 * The return of api
 *
 * @author hongghe 17/07/2018
 */
public enum ApiConstants {
    ERROR(-1, "error"),
    FAIL(0, "fail"),
    SUCCESS(1, "success");

    public Integer code;
    public String message;

    ApiConstants(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
