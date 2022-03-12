package com.albert.quartz;

import com.albert.quartz.job.SimpleExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@SpringBootApplication
public class QuartzApplication {

	public static void main(String[] args) throws Exception {

		SpringApplication.run(QuartzApplication.class, args);

		SimpleExample.excute();
	}



}
