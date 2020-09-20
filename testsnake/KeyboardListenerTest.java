package testsnake;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Button;
import java.awt.event.KeyEvent;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Jessica
 */
public class KeyboardListenerTest {
    
    public KeyboardListenerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    
    /**
     * Test of keyPressed method, of class KeyboardListener.
     */
    
    
    
     @Test
    public void testKeyPressed(){
        System.out.println("keyPressed");
     
      Button b = new Button();     
      KeyEvent up= new KeyEvent(b,1,2,3, KeyEvent.VK_UP);
      KeyEvent down = new KeyEvent(b, 2, 3, 4, KeyEvent.VK_DOWN);
      KeyEvent right = new KeyEvent(b, 3, 4, 5, KeyEvent.VK_RIGHT);
      KeyEvent left = new KeyEvent(b, 4, 5, 6, KeyEvent.VK_LEFT);
     
      //coverage for the switch cases
      KeyboardListener v = new KeyboardListener();
      ThreadsController.directionSnake = 3;
      v.keyPressed(up);
      ThreadsController.directionSnake = 2;
      v.keyPressed(left);
      ThreadsController.directionSnake = 1;
      v.keyPressed(down);
      ThreadsController.directionSnake = 4;
      v.keyPressed(right);
    }
    
 
   
}
