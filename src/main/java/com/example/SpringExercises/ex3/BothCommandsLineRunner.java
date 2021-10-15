package com.example.SpringExercises.ex3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class BothCommandsLineRunner implements CommandLineRunner {

    @Autowired
    private List<DummyLogger> dummyLoggers;

    @Override
    public void run(String... args) throws Exception {
        for (DummyLogger logger : dummyLoggers) {
            logger.sayHello();
            log.info("Variable is: " + logger);
        }
        log.info("Both Commands Line Runner");
        log.info("--------------------------------------------------");
    }
}
