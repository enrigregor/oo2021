package org.homework;
import java.util.ArrayList;


public class World {
    private int width;
    private int height;
    
  
    private ArrayList<GameCharacter> characters;
    private ArrayList<GameItems> gameItems;

  
    public World(int width, int height){
      this.width = width;
      this.height = height;
    }
  
    public void addItems(ArrayList<GameItems> i){
      this.gameItems = i;
    }

    public void addCharacters(ArrayList<GameCharacter> c){
      this.characters = c;
    }
    
  
    public void render(){
      char symbol;
  
      for (int y = 0; y <= height; y++){
        for (int x = 0; x <= width; x++){
          if (y == 0 || y == height){
            symbol = '-';
          } else if (x == 0 || x == width){
            symbol = '|';
          } else {
            symbol = ' ';
          }
          
          for (GameCharacter c : characters){
            if (x == c.x && y == c.y){
              symbol = c.getSymbol();
            }
          }

          for (GameItems i : gameItems){
            if (x == i.x && y == i.y && i.isVisible){
              symbol = i.getSymbol();
            }

          }

          System.out.print(symbol);
        }
  
        System.out.println("");
      }
    }
  }


  

