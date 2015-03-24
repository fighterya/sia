package com.vick.sia.webtutorial;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class HelloWorldConfig
{
    @Bean
    public HelloWorld helloWorld()
    {
        return new HelloWorld();
    }
}