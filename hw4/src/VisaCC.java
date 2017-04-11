/**
 *
 * @author Krystle
 */
public class VisaCC extends CreditCard{
    //First digit is a 4. Length is either 13 or 16 digits.
    private static final int CC_NUM_LENGTH_OPTION_ONE = 13;
    private static final int CC_NUM_LENGTH_OPTION_TWO = 16;
    private static final char FIRST_DIGIT = '4';
    
    private final String CC_NUMBER;
    public VisaCC(String ccNumber) {
           CC_NUMBER = ccNumber;
    }
    
    public static boolean isValidType(String ccNum) {
        int len = ccNum.length();
        if((len==CC_NUM_LENGTH_OPTION_ONE || len==CC_NUM_LENGTH_OPTION_TWO) && ccNum.charAt(0)==FIRST_DIGIT ){
            return true;
        }
        return false;
    }

    
    
}
