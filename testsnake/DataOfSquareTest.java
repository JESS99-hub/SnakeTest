package testsnake;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Jessica
 */
public class DataOfSquareTest {
  
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }


    /**
     * Test of lightMeUp method, of class DataOfSquare.
     */
    @Test
    public void testLightMeUp() throws IndexOutOfBoundsException{
        System.out.println("lightMeUp");
        int a = 1;
        //get coverage for lightMeUp function
        DataOfSquare instance = new DataOfSquare(1) ;
        instance.lightMeUp(a);
    }
    
  
    
}
