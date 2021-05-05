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
public class UsingThrow {
    private String String1;

    private String String2;

    public UsingThrow(String String1, String String2) {
        this.String1 = String1;
        this.String2 = String2;
    }

    public String getString1() {
        return String1;
    }

    public void setString1(String String1) {
        this.String1 = String1;
    }

    public String getString2() {
        return String2;
    }

    public void setString2(String String2) {
        this.String2 = String2;
    }

    

    public String throwException() {
        String string = " ";
        if (String1.length()>String1.indexOf(String1) ){
            throw new StringIndexOutOfBoundsException("Exception thrown");
        } else {
            string = "Out of bounds";
        }
        return string;
    }

    @Override
    public String toString() {
        return "String: " + String1 + "\nString2: " + String2;
    }

}
    