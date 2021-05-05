/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question03.Downcasting;

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
        // Creating an object of Vehicle class
        // and referring it to Car class
        System.out.println("By Rohit Reddy Chandupatla");
        Vehicles v = new Car();
        Car.method(v);
    }
}
