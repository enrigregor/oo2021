import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        division();
        PrimeNumber();
    }

    public static void division(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta number: ");
        int input = scanner.nextInt();
       // boolean ok = true;

        //kontrollin kas arv jagub 2, 3, 5 v 7-ga
        System.out.println("Sisestatud arv on "+ input +"\n");
        if (input % 2 == 0){
            System.out.println("Arv jagub kahega \n");
        }
        if (input % 3 == 0){
            System.out.println("Arv jagub kolmega \n");
        }
        if (input % 5 == 0){
            System.out.println("Arv jagub viiega \n");
        }
        if (input % 7 == 0){
            System.out.println("Arv jagub seitsmega \n");
        }

        //kontrollime kas kasjutaja sisestatud arv on algarv 
        for (int i=2; i <= input / 2; i++ ){
            if(input % i == 0){
                //ok = false;
                System.out.println("See number ei ole algarv!\n");
                break;
            }
            if(i >= input / 2){
                System.out.println("See number on algarv!\n");
            }
        }
        scanner.close();
    }

    public static void PrimeNumber(){
        int algarvArv = 1000;
        int[] Algarvud;
     
        Algarvud = new int[algarvArv];
        int count = 0;
        int number = 2;

        while(count < algarvArv) {

            if(primeCheck(number)){

                Algarvud[count] = number;
                count++;
            }
            number++;
        }
        //Siin vaatame tuhandenda algarvu ruudust järgmised 10 temast väiksemad olevad algarvud
        int lastNumber = Algarvud[999];
        System.out.println(lastNumber);
        int lastNumberSquared = lastNumber * lastNumber;
        int loendur = 0;

        for (int i = lastNumberSquared; loendur < 10; i--){
            
            for(int j = 0; j <= 999; j++ ){

                if(i % Algarvud[j] == 0){
                   break;
                }
                if(j == 999){
                    loendur++;
                    System.out.println(i);
                }

            }
        }
    }
    public static boolean primeCheck(int number){

        for (int i=2; i <= number / 2; i++ ){
            if(number % i == 0){
                //ok = false;
                return false;
            }
        }
        return true;
    }
}

