package problem3.instruments;

/**
 *
 * @author Krystle
 */
public class Violin extends String {
    private String bow;
    
    //Only takes from String and Violin
    public Violin(String bow, int numStrings, boolean hasBow, String stringType) {
        super(numStrings, hasBow, stringType);
        this.bow = bow;
    }
    
    //takes from Instrument and String and Violin
    public Violin(String bow, int numStrings, boolean hasBow, String stringType, String range, String transposition, String[] techniques) {
        super(numStrings, hasBow, stringType, range, transposition, techniques);
        this.bow = bow; 
    }
  
    
    
}
