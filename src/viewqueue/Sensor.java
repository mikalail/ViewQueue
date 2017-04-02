package viewqueue;

import java.util.Observable;

/**
 * The Sensor class represents a sensor near an attraction at the park to count how many people are waiting in line
 */
public class Sensor{

    private String aName;
    private int numPpl;

    /**
     * Creates an new Sensor
     * @param aName The name of the park Attraction
     * @param numPpl The number of people detected by the Sensor at this Attraction
     */
    public Sensor(String aName, int numPpl) {
        this.aName = aName;
        this.numPpl = numPpl;
    }

    /**
     * Serves as a getter function for the number of people detected by the sensor
     * @return and integer value that equals the number of people in line
     */
    public int getNumPpl() {
        return numPpl;
    }

    /**
     * Updates the number of people in line as detected by the Sensor
     * @param numPpl The number of people detected by the sensor
     */
    public void setNumPpl(int numPpl) {
        this.numPpl = numPpl;
    }

    /**
     * The attraction name associated with this Sensor
     * @return The attraction name
     */
    public String getaName() {
        return aName;
    }
}
