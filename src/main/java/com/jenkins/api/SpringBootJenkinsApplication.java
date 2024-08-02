package com.jenkins.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootJenkinsApplication {
	public static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);

	public static void main(String[] args) {
		
		logger.info("Apllication executed...");
		
		SpringApplication.run(SpringBootJenkinsApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		logger.info("Application started.....");
	}

}
