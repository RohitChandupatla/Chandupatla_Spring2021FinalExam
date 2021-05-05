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
public class Test {
    public static void main(String[] args) {
        GeometricObject[] geometricObjects = new GeometricObject[5];
        geometricObjects[0] = new Square(5, "red", true);
        geometricObjects[1] = new Square(2, "blue", false);
        geometricObjects[2] = new Square(3, "green", false);
        geometricObjects[3] = new Square(10, "yellow", true);
        geometricObjects[4] = new Square(25, "purple", false);

        for (GeometricObject object: geometricObjects) {
            System.out.println("By Rohit Reddy Chandupatla");
            System.out.println("Area: " + object.getArea());
            if (object instanceof Colorable) {
                System.out.print("How to Color: ");
                ((Colorable) object).howToColor();
            }
        }
    }
}
