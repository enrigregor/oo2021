import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Calculator for dividing");
        System.out.println("Enter a number you'd like to divide: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter a number you'd like to divide with: ");
        int secondNumber = input.nextInt();     
            
            try {
                int division = firstNumber / secondNumber;
                System.out.println("The result of your calculation is: " + division);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                System.out.println("Calcualtion is not possible");
            }

            System.out.println("Calculation process is complete");
            System.out.println("End.");

        input.close();
    }
}
