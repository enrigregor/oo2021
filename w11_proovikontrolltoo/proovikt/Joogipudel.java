public class Joogipudel {
    double pudeliMaht, taaraRaha;
    String pudeliTyyp;
    Jook jook;

    public Joogipudel(String pudeliTyyp, Jook jook, double pudeliMaht, double taaraRaha){
        this.pudeliTyyp = pudeliTyyp;
        this.pudeliMaht = pudeliMaht;
        this.taaraRaha = taaraRaha;

        if (jook != null){
            this.jook = jook;
        } else {
            this.jook = new Jook(null, 0, 0);
        }
    }

    public double pudeliMass(){
        double erikaal = jook.erikaal;
        if (jook.joogiNimi != null){
            double pudeliMass = pudeliMaht * erikaal;
            return pudeliMass;
        } else {
            double pudeliMass = 0;
            return pudeliMass;
        }
    }

    public double pudeliOmahind(){
        double joogiHind = pudeliMaht * jook.liitriHind;
        double koguHind = joogiHind + taaraRaha;

        return koguHind;
    }

}
