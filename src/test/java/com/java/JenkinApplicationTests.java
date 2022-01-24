package com.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinApplicationTests {

	public static Logger log = LoggerFactory.getLogger(JenkinApplicationTests.class);
	
	@Test
	void contextLoads() {
			log.info("started testing");
			
			assertEquals(1,1);
			
	}
	
	
	
	

}
