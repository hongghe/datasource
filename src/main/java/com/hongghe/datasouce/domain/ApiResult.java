package com.hongghe.datasouce.domain;

import com.google.common.collect.Maps;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 标准接口返回值
 *
 * @author hongghe 09/07/2018
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResult<T> implements Serializable {

    public static final long serialVersionUID = 1L;
    private Integer code = 1;
    private String message = "success";
    private T data = (T) Maps.newHashMap();
}
