public class FinnishID implements PersonalCodeBehaviour{
    private String code;

    public FinnishID(String code){
        this.code = code;
    }

    @Override
    public String getGender() {
        String gender;
        char firstChar = code.charAt(9);
        if(firstChar % 2 == 0){
            gender = "Naine";
        } else {
            gender = "Mees";
        }
        return gender;
    }

    @Override
    public int getFullYear() {
        char century = code.charAt(6);
        int year = Integer.parseInt(code.substring(4, 6));

        int centuryNr;
        if(century == '+'){
            centuryNr = 1800;
        }else if(century == '-'){
            centuryNr = 1900;
        }else if(century == 'A'){
            centuryNr = 2000;
        }else{
            centuryNr = 0;
        }
        int fullYear = centuryNr+year;

        return fullYear;
    }

    @Override
    public String getDOB() {
        int date = Integer.parseInt(code.substring(2, 4));
        int day = Integer.parseInt(code.substring(0, 2));
        char century = code.charAt(6);
        int year = Integer.parseInt(code.substring(4, 6));

        int centuryNr;
        if(century == '+'){
            centuryNr = 1800;
        }else if(century == '-'){
            centuryNr = 1900;
        }else if(century == 'A'){
            centuryNr = 2000;
        }else{
            centuryNr = 0;
        }
        int fullYear = centuryNr+year;

        return day+"."+date+"."+fullYear;
    }
    
}
