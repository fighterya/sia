package com.vick.sia.webtutorial;

import org.springframework.context.annotation.Configuration;

public class HelloWorld
{
    private String message;

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }
}