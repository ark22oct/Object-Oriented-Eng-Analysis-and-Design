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
public class Flight {
   //Instance variables
   private int flightNumber;
   private int capacity;
   private int numberOfSeatsLeft;
   private double originalPrice;
   private String origin;
   private String destination;
   private String departureTime;
   
   //Flight constructor
   //public Flight(int flightNumber, int capacity, double originalPrice, String origin, String destination, String departureTime){
   public Flight (int flightNumber, int capacity, double originalPrice, String origin, String destination, String departureTime){
     if (origin.equals(destination)) {
       throw new IllegalArgumentException("Origin and destination cannot be the same!");
   }
       
    numberOfSeatsLeft = capacity;   
    this.flightNumber= flightNumber;
    this.capacity= capacity;
    this.originalPrice= originalPrice;
    this.departureTime= departureTime;
    this.origin= origin;
    this.destination= destination;
   }
   //Setters and getters for instance variables
   public void setFlightNumber (int flightNumber){
      this.flightNumber= flightNumber; 
   }
   
   public int getFlightNumber (){
       return this.flightNumber;
   }
   
   public void setCapacity(int capacity){
       this.capacity= capacity;
   }
   
   public int getCapacity(){
       return this.capacity;
   }
   
   public void setOriginalPrice (double originalPrice ){
      this.originalPrice= originalPrice;
   }
   
   public double getOriginalPrice (){
       return this.originalPrice;
   }
   
   public void setDepartureTime (String departureTime){
       this.departureTime= departureTime;
   }
   
   public String getDepartureTime (){
       return this.departureTime;
   }
   public void setOrigin(String origin){
       this.origin= origin;
   
   }
   public String getOrigin (){
       return origin;
   }
   
   public void setDestination (String destination){
       this.destination= destination;
   }
   
   public String getDestination (){
       return destination;
   }
   
   public void setNumberOfSeatsLeft (int numberOfSeatsLeft){
       this.numberOfSeatsLeft= numberOfSeatsLeft;
   }
   
   public int getNumberOfSeatsLeft (){
       return this.numberOfSeatsLeft;
   }
   
   public boolean bookASeat(){
       if (this.numberOfSeatsLeft > 0){
           this.numberOfSeatsLeft--;
           return true;
       }
       else{
           return false;
       }
   }
   
   //String representation of a flight object
        @Override
      public String toString(){
        String x;
        x = "Flight " + flightNumber + ", " + origin + " to " + destination + ", ";
        x +=  departureTime + ", original price: $" + originalPrice;
        return x;
    }}