package com.cognizant.springcore.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAppConstructor {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TextEditorWithConstructor editor = context.getBean(TextEditorWithConstructor.class);
        editor.spellCheck();
    }
}
