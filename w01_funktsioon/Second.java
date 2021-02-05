public class Second {
    
    public static void main(String[] args) {
        System.out.println(myName());
        System.out.println(add(5, 10));
        System.out.println(fullName("Enri", "Riim"));
        System.out.println(checkEqual(5, 5));
        System.out.println(notEqual(4, 4));

        myMath();
        myLogical();
        areStringsEqual();
    }

    public static String myName(){
        return "Enri";
    }

    public static int add(int number1, int number2){
        return number1 + number2;
    }

    public static String fullName(String firstname, String lastname){
        return firstname + " " + lastname + " !";
    }


    public static boolean checkEqual(int number1, int number2){
        return number1 == number2;
    }

    public static boolean notEqual(int number1, int number2){
        return number1 != number2; 
    }

    public static void myMath(){
        System.out.println(Math.pow(5, 2));
        int number = Math.pow(5,2); // casting
        System.out.println(number);

        System.out.println(Math.sqrt(9));
    }

    public static void myLogical(){
        System.out.println(5 < 10 && 5 > 4);
        System.out.println(6 > 8 || 3 == 3);

    }

    public static void areStringsEqual(){
        String name1 = "Enri"
        String name2 = "Enri"

        System.out.println(name1 == name2);

        String newName1 = new String("Enri"); //uus object
        String newName2 = new String("Enri"); //uus object

        System.out.println(newName1 == newName2);
        System.out.println(newName1.equals(newName2));
    }



}
