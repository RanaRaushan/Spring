package com.learning.webmvc.config;

import com.learning.webmvc.utils.ViewName;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@EnableWebMvc
@Component
@ComponentScan(basePackages = "com.learning.webmvc")
public class WebConfig implements WebMvcConfigurer {

//    constant
    public static final String RESOLVER_PREFIX = "WEB-INF/jsp/";
    public static final String RESOLVER_SUFFIX = ".jsp";

//    bean method
    @Bean
    public ViewResolver viewResolver(){

        UrlBasedViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix(RESOLVER_PREFIX);
        viewResolver.setSuffix(RESOLVER_SUFFIX);
        return viewResolver;

    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        WebMvcConfigurer.super.addViewControllers(registry);
        registry.addViewController("/").setViewName(ViewName.HOMEPAGE);
    }
}
