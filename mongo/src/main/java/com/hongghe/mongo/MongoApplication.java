package com.hongghe.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * The startup class of project.
 *
 * @author hongghe 20/07/2018
 */
@SpringBootApplication
public class MongoApplication {

	@Bean
	public MongoInitializer mongoInitializer() {
		return new MongoInitializer();
	}

	@Bean
	public MongowebConfig mongowebConfig() {
		return new MongowebConfig();
	}

	@Bean
	public MongoProperties mongoProperties() {
		return new MongoProperties();
	}

	public static void main(String[] args) {
		SpringApplication.run(MongoApplication.class, args);
	}
}
