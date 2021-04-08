package org.homework;
 public class GameItems {
    public int x;
    public int y;
     private char symbol;
     public boolean isVisible = false;
    
    public GameItems(int x, int y, char symbol){
        this.x = x;
        this.y = y;
        this.symbol = symbol;
       }
    
    
    public char getSymbol(){
         return symbol;
         }
 }

