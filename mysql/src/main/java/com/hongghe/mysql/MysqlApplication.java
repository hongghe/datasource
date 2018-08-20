package com.hongghe.mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MysqlApplication {

	@Bean
	public MysqlInitializer mysqlIntializer() {
		return new MysqlInitializer();
	}

	@Bean
	public MysqlProperties mysqlProperties() {
		return new MysqlProperties();
	}

	@Bean
	public MysqlWebConfig mysqlWebConfig() {
		return new MysqlWebConfig();
	}

	public static void main(String[] args) {
		SpringApplication.run(MysqlApplication.class, args);
	}
}
