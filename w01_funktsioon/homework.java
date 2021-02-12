import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        convertPower();
    }
    public static void convertPower(){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Insert the unit of measurement you would like to convert form [kw or hp] ");
        String powerChoice = myObj.nextLine();
        
        
        if (powerChoice.equals("hp")){
            System.out.println("Enter the number of hp you'd like to convert:");
            Double powerNr = myObj.nextDouble();
            Double convertedPower = (Double) powerNr / 1.341;
            System.out.println(powerNr + powerChoice + " is " + convertedPower + " kw.");
        } else if (powerChoice.equals("kw")){
            System.out.println("Enter the number of kw you'd like to convert:");
            Double powerNr = myObj.nextDouble();
            Double convertedPower = (Double) powerNr * 1.341;
            System.out.println(powerNr + powerChoice + " is " + convertedPower + " hp.");
        } else {
            System.out.println("Please choose either kw or hp");
        };
        System.out.println("End of program");
    
    }
}
