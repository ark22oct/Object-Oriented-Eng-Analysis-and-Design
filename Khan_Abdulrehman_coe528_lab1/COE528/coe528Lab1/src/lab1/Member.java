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
public class Member extends Passenger {

    //Instance variables
    private int yearsOfMembership;
    
    //Constructor
    public Member(String name, int age, int yearsOfMembership){
        super(name,age);
        this.yearsOfMembership= yearsOfMembership;
    }
    //Setters and Getters
    public void setYearsOfMembership(int yearsOfMembership){
        this.yearsOfMembership= yearsOfMembership;
    }
    
    public int getYearsOfMembership(){
        return this.yearsOfMembership;
    }
    //Giving members a discount
    @Override
    public double applyDiscount (double p){
     if (this.yearsOfMembership > 5){
         return (p*0.5);
     }
     else if ((this.yearsOfMembership > 1) && (this.yearsOfMembership <= 5)){
        return (0.9*p);
    }
     else{
         return p;
     }
    }
    
    
    
}
    
 