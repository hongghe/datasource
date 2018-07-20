package com.hongghe.redis.domain;

import lombok.Data;

import java.util.HashMap;

@Data
public class ApiResult {

    public Integer code = ApiReturn.SUCCESS.getCode();
    public String message = ApiReturn.SUCCESS.getMessage();
    public Object data = new HashMap<>();
}
