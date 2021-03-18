package homework;

public class Arvutused implements Liides{
    private String code;

    public Arvutused(String code){
        this.code = code;
    }


    @Override
    public String getRoot() {
        int length = code.length();
        int arv = Integer.parseInt(code.substring(0, length));
        double root = Math.sqrt(arv);
        //kontrollib kas arvust saab täpset ruutjuurt
        if(root % 2 == 0 || root % 3 == 0 || root % 1 == 0){
            return "arv "+arv+" jagub täpselt ning see on "+root;
        } else {
            return "Arvust "+arv+" ei saa täpset ruutjuurt. Ruutjuur on "+root;
        }
        
    }

    @Override
    public double getMulti() {
        int length = code.length();
        int halfLength;
        if(length % 2 == 0){
            halfLength = length / 2;
        } else {
            halfLength = (length - 1) / 2;
        }
        //System.out.println(length);
        //System.out.println(halfLength);
        int arvFirst = Integer.parseInt(code.substring(0, halfLength));
        int arvSecond = Integer.parseInt(code.substring(halfLength, length));
        //System.out.println(arvFirst);
        //System.out.println(arvSecond);
        double arvAns = arvFirst * arvSecond;
        return arvAns;
    }

    @Override
    public double getSum() {
        int length = code.length();
        int arv = Integer.parseInt(code.substring(0, length));
        double arvSum = arv + arv / 2;
        return arvSum;
    }
    
}
