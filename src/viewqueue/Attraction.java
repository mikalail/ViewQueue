package viewqueue;

/**
 *Represents an Attraction at an amusement park such as a ride, game, or show
 */
public class Attraction {

    private String name; // name of Attraction
    private String type; // type of Attraction
    private int numOps;    //the number of operators
    private int capacity;    // the number of people the Attraction can serve at each "turn"
    private double rate;      // the number of people per unit of time served by the Attraction
    private double wait;

    private Sensor s = new Sensor(this.name, 0); // The sensor for this attraction

    /**
     * Builds a new Attraction
     * @param name The name of this attraction
     * @param type The type of attraction. i.e. (ride: rollercoaster, ride: spinning cups, etc.)
     * @param numOps The number of operators running the Attraction
     * @param capacity The capacity of each "run" or "turn" of the Attraction
     * @param rate The rate at which the attraction moves people through per unit of time
     */
    public Attraction(String name, String type, int numOps, int capacity, double rate) {
        this.name = name;
        this.type = type;
        this.numOps = numOps;
        this.capacity = capacity;
        this.rate = rate;
    }


    private void CalculateWait(){

        this.wait = this.s.getNumPpl() / this.rate;

    }

    /**
     * The name of this Attraction
     * @return attraction name
     */
    public String getName() {
        return name;
    }

    /**
     * The type of this Attraction
     * @return attraction type
     */
    public String getType() {
        return type;
    }

    /**
     * The number of operators on this Attraction
     * @return number of attraction operators
     */
    public int getNumOps() {
        return numOps;
    }

    /**
     * The capacity for each seating of this Attraction
     * @return attraction capacity for each seating
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * The rate (people/min) that the Attraction serves customers.
     * @return the rate of the Attraction in people per minute
     */
    public double getRate() {
        return rate;
    }

    /**
     * The wait time for this attraction based on the last sensor reading
     * @return The waiting time in minutes
     */
    public double getWait() {
        return wait;
    }

    /**
     * Sets the number of operators for this Attraction
     * @param numOps an integer representing the number of operators
     */
    public void setNumOps(int numOps) {
        this.numOps = numOps;
    }

    /**
     * sets the capacity for this attraction
     * @param capacity an integer representing the capacity served by each run/turn of the attraction
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * sets the rate for this attraction
     * @param rate a double value representing the rate in people per minute.
     */
    public void setRate(double rate) {
        this.rate = rate;
    }
}
