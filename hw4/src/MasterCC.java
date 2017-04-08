
/**
 *
 * @author Krystle
 */
public class MasterCC extends CreditCard {
    //First digit is a 5, second digit is in range 1 through 5 inclusive. Only valid lenght of number is 16 digits.
    private static final int CC_NUM_LENGTH = 16;
    private static final char FIRST_DIGIT = '5';
    
    private static final char SECOND_DIGIT_1 = '1';
    private static final char SECOND_DIGIT_2 = '2';
    private static final char SECOND_DIGIT_3 = '3';
    private static final char SECOND_DIGIT_4 = '4';
    private static final char SECOND_DIGIT_5 = '5';
    
    private final String CC_NUMBER;

    static boolean isValid(String ccNum) {
        
        if(ccNum.length()==CC_NUM_LENGTH && ccNum.charAt(0)==FIRST_DIGIT){
            char secondChar = ccNum.charAt(1);
            if(secondChar==SECOND_DIGIT_1 || secondChar==SECOND_DIGIT_2 || secondChar==SECOND_DIGIT_3 || 
                    secondChar==SECOND_DIGIT_4 || secondChar==SECOND_DIGIT_5){
                return true;
            }
        }
        return false;
    }
    
    public MasterCC(String ccNumber){
        CC_NUMBER = ccNumber;
    }
}
