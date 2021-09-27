package DataStructures;

import DataStructures.EmptyCollectionException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public interface StackADT<T> extends CollectionADT {
    
    
     //Adds the specified element to the top of the stack
     //@param element element to be pushed onto the stack
       //  public void push(T element);
    
    /**
     * Removes and returns the element that is on top of the stack
     * @return the element removed from the stack
     * @throws EmptyCollectionException throws exception if needed
     */
    public T pop() throws EmptyCollectionException;
    
    /**
     * Returns (without removing) the element that is on top of the stack
     * @return the element on top of the stack
     * @throws EmptyCollectionException throws exception if needed
     */
    public T peek()throws EmptyCollectionException;
    
}
