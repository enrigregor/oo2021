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
        int Year = Integer.parseInt(code.substring(1, 3));
        int Month = Integer.parseInt(code.substring(3, 5));
        int Day = Integer.parseInt(code.substring(5, 7));
        if(Year < 22){
            return Day + "." + Month + "." + (2000 + Year);
        } else {
            return Day + "." + Month + "." + (1900 + Year);
        }
    }

    @Override
    public String getMonth() {
        int Month = Integer.parseInt(code.substring(3, 5));

        return "Mitmes kuu:"+Month;
    }

    @Override
    public int getDay() {
       int Day = Integer.parseInt(code.substring(5, 7));
        return Day;
    }
    
}
