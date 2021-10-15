package com.example.SpringExercises.ex4;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

@Slf4j
@SpringBootApplication
public class SpringExercisesApplication implements CommandLineRunner {
	@Autowired
	private UtilConfiguration utilConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(SpringExercisesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		utilConfiguration.dummyLogger().sayHi();
		log.info("------------------------------------");

		List<Integer> ints = Arrays.asList(10, 20, 30);
		int result = utilConfiguration.listUtility().sumElements(ints);
		log.info("Sum = " + result);
		log.info("------------------------------------");

		List<String> words = Arrays.asList("Hello", "world", "from", "string", "util", "class");
		String sentence = utilConfiguration.stringUtil().formSentence(words);
		log.info("Sentence: " + sentence);
		log.info("------------------------------------");

	}

}
