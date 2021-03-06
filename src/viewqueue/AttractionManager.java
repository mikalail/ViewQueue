package viewqueue;

import java.util.ArrayList;

/**
 * Attraction Manager manages a group of Attractions
 */
public class AttractionManager {

    private ArrayList<Attraction> list;
    
    /**
     * Constructs a new AttractionManager
     * @param rides arrayList of Attraction objects
     */
    public AttractionManager(ArrayList<Attraction> rides) {

        this.list = rides;

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
     * displays each Attraction in list with Name + wait time only.
     */
   public String toString(){

       String waitlist = "";

        for(Attraction at : list){

            waitlist += at.toString();  // concatenates the current attraction into the waitlist string.
            at.updateWait();
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
