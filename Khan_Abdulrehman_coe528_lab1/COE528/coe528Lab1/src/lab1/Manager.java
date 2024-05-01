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

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class Manager {
    
    //Array lists to store flight and ticket information being created
    ArrayList <Flight> flightList = new ArrayList<Flight>();
    ArrayList <Ticket> ticketList = new ArrayList<Ticket>();
    
    
    //Creating flights
    public void createFlights(){
       
       //Parameters form: (int flightNumber, int capacity, double originalPrice, String origin, String destination, String departureTime)
       flightList.add(new Flight(1231,20,1000,"Toronto","Vancouver","10/22/2021 07:30pm"));
       flightList.add(new Flight(1421,19,800,"Toronto","Tokyo","02/05/2021 11:00pm"));
       flightList.add(new Flight(1952,18,800,"Toronto","Victoria","05/05/2021 11:00am"));
       flightList.add(new Flight(1323,17,800,"Toronto","Winsdor","07/09/2021 9:00am"));
       flightList.add(new Flight(1444,17,800,"Toronto","London","07/09/2021 9:00am"));
       
       flightList.add(new Flight(1235,16,1000,"Winsdor","Toronto","08/04/2021 5:30pm"));
       flightList.add(new Flight(1006,15,1000,"Winsdor","Tokyo","08/05/2021 5:30pm"));
       flightList.add(new Flight(1007,14,1000,"Winsdor","Vancouver","08/03/2021 5:30pm"));
       flightList.add(new Flight(1918,13,1000,"Winsdor","Victoria","08/02/2021 5:30pm"));
       flightList.add(new Flight(8301,13,1000,"Winsdor","London","08/02/2021 5:30pm"));

       
       flightList.add(new Flight(1052,12,1300,"Winnipeg","Toronto","07/01/2021 3:00pm"));
       flightList.add(new Flight(1009,11,1030,"Winnipeg","Tokyo","07/09/2021 3:00pm"));
       flightList.add(new Flight(1010,16,1010,"Winnipeg","Vancouver","07/27/2021 3:00pm"));
       flightList.add(new Flight(1011,17,1020,"Winnipeg","Victoria","07/27/2021 3:00pm"));
       flightList.add(new Flight(7401,13,1000,"Winnipeg","London","08/02/2021 5:30pm"));
       
       flightList.add(new Flight(9212,18,1000,"Tokyo","Toronto","09/02/2021 11:00am"));
       flightList.add(new Flight(8413,19,1000,"Tokyo","Vancouver","09/02/2021 11:00am"));
       flightList.add(new Flight(1214,20,1000,"Tokyo","Victoria","09/02/2021 11:00am"));
       flightList.add(new Flight(7231,13,1000,"Tokyo","London","08/02/2021 5:30pm"));
       flightList.add(new Flight(1453,17,800,"Tokyo","Winsdor","07/09/2021 9:00am"));
       
       
       flightList.add(new Flight(4016,20,500,"London","Toronto","09/05/2021 6:00pm"));
       flightList.add(new Flight(9017,70,500,"London","Victoria","09/03/2021 6:00pm"));
       flightList.add(new Flight(4018,10,500,"London","Vancouver","09/02/2021 6:00pm"));
       flightList.add(new Flight(8019,90,500,"London","Winsdor","09/01/2021 6:00pm"));
       flightList.add(new Flight(1923,90,500,"London","Tokyo","09/01/2021 6:00pm"));
       
       /*for(int i=0; i<flightList.size(); i++){
           //System.out.println(flightList.get(i).toString());
    }*/
    }

    public void displayAvailableFlights(String origin, String destination){
        
        boolean flight = false;
        for(int i = 0; i < flightList.size(); i++) {
            if(flightList.get(i).getOrigin().equalsIgnoreCase(origin) && flightList.get(i).getDestination().equalsIgnoreCase(destination) && flightList.get(i).getNumberOfSeatsLeft() > 0) {
                System.out.println("\n" + flightList.get(i));
                flight = true;
            }               
        }
        if(flight == false) {
            System.out.println("\nNo flights found from " + origin + " to " + destination + ".");
            throw new IllegalArgumentException();
        } 
        
        
    }
    
    public Flight getFlight(int flightNumber){
        for(int i = 0; i < flightList.size(); i++) {
            if(flightList.get(i).getFlightNumber() == flightNumber)
                return flightList.get(i);
        }
        throw new IllegalArgumentException("Invalid Flight entered!");
        
        
    }
   
    public void bookSeat (int flightNumber, Passenger p){
      Ticket ticket;
        if(getFlight(flightNumber).bookASeat() == true){
            ticket = new Ticket(p, getFlight(flightNumber), p.applyDiscount(getFlight(flightNumber).getOriginalPrice()));
            ticketList.add(ticket);
            System.out.println("\nPurchased ticket:\n" + ticket);
        } 
        else
            throw new IllegalArgumentException("No space left on flight!");
            
        
   }
    
    public static void main (String args[]){
        //All methods are working and any invalid input from the user is handled accordingly!
        
        Scanner scan = new Scanner(System.in);
        Manager m = new Manager();
        m.createFlights();
        Passenger p = null;
        int age = 0, yearsOfMembership;
        String origin, destination, name, selector;
        boolean quit = false;
        
        do {
            System.out.print("Enter your name:\n");
            name = scan.nextLine();
            System.out.println("\nEnter your age:");
            boolean done = false;
            
            do {
                try {
                    age = scan.nextInt();
                    done = true;
                }
                catch(InputMismatchException e) {
                    System.out.println("\nError, enter appropriate age:");
                    scan.next();
                }
            } while(done == false);
            
            do {
                System.out.println("\nAre you a member?(y/n)");
                selector = scan.next();
            } while(!selector.equalsIgnoreCase("y") && !selector.equalsIgnoreCase("n"));
            
            if(selector.equalsIgnoreCase("y")) {
                System.out.println("\nYears of membership:");
                done = false;
            
                do {
                    try {
                        yearsOfMembership = scan.nextInt();
                        p = new Member(name, age, yearsOfMembership);
                        done = true;
                    }
                    catch(InputMismatchException e) {
                        System.out.println("\nError, a number is required!");
                        scan.next();
                    }
                } while(done == false);
                    
                    
                }
            else {
                p = new nonMember(name, age);
            }
            done = false;
            do {
                try {
                    System.out.println("\nAvailable flights from: Toronto, Tokyo, Winsdor, Winnipeg and London.");
                    System.out.println("Enter origin:");
                    origin =  scan.next();
                    System.out.println("\nAvailable destinations: Toronto, Tokyo, Winsdor, Vancouver, Victoria and London");
                    System.out.println("Enter desired destination:");
                    destination = scan.next();
                    m.displayAvailableFlights(origin, destination);
                    done = true;
                }
                catch(IllegalArgumentException e) {
                    System.out.println("Invalid origin and destination, try again:");
                }
            } while(done == false);
            
            System.out.println("\nFlight number:");
            done = false;
            do {
                try {
                    m.bookSeat(scan.nextInt(), p);
                    done = true;
                }
                catch(InputMismatchException e) {
                    System.out.println("\nInvalid flight number, try again:");
                    scan.next();
                }
                catch(IllegalArgumentException e) {
                    System.out.println("\nInvalid flight number, try again:");
                }
            } while(done == false);
            
            
            do {
                System.out.println("\nPurchase another ticket?(y/n):");
                selector = scan.next();
                scan.nextLine();
            } while(!selector.equalsIgnoreCase("y") && !selector.equalsIgnoreCase("n"));
            if(selector.equalsIgnoreCase("y")) {
                System.out.println("");
                quit = false;
            }
            else {
                System.out.println("\nReciept:");
                for(Ticket item: m.ticketList)
                    System.out.println(item.getNumber() + ": " + item.toString());
                System.out.println("\nEnjoy your flight!");
                quit = true;
            }
        } while (quit == false);
        
        
    }
}

