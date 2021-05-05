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
    public abstract class Reservation {

    final String category;

    Reservation(String category) {
        this.category = category;
    }

    // abstract methods
    public abstract String upgrade();
    public abstract String getDiscount();
}

   
