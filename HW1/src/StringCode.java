/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    String blowup(String str){
        return "";
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
    int maxRun(String str){
        return -1;
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
    boolean stringIntersect(String a, String b, int len){
        return false;
    }
}
