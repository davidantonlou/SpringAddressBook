package com.example.addressbook;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by davidanton on 19/6/17.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.example.addressbook")
public class ApplicationConfig {

//    @Bean
//    @Primary
//    @ConfigurationProperties(prefix="h2")
//    javax.sql.DataSource h2DataSource(Environment env) {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean
//    @ConfigurationProperties(prefix="oracle")
//    javax.sql.DataSource oracleDataSource(Environment env) {
//        return DataSourceBuilder.create().build();
//    }

}
