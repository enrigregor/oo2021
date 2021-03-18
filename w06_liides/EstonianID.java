public class EstonianID implements PersonalCodeBehaviour{
    private String code;

    public EstonianID(String code){
        this.code = code;
    }

    @Override
    public String getGender() {
        String gender;
        char firstChar = code.charAt(0);
        if(firstChar % 2 == 0){
            gender = "Naine";
        } else {
            gender = "Mees";
        }

        return gender;
    }

    @Override
    public int getFullYear() {
        int century = Integer.parseInt(code.substring(0, 1));
        int yearFirst = Integer.parseInt(code.substring(1, 2));
        int yearSecond = Integer.parseInt(code.substring(2, 3));

        int centuryNr;
        if(century < 3){
            centuryNr = 1800;
        }else if(century == 3 || century == 4){
            centuryNr = 1900;
        }else if(century == 5 || century == 6){
            centuryNr = 2000;
        } else{
            centuryNr = 0;
        }
        yearFirst = (yearFirst*10);
        int fullYear = centuryNr+yearFirst+yearSecond;
        return fullYear;
    }

    @Override
    public String getDOB() {
        // TODO Auto-generated method stub
        return "Pärast teen";
    }
    
}
