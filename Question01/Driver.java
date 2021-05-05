/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question01;

/**
 *
 * @author Rohit Reddy Chandupatla
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         CarReservation carReservation = new CarReservation();
        FlightReservation flightReservation = new FlightReservation();
        
        System.out.println("By Rohit Reddy Chandupatla");
        System.out.println("Car: " + carReservation.category);
        System.out.println("Flight: " + flightReservation.category);

        System.out.println("Car: " + carReservation.upgrade());
        System.out.println("Flight: " + flightReservation.upgrade());

        System.out.println("Car: " + carReservation.getDiscount());
        System.out.println("Flight: " + flightReservation.getDiscount());

    }
}