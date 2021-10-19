package com.example.SpringExercises.ex5;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class WelcomeMessageLogger implements CommandLineRunner {

    private String text;
    private int number;
    private Boolean shouldLog;

    public WelcomeMessageLogger(
            @Value("${pl.sdacademy.welcome.text.value}")
            String text,
            @Value("${pl.sdacademy.welcome.text.number}")
            int number,
            @Value("${pl.sdacademy.welcome.text.enable}")
            Boolean shouldLog
    ) {
        this.text = text;
        this.number = number;
        this.shouldLog = shouldLog;
    }

    @Override
    public void run(String... args) throws Exception {
        if (Boolean.TRUE.equals(shouldLog)) {
            log.info("Text: " + text);
            log.info("Number: " + number);
            log.info("Should Log: " + shouldLog);
        }

    }
}
