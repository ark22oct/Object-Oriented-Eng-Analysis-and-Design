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
public class Ticket {
 
    //Instance variables
    private static int num =1;
    private int digit;
    private int id=0;
    private double price;
    private Passenger passenger;
    private Flight flight;
    
    //Ticket constructor
    public Ticket (Passenger p, Flight flight, double price){
        this.passenger= p;
        this.flight= flight;
        this.price= price;
        digit= num++;
    }
    
    
    //Setters and getters for ticket class
    public int getNumber() {
       return digit;
   }
     
    public void setNumber(int number) {
       this.digit = number;
   }
    public void setPrice(double price){
        this.price= price;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPassenger(Passenger passenger){
       this.passenger=passenger;
    }
    public Passenger getPassenger(){
        return this.passenger;
    }
    
    public void setFlight(Flight flight){
        this.flight= flight;
    }
    public Flight getFlight(){
        return flight;
    }
    
    //String representation of ticket object
    @Override
    public String toString() {
       String x = passenger.getName() + ", " + flight.toString() + ", ticket price: $" + price;
       return x;
   }
}
