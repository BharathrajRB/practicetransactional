package com.transactional.practicetransactional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement 
public class PracticetransactionalApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticetransactionalApplication.class, args);
	}

}
