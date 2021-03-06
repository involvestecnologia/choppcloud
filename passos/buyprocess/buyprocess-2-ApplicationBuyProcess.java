package com.br.choppcloud.buyprocess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@EnableCircuitBreaker
@SpringBootApplication
public class ApplicationBuyProcess {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(ApplicationBuyProcess.class, args);
	}

}