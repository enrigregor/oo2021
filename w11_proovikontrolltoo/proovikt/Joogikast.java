public class Joogikast {
    String kastityyp;
    double kastihind;
    double kastimass;
    int pesadeArv;
    Joogipudel pudel;

    public Joogikast(String kastityyp, int pesadeArv){
        this.kastityyp = kastityyp;
        this.pesadeArv = pesadeArv;
    }

    public double yheKastiHind(){
        kastihind = pudel.pudeliOmahind() * pesadeArv;

        return kastihind;

    }

    public double kastimass(){
        kastimass = pudel.pudeliMass() * pesadeArv;
        
        return kastimass;
    }


}
