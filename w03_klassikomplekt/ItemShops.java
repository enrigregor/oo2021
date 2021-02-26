public class ItemShops {
    public int x;
    public int y;
    public String name;
    private char symbol;

  public ItemShops(String name, int x, int y, char symbol){
      this.name = name;
      this.x = x;
      this.y = y;
    this.symbol = symbol;
   }

   public char getSymbol(){
    return symbol;
  }

}
