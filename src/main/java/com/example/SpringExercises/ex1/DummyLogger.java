package com.example.SpringExercises.ex1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Slf4j
public class DummyLogger implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("Hello from task 1!");
    }
}
