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
    class Car extends Vehicles {
    static void method(Vehicles v)
    {
  
        //
        if (v instanceof Car) {
  
            // Downcasting
            Car c = (Car)v;
  
            // Display message
            System.out.println("Downcasting performed");
        }
    }
    
}
