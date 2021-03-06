public class Word implements LetterInterface{
    private String word;
    private char letter;

    public Word(String word, char letter){
        this.word = word;
        this.letter = letter;
    }

    @Override
    public int getLetterCount() {
        int length = word.length() -1;
        int counter = 0;
        for (int i = 0; length > i; i++){
            if (word.charAt(i) == letter){
                counter++;
            }
        }
        return counter;
    }
    
}
