/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsassignment3;

import java.util.ArrayList;

/**
 *
 * @author trist
 */
public class WorkAheadQueue<T> implements WorkAheadQueueADT<T> {

    protected ArrayList<LinearNode<T>> queue = new ArrayList<>();
    protected LinearNode<T> front;
    protected LinearNode<T> back=new LinearNode();
    protected LinearNode<T> mid=new LinearNode();
    protected ArrayList<LinearNode<T>> frontThreeNodes= new ArrayList<>();
    protected ArrayList<T> frontThreeElements = new ArrayList<>();
    protected int numNodes=0;
    protected LinearNode<T> temp;
    
  

    @Override
    public T first(int x) throws EmptyCollectionException, InvalidArgumentException {
      if (this.numNodes == 0) 
        {throw new EmptyCollectionException("queue");}
      if(x>2||x>queue.size()-1||x<0)
      {throw new InvalidArgumentException("Larger first then queue size");}
      return queue.get(x).getElement();
      
    }

    @Override
    public ArrayList<LinearNode<T>> firstThreeNodes() throws EmptyCollectionException {
      if (this.numNodes == 0) 
        {throw new EmptyCollectionException("queue");}
      setThrees(); 
      return frontThreeNodes;
    }

    @Override
    public ArrayList<T> firstThreeElements() throws EmptyCollectionException {
        if (this.numNodes == 0) 
        {throw new EmptyCollectionException("queue");}
        ArrayList<T> retArray = new ArrayList<>();
        LinearNode<T> temp = front;
        for (int i = 0; (temp != null) && (i < 3); i++) 
        {retArray.add(temp.getElement());
        temp = temp.getNext();}
        return retArray;}
public void setThrees()
{
   
    frontThreeElements.clear();
    frontThreeNodes.clear();
if(front!=null)
{
    
   for(int i = 0; i<3&& i <=queue.size()-1;i++)
{
frontThreeNodes.add(queue.get(i));
frontThreeElements.add(queue.get(i).getElement());
}

}


}
    @Override
    public void enqueue(T element) {

        if(front==null)
        {front = new LinearNode<T>(element);
        front.setNext(back);
        numNodes=1;
        queue.add(front);
        }
        else{
          temp= new LinearNode<T>(element);
            if(back!=null)
            {
        back.setNext(temp);
        temp.setPrev(back);
        back= temp;
        queue.get(queue.size()-1).setNext(back);
        queue.add(back);
            }      
            else{
            back = temp;
            front.setNext(back);
            back.setPrev(front);
            queue.add(back);
            queue.set(0,front);
            }
            
            numNodes++;
        }  
        setThrees();
    
    }

    @Override
  public T dequeue(int x) throws EmptyCollectionException, InvalidArgumentException {
     
      if (queue.isEmpty()) 
        {throw new EmptyCollectionException("queue");}
    
        
      if(x>queue.size()-1)
       {throw new InvalidArgumentException("queue");}
      
      if(x<0)
       {throw new InvalidArgumentException("queue");}
     
        
        numNodes--;
     temp=this.queue.remove(x);
   
     
     
      setThrees();
     return temp.getElement();
    }

    @Override
    public T first() throws EmptyCollectionException {
      if (this.numNodes == 0) 
        {throw new EmptyCollectionException("queue");}
      return queue.get(0).getElement();
    }
    
    @Override
    public T dequeue() throws EmptyCollectionException{
    if(numNodes==0)
    {
        throw new EmptyCollectionException("queue");
    }
   numNodes--;
   mid = queue.remove(0);
  if(queue.size()>1){ front=queue.get(0);
   front.setPrev(null);
   queue.set(0,front);}
   setThrees();
 return mid.getElement();
    }
    
    
    
    
    public int size() 
       {return this.numNodes;}
    
    public boolean isEmpty() 
       {return (this.numNodes == 0);}
    
    
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        LinearNode curr = front;
            for (int i = 0; i < size(); i++) {
                sb.append(curr.getElement().toString());
             if (i < size() - 1) 
             {sb.append(", ");}
       curr = curr.getNext();}return sb.toString();}
    
    
}
