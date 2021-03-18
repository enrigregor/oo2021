package homework;

public class Main {
    public static void main(String[] args){

        //see põhimõtteliselt demonstreerib, kui kaks erinevat asutust peaks samasse kohta oma andmetega aru andma.
        //ma kasutasin lihtsalt suvalisi arvutusi siin

        Arvutused arv = new Arvutused("32123");
        Arvutused2 arvUus = new Arvutused2("39601");

        System.out.println("Ruutjuur");
        System.out.println(arv.getRoot());
        System.out.println("Arvu mõlema poole korrutis");
        System.out.println(arv.getMulti());
        System.out.println("Summa iseenda poolsummaga");
        System.out.println(arv.getSum());

        System.out.println("--------------------------------------------------");

        System.out.println("Ruutjuur");
        System.out.println(arvUus.getRoot());
        System.out.println("Arvu mõlema poole korrutis");
        System.out.println(arvUus.getMulti());
        System.out.println("Summa iseenda poolsummaga");
        System.out.println(arvUus.getSum());

    }
}
