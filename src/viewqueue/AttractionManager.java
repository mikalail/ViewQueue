package viewqueue;

import java.util.ArrayList;

/**
 * Attraction Manager manages a group of Attractions
 */
public class AttractionManager {

    private ArrayList<Attraction> list = new ArrayList<>();


    /**
     * adds an Attraction object to the list
     * @param a - an Attraction object
     */

    public void add(Attraction a){

        list.add(a);

    }

    /**
     * removes an item from the list
     * @param a - an Attraction object
     * @return a boolean result based on success(true) or failure(false)
     */
    public boolean rem(Attraction a){

       return(list.remove(a));

   }

    /**
     *displays a simple list of Attractions (name only)
     * @param a - an Attraction object
     */
   public void display(Attraction a){

       for(Attraction at : list){

           System.out.println(at.getName());

       }
   }

}
