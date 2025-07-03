package com.cognizant.springcore.dependencyinjection;

public class TextEditor {
    private SpellChecker spellChecker;

    public TextEditor() {
        System.out.println("TextEditor constructor called");
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
