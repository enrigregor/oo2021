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
        int counter = 0;
        for (String a : words){
           // System.out.println(a);
            counter++;
        }
        return counter;
    }

    @Override
    public int[] getLetterCountPerWord() {
        String[] words = sentence.split(" ");
        int arraySize = 0;
        for (String a : words){
            arraySize++;
        }
        int[] c = new int[arraySize];
        for (int i = 0; i < words.length; i++){
            int counter = 0;
            String word = words[i];
            int length = word.length();
            for (int j = 0; j < length; j++){
                if(word.charAt(j) == 'a'){
                    counter++;
                }
            }
            c[i] = counter;
            System.out.println(c[i]);
        }
        return c;
    }

    @Override
    public int getLetterCountInSentence() {

        return 0;
    }
    
}
