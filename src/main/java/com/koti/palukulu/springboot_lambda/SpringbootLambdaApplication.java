package com.koti.palukulu.springboot_lambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
//@EnableJpaRepositories(basePackages = "com.koti.palukulu.springboot_lambda")

public class SpringbootLambdaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLambdaApplication.class, args);
	}

}
