/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author S542052
 */


public class EmployeeDriver {

	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();  
		al.add(new Employee(1,"Vijay",23000));    
		al.add(new Employee(3,"Jai",21500));
		al.add(new Employee(2,"Ajay",27000));
		al.add(new Employee(5,"Suresh",2000));
		al.add(new Employee(4,"Ramesh",35000));
		
                System.out.println("The original list\n");
		for(Employee st:al){ 
                    System.out.println(st.toString()); 
		} 
		  System.out.println("\nafter sorting with employee id \n");
		Collections.sort(al);  
		for(Employee st:al){  
			System.out.println(st.toString());
		}  
		System.out.println("\nafter sorting with salary\n");
		Collections.sort(al,new Comparator<Employee>(){
                    @Override
                    public int compare(Employee arg0, Employee arg1) {
		// TODO Auto-generated method stub
		return Double.compare(arg0.getEmpSalary(), arg1.getEmpSalary());
	}
                });
		for(Employee st:al){  
			System.out.println(st.toString());
		}  
		
		System.out.println("\nafter sorting with employee name\n");
		Collections.sort(al,new Comparator<Employee>(){
                @Override
                public int compare(Employee o1, Employee o2) {
                        return o1.getEmpName().compareTo(o2.getEmpName());
                }
                });
		for(Employee st:al){  
			System.out.println(st.toString());
		}  

	}

}

