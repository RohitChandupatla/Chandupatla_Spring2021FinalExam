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
    public class CarReservation extends Reservation{

    CarReservation() {
        super("Road");
    }

    @Override
    public String upgrade() {
        return "Car type upgraded";
    }

    @Override
    public String getDiscount() {
        return "Discounted Car rental";
    }
}


