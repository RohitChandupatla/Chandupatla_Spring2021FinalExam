/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question07;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Rohit Reddy Chandupatla
 */
        public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand=new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1000)+1;
	}
        Scanner nacs=new Scanner(System.in);
        System.out.println("By Rohit Reddy Chandupatla");
        System.out.print("Enter the index of the array: ");
        int index=nacs.nextInt();
        try{
            System.out.println("Corresponding element value at this "+index+" is: "+array[index]);
        }catch(ArrayIndexOutOfBoundsException ex){
       
            System.out.println("Out of bounds");
        
    }
    
}
        }