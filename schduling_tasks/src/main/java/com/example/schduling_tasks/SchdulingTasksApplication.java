package com.example.schduling_tasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchdulingTasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchdulingTasksApplication.class, args);
	}

}
