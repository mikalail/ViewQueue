package viewqueue;

import java.util.ArrayList;

/**
 * Attraction Manager manages a group of Attractions
 */
public class AttractionManager {

    private ArrayList<Attraction> list;
    private int numAttractions;


    public AttractionManager() {

        this.list = new ArrayList<>();
        this.numAttractions = 0;

    }

    /**
     * adds an Attraction object to the end of the list
     * @param a - an Attraction object
     * @return boolean value: true on success, otherwise false
     */

    public boolean add(Attraction a){

        if( list.add(a) ){
            this.numAttractions += 1;
            return true;
        }else return false;

    }

    /**
     * removes Attraction object from list - if present
     * @param a - an Attraction object
     * @return a boolean result based on success(true) or failure(false)
     */
    public boolean rem(Attraction a){

       if( list.remove(a) ){
           this.numAttractions -= 1;
           return true;
       }else return false;

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

   public void waitList(){

        for(Attraction at : list){

            // this should ultimately create a String listing of each to go through the network stream
            // for now, just printing out with a system message
            System.out.println(at.toString());
        }
   }

}
