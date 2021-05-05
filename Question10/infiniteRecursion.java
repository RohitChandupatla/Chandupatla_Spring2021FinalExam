/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

import java.util.Scanner;

/**
 *
 * @author Rohit Reddy Chandupatla
 */
public class infiniteRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
                System.out.println("By Rohit Reddy Chandupatla");
                try{
		long factorial = infiniteRecursion(num);
                
		System.out.println(num + "! = " + factorial);
		sc.close();
	}catch(StackOverflowError st){
                    System.out.println("infinite recursion occured");
        }
	// example for infinite recursion
    }
    /**
     *
     * @param num
     * @return
     */
	public static long infiniteRecursion(int num) {
		return num * infiniteRecursion(num - 1);
	}
}
        
        
    
    

