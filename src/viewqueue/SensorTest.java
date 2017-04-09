package viewqueue;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * SensorTest tests the methods in the Sensor class
 */
public class SensorTest {

    Sensor s = new Sensor("Ride", 60);


    @Test
    public void getNumPpl() throws Exception {

        assertEquals("should be 60", 60, s.getNumPpl());
    }

    @Test
    public void setNumPpl() throws Exception {

        // first change the value from 60 to 80
        s.setNumPpl(80);
        assertEquals("New number should be 80", 80, s.getNumPpl());
    }

    @Test
    public void getaName() throws Exception {

        assertEquals("Ride", s.getaName());
    }

}