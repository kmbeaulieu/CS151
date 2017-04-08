package problem3.instruments;

/**
 *
 * @author Krystle
 */
public class Cello extends String{

    
    /*
     * because a string has no empty constructor, 
     * Cello cannot have a constructor without String's attributes
    */
    public Cello(int numStrings, boolean hasBow, String stringType) {
        super(numStrings, hasBow, stringType);
    }
    
    void somethingOnlyCelloCanDo(){
        //does something only a cello can do. Spin on the end pin? I don't know.
    }
        
}
