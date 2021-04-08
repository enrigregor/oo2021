public class GameCharacter implements HomeworkInterface{
    public int x;
    public int y;
    public String name;
    private char symbol;


    private Direction direction;


    

    public GameCharacter(String name, int x, int y, char symbol){
        this.name = name;
        this.direction = Direction.RIGHT;
        this.symbol = symbol;

        this.x = x;
        this.y = y;
    
    }


    public char getSymbol(){
        return symbol;
      }

    public void setDirection(Direction d){
        this.direction = d;
        move();
    }

    public void move(){
        switch(this.direction){
            case UP:
                this.y--;
                break;
            case RIGHT:
                this.x++;
                break;
            case DOWN:
                this.y++;
                break;
            case LEFT:
                this.x--;
                break;
            default:
                break;
        }
    }

 

	@Override
    public String toString(){
        return "Location-> x: "+x+" y: "+y; 
    }

    @Override
    public String ClosestSide() {
        String location;
        int xPos = this.x;
        int width = 35;

        if(xPos > (width/2)){
            location = "Position: right";
        } else if ( xPos < (width/2)){
            location = "Position: left";
        } else {
            location = "Position: in the middle";
        }

        
        
        return location;
    }
}
