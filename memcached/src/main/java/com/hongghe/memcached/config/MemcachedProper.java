package com.hongghe.memcached.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * memcached properties.
 *
 * @author hongghe 19/07/2018
 */
@Data
@ConfigurationProperties(prefix = "memcacheddemo")
public class MemcachedProper {
        private String[] servers;
        private Integer[] weights;
        private int initConn;
        private int minConn;
        private int maxConn;
        private long maintSleep;
        private boolean nagle;
        private int socketTO;
}
