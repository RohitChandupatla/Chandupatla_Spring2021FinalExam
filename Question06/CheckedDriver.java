/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Rohit Reddy Chandupatla
 */
public class CheckedDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        FileInputStream fis = null;
	/*This constructor FileInputStream(File filename)
	 * throws FileNotFoundException which is a checked
	 * exception
         */
       
        System.out.println("By Rohit Reddy Chandupatla");
        fis = new FileInputStream("question06.txt"); 
	int k; 

	/* Method read() of FileInputStream class also throws 
	 * a checked exception: IOException
         */
	while(( k = fis.read() ) != -1) 
	{ 
		System.out.println((char)k); 
	} 

	/*The method close() closes the file input stream
	 * It throws IOException*/
	fis.close(); 	
   }
}
    

    