package com.hongghe.datasouce;

import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.metrics.prometheus.PrometheusMetricsTrackerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

/**
 * 初始化数据连接成
 *
 * @author hongghe 09/07/2018
 */
public class DataSourceInitializer {

    @Autowired
    private DataSource dataSource;

    @PostConstruct
    public void init() {
        if (this.dataSource instanceof HikariDataSource) {
            ((HikariDataSource) this.dataSource).setMetricsTrackerFactory(new PrometheusMetricsTrackerFactory());
        }
    }
}
