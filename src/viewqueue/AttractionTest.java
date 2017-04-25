package viewqueue;

import org.junit.Test;
import static org.junit.Assert.*;


public class AttractionTest {

    Attraction at = new Attraction("DeathCoaster3000", 5);

    // tests that proper name is returned

    @Test
    public void getName() throws Exception {

        assertEquals("DeathCoaster3000", at.getName());
    }

    // tests that proper wait time is returned

    @Test
    public void getWait() throws Exception {

        assertEquals(5, at.getWait());
    }

    // checks that toString returns the format required by the server/client classes
    // format of string is "name:wait:"

    @Test
    public void toStringTest() throws Exception {

        assertEquals("DeathCoaster3000:5:", at.toString());
    }

    // note: because updateWait( ) method uses a random number generator, JUnit testing was impossible for that
    // method, but the method has work properly in integration & system testing with the Android app.



}