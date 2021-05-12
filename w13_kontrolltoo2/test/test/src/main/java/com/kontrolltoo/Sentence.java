package com.kontrolltoo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Sentence implements LetterInterface {
    private String sentence;
    private char letter;

    public Sentence(String sentence, char letter){
        this.sentence = sentence;
        this.letter = letter;
    }

    @Override
    public int getLetterCount() {
        int length = sentence.length();
        int counter = 0;
        for (int i = 0; length > i; i++){
            if (sentence.charAt(i) == letter){
                counter++;
            }
        }
        return counter;
    }

    public int getWordCount() {
        String[] words = sentence.split(" ");
        int counter = 0;
        for (String a : words){
           // System.out.println(a);
            counter++;
        }
        return counter;
    }

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
        }
        return c;
    }


    public ArrayList<String> wordsInFile() throws IOException{
        File file = new File("Words.txt");
        FileReader rf = new FileReader(file);
        BufferedReader br = new BufferedReader(rf);
        String[] words = sentence.split(" ");
        int pos = 0;
        String line;
        int k = 0;
        ArrayList<String> existingWords = new ArrayList<String>();
        while((line = br.readLine()) != null){
            existingWords.add(line);
            
        }
        ArrayList<String> notNew = new ArrayList<String>();
        ArrayList<String> newWords = new ArrayList<String>();
        for(int i = 0; i < words.length; i++){

            for(int j = 0; j < existingWords.size(); j++){

                if(words[i].equals(existingWords.get(j))){
                    notNew.add(words[i]);
                    break;
                } else if (j == (existingWords.size() - 1)){
                    newWords.add(pos, words[i]);
                    pos++;
                }
            }
        }
        
        System.out.println(notNew);
        System.out.println("-----------------------------------------------------------");
        System.out.println("New words added to the file are: ");
        rf.close();
        br.close();
        PrintWriter pw = new PrintWriter((new BufferedWriter(new FileWriter(file, true))));
        for(k = 0 ; k < (newWords.size()); k++){
            pw.println(newWords.get(k));
        }
        pw.close();
        return newWords;
    }
    
}
