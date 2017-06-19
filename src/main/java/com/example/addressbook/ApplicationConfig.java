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
}
