package com.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by lenovo on 2017/3/8.
 */
@Configuration
public class AppConfigurer extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 自定义内部资源目录
        registry.addResourceHandler("/myres/**").addResourceLocations("classpath:/myres/");

        // 自定义外部资源目录
        registry.addResourceHandler("/api_files/**").addResourceLocations("file:G:/api_files/");
        super.addResourceHandlers(registry);
    }
}
