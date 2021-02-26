public class Homework3 {
    public static void main(String[] args) {

        int numberOfLetters = 0;
        String sentence = "what is up, its ya boy ksiolajidebt";

        //kalkulatsiooni osa
        for (char letter = 'a'; letter <= 'z'; letter++) {

            for (int x = 0; x < sentence.length(); x++) {
                if (sentence.charAt(x) == letter) {
                numberOfLetters++;
                }
        }
        //print osa
        if (numberOfLetters > 0) {
            System.out.println(letter+"- "+numberOfLetters);
            numberOfLetters = 0;
            }
        }
    }
        
}
