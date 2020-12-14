package com.bsos;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@MapperScan("com.bsos")
@ComponentScan("com.bsos")
public class BsosApplication {
	public static void main(String[] args) {
		SpringApplication.run(BsosApplication.class, args);
	}
}
