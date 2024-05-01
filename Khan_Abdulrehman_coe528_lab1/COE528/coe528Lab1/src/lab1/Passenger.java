/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Abdulrehman Khan
 */
public abstract class Passenger {
 
    //Instance variables
    private String name;
    private int age;
    
    //Passenger constructor
    public Passenger(String name, int age){ 
        this.name= name;
        this.age= age;
    }
    
    //Setters and getters for instance variables
    public void setName(String name){ 
        this.name= name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setAge(int age){
        this.age= age;
    }
    
    public int getAge(){
        return this.age;
    }
    
    //Method to apply appropriate discount and retrun price
    public abstract double applyDiscount (double p);
}

    
