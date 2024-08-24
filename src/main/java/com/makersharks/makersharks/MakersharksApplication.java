package com.makersharks.makersharks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.makersharks.makersharks.repository")
@EntityScan(basePackages = "com.makersharks.makersharks.model")
public class MakersharksApplication {

	public static void main(String[] args) {
		SpringApplication.run(MakersharksApplication.class, args);
	}
}
