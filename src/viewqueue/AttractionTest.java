package viewqueue;

import org.junit.Test;
import static org.junit.Assert.*;


public class AttractionTest {

    Attraction at = new Attraction("DeathCoaster3000", 5.33);


    @Test
    public void getName() throws Exception {

        assertEquals("DeathCoaster3000", at.getName());
    }

    @Test // tests sensorUpdate (and private setWait), and getWait methods
    public void  sensorUpdate() throws Exception{

        at.sensorUpdate(300);
        assertEquals(56.28, at.getWait(), 0.01);
    }



}