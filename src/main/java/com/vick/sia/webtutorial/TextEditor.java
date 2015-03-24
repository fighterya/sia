package com.vick.sia.webtutorial;

public class TextEditor
{

    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker)
    {
        this.spellChecker = spellChecker;
        System.out.println("Inside TextEditor constructor...");
    }

    public void spellCheck()
    {
        spellChecker.checkSpelling();
    }

    public SpellChecker getSpellChecker()
    {
        return spellChecker;
    }
}