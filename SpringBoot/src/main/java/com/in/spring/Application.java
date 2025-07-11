package com.in.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		ApplicationSpringContext.setApplicationContext(applicationContext);
		System.out.println(applicationContext.getStartupDate());
	}

}
