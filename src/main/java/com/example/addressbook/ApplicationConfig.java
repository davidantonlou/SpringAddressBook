package com.example.addressbook;

import org.h2.server.web.WebServlet;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by davidanton on 19/6/17.
 */
@Configuration
@EnableWebMvc
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.example.addressbook")
public class ApplicationConfig {

    @Bean
    ServletRegistrationBean h2servletRegistration(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebServlet());
        registrationBean.addUrlMappings("/console/*");
        return registrationBean;
    }

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
