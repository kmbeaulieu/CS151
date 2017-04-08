/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Krystle
 */
public class StringCodeTest {
    
    public StringCodeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of blowup method, of class StringCode.
     */
    @Test
    public void testBlowup() {
        System.out.println("blowup nil");
        String str = "";
        StringCode instance = new StringCode();
        String expResult = "";
        String result = StringCode.blowup(str);
        assertEquals(expResult, result);
        
        System.out.println("blowup 1 letter");
        str = "a";
        instance = new StringCode();
        expResult = "a";
        result = StringCode.blowup(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of maxRun method, of class StringCode.
     */
    @Test
    public void testMaxRun() {
        System.out.println("maxRun");
        String str = "";
        int expResult = 0;
        int result = StringCode.maxRun(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stringIntersect method, of class StringCode.
     */
    @Test
    public void testStringIntersect() {
        System.out.println("stringIntersect");
        String a = "";
        String b = "";
        int len = 0;
        boolean expResult = false;
        boolean result = StringCode.stringIntersect(a, b, len);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class StringCode.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        StringCode.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
