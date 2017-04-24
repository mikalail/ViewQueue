package viewqueue;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Attraction> rides = new ArrayList<>();

        AttractionManager attManager = new AttractionManager(rides);

        Attraction att1 = new Attraction("Apocalypse", 4);
        Attraction att2 = new Attraction("Batwing", 6);
        Attraction att3 = new Attraction("Dare Devil", 9);
        Attraction att4 = new Attraction("Mind Eraser", 7);
        Attraction att5 = new Attraction("Superman", 3);
        Attraction att6 = new Attraction("Live Music", 2);
        Attraction att7 = new Attraction("Theater", 3);
        attManager.add(att1);
        attManager.add(att2);
        attManager.add(att3);
        attManager.add(att4);
        attManager.add(att5);
        attManager.add(att6);
        attManager.add(att7);


        AttractionServer s1 = new AttractionServer(attManager);

    }
}
