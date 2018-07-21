package com.hongghe.memcached;

import com.hongghe.memcached.config.MemcachedProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MemcachedApplication {

	@Bean
	public MemcachedProperties memcachedProperties() {
		return new MemcachedProperties();
	}

	public static void main(String[] args) {
		SpringApplication.run(MemcachedApplication.class, args);
	}
}
