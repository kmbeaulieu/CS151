package problem3.instruments;

/**
 *
 * @author Krystle
 */
public class Clarinet_BFLat extends Woodwind{

    /*Unique to a clarinet is its parts, so you could enumerate the parts and 
     *their specific functions.
     */
    private enum parts{
         MOUTHPIECE{
             String reed;
             String material;
             Boolean isReedPlaced;
         },
         BARREL{
             String material;
         },
         UPPERJOINT{
            String material;
         },
         LOWERJOINT{
             String material;
         },
         BELL{
             String material;
         };
    }

    public Clarinet_BFLat() {
    }

    public Clarinet_BFLat(boolean needsReed, String instrumentMaterial, int keyNum) {
        super(needsReed, instrumentMaterial, keyNum);
    }
    
    
}


    
   
    

