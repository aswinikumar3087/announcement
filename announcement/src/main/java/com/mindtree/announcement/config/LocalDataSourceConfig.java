package com.mindtree.announcement.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
@Profile("default")

public class LocalDataSourceConfig {

    public static final String DATA_SOURCE_HIKARI = "spring.datasource.hikari";

    @Value("${database.username}")
    public String username;

    @Value("${database.password}")
    private String password;

    @Value("${database.url}")
    private String databaseUrl;

    @Value("${database.driverClassName}")
    private String driverClassName;

    @Primary
    @Bean
    /**
     * creating DataSourceProperties for local db
     * 
     * @return
     */
    public DataSourceProperties localSourceProperties() {
        final DataSourceProperties prob = new DataSourceProperties();
        prob.setUrl(databaseUrl);
        prob.setUsername(username);
        prob.setPassword(password);
        prob.setDriverClassName(driverClassName);
        return prob;
    }

    @Primary
    @Bean
    @ConfigurationProperties(DATA_SOURCE_HIKARI)
    /**
     * creating hikari connectionpool
     * 
     * @param localSourceProperties
     * @return
     */
    public DataSource dataSource(DataSourceProperties localSourceProperties) {
        return localSourceProperties.initializeDataSourceBuilder().type(HikariDataSource.class).build();
    }
}
