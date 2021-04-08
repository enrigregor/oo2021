public class Main {
    public static void main(String[] args){

        EstonianID est = new EstonianID("50108232013");

        
        FinnishID fin = new FinnishID("100190-003K");

        System.out.println(est.getGender());
        System.out.println(est.getFullYear());
        System.out.println("Sünnikuupäev");
        System.out.println(est.getDOB());
        System.out.println(est.getMonth());
        System.out.println("Päev:");
        System.out.println(est.getDay());

        System.out.println("------------------------------------");

        System.out.println(fin.getGender());
        System.out.println(fin.getFullYear());
        System.out.println("Sünnikuupäev");
        System.out.println(fin.getDOB());
        System.out.println(fin.getMonth());
        System.out.println("Päev:");
        System.out.println(fin.getDay());

    }
}
