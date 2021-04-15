public abstract class Parent {
    public String name = "default";
    public String dream;
    public String thought;

    public Parent(String name, String dream, String thought){
        this.name = name;
        this.dream = dream;
        this.thought = thought;
    }

    public void favoriteHobbyIs(String hobby){
        System.out.println(this.name + "'s favorite hobby is " + hobby);
    }

    public void firstThingIDo(){
        System.out.println("I brush my teeth");
    }

    public void personsCurrentState(int age){
        System.out.println(name +"'s dream is " +dream+" and the thing they are thinking about at the moemnt is " + thought +". Not to mention they are "+ age+" years old.");
    }

    public abstract void howISpendMyEvenings();
}
