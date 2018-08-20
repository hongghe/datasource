package com.hongghe.memcached.config;

import com.whalin.MemCached.MemCachedClient;
import com.whalin.MemCached.SockIOPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Memcached configuration.
 *
 * @author hongghe 19/07/2018
 */
@Component
public  class MemcachedConfig {

    @Autowired
    private MemcachedProper memcachedProperties;

    @Bean
    public SockIOPool sockIOPool(){
        //获取连接池的实例
        SockIOPool pool = SockIOPool.getInstance();
        //服务器列表及其权重
        String[] servers = memcachedProperties.getServers();
        Integer[] weights = memcachedProperties.getWeights();
        //设置服务器信息
        pool.setServers(servers);
        pool.setWeights(weights);
        //设置初始连接数、最小连接数、最大连接数、最大处理时间
        pool.setInitConn(memcachedProperties.getInitConn());
        pool.setMinConn(memcachedProperties.getMinConn());
        pool.setMaxConn(memcachedProperties.getMaxConn());
        //设置连接池守护线程的睡眠时间
        pool.setMaintSleep(memcachedProperties.getMaintSleep());
        //设置TCP参数，连接超时
        pool.setNagle(memcachedProperties.isNagle());
        pool.setSocketConnectTO(memcachedProperties.getSocketTO());
        //初始化并启动连接池
        pool.initialize();
        return pool;
    }

    @Bean
    @ConditionalOnBean(SockIOPool.class)
    public MemCachedClient memCachedClient(){
        return new MemCachedClient();
    }
}