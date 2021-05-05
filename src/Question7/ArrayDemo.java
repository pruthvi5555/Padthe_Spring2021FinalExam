/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author S542052
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        // TODO code application logic here
		Random rd = new Random(); 
	      int[] arr = new int[100];
	      for (int i = 0; i < arr.length; i++) {
	         arr[i] = rd.nextInt(); 
	      }
	      Scanner sc= new Scanner(System.in);
	      System.out.println("please enter a number");
	      int a=sc.nextInt();
        if(a>=0 &&a<=100){
        	System.out.println(arr[a]);
        }
        else{
        	throw new ArrayIndexOutOfBoundsException("Array index out of bound.");
    }
    
}
}

