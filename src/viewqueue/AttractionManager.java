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
        Attraction att1 = new Attraction("Apocalypse", 4);
        Attraction att2 = new Attraction("Batwing", 6);
        Attraction att3 = new Attraction("Dare Devil", 9);
        Attraction att4 = new Attraction("Mind Eraser", 7);
        Attraction att5 = new Attraction("Superman", 3);
        Attraction att6 = new Attraction("Live Music", 2);
        Attraction att7 = new Attraction("Theater", 3);
        list.add(att1);
        list.add(att2);
        list.add(att3);
        list.add(att4);
        list.add(att5);
        list.add(att6);
        list.add(att7);
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
