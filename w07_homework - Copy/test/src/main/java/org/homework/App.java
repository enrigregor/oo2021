package org.homework;
import java.util.ArrayList;
import java.util.Scanner;

import java.lang.Math;
public class App {
    public static int width = 35;
    public static int height = 10;
    public static String direction = "r";
    public static int score = 0;

    public static void main(String[] args){
      game();
      }
    

public static void game(){
  World world = new World(width, height);


  GameCharacter player = new GameCharacter("player", 10, 2, 'O');
  GameCharacter enemy = new GameCharacter("criminal", 5, 6, 'X');

  ArrayList<GameCharacter> characters = new ArrayList<>();

characters.add(player);
characters.add(enemy);
//----------------------------------------------


//----------------------------------------------
GameItems bullet = new GameItems(2, 2, 'o');

ArrayList<GameItems> gameItems = new ArrayList<>();
gameItems.add(bullet);
//----------------------------------------------
world.addCharacters(characters);
world.addItems(gameItems);
world.render();
System.out.println(player);

Scanner scanner = new Scanner(System.in);
String input = "";

while(!input.equals("end")){
input = scanner.nextLine().toLowerCase();

if (input.equals("")){
  player.move();
} else if (input.equals("l")){
  player.setDirection(Direction.LEFT);
  direction = "l";
} else if (input.equals("r")){
  player.setDirection(Direction.RIGHT);
  direction = "r";
} else if (input.equals("u")){
  player.setDirection(Direction.UP);
  direction = "u";
} else if (input.equals("d")){
  player.setDirection(Direction.DOWN);
  direction = "d";
} else if (input.equals("s")){
  bullet.isVisible = true;
  while (bullet.x <= width && bullet.y <= height && bullet.x >= 0 && bullet.y >= 0){
    if (bullet.x == enemy.x &&  bullet.y == enemy.y){
      score++;
      enemy.x = (int)(Math.random() * width - 1) + 1;
      enemy.y = (int)(Math.random() * height - 1) +1;
      bullet.isVisible = false;
      world.render();
      break;
    } else if (direction == "l"){
      bullet.y = player.y;
      bullet.x--;
      world.render();
    } else if (direction == "r"){
      bullet.y = player.y;
      bullet.x++;
      world.render();
    } else if (direction == "u"){
      bullet.x = player.x;
      bullet.y--;
      world.render();
    } else if (direction == "d"){
      bullet.x = player.x;
      bullet.y++;
      world.render();
    } 
    
  } 
  if(bullet.x <= width || bullet.y <= height || bullet.x >= 0 || bullet.y >= 0){
    bullet.isVisible = false;
    bullet.x = player.x;
    bullet.y = player.y;
  }
}


world.render();
System.out.println(player);
System.out.println(player.ClosestSide());
System.out.println("Your score is: " + score);


    }
  }
  public String testResult(){
    String test = "Done";
    return test;
}
}
