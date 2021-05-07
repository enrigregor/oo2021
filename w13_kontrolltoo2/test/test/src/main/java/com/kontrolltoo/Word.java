package com.kontrolltoo;

public class Word implements LetterInterface{
    private String word;
    private char letter;

    public Word(String word, char letter){
        this.word = word;
        this.letter = letter;
    }


    @Override
    public int getLetterCount() {
        int length = word.length();
        int counter = 0;
        for (int i = 0; length > i; i++){
            if (word.charAt(i) == letter){
                counter++;
            }
        }
        return counter;
    }


    @Override
    public int getWordCount() {
        return 0;
    }

    @Override
    public int getLetterCountPerWord() {
        return 0;
    }
    
    @Override
    public int getLetterCountInSentence() {
        return 0;
    }
    
}
