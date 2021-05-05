/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question02;

/**
 *
 * @author Rohit Reddy Chandupatla
 */
public class Square extends GeometricObject implements Colorable {
    private double side;

    public Square(double side, String color, boolean isFilled) {
        super(color, isFilled);
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side*side;
    }
}