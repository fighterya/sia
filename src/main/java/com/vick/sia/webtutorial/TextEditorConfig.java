package com.vick.sia.webtutorial;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@Configuration
public class TextEditorConfig
{
    @Bean
    public SpellChecker spellChecker()
    {
        return new SpellChecker();
    }

    @Bean
    public TextEditor textEditor()
    {
        return new TextEditor(spellChecker());
    }
}
