/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1c;


/**
 *
 * @author Pruthvi Raj Padthe
 */
public class Master extends AbstractClass {
    public int method1(int num1, int num2) {
System.out.println("Answer for Question 1c : Pruthvi Raj Padthe");
        System.out.println("implementing 1st method to add two numbers");
        return num1+num2;
    }
        public int method2 (int num1,int num2, int num3) {
            System.out.println("implementing 2nd method to multiply 3 numbers-");
            return num1 * num2 * num3;
        }
        public static void main (String args[]) {
            AbstractClass absc = new Master();
            System.out.println(absc.method1(2, 3));
            System.out.println(absc.method2(2, 3, 5));
            absc.disp();
        }
    }
    

