package com.bavi.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages = "com.bavi")
@EnableFeignClients
@ImportAutoConfiguration(FeignAutoConfiguration.class)
public class EmpDempMainClass {

	public static void main(String[] args) {
		
		SpringApplication.run(EmpDempMainClass.class, args);  
		System.out.println(" Welcome to sEMP-Main-01 ");

	}
	 
	  

}
