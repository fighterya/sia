package com.vick.sia.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;


import com.vick.sia.webtutorial.HelloWorldConfig;
import com.vick.sia.webtutorial.TextEditorConfig;

@Configuration
@Import({HelloWorldConfig.class, TextEditorConfig.class})
@ComponentScan(basePackages = {"com.vick.sia.soundsystem"})
public class SpringConfig
{

}