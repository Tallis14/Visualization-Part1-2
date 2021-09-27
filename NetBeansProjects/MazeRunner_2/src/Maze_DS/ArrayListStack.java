/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maze_DS;

import DataStructures.EmptyCollectionException;
import DataStructures.StackADT;
import java.util.ArrayList;



/**
 *
 * @author trist
 * 
  */
public class ArrayListStack<T> implements StackADT{

    private ArrayList <T> myStack;
    private int count;
  
    /**
     * This is a default constructor for an ArrayListStack
     */
    public ArrayListStack()
    {
    myStack =  new ArrayList<T>(count);
           }
    
    /**
     * Adds the specified element to the top of the stack
     * @param element element to be pushed onto the stack
     */
      public void push(T element){
  
        myStack.add( element) ;
        count++;
        
    }
/**
 * 
 * Removes the first element from the stack and gives it to the user
 * @return T returns the first element on the stack
 * @throws EmptyCollectionException makes sure it is not empty
 */
    @Override
    
    public T pop() throws EmptyCollectionException {
   if(myStack.isEmpty())
   { throw new EmptyCollectionException("myStack");}
    count--;
        return myStack.remove(myStack.size()-1);   
  
    }

    
    /**
     * Looks at the first element and shows it to the user
     * @return T returns the first element on the stack
     * @throws EmptyCollectionException makes sure it is not empty
     */
    @Override
    public T peek() throws EmptyCollectionException {
if(myStack.isEmpty())
    throw new EmptyCollectionException("myStack");
        return myStack.get(myStack.size()-1);
    }
/**
 * tells if the stack is empty
 * @return boolean returns true if the stack is empty and false if it is not
 */
    @Override
    public boolean isEmpty() {
    if(count==0)
    {return true;}
    return false;
    }
/**
 * Tells the user the size of the stack
 * @return Integer size returns an integer of the size of the stack
 */
    @Override
    public int size() {
    return count;   
    }

    @Override
    public String toString() {
        return "ArrayListStack{" + "myStack=" + myStack + ", count=" + count + '}';
    }

   
 
    
}
