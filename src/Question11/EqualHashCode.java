/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

/**
 *
 * @author Pruthvi Raj Padthe
 */
public class EqualHashCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee a1 = new Employee(1, "Raj");
        Employee a2 = new Employee(1, "Raj");

        System.out.println("hashcode of first Raj = " + a1.hashCode());
        System.out.println("hashcode of second Raj = " + a2.hashCode());
        System.out.println("equals value is = " + a1.equals(a2));
	}

}