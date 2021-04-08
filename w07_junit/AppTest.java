import static org.junit.Assert.assertEquals;
import org.junit.Test;

import jdk.jfr.Timestamp;


public class AppTest {
    
    @Test
    public void firstTest(){
        assertEquals("1 equals 1", 1, 1);
    }

}
//javac -cp .;junit-4.13.2.jar;hamcrest-core-1.3.jar AppTest.java