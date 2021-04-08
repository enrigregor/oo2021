package org.homework;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;

import org.junit.Test;




public class AppTest 
{
    static App game;

    @BeforeClass
    public static void init(){
         game = new App();
    }

    @Test
    public void checkGameBorders()
    {
        assertTrue(game.width == 35);
        assertTrue(game.height == 10);
    }

    @Test
    public void scoreStartsWithZero(){
        assertTrue(game.score == 0);
    }

    @Test
    public void isLocationShown(){
        assertTrue(game.toString() != "");
    }


    @Test(timeout = 15000)
    public void isTestResultFalse(){
        assertFalse(game.testResult() == "Not Ready");
    }

    @Test
    public void isPlayerInBorder(){
        
    }

}
