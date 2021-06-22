package com.toy.quartz;

import lombok.RequiredArgsConstructor;
import org.quartz.SchedulerException;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@RequiredArgsConstructor
@Component
public class BatchService {
    private final QuartzService quartzService;

    @PostConstruct
    public void init() {
        try {
            quartzService.addCronJob(QuartzJob.class, "QuartzJob", "Quartz 5", null, "0/5 * * * * ?");
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
