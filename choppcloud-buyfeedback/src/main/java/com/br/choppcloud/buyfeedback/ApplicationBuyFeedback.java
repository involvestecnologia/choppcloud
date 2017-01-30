package com.br.choppcloud.buyfeedback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
@EnableRedisRepositories
public class ApplicationBuyFeedback {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(ApplicationBuyFeedback.class, args);
	}

}
