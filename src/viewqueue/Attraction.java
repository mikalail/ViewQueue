package viewqueue;

import java.io.Serializable;

/**
 *Represents an Attraction at an amusement park such as a ride, game, or show
 */
public class Attraction  implements Serializable{

    private String name;      // name of Attraction
    private double wait;
    private int sensorData;
    double rate;


    /**
     * Builds a new Attraction
     * @param name The name of this attraction
     * @param rate the rate (in people/min) that the Attraction
     */
    public Attraction(String name, double rate) {
        this.name = name;
        this.rate = rate;
        this.wait = 0.0;
        this.sensorData = 0;

    }


    private void setWait( ){

        this.wait = this.sensorData/this.rate;
    }

    /**
     * The string representation of Attraction, containing only the 'name' and 'wait' fields
     * @return a string containing the name and wait time.
     */
    public String toString(){

        return(name + " & " + wait);

    }

    /**
     * The name of this Attraction
     * @return attraction name
     */
    public String getName() { return name; }

    /**
     * The wait time of this Attraction
     * @return the wait time (in minutes)
     */
    public double getWait() {
        return wait;
    }

    /**
     * Updates the sensor count of people waiting in line
     * @param ppl
     */
    public  void sensorUpdate(int ppl){
        this.sensorData = ppl;
        setWait();

    }

}
