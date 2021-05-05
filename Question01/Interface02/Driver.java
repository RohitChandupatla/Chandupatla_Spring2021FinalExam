/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question01.Interface02;

import java.util.Scanner;


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
         Scanner scan = new Scanner(System.in);
        System.out.println("By Rohit Reddy Chandupatla");
        System.out.println("Enter the distance: ");
        double distance = scan.nextDouble();
        System.out.println("Enter the time taken: ");
        double time = scan.nextDouble();
        System.out.println("Total number of Seats:");
        int totalNumberofseats = scan.nextInt();
        System.out.println("Empty Seats: ");
        int emptyseats = scan.nextInt();

        Transportation v;
        v = new Transportation(distance, time, totalNumberofseats, emptyseats);
        System.out.println(v.toString());
        System.out.println("car acceleration= " + v.accelerationCalculation());
        System.out.println("seatsFilled in bus= " + v.seatsFilled());
    }

    
}