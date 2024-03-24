package com.nt.comps;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nt")
public class AppConfig {
	@Bean(name = "ldt")
	public LocalDateTime createLocalDate() {
		System.out.println("AppConfig.createLocalDate()");
		return LocalDateTime.now();
	}

}
