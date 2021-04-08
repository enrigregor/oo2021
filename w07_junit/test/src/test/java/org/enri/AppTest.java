package org.enri;
 
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;



import org.junit.BeforeClass;
import org.junit.Test;


 
/**
 * Unit test for simple App.
 */
public class AppTest {
    static App app;
    
    @BeforeClass
    public static void init(){
        app = new App();
    }
 
    @Test
    public void shouldAnswerWithTrue(){
        assertTrue( true );
    }
    
    @Test
    public void checkSum(){
        assertTrue(4 == app.sum(2, 2));
    }

    @Test
    public void checkName(){
        app.name = "Test";
        assertEquals("App name should be Test", "Test", app.getName());
    }

    @Test
    public void doArraysEqual(){
        int[] arr = new int[]{ 2, 3, 4, 5};

        assertArrayEquals(arr, app.toArray(2, 3, 4, 5));
    }

    @Test 
    public void hamcrestTest(){
        assertThat(50, is(not(40)));
        assertThat(50, is(greaterThan(61)));

        assertThat("Hello", startsWith("o"));
    }

    @Test 
    public void compareObjects(){
        
    }

    
}