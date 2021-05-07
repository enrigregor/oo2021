package com.kontrolltoo;

public class Sentence implements LetterInterface {
    private String sentence;

    public Sentence(String sentence){
        this.sentence = sentence;
    }

    @Override
    public int getLetterCount() {
        return 0;
    }

    @Override
    public int getWordCount() {
        String[] words = sentence.split(" ");
        System.out.println(words);
        for (String a : words){
            System.out.println(a);
        }
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
