package com.example.SpringExercises.ex3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Slf4j
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component()
public class SecondLogger implements DummyLogger {
    @Override
    public void sayHello() {
        log.info("Second logger!");
    }
}
