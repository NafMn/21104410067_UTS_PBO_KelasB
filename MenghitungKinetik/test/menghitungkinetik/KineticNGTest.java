/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package menghitungkinetik;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Mohamad Nafis
 */
public class KineticNGTest {
    
    public KineticNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getResult method, of class Kinetic.
     */
    @Test
    public void testGetResult() {
        System.out.println("getResult");
        Kinetic instance = new Kinetic();
        double expResult = 0.0;
        double result = instance.getResult();
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResult method, of class Kinetic.
     */
    @Test
    public void testSetResult() {
        System.out.println("setResult");
        double v = 0.0;
        double m = 0.0;
        Kinetic instance = new Kinetic();
        instance.setResult(v, m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
