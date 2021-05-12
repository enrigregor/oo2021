package com.kontrolltoo;


import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String wordInput = input.nextLine();
        System.out.println("Enter a letter");
        String letterInput = input.nextLine();
        while (letterInput.length() > 1){
            System.out.println("Please enter only one letter."); 
            letterInput = input.nextLine();
        }
        char letterChar = letterInput.charAt(0);  
        Word word = new Word(wordInput, letterChar);
        System.out.println();
        System.out.println("The amount of letter "+letterChar+"'s in your word: ");
        System.out.println(word.getLetterCount());
        System.out.println();
        
        System.out.println("Please write a sentence: ");
        String sentenceInput = input.nextLine();
        Sentence sentence = new Sentence(sentenceInput, letterChar);
        System.out.println("-----------------------------------------------------------");
        System.out.println("The amount of letter "+ letterChar+"'s in your sentence: ");
        System.out.println(sentence.getLetterCount());
        System.out.println("-----------------------------------------------------------");
        System.out.println("The amount of words in your sentence:");
        System.out.println(sentence.getWordCount());
        System.out.println("-----------------------------------------------------------");
        System.out.println("The amount of letter 'A'-s in each word in your sentence:");
        System.out.println(Arrays.toString(sentence.getLetterCountPerWord()));
        System.out.println("-----------------------------------------------------------");
        System.out.println("Words that were already in the file :");
        System.out.println((sentence.wordsInFile()));
        System.out.println("-----------------------------------------------------------");


        input.close();

    }
}
