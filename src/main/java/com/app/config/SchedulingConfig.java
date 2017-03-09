package com.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by lenovo on 2017/3/9.
 * 定时任务
 */
@Configuration
@EnableScheduling
public class SchedulingConfig {
    @Scheduled(cron="0/5 * * * * ?")
   public void scheduler(){
        // System.out.println(">>>>>>>>>>>>> SchedulingConfiguration.scheduler()");
    }
}
