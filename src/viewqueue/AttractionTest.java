package viewqueue;

import org.junit.Test;
import static org.junit.Assert.*;


public class AttractionTest {

    Attraction at = new Attraction("DeathCoaster3000", 5);


    @Test
    public void getName() throws Exception {

        assertEquals("DeathCoaster3000", at.getName());
    }





}