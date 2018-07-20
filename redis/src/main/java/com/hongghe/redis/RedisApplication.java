package com.hongghe.redis;

import com.hongghe.redis.config.RedisConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * startup class of project.
 *
 * @author hongghe 07/2018
 */
@SpringBootApplication
public class RedisApplication {

	@Bean
	public RedisConfig redisConfig() {
		return new RedisConfig();
	}

	@Bean
	public RedisInitializer redisInitializer() {
		return new RedisInitializer();
	}

	@Bean
	public RedisProperties redisProperties() {
		return new RedisProperties();
	}

	@Bean
	public RedisWebConfig redisWebConfig() {
		return new RedisWebConfig();
	}

	public static void main(String[] args) {
		SpringApplication.run(RedisApplication.class, args);
	}
}
