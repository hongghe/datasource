package com.hongghe.datasouce.controller;

import com.hongghe.datasouce.domain.ApiResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 入口地址
 *
 * @author hongghe 09/07/2018
 */
@RestController
@RequestMapping("/home")
public class HomepageController {

    @RequestMapping("error")
    public ApiResult errorPage() {
        ApiResult apiResult = new ApiResult();
        apiResult.setCode(-1);
        apiResult.setMessage("fail");
        return apiResult;
    }
}
