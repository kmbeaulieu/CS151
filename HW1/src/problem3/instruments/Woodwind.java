package problem3.instruments;

/**
 *
 * @author Krystle
 */
public class Woodwind extends Instrument{
    private boolean needsReed; //some need reeds and some don't (oboe vs flute)
    private String instrumentMaterial; //is it brass,etc?
    private int keyNum; //number of keys it has

    public Woodwind(){
        
    }

    public Woodwind(boolean needsReed, String instrumentMaterial, int keyNum) {
        this.needsReed = needsReed;
        this.instrumentMaterial = instrumentMaterial;
        this.keyNum = keyNum;
    }
    
    public boolean isNeedsReed() {
        return needsReed;
    }

    public String getInstrumentMaterial() {
        return instrumentMaterial;
    }

    public int getKeyNum() {
        return keyNum;
    }

    /**
     * blow into the instrument
     */
    public void blow(){
        
    }
    
    /*
    they tune a different way than strings, so it needs to override the method.
    */
    @Override
    public void tune(){
        blow();
        super.tune();
    }
    
    
}