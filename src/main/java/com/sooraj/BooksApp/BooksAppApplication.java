package com.sooraj.BooksApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@EnableAutoConfiguration
@ComponentScan
public class BooksAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksAppApplication.class, args);
	}

}
