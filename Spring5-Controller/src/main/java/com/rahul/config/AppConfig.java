package com.rahul.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

@Configuration
@RequestScope
@ComponentScan(basePackages = "com.rahul")
public class AppConfig {

}
