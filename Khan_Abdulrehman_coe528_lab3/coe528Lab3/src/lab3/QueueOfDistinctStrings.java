/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Abdulrehman 
 */

import java.util.ArrayList;

public class QueueOfDistinctStrings {
       /**
        * Overview: QueueOfDistinctStrings are mutable, bounded collection of distinct strings that operate in FIFO (First-In-First-Out) order.
        */
        
        // Abstraction function: AF (C) where c is the QueueOfDistinctStrings object "queue" that will be equal to an abstract queue d, AF(queue) = {d.queue.items[0]= q0 (first distinct string within the array list,
        // front of the queue), d.queue.items[items.size()-1] = qn where n is the final distinct string within the array list, end of the queue | for queue = {q0,q1,q2...qn}}
        
        // Rep invariant: queue.items != null && queue.items.size() = n if the item was enqueued to queue && queue.items[i] = qi where i is the item enqueued to queue. Two items within the queue cannot be the same
        // as only distinct strings are permitted, nested for loops with an if statement are used to check for this.
        

        // The rep
    private ArrayList <String> items;
    
        
        // Constructor
    public QueueOfDistinctStrings(){
        
        /*
         * REQUIRES: None
         * MODIFIES: None
         * EFFECTS: Creates a new QueueOfDistinctStrings object!
         */
        
        items = new ArrayList <String>();
    }
    

        /*
         * REQUIRES: None
         * MODIFIES: This
         * EFFECTS: Appends the element at the end of the queue if the element is not in the queue, otherwise does nothing.
         */
    public void enqueue (String element) throws Exception {
        if (element == null) throw new Exception();
        if (false == items.contains(element));
        items.add(element);
    }
    
    
    public String dequeue() throws Exception {
        /*
         * REQUIRES: None
         * MODIFIES: This
         * EFFECTS: Remove an element from the front of the queue 
         */
        
        if (items.size() == 0) throw new Exception();
        return items.remove(0);
        
    }
    
    
    public boolean repOK() throws Exception{
        /*
         * REQUIRES: None
         * MODIFIES: None
         * EFFECTS: Returns true if the rep invariant holds for this object; otherwise returns false.
         */
        
        QueueOfDistinctStrings queue = new QueueOfDistinctStrings();
        if (!queue.items.isEmpty() || queue.items == null)
            return false;
        
        for (int i=0; i<items.size(); i++){
            for (int j=0; j<items.size(); j++){
                if (items.get(i).equals(items.get(j))){
                    return false;
                }
            }
        }
        
        queue.enqueue("ab");
        queue.enqueue("cd");
        queue.enqueue("ef");
        
        return queue.items.size() == 3 && queue.items.get(0).equals("ab") && queue.items.get(1).equals("cd") && queue.items.get(2).equals("ef");
        
    }
    
    @Override
    public String toString() {
        /*
         * REQUIRES: None
         * MODIFIES: None
         * EFFECTS: Returns a string that contains the strings in the queue, the front element and the end element implements the abstraction function.
         */
        
        String x = "";
        
        if (items == null)
            return "Nothing was found in the queue (Empty!)";
        
        for (String element: items){
            x = x + " " + element;
        }
        
        return x;
    }
   
    public static void main (String [] args){
        
       
        
        
        
}
}