package com.example.SpringExercises.ex3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SecondCommandLineRunner implements CommandLineRunner {

    //On field
    @Autowired
    @Qualifier("secondLogger")
    private DummyLogger dummyLogger;

    @Override
    public void run(String... args) throws Exception {
        dummyLogger.sayHello();
        log.info("Second Command Line  Runner" + dummyLogger);
        log.info("--------------------------------------------------");
    }


    //On Setter
//    @Autowired
//    public SecondCommandLineRunner setDummyLogger(@Qualifier("secondLogger") DummyLogger dummyLogger) {
//        this.dummyLogger = dummyLogger;
//        return this;
//    }

    //On Constructor
//    public SecondCommandLineRunner(@Qualifier("secondLogger") DummyLogger dummyLogger) {
//        this.dummyLogger = dummyLogger;
//    }
}
