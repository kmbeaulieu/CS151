
public class CreditCard {
    String ccNumber;
    private final int MAX_CC_NUMBER_LENGTH = 19;
    
    CreditCard cc;
    
    public boolean isValid(){
        //if less than the max length a cc number can be, 
        if(ccNumber.length()<=MAX_CC_NUMBER_LENGTH){
            //start checking for various cc types
            //add more here when adding other credit card types
            if(isVisa(ccNumber)){
                cc  = new VisaCC(ccNumber);
                return true;
            }else if(isAmEx(ccNumber)){
                cc = new AmExCC(ccNumber);
                return true;
            }else if(isMaster(ccNumber)){
                cc = new MasterCC(ccNumber);
                return true;
            }else if(isDiscover(ccNumber)){
                cc = new DiscoverCC(ccNumber);
                return true;
            }
        }
        return false;
    }

//----CHECK VALIDITTY FOR VAROUS CC TYPES-------
    private boolean isVisa(String ccNum) {
        return VisaCC.isValid(ccNum);
    }

    private boolean isAmEx(String ccNum) {
        return AmExCC.isValid(ccNum);
    }

    private boolean isMaster(String ccNum) {
        return MasterCC.isValid(ccNum);
    }

    private boolean isDiscover(String ccNum) {
        return DiscoverCC.isValid(ccNum);
    }
    
    public CreditCard getCC(){
        return cc;
    }
}
