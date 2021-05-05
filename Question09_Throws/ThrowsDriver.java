/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question09_Throws;

import java.util.Scanner;

/**
 *
 * @author Rohit Reddy Chandupatla
 */
public class ThrowsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws StringIndexOutOfBoundsException{
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        System.out.println("By Rohit Reddy");
        System.out.print("Enter the String: ");
        String st1=sc.next();
        try{
            
            System.out.println(st1.charAt(12));
        }catch(Exception e){
            System.out.println("Index is out of bounds");
        }
        
        String st=null;
        System.out.print("Enter string 2: ");
        
        String st2=sc.next();
        
        try{
            if("rohit".equals(st)){
                System.out.println("same");
            }
            else
            System.out.println(st2);
            }catch(Exception e){
                System.out.println("null pointer exception");
                
        
        
        }
    }
    
}
