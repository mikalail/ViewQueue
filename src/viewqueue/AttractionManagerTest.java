package viewqueue;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class AttractionManagerTest {


    ArrayList<Attraction> rides = new ArrayList<>();

    AttractionManager am = new AttractionManager(rides);


    @Test
    public void addTest() throws Exception {

        Attraction att1 = new Attraction("Fun House", 3);
        am.add(att1);

        // testing getNumAttractions() by checking if 1 item was added

        assertEquals(1, am.getNumAttractions());

    }

    @Test
    public void toStringTest() throws Exception {

        Attraction att1 = new Attraction("Fun House", 3);
        Attraction att2 = new Attraction("WhirlyBird", 5);

        am.add(att1);
        am.add(att2);

        assertEquals("Fun House:3:WhirlyBird:5:", am.toString());

    }

    @Test
    public void getNumAttractionsTest() throws Exception {

        Attraction att1 = new Attraction("Fun House", 3);
        Attraction att2 = new Attraction("WhirlyBird", 5);

        am.add(att1);
        am.add(att2);

        assertEquals(2, am.getNumAttractions());

    }

}