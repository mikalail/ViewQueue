package viewqueue;
//I commented out the package cause I was all the java files in my ubuntu machine. "javac *.java" to compile all and 
//"java Main" to run the server works

import java.io.Serializable;
import java.util.Random;
/**
 *Represents an Attraction at an amusement park such as a ride, game, or show
 */
public class Attraction  implements Serializable{

    private String name;      // name of Attraction
    private int wait;

    /**
     * Builds a new Attraction
     * @param name The name of this attraction
     * @param wait an estimated initial wait time (integer minutes)
     */
    public Attraction(String name, int wait) {
        this.name = name;
        this.wait = wait;//

    }

    private static int rand(int min, int max){
    Random rand = new Random();
    int randomNum = rand.nextInt((max - min) + 1) + min;
    return randomNum;
    }

    private int getWaitTime(){
        return wait;
    }

    /**
     * updates the Wait time with a random number generator (to simulate sensors changing)
     */

    public void updateWait( ){
       int temp = rand(0, 10);
       int result = temp - 5;
       // this.wait = this.sensorData/this.rate;
       result = (result % 15) + 15;//keep number positive
       this.wait = result;
    }

    /**
     * The string representation of Attraction, containing only the 'name' and 'wait' fields
     * @return a string containing the name and wait time with : as field separators.
     */
    public String toString(){

        return(name + ":" + wait + ":");

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
}
