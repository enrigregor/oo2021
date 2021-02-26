import java.util.ArrayList;
import java.util.Scanner;


import java.lang.Math;

public class Game {
    
    public static void main(String[] args){
        int width = 20;
        int height = 10;

        World world = new World(width, height);
        GameCharacter player = new GameCharacter("Irne", 1, 2, 'C', GameCharacterType.WARRIOR);
        GameCharacter dummy = new GameCharacter("BOT Seth", 5, 6, 'B', GameCharacterType.WIZARD);
        GameCharacter witch = new GameCharacter("Witch", 7, 8, '?', GameCharacterType.WIZARD);
       
        ArrayList<GameCharacter> characters = new ArrayList<>();
    characters.add(player);
    characters.add(dummy);
    characters.add(witch);
//-----------------------------------------------
      InventoryItems stats = new InventoryItems(0, 3, 0);

      ArrayList<Integer> stones = new ArrayList<Integer>();
//-----------------------------------------------
      ItemShops shop = new ItemShops("Pood", 3, 4, 'S');
      ItemShops workplace = new ItemShops("Müü asju - Workshop!", 4, 5, 'W');
      
      ArrayList<ItemShops> shops = new ArrayList<>();
      shops.add(shop);
      shops.add(workplace);
//-----------------------------------------------
      GameItems stone1 = new GameItems(7,9,'.');
      GameItems stone2 = new GameItems(10,2,'.');

      ArrayList<GameItems> gameStuff = new ArrayList<>();
      gameStuff.add(stone1);
     gameStuff.add(stone2);
//----------------------------------------------
    world.addItems(gameStuff);
    world.addCharacters(characters);
    world.addShops(shops);
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

    if (player.x == witch.x && player.y == witch.y){
        player.x = (int)(Math.random() * width - 1) + 1;
        player.y = (int)(Math.random() * height - 1) +1;

        /*if (dummy.isVisible == true){
            dummy.isVisible == false;
        } else {
            dummy.isVisible = true;
        }*/
        dummy.isVisible = dummy.isVisible == true ? false : true;
        /*see ülemine lause teeb sama asja is üleval välja kommenteeritud if lause*/
    }

    /*if (player.x == stone1.x && player.y == stone1.y){
        stone1.x = (int)(Math.random() * width - 1) + 1;
        stone1.y = (int)(Math.random() * height - 1) + 1;
      
    } */

    if (player.x == stone1.x && player.y == stone1.y){
        
        if (stones.size() < stats.slots){
          stones.add(1);
          stone1.x = (int)(Math.random() * width - 1) + 1;
          stone1.y = (int)(Math.random() * height - 1) + 1;
        }  else {
          System.out.println("You need to buy more slots to carry more rocks!");
          player.x ++;
        }
    }

    if (player.x == stone2.x && player.y == stone2.y){
        
        if (stones.size() < stats.slots){
          stones.add(1);
          stone2.x = (int)(Math.random() * width - 1) + 1;
          stone2.y = (int)(Math.random() * height - 1) + 1;
        } else {
          System.out.println("You need to buy more slots to carry more rocks!");
          player.x ++;
        }
    } 


    if (player.x == workplace.x && player.y == workplace.y){
      System.out.println("Do you want to sell all your rocks? (1 rock = 2 dolla dolla) [y/n]");
      System.out.println("You currently have "+stones.size()+" rocks!");
      
      if (input.equals("y")){
        stats.money = stats.money + (int) stones.size() * 2;
        stones.clear();
        System.out.println("Thank you and goodbye!");
        System.out.println("You now have "+stats.money+" dolla dolla.");
        player.x ++;
      }
      else if (input.equals("n")){
        player.x ++;
      }           
    }
    if (player.x == shop.x && player.y == shop.y){
      System.out.println("Do you want to buy more inventory slots? (adds 3 slots for 2 dolla dolla) [y/n]");
      System.out.println("You currently have "+stats.money+" dolla dolla.");
      if (input.equals("y")){
        if (stats.money >= 2){
          stats.slots = stats.slots + 3;
          stats.money = stats.money - 2;
          System.out.println("Success! You now have "+stats.slots+" inventory slots and "+stats.money+" dolla dolla.");
          player.x ++;
        } else {
          System.out.println("You don't have enough money for that purchase.");
          player.x ++;
        }
      }
      else if (input.equals("n")){
        player.x ++;
      }           
    }

      world.render();
      System.out.println(player);
      //System.out.println(shop);
    }
  }
}
