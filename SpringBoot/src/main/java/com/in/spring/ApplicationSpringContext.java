package com.in.spring;

import org.springframework.context.ConfigurableApplicationContext;

public class ApplicationSpringContext {
	static ConfigurableApplicationContext applicationContext;
	
	private ApplicationSpringContext() {}

	public static ConfigurableApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public static void setApplicationContext(ConfigurableApplicationContext applicationContext) {
		ApplicationSpringContext.applicationContext = applicationContext;
	}
}
