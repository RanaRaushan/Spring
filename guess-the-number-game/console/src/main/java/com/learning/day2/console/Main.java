package com.learning.day2.console;

import com.learning.day1.config.GameConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {

    public static void main(String[] args) {
        log.info("Guess the number");
//        create context container
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);

//        close context (container)
        context.close();
    }
}

