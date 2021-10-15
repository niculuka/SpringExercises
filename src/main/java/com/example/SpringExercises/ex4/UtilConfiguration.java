package com.example.SpringExercises.ex4;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class UtilConfiguration {
    @Bean
    public DummyLogger dummyLogger (){
        log.info("dummy logger");
        log.info("------------------------------------");
        return new DummyLogger();
    }

    @Bean
    public ListUtil listUtility() {
        log.info("list util");
        log.info("------------------------------------");
        return new ListUtil();
    }

    @Bean(name = "stringUtility")
    public StringUtil stringUtil() {
        log.info("------------------------------------");
        return new StringUtil();
    }
}
