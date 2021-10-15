package com.example.SpringExercises.ex2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DummyLogger {

    public void sayHello() {
        log.info("hello from DummyLogger");
    }
}
