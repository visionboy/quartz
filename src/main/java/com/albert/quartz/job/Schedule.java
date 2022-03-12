package com.albert.quartz.job;

import org.springframework.scheduling.annotation.Scheduled;

public class Schedule {

    @Scheduled(fixedRateString = "5", initialDelay = 3000)
    private void scheduleTest() {
        System.out.println("hello jeong-pro");
    }

}
