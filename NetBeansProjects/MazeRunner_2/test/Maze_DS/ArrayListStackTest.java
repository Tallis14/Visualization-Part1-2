/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maze_DS;

import DataStructures.EmptyCollectionException;
import java.util.ArrayList;
import java.util.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author trist
 */
public class ArrayListStackTest {
    ArrayListStack instance = new ArrayListStack();
    public ArrayListStackTest() {
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
     * Test of push method, of class ArrayListStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object element = null;
        ArrayListStack instance = new ArrayListStack();
        instance.push(element);
       if(instance.size()!=1)
           fail("The test case is not adding to the stack");
    }

    /**
     * Test of pop method, of class ArrayListStack.
     */
    @Test
    public void testPop() throws Exception {
   assertTrue(instance.isEmpty());
   String num = "hi";
   instance.push(num);
   assertEquals(instance.size(),1);
   assertEquals(instance.pop(),"hi");
 
   
   try{
   instance.pop();
   
   }   
   catch (EmptyCollectionException a){
assertTrue(a instanceof EmptyCollectionException);
   
   }
   instance.push("123");
   assertEquals("123", instance.pop());
    assertEquals(instance.size(),0);
    
    }

    /**
     * Test of peek method, of class ArrayListStack.
     */
    @Test
    public void testPeek() throws Exception {
        System.out.println("Peek");
           try{
        instance.peek();
        }
        catch(EmptyCollectionException a){
        assertTrue(a instanceof EmptyCollectionException);
        }
        
        instance.push("hi");
        assertEquals("hi",instance.peek());
        instance.pop();
    
        
        
    }

    /**
     * Test of isEmpty method, of class ArrayListStack.
     */
    @Test
    public void testIsEmpty() {
      assertTrue(instance.isEmpty());
     instance.push("null");
     assertFalse(instance.isEmpty());
    }

    /**
     * Test of size method, of class ArrayListStack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ArrayListStack instance = new ArrayListStack();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
          instance.push("6");
          assertEquals(instance.size(),1);
    }

   

    
}
