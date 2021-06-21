package com.toy.scheduler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.toy.scheduler.test.TestEnum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedulerApplication {

    public static void main(String[] args) throws JsonProcessingException {
        SpringApplication.run(SchedulerApplication.class, args);
        for (TestEnum cate : TestEnum.values()) {
            System.out.println(cate.getName()+","+cate.name());
        }
    }

}
