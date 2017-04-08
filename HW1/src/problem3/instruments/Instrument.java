package problem3.instruments;

/**
 * @author Krystle
 */
   

public class Instrument {
    private String range; //the range of notes it can play
    private String transposition; //music for transposing instruments is not written or read at concert pitch
    private String[] techniques;//the types of techniques it can play

    public Instrument() {
    }

    public Instrument(String range, String transposition, String[] techniques) {
        this.range = range;
        this.transposition = transposition;
        this.techniques = techniques;
    }

    public void setTechniques(String[] techniques) {
        this.techniques = techniques;
    }
    
    public String getRange() {
        return range;
    }

    public String getTransposition() {
        return transposition;
    }

    /**
     * play a piece of music
     */ 
    public void play(){
        
    }
    
    /**
     * tune the instrument.
     */
    public void tune(){
        checkKey();
    }

    private void checkKey() {
        //check the key of the current note playing to tune the instrument
    }
    
}

