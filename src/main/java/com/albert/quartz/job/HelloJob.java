package com.albert.quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

public class HelloJob implements Job {
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("Hello World! - " + new Date());
    }
}
