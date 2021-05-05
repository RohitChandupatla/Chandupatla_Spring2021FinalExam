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
public class Master extends Bed {

    private double length;
    private double breadth;

    public Master(double length, double breadth, String shopName, String Location) {
        super(shopName, Location);
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public double areaOfBed() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double area = length * breadth;
        return area;
    }

    public double perimeterOfBed() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double perimeter = 2 * (length + breadth);
        return perimeter;
    }

    @Override
    public String toString() {
        return super.toString() + "\nlength of Master: " + length + "\nbreadth ofMaster: " + breadth
                + "\narea of the Bed: " + areaOfBed()
                + "\nperimeter of the Bed: " + perimeterOfBed();
    }

    public double areaOfMatrress() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double perimeterOfMatrress() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double areaOfbed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double perimeterOfbed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

