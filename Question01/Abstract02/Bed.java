/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question01.Abstract02;

/**
 *
 * @author Rohit Reddy Chandupatla
 */
 public abstract class Bed {

    private String shopName;
    private String Location;

    public Bed(String shopName, String Location) {
        this.shopName = shopName;
        this.Location = Location;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public abstract double areaOfbed();

    public abstract double perimeterOfbed();

    @Override
    public String toString() {
        return "shop Name: " + shopName + "y\nLocation: " + Location;
    }

}