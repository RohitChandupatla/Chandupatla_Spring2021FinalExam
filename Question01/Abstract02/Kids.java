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
    public class Kids extends Bed {

    private double side;

    public Kids(double side, String shopName, String Location) {
        super(shopName, Location);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double areaOfBed() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double area = Math.pow(side, 2);
        return area;
    }
    
    
    public double perimeterOfBed() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double peri = 4 * side;
        return peri;
    }

    @Override
    public String toString() {
        return "side: " + side
                + "\narea of Bed: " + areaOfBed()
                + "\nperimeter of the Bed: " + perimeterOfBed();
    }

    public double areaOfMatrress() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double perimeterOfbed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double areaOfbed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}
