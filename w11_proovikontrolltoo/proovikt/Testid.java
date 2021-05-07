import static org.junit.Assert.assertEquals;
import org.junit.Test;

import jdk.jfr.Timestamp;

public class Testid {

    //kogu testimissüsteemi oleks teinud maven projectiga aga see lõpetas töötamise
    
    Jook limonaad = new Jook("Limonaad", 1.44, 0.98);

    Joogipudel limonaadipurk = new Joogipudel("Purk", limonaad, 0.33, 0.1);

    Joogipudel tyhiPudel =  new Joogipudel("Poolene pudel", null, 0.5, 0.1);


    @Test
    public void mass(){
        assertEquals(0.3234, limonaadipurk.pudeliMass(), 0.0001f);
    }

    @Test 
    public void massTyhi(){
        assertEquals(0.0f, tyhiPudel.pudeliMass(), 0.0001f);
    }

    @Test
    public void omahindTyhi(){
        assertEquals(0.1f, tyhiPudel.pudeliOmahind(), 0.0001f);
    }

    @Test 
    public void omahindTais(){
        assertEquals(0.4752, limonaadipurk.pudeliOmahind(), 0.0001f);
    }
}
