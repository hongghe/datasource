package com.hongghe.datasouce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * The begin class of project.
 *
 * @author hongghe 09/07/2018
 */
@SpringBootApplication
public class DataSourceApplication {

    @Bean
    public DataSourceConfig dataSourceConfig() {
        return new DataSourceConfig();
    }

    @Bean
    public DataSourceInitializer dataSourceInitializer() {
        return new DataSourceInitializer();
    }

    @Bean
    public DataSourceWebConfig dataSourceWebConfig() {
        return new DataSourceWebConfig();
    }

    public static void main(String[] args) {
        SpringApplication.run(DataSourceApplication.class, args);
    }
}
