package com.rahul.config;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebConfig implements WebMvcConfigurer {
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/jsp/", ".jsp").getClass();
	}


	public void addViewControllers(ViewControllerRegistry registry) {
		// this will map uri to jsp view directly without a controller

		registry.addViewController("/hi").setViewName("Registration");
	}
}
