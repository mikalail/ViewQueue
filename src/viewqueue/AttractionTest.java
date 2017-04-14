package viewqueue;

import org.junit.Test;
import static org.junit.Assert.*;


public class AttractionTest {

    Attraction at = new Attraction("DeathCoaster3000", "rollercoaster", 4, 80, 5.33);


    @Test
    public void getName() throws Exception {

        assertEquals("DeathCoaster3000", at.getName());
    }

    @Test
    public void getType() throws Exception {

        assertEquals("rollercoaster", at.getType());
    }

    @Test
    public void getNumOps() throws Exception {

        assertEquals("4 operators", 4, at.getNumOps());
    }

    @Test
    public void getCapacity() throws Exception {

        assertEquals("capacity 80", 80, at.getCapacity());
    }

    @Test
    public void getRate() throws Exception {

        assertEquals(5.33, at.getRate(), .01);
    }

    @Test // because click invokes other methods, this test combines click, sensorPeek,  getWait()
          // and calculateWait() to check full functionality of the click method

    public void click() throws Exception {

        at.click(300);
        assertEquals("should be 300", 300, at.sensorPeek());
        assertEquals(56.28, at.getWait(), .01);

    }

    @Test
    public void setNumOps() throws Exception {

        at.setNumOps(6); // set ops to a new number
        assertEquals("new ops = 6", 6, at.getNumOps());

    }

    @Test
    public void setCapacity() throws Exception {

        at.setCapacity(100);
        assertEquals("new capacity  = 100", 100, at.getCapacity());
    }

    @Test
    public void setRate() throws Exception {

        at.setRate(9.32);
        assertEquals(9.32, at.getRate(), .01);
    }

}