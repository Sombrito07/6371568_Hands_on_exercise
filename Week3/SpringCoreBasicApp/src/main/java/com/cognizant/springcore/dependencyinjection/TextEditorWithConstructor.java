package com.cognizant.springcore.dependencyinjection;

public class TextEditorWithConstructor {
    private SpellChecker spellChecker;

    public TextEditorWithConstructor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
        System.out.println("TextEditorWithConstructor: Constructor called");
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
