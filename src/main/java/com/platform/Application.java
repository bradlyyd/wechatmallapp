package com.platform;


import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * 程序的入口
 *  
 * @author 小翼
 * @version 1.0.0
 */
//@EnableDiscoveryClient
@MapperScan("com.platform.dao")  
@SpringBootApplication
public class Application  {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	
}