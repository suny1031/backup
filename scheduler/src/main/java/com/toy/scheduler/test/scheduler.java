package com.toy.scheduler.test;

import net.javacrumbs.shedlock.spring.annotation.EnableSchedulerLock;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableSchedulerLock(defaultLockAtMostFor = "0s")
public class scheduler {
    @Scheduled(cron = "0/10 * * * * *")
    @SchedulerLock(name="SchedulerLock")
    public void cronJobSch() {
        System.out.println("test");
    }
}
