/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question09;

/**
 *
 * @author Rohit Reddy Chandupatla
 */
public class ThrowDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String String1="I am rohit reddy chandupatla";
        String String2="I came here to do masters";
     UsingThrow ut  =new UsingThrow( String1, String2);
        try {

            System.out.println(ut.toString());
            System.out.println(ut.throwException());
        } catch (Exception e) {
            System.out.println("throws exception");
        }
    }
}
    