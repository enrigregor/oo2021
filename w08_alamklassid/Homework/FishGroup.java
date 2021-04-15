package Homework;

public abstract class FishGroup {
    //-------------
    //PARENT FAIL
    //-------------
    //sisesta kala
    //programm andmete järgi valib kuhu gruppi ja batchi kala paigutatakse

    public String fishName;
    public int fishWeight;

    public FishGroup(String fishName, int fishWeight){
        this.fishName = fishName;
        this.fishWeight = fishWeight;
    }

    public void fishNameAndWeight(String name, int weight){
        System.out.println("You entered: ");
        System.out.println("Fish: "+name+" with the weight of "+weight+" kg.");
    }

    public void fishBatch(String fish){
        int letter = fish.length();
        if(letter > 7){
            System.out.println("This fish belongs in the 26G1 batch");
        } else {
            System.out.println("This fish belongs in the 25G3 batch");
        }
    }

    public void fishGroup(){
        if(fishWeight <= 3){
            System.out.println("This fish is in the lightweights group");
        } else if (fishWeight > 3 && fishWeight <= 6){
            System.out.println("This fish is in the midweights group");
        } else {
            System.out.println("This fish is in the heavyweights group");
        }
    }

}
