/**
 *
 * @author Krystle
 */
public class AmExCC extends CreditCard{
    //First digit is a 3 and second digit a 4 or 7. Length is 15 digits.
    private static final int CC_NUM_LENGTH = 15;
    private static final char FIRST_DIGIT = '3';
    private static final char SECOND_DIGIT_OPTION_ONE = '4';
    private static final char SECOND_DIGIT_OPTION_TWO = '7';
    
    private final String CC_NUMBER;

    
    /**
     * Checks if a given number is a valid American Express Credit Card Number
     * @param ccNum the credit card number to check
     * @return true if it is a valid AmExCC#, false if it is not
     */
    public static boolean isValid(String ccNum){
        String num = ccNum;
        //Length is 15 digits.
        if(num.length()==CC_NUM_LENGTH){
            //the first digit and second digit are valid
            if((num.charAt(0)==FIRST_DIGIT && num.charAt(1)==SECOND_DIGIT_OPTION_ONE) ||
               (num.charAt(0)==FIRST_DIGIT && num.charAt(1)==SECOND_DIGIT_OPTION_TWO) ){
                return true;
            }
        }
        return false;
    }

    AmExCC(String ccNumber) {
        CC_NUMBER = ccNumber;
    }
}
