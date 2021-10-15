package com.example.SpringExercises.ex3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Slf4j
@Primary
@Component
public class FirstLogger implements DummyLogger {
    @Override
    public void sayHello() {
        log.info("First Logger!");
    }
}
