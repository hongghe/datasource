package com.hongghe.datasouce.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 标准接口返回值
 *
 * @author hongghe 09/07/2018
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResult {
    public Integer code;
    public String message;
    public Object data;
}
