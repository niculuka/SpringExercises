package com.example.SpringExercises.ex3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringExercisesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringExercisesApplication.class, args);
	}

//	@Bean
//	public DummyLogger createAnonymousLogger() {
//		return new DummyLogger() {
//			@Override
//			public void sayHello() {
//				log.info("Anonymous Logger");
//			}
//		};
//	}
}
