package com.app;

import com.app.utils.SpringUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

@ServletComponentScan
@SpringBootApplication
public class Demo1HelloWorldApplication {
    public static void main(String[] args) {
        SpringApplication.run(Demo1HelloWorldApplication.class, args);
    }

    /**
     * 注册Spring Util
     * 这里为了和上一个冲突，所以方面名为：springUtil
     * 实际中使用springUtil
     */

    @Bean
    public SpringUtil springUtil2() {
        return new SpringUtil();
    }

}
