import java.util.ArrayList;
import java.util.Scanner;


import java.lang.Math;

public class Game {
    
    public static void main(String[] args){
        int width = 40;
        int height = 20;

        World world = new World(width, height);
        GameCharacter player = new GameCharacter("Irne", 1, 2, 'O');
        GameCharacter enemy = new GameCharacter("BOT Seth", 5, 6, 'X');
       
        ArrayList<GameCharacter> characters = new ArrayList<>();
    characters.add(player);
    characters.add(enemy);
//----------------------------------------------

//----------------------------------------------
    world.addCharacters(characters);
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
      } else if (input.equals("r")){
        player.setDirection(Direction.RIGHT);
      } else if (input.equals("u")){
        player.setDirection(Direction.UP);
      } else if (input.equals("d")){
        player.setDirection(Direction.DOWN);
      }
    }

      world.render();
      System.out.println(player);
      //System.out.println(shop);
    }
  }

