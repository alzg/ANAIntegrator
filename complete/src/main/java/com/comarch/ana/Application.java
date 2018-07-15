package com.comarch.ana;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.client.RestTemplate;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.concurrent.Executor;

@SpringBootApplication
@EnableScheduling
@EnableAsync

public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Autowired
    public CustomProperties cp;

    @Bean(name = "otc")
    @ConfigurationProperties("otc.datasource")
    @Primary
    public DataSource dataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "gmk")
    @ConfigurationProperties("gmk.datasource")
    public DataSource dataSourceGmk(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name="tm1")
    @Autowired
    @Primary
    DataSourceTransactionManager tm1(@Qualifier("otc") DataSource datasource) {
        DataSourceTransactionManager txm  = new DataSourceTransactionManager(datasource);
        return txm;
    }

    @Bean(name="tm2")
    @Autowired
    DataSourceTransactionManager tm2(@Qualifier ("gmk") DataSource datasource) {
        DataSourceTransactionManager txm  = new DataSourceTransactionManager(datasource);
        return txm;
    }
    @Bean
    public JdbcTemplate jdbcTemplateOtc(DataSource dataSource)
    {
        return new JdbcTemplate(dataSource());
    }

    @Bean
    public JdbcTemplate jdbcTemplateGmk(DataSource dataSource)
    {
        return new JdbcTemplate(dataSourceGmk());
    }

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public Executor asyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(2);
        executor.setMaxPoolSize(4);
        executor.setQueueCapacity(500);
        executor.setThreadNamePrefix("ANARestAPI-");
        executor.initialize();
        return executor;
    }

    @Bean
    public CommandLineRunner run() throws Exception {

        return args -> {
            log.info("Endpoint: " + cp.getEndpoint());
        };
    }
}