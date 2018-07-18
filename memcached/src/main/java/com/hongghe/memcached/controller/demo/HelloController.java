package com.hongghe.memcached.controller.demo;

import com.hongghe.memcached.domain.ApiResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The try to rest the controller.
 *
 * @author hongghe 18/07/2018
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    /**
     * The default of api for testing.
     *
     * @return The default setting of ApiResult.
     */
    @RequestMapping("")
    public ApiResult helloPage() {
        ApiResult apiResult = new ApiResult();
        return apiResult;
    }
}
