package com.hongghe.memcached.domain;

import lombok.Data;

import java.util.HashMap;

/**
 * common return of api object.
 *
 * @author hongghe 18/07/2018
 */
@Data
public class ApiResult {
    private final Integer code = ApiCode.SUCCESS.code;
    private final String message = ApiCode.SUCCESS.message;
    private final Object data = new HashMap<>();
}
