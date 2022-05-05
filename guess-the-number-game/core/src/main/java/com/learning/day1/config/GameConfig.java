package com.learning.day1.config;

import com.learning.day1.GuessCount;
import com.learning.day1.MaxNumber;
import com.learning.day1.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.learning")
@PropertySource("classpath:config/game.properties")
public class GameConfig {

//    fields
    /**
     *  It takes default value i.e {@link 20} <br/>if values are not define in properties file
     */
    @Value("${game.maxNumber:20}")
    private final int maxNumber;
    /**
     *  It takes default value i.e {@link 5} if values are not define in properties file
     */
    @Value("${game.guessCount:5}")
    private final int guessCount;

    @Value("${game.minNumber:15}")
    private final int minNumber;

//    constructor
    public GameConfig(@Value("${game.maxNumber:20}") int maxNumber, @Value("${game.guessCount:5}") int guessCount, @Value("${game.minNumber:15}") int minNumber) {
        this.maxNumber = maxNumber;
        this.guessCount = guessCount;
        this.minNumber = minNumber;
    }

    //    bean methods
    @Bean
    @MaxNumber
    public int maxNumber(){
        return maxNumber;
    }

    @Bean
    @GuessCount
    public int guessCount(){
        return guessCount;
    }

    @Bean
    @MinNumber
    public int minNumber(){
        return minNumber;
    }
}
