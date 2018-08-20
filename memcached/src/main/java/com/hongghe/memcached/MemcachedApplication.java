package com.hongghe.memcached;

import com.hongghe.memcached.config.MemcachedConfig;
import com.hongghe.memcached.config.MemcachedProper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * 启动文件
 *
 * @author hongghe 2018/08/19
 */
@SpringBootApplication
public class MemcachedApplication {

	@Bean
	public MemcachedInitializer memcachedInitializer() {
		return new MemcachedInitializer();
	}

	@Bean
	public MemcachedProperties memcachedProperties() {
		return new MemcachedProperties();
	}

	@Bean
	public MemcachedConfig memcachedConfig() {
		return new MemcachedConfig();
	}

	@Bean
	public MemcachedProper memcachedProper() {
		return new MemcachedProper();
	}

	@Bean
	public MemcachedWebConfig memcachedWebConfig() {
		return new MemcachedWebConfig();
	}

	public static void main(String[] args) {
		SpringApplication.run(MemcachedApplication.class, args);
	}
}
