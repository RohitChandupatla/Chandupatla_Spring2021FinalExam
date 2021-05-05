/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question05;

/**
 *
 * @author Rohit Reddy Chandupatla
 */
public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "Radius of comparablecircle : " + getRadius() + "}";
    }

    @Override
    public int compareTo(ComparableCircle circle) {
        return Double.compare(getArea(), circle.getArea());
    }
}
