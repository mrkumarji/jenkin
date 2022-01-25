package com.java;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinApplication {
	
	
	public static org.slf4j.Logger log = LoggerFactory.getLogger(JenkinApplication.class);
	 

	@PostConstruct
	public void init()
	{
		log.info("inside init 2 ");
	}
	public static void main(String[] args) {
		log.info("inside main");
		SpringApplication.run(JenkinApplication.class, args);
	}

}
