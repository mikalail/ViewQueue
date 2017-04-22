package viewqueue;

import java.util.ArrayList;

/**
 * Attraction Manager manages a group of Attractions
 */
public class AttractionManager {

    private ArrayList<Attraction> list;

    /**
     * Constructs a new AttractionManager
     */
    public AttractionManager() {

        this.list = new ArrayList<>();

    }

    /**
     * adds an Attraction object to the end of the list
     * @param a - an Attraction object
     * @return boolean value: true on success, otherwise false
     */
    public boolean add(Attraction a){

        return list.add(a);

    }

    /**
     * removes Attraction object from list - if present
     * @param a - an Attraction object
     * @return a boolean result based on success(true) or failure(false)
     */
    public boolean rem(Attraction a){

        return list.remove(a);

   }

    /**
     *displays a simple list of Attractions (name only)
     *
     */
    public void display(){

       for(Attraction at : list){

           System.out.println(at.getName());

       }
   }

    /**
     * displays each Attraction in list with Name + wait time only.
     */
   public String toString(){

       String waitlist = "";

        for(Attraction at : list){

            int read = at.getSensorData() + 50; // simulates the sensor changing by adding 50 ppl.
            at.sensorUpdate(read); // updates the sensordata (and wait time) for the current attraction
            waitlist += at.toString();  // concatenates the current attraction into the waitlist string.
        }
        return waitlist;
   }

    /**
     * The number of Attractions being managed my AttractionManager
     * @return the number of Attractions active in AttractionManager
     */
    public int getNumAttractions() {
        return list.size();
    }
}
