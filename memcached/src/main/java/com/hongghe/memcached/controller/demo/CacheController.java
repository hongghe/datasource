package com.hongghe.memcached.controller.demo;

import com.whalin.MemCached.MemCachedClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * The controller of memcached.
 *
 * @author hongghe 19/07/2018
 */
@RestController
@RequestMapping(value="/demo")
public class CacheController {

    @Autowired
    private MemCachedClient memCachedClient;

    @RequestMapping("cacheSave")
    public String cacheSave(@RequestParam(value="id", required=false, defaultValue="228")String id)
    {
        boolean i = memCachedClient.set("id", id, 1000);
        return String.valueOf(i);
    }
}
