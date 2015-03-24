package com.vick.sia;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.vick.sia.webtutorial.HelloWorldConfig;
import com.vick.sia.webtutorial.HelloWorld;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

        helloWorld.setMessage("This is a hello world message");

        System.out.println(helloWorld.getMessage());
    }
}
