package com.kontrolltoo;
import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;




public class MainTest {
    

    @Test
    public void letterPInWord(){
        var word = new Word("pere", 'p');
        var result = word.getLetterCount(); 
        Assert.assertEquals(1, result);
    }

    @Test
    public void letterEInWord(){
        var word = new Word("pere", 'e');
        var result = word.getLetterCount(); 
        Assert.assertEquals(2, result);
    }

    @Test
    public void letterAInWord(){
        var word = new Word("pere", 'a');
        var result = word.getLetterCount(); 
        Assert.assertEquals(0, result);
    }

    @Test
    public void isLetterACountCorrect(){
        var sentence = new Sentence("In this sentence should be one letter a", 'a');
        var result = sentence.getLetterCountPerWord(); 
        Assert.assertEquals(1, (result[7]));
    }
}

