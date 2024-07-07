package com.farhad.aws.lambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class AwsLambdaSpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsLambdaSpringBootDemoApplication.class, args);
	}

	@Bean
	public Function<String, String> reverse(){
		return s -> String.valueOf(new StringBuilder(s).reverse());
	}
}
