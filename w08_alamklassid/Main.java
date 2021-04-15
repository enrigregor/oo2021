public class Main {
    public static void main(String[] args){
        Child child = new Child("Mari", "developer");
        child.favoriteHobbyIs("dancing");
        child.personsCurrentState(12);
        child.firstThingIDo();

        Child person = new Child("Mirjam", "to build a lake into the ocean");
        //person.name = "Mirjam";
        //person.dream = "to build a lake into the ocean";
        person.thought = "why are lemons yellow and sting like hell when I rub them in my eyes";
        person.personsCurrentState(12);
    }
}
