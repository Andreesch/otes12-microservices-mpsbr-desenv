package com.criasoft.processcapacity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.criasoft.processcapacity")
public class ProcessCapacityApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcessCapacityApplication.class, args);
	}

}
