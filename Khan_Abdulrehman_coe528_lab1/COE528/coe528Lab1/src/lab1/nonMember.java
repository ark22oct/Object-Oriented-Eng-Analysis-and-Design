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
public class nonMember extends Passenger {
    
    //Constructor
    public nonMember(String name, int age){
        super(name, age);
    }
    
    //Giving seniors a discount
    @Override
    public double applyDiscount (double p){
        if (getAge() > 65){
            return (0.9*p);
        }
        else{
            return p;
        }
    }
}



