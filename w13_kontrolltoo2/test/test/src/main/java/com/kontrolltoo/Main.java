package com.kontrolltoo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String wordInput = input.nextLine();
        System.out.println("Enter a letter");
        String letterInput = input.nextLine();
        if (letterInput.length() > 1){
            System.out.println("Please enter only one letter.");  
        } else {
            char letterChar = letterInput.charAt(0);  
            Word word = new Word(wordInput, letterChar);
            System.out.println();
            System.out.println(word.getLetterCount());
        }

        System.out.println("Please write a sentence: ");
        String sentenceInput = input.nextLine();
        Sentence sentence = new Sentence(sentenceInput);
        System.out.println(sentence.getWordCount());
        System.out.println(Arrays.toString(sentence.getLetterCountPerWord()));
        
        input.close();
    }
}
