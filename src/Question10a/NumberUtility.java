/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10a;

/**
 *
 * @author S542052
 */
public class NumberUtility {
     public static int sum(int n) {
    if (n >= 1) {
        System.out.println("Calling method sum() with n = "+n);
        return sum(n - 1) + n;
    }
    System.out.println("Reached termination of calculation with n= "+n);
    return n;
    
}
}
