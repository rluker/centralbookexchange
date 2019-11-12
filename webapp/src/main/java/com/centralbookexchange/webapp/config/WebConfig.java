package com.centralbookexchange.webapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(
                "/META-INF/**",
        		"/banners/**",
                "/images/**",
                "/css/**",
                "/js/**")
                .addResourceLocations(
                        "classpath:/META-INF/",
                		"classpath:/static/banners/",
                        "classpath:/static/images/",
                        "classpath:/static/css/",
                        "classpath:/static/js/");
    }

}