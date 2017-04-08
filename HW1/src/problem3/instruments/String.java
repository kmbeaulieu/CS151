package problem3.instruments;


/**
 *
 * @author Krystle
 */
public class String extends Instrument{
    private int numStrings; //ex a guitar has 5,6, etc. strings
    private boolean hasBow; //some strings have a bow
    private String stringType; //what are the strings made of?

    /* Because Instrument has an empty constructor, String can have a constructor
     * without Instrument's attributes.
     */
    public String(int numStrings, boolean hasBow, String stringType) {
        this.numStrings = numStrings;
        this.hasBow = hasBow;
        this.stringType = stringType;
    }

    /*this constructor has the super class's constructor attributes and 
    * its own class' constructor attributes
    */
    public String(int numStrings, boolean hasBow, String stringType, String range, String transposition, String[] techniques) {
        super(range, transposition, techniques);
        this.numStrings = numStrings;
        this.hasBow = hasBow;
        this.stringType = stringType;
    }

  
    
    

    public int getNumStrings() {
        return numStrings;
    }

    public boolean isHasBow() {
        return hasBow;
    }

    public String getStringType() {
        return stringType;
    }

    /**
     * use the strings of the instrument. 
     * This is different than the woodwinds who press keys/blow.
     */
    void useStrings(){
    }
    
    /**
     * This is used for tuning, pluck a single string at a time.
    */
    void pluckString(){
        
    }
        
        
    @Override
    public void tune() {
        super.tune();
        /*there are possibly things that need to be done across all instruments,
        *but only strings pluck their strings so this needs to be overriden with
        *a string only function
        */

        pluckString();
        
    }

    @Override
    public void play() {
        /**
         * a stringed instrument plays by plucking/strumming/etc. strings
         */
        useStrings();
    }
    

    
}