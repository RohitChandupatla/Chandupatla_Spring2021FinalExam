/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question06;

/**
 *
 * @author Rohit Reddy chandupatla
 */
public class UncheckedDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
	   int arr[] ={1,2,3,4,5};
            System.out.println("By Rohit Reddy Chandupatla");
	   System.out.println(arr[7]);
	}
        catch(ArrayIndexOutOfBoundsException e){
	   System.out.println("The specified index does not exist ");
		System.out.println("in array. Please correct the error."+e);
	}
   }
    }
    
