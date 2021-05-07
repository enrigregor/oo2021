import java.util.ArrayList;

public class Joogivaat {
    double ruumala, jookiSees, jaak;
    Jook jook;
    Joogipudel Pudel;

    public Joogivaat(double ruumala, double jookiSees, Jook jook){

    }

    

    public void lisaJook(Joogipudel jook){

        double joogikogus = jook.pudeliMass();

        if(joogikogus + this.jookiSees > this.ruumala && this.jook == null || this.jook == jook.jook){

            this.jaak += (this.jookiSees + joogikogus) - this.ruumala;
            this.jookiSees = this.ruumala;
            this.jook = jook.jook;
        } else if(joogikogus + this.jookiSees < this.ruumala && this.jook == null || this.jook == jook.jook) {

            this.jookiSees += joogikogus;
            jook.jook = null;
            this.jook = jook.jook;
            
        } else {

        }
    }

    public double kuvaKogus(){
        return this.jookiSees;
    }

    public double kuvaJaak(){
        return this.jaak;
    }

    public ArrayList<Joogipudel> vaatPudelitesse(Joogipudel pudel){
        ArrayList<Joogipudel> pudelid = new ArrayList<Joogipudel>();
        for(int i = 0; this.jookiSees > pudel.pudeliMaht; i++){
            this.jookiSees -= pudel.pudeliMaht;
            this.Pudel = new Joogipudel(pudel.pudeliTyyp, this.jook, pudel.taaraRaha, pudel.pudeliMaht);
            pudelid.add(Pudel);
        }
        return pudelid;
    }

}

