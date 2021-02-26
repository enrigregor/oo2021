import java.util.ArrayList;

public class World {
    private int width;
    private int height;
    
  
    private ArrayList<GameCharacter> characters;
    private ArrayList<ItemShops> shops;
    private ArrayList<GameItems> gameStuff;

    
  
    public World(int width, int height){
      this.width = width;
      this.height = height;
    }
  
    public void addCharacters(ArrayList<GameCharacter> c){
      this.characters = c;
    }
    public void addShops(ArrayList<ItemShops> s){
         this.shops = s;
    }
    public void addItems(ArrayList<GameItems> g){
        this.gameStuff = g;
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
            if (x == c.x && y == c.y && c.isVisible){
              symbol = c.getSymbol();
            }
          }

          for (ItemShops s : shops){
            if (x == s.x && y == s.y){
              symbol = s.getSymbol();
            }
          }
          for (GameItems g : gameStuff){
            if (x == g.x && y == g.y && g.isVisible){
              symbol = g.getSymbol();
            }
          }
  
          System.out.print(symbol);
        }
  
        System.out.println("");
      }
    }
  }


  

