/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

/**
 *
 * @author Rohit Reddy Chandupatla
 */
public class Test_Hash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         * two strings are initialised and declared
         */
        String a = "Rohit";  
        String b = "Rohit";  
         
        System.out.println("By Rohit Reddy Chandupatla");
        /**
         * two strings are compared and checked with equal() and the hashcode for each if them will be given
         */
        if(a.equals(b)){   //checking the equality of objects using equals() methods  
            System.out.println("a & b are equal variables, and respective hashvalue are:" + " "+ a.hashCode() + " & " + b.hashCode());  
          
        }  
  
        String c = "Bunny";  
        String d= "Sunny";  
         /**
          * two strings are compared and checked with equal() and the hashcode for each if them will be given
          */
        if(!c.equals(d)){    //checking  the equality of objects using equals() method  
            System.out.println("\nc & d are Un-equal variables, and their  hashvalues are:" + " "+ c.hashCode() + " & " + d.hashCode());  
              
        }  
    
    }
    
}
