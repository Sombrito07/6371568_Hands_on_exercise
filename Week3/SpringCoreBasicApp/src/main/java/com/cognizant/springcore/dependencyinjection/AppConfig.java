package com.cognizant.springcore.dependencyinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public SpellChecker spellChecker() {
        return new SpellChecker();
    }

    @Bean
    public TextEditor textEditor() {
        TextEditor te = new TextEditor();
        te.setSpellChecker(spellChecker()); // setter injection
        return te;
   
        
    }
    @Bean
    public TextEditorWithConstructor textEditorWithConstructor() {
        return new TextEditorWithConstructor(spellChecker()); // constructor injection
    }

}
