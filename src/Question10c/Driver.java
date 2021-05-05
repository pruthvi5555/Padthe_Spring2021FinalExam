/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10c;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pruthvi Raj Padthe
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ArrayList<Integer> arrlist = new ArrayList<Integer>(5);
		 arrlist.add(30);
	     arrlist.add(20);
	     arrlist.add(25);
	     arrlist.add(40);
	     arrlist.add(50);
             System.out.print("Enter a number: ");
             Scanner sc = new Scanner(System.in);
         int x=sc.nextInt();
	         RecursiveSearch a1=new RecursiveSearch();
	        //Method call to find the value at 3
	        int index = a1.recSearch(arrlist, 0, arrlist.size()-1, x);
	        if (index != -1)
	           System.out.println("Element " + x + " is present at index " +
	                                                    index);
	        else
	            System.out.println("Element " + x + " is not present");
	}

}
