package com.epiuse.recruiting.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {
    @Bean
    public DataSource dataSource()
    {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("b9e199a40962e5");
        dataSource.setPassword("e05219cce580b7c");
        dataSource.setCatalog("ad_b46d6f8c649720e");
        dataSource.setUrl("jdbc:mysql://us-iron-auto-dca-02-a.cleardb.net:3306");

        return dataSource;
    }
}

