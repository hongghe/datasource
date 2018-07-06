package com.hongghe.datasouce;

import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.metrics.prometheus.PrometheusMetricsTrackerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

public class DataSourceIntiation {
    @Autowired
    private DataSource dataSource;

    @PostConstruct
    public void init() {
        if (this.dataSource instanceof HikariDataSource) {
            ((HikariDataSource) this.dataSource).setMetricsTrackerFactory(new PrometheusMetricsTrackerFactory());
        }
    }
}
