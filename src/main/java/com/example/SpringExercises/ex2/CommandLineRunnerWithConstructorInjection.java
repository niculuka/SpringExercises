package com.example.SpringExercises.ex2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CommandLineRunnerWithConstructorInjection implements CommandLineRunner {

    private DummyLogger dummyLogger;

    public CommandLineRunnerWithConstructorInjection(DummyLogger dummyLogger) {
        this.dummyLogger = dummyLogger;
    }

    @Override
    public void run(final String... args) throws Exception {
        dummyLogger.sayHello();
        log.info("hello from Constructor Injection!");
        log.info("--------------------------------------");
    }
}
