/**
 *
 * @author Krystle
 */
public class DiscoverCC extends CreditCard{
    //First four digits are 6011. Length is 16 digits.
    private static final int CC_NUM_LENGTH = 16;
    private static final char FIRST_DIGIT = '6';
    private static final char SECOND_DIGIT = '0';
    private static final char THIRD_DIGIT = '1';
    private static final char FOURTH_DIGIT = '1';
    private final String CC_NUMBER;

    static boolean isValid(String ccNum) {
        if(ccNum.length()==CC_NUM_LENGTH && 
                ccNum.charAt(0)==FIRST_DIGIT && 
                ccNum.charAt(1)==SECOND_DIGIT && 
                ccNum.charAt(2)==THIRD_DIGIT && 
                ccNum.charAt(3)==FOURTH_DIGIT){
            return true;
        }
        return false;
    }

    DiscoverCC(String ccNumber) {
        CC_NUMBER = ccNumber;
    }

}
