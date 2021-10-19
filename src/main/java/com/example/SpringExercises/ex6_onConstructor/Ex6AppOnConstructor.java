package com.example.SpringExercises.ex6_onConstructor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@Slf4j
@EnableConfigurationProperties(PersonPropOnConstructor.class)
@SpringBootApplication
public class Ex6AppOnConstructor {

	public static void main(String[] args) {
		SpringApplication.run(Ex6AppOnConstructor.class, args);
	}

}
