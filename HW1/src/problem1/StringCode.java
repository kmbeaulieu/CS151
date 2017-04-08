package problem1;

import java.util.HashSet;

/**
 *
 * @author Krystle
 */
public class StringCode {
    
    /**
     * 
     * @param str the string to blow up
     * @return a version of the original string as follows: 
     * each digit 0-9 that appears in the original string is replaced by 
     * that many occurrences of the character to the right of the digit.
     * EX: "a3tx2z" yields "attttxzzz", and "12x" yields "2xxx".
     * 
     * Note: A digit not followed by a character (i.e. at the end of the string)
     * is replaced by nothing.
     */
    public static String blowup(String str){
        //initial conditions. Do nothing if empty. Return number or letter if only 1 char. 
        if(str.isEmpty() || str.length()==1){
            return str;
        }
        
        String holderStr = str;
        Character cc; //current character
        String finalStr = "";
        Boolean didNumberThenLetter = false;
        Boolean didNumberThenNumber = false;
        
        while(!holderStr.isEmpty()){
            cc = holderStr.charAt(0);
            //is a letter, push to final string
            if(Character.isAlphabetic(cc)){
                
                String concat = cc.toString();
                finalStr+=concat;
            }else if(Character.isDigit(cc)){
                //is number, do the number things if it has something after.
                if(holderStr.length()>1){
                    //need the next char to see what to do after a number
                    Character nextChar = holderStr.charAt(1);
                    //if the next char is a letter, and the number isn't 0, ex 2a, then do aaa
                    if(Character.getNumericValue(cc)!=0 && Character.isAlphabetic(nextChar)){
                        finalStr+=nextChar;
                        for(int i = Character.getNumericValue(cc);i>0;i--){
                            finalStr+=nextChar;
                            //flag
                            didNumberThenLetter=true;
                        }
                    }
                    //if it is a number then a number, ex 23, then do 33
                    else if(Character.getNumericValue(cc)!=0 && Character.isDigit(nextChar)){
                        for(int i = Character.getNumericValue(cc);i>0;i--){
                            finalStr+=nextChar;
                        }
                        //flag
                        didNumberThenNumber=true;
                    }
                }
                else{
                    finalStr+=holderStr;
                }
                
            }
            
            //how to go about doing the next in line. 
            if(didNumberThenLetter  &&  holderStr.length()>2){
                didNumberThenLetter = false;
                holderStr = holderStr.substring(2);
            }else if(didNumberThenNumber && holderStr.length()==2){
                didNumberThenNumber = false;
                return finalStr;
            }else if(didNumberThenLetter && holderStr.length()==2){
                holderStr= "";            
            }else{
                holderStr= holderStr.substring(1);
            }
        }
        
        
        return finalStr;
        
        
    }

    /**
     * 
     * @param str
     * @return the length of the largest run in the string
     * 
     * NOTE: A "run" is a series of zero or more adjacent characters 
     * that are the same. 
     * EX: So the max run of "xxyyyz" is 3, and the max run of "xyz" is 1.
     */
    static int maxRun(String str){
        //setup
        int maxRun = 0;
        int currentRun = 0;
        String strHold = str;
        Character cHold = null;
        Character cCurrent;
        if(str.length()==0){
            return 0;
        }
        //iterate through
        for(int i =0; i<strHold.length();i++){ 
            //store the current letter
            cCurrent = strHold.charAt(i);
            if(i==0){ 
                //for the first char do these things
                cHold = cCurrent;
                currentRun++;
                maxRun++;
            }else{
                
                //everything that isnt the first character
                if(cCurrent.equals(cHold)){
                    currentRun++;
                    //if the new current run is bigger than the max, set the max.
                    if(currentRun>maxRun){
                        maxRun=currentRun;
                    }
                }else{
                    //set the new max if applicable
                    if(currentRun>maxRun){
                        maxRun=currentRun;
                    }
                    //reset the run since cHold/cCurrent are different and store the current char to check next time
                    currentRun=1;
                    cHold = cCurrent;
                }
            }
        }
        return maxRun;
    }

    /**
     * 
     * @param a str 1
     * @param b str 2
     * @param len length of substring you want to test between a and b
     * @return true if there are any such substrings which appear in both strings
     * 
     * NOTE: Compute this in O(n) time using a HashSet. Len will be 1 or more.
     */
    static boolean stringIntersect(String a, String b, int len){
        HashSet hs = new HashSet();
        for(int i=0;i<a.length()-len;i++){
            String s = a.substring(i, i+len);
            //if it already has what we want to add, return true            
            hs.add(s);
            
        }
        for(int i=0;i<b.length()-len;i++){
            String s = b.substring(i, i+len);
            if(hs.contains(s)){
                return true;
            }
        }
        
        
        return false;
    }
    
    
    public static void main(String[] args){
        
       //blowup tests
//        String testStr0 = "";
//        String testStr1 = "a3tx2z"; 
//        String testStr2 = "z"; 
//        String testStr3 = "aaa"; 
//        String testStr4 = "aab2c2"; 
//        String testStr5 = "aabbccbbd"; 
//        String testStr6 = "el"; 
//        String testStr7 = "Hello"; 
//        String testStr8 = "123";
//        String testStr9 = "ABC";
//        String testStr10 = "2ABC"; 
//        String testStr11 = "ABC2"; 
//        String testStr12 = "0ABC"; 
//        String testStr13 = "ABC0"; 
//        String testStr14 = "AB0C";
    //  System.out.println("test: expected: , result: " + StringCode.blowup(testStr0));
//      System.out.println("test: expected: attttxzzz, result: " + StringCode.blowup(testStr1));
//      System.out.println("test: expected: z, result: " + StringCode.blowup(testStr2));      
//      System.out.println("test: expected: aabccc2, result: " + StringCode.blowup(testStr4));
//      System.out.println("test: expected: 233, result:****** " + StringCode.blowup(testStr8));
//      System.out.println("test: expected: ABC, result: " + StringCode.blowup(testStr9));
//      System.out.println("test: expected: AAABC, result: " + StringCode.blowup(testStr10));
//      System.out.println("test: expected: ABC2, result: " + StringCode.blowup(testStr11));
//      System.out.println("test: expected: ABC, result:**** " + StringCode.blowup(testStr12));
//      System.out.println("test: expected: ABC0, result: " + StringCode.blowup(testStr13));
//      System.out.println("test: expected: ABC, result: " + StringCode.blowup(testStr14));

        //maxRunTests
//        String mr1 = "a";
//        String mr2 = "";
//        String mr3 = "aabbbb";
//        String mr4 = "ab444bb";
//        String mr5 = "ab!!c";
        
//        System.out.println("test: expected: 1, result: "+StringCode.maxRun(mr1));
//        System.out.println("test: expected: 0, result: "+StringCode.maxRun(mr2));
//        System.out.println("test: expected: 4, result:**** "+StringCode.maxRun(mr3));
//        System.out.println("test: expected: 3, result: "+StringCode.maxRun(mr4));
//        System.out.println("test: expected: 2, result: "+StringCode.maxRun(mr5));

        
    }
}

