package com.example.SpringExercises.ex2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CommandLineRunnerWithFieldInjection implements CommandLineRunner {

    @Autowired
    private DummyLogger dummyLogger;

    @Override
    public void run(final String... args) throws Exception {
        dummyLogger.sayHello();
        log.info("hello from Field Injection!");
        log.info("--------------------------------------");
    }
}
