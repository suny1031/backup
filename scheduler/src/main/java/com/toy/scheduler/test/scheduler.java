package com.toy.scheduler.test;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class scheduler {
    @Scheduled(cron = "0/10 * * * * *")
    public void cronJobSch() {
        System.out.println("test");
    }
}
