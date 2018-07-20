package com.hongghe.redis.domain;

public enum  ApiReturn {

    FAIL(-1, "fail"),
    ERROR(0, "error"),
    SUCCESS(1, "success");

    private Integer code;
    private String message;

    ApiReturn(Integer code, String message) {
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
