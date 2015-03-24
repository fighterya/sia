package com.vick.sia;

import static java.lang.System.out;
import java.util.Properties;
import java.util.Set;
import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vick.sia.webtutorial.TextEditor;
import com.vick.sia.webtutorial.HelloWorld;

import com.vick.sia.soundsystem.CompactDisc;

import com.vick.sia.config.SpringConfig;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        TextEditor textEditor = ctx.getBean(TextEditor.class);
        textEditor.spellCheck();

        CompactDisc cd = ctx.getBean(CompactDisc.class);
        cd.play();

        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
        helloWorld.setMessage("random message");
        out.println(helloWorld.getMessage());
    }


    // public static void printSystemProperties()
    // {
    //     Properties systemProperties = System.getProperties();
    //     Set<String> systemPropertyNames = systemProperties.getStringNames();
    //     Iterator<String> systemPropertyNamesIterator = systemPropertyNames.iterator();

    //     while (systemPropertyNamesIterator.hasNext())
    //     {

    //         String systemPropertyName = systemPropertyNamesIterator.next();
    //         out.println(systemPropertyName + " = " + systemProperties.get(systemPropertyName));
    //     }
    // }
}
