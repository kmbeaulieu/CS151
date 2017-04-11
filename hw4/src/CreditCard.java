
public abstract class CreditCard {
    String ccNumber;
    final static int MAX_CC_NUMBER_LENGTH = 19;
    
//    public static CreditCard createCard(String number){
//        if(AmExCC.)
//    }
//    
//    
//    static boolean isCardType(String ccNum){
//        if(ccNum.length()<=MAX_CC_NUMBER_LENGTH){
//            return false;
//        }
//    }
    
        //if less than the max length a cc number can be, 
//        if(ccNumber.length()>=MAX_CC_NUMBER_LENGTH){
//            return false;
//            //start checking for various cc types
//            //add more here when adding other credit card types
//            if(isVisa(ccNumber)){
//                cc  = new VisaCC(ccNumber);
//                return true;
//            }else if(isAmEx(ccNumber)){
//                cc = new AmExCC(ccNumber);
//                return true;
//            }else if(isMaster(ccNumber)){
//                cc = new MasterCC(ccNumber);
//                return true;
//            }else if(isDiscover(ccNumber)){
//                cc = new DiscoverCC(ccNumber);
//                return true;
//            }
//        }
//        return false;
    

    

//    @Override
//    public String toString() {
//        if(cc!=null){
//            String last4 = ccNumber.substring(ccNumber.length()-4, ccNumber.length());
//        return "CreditCard{" + "ccNumber=" + last4 + '}';
//        }
//        else return "ERROR BAD CREDIT CARD";
//    }
//
//    public CreditCard createCard(String ccnum){
//        if(AmexCC.isValid(ccnum)){
//            CreditCard cc = new VisaCC(ccnum);
//        }
//    }
////----CHECK VALIDITTY FOR VAROUS CC TYPES-------
//    private static boolean isVisa(String ccNum) {
//        return VisaCC.isValidVisa(ccNum);
//    }
//
//    private static boolean isAmEx(String ccNum) {
//        return AmExCC.isValidAmEx(ccNum);
//    }
//
//    private static boolean isMaster(String ccNum) {
//        return MasterCC.isValidMaster(ccNum);
//    }
//
//    private static boolean isDiscover(String ccNum) {
//        return DiscoverCC.isValidDiscover(ccNum);
//    }
//    
//   
//    
}
