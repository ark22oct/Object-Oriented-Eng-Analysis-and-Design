/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Abdulrehman Khan
 */
public class FlightTest {
    
    public FlightTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testConstructor() {
        System.out.println("testConstructor");
        Flight test = new Flight(1004,16,1000,"Winsdor","Toronto","08/12/2021 5:30pm");
        assertEquals(1004, test.getFlightNumber());
        assertEquals("Winsdor", test.getOrigin());
        assertEquals("Toronto", test.getDestination());
        assertEquals("08/12/2021 5:30pm", test.getDepartureTime());
        assertEquals(16, test.getCapacity());
        assertEquals(1000, test.getOriginalPrice(), 0.001);
        
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testInvalidConstructor() {
        System.out.println("invalidConstructor");
        Flight test = new Flight(1004,16,1000,"Winsdor","Winsdor","08/12/2021 5:30pm");
    }

    /**
     * Test of setFlightNumber method, of class Flight.
     */
    @Test
    public void testSetFlightNumber() {
        System.out.println("setFlightNumber");
        Flight test = new Flight(1004,16,1000,"Winsdor","Toronto","08/12/2021 5:30pm");
        test.setFlightNumber(451);
        int expResult = 451;
        assertEquals(expResult, test.getFlightNumber());
    }

    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        System.out.println("getFlightNumber");
        Flight test = new Flight(1004,16,1000,"Winsdor","Toronto","08/12/2021 5:30pm");
        int expResult = 1004;
        int result = test.getFlightNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        Flight test = new Flight(1004,16,1000,"Winsdor","Toronto","08/12/2021 5:30pm");
        test.setCapacity(61);
        int expResult= 61;
        assertEquals(expResult, test.getCapacity());
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        Flight test = new Flight(1004,16,1000,"Winsdor","Toronto","08/12/2021 5:30pm");
        int expResult = 16;
        int result = test.getCapacity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        System.out.println("setOriginalPrice");
        Flight test = new Flight(1004,16,1000,"Winsdor","Toronto","08/12/2021 5:30pm");
        test.setOriginalPrice(1100);
        double expResult= 1100;
        assertEquals(expResult, test.getOriginalPrice(), 0.001);
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        System.out.println("getOriginalPrice");
        Flight test = new Flight(1004,16,1000,"Winsdor","Toronto","08/12/2021 5:30pm");
        double expResult = 1000;
        double result = test.getOriginalPrice();
        assertEquals(expResult, result, 0.0001);
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        System.out.println("setDepartureTime");
        Flight test = new Flight(1004,16,1000,"Winsdor","Toronto","08/12/2021 5:30pm");
        test.setDepartureTime("03/02/2021 9:30pm");
        String expResult = "03/02/2021 9:30pm";
        assertEquals(expResult, test.getDepartureTime());
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        System.out.println("getDepartureTime");
        Flight test = new Flight(1004,16,1000,"Winsdor","Toronto","08/12/2021 5:30pm");
        String expResult = "08/12/2021 5:30pm";
        String result = test.getDepartureTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        System.out.println("setOrigin");
        Flight test = new Flight(1004,16,1000,"Winsdor","Toronto","08/12/2021 5:30pm");
        test.setOrigin("Kenya");
        String expResult = "Kenya";
        assertEquals(expResult, test.getOrigin());
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        System.out.println("getOrigin");
        Flight test = new Flight(1004,16,1000,"Winsdor","Toronto","08/12/2021 5:30pm");
        String expResult = "Winsdor";
        String result = test.getOrigin();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        Flight test = new Flight(1004,16,1000,"Winsdor","Toronto","08/12/2021 5:30pm");
        test.setDestination("Pakistan");
        String expResult= "Pakistan";
        assertEquals(expResult, test.getDestination());
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        Flight test = new Flight(1004,16,1000,"Winsdor","Toronto","08/12/2021 5:30pm");
        String expResult = "Toronto";
        String result = test.getDestination();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetNumberOfSeatsLeft() {
        System.out.println("setNumberOfSeatsLeft");
        Flight test = new Flight(1004,16,1000,"Winsdor","Toronto","08/12/2021 5:30pm");
        test.setNumberOfSeatsLeft(61);
        int expResult= 61;
        assertEquals(expResult, test.getNumberOfSeatsLeft());
    }

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        System.out.println("getNumberOfSeatsLeft");
        Flight test = new Flight(1004,16,1000,"Winsdor","Toronto","08/12/2021 5:30pm");
        int expResult = 16;
        int result = test.getNumberOfSeatsLeft();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        System.out.println("bookASeat");
        Flight test = new Flight(1004,16,1000,"Winsdor","Toronto","08/12/2021 5:30pm");
        boolean expResult = true;
        boolean result = test.bookASeat();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Flight test = new Flight(1004,16,1000,"Winsdor","Toronto","08/12/2021 5:30pm");
        String expResult = "Flight 1004, Winsdor to Toronto, 08/12/2021 5:30pm, original price: $1000.0";
        String result = test.toString();
        assertEquals(expResult, result);
    }
    
}
