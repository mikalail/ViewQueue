package viewqueue;

import java.util.ArrayList;

/**
 * Attraction Manager manages a group of Attractions
 */
public class AttractionManager {

    private ArrayList<Attraction> list;

    public void add(Attraction a){

        list.add(a);

    }

   public boolean rem(Attraction a){

       return(list.remove(a));

   }

   public void display(Attraction a){

       for(Attraction at : list){

           System.out.println(at.getName());

       }

   }

}
