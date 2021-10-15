package com.example.SpringExercises.ex1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringExercisesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringExercisesApplication.class, args);
	}

	@Bean
	public DummyLogger dummyLogger() {
		return new DummyLogger();
	}

}
