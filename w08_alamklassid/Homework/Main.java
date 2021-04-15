package Homework;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of the fish: ");
        String nameInput = input.nextLine();

        System.out.println("----------------------------");

        System.out.println("Enter the weight of the fish (kg): ");
        int weightInput = input.nextInt();

        FishDescription fishData = new FishDescription(nameInput, weightInput);
        fishData.fishNameAndWeight(nameInput, weightInput);
        fishData.fishBatch(nameInput);
        fishData.fishGroup();

        input.close();

    }
}
