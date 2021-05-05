/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10b;

/**
 *
 * @author S542052
 */
public class NumberUtility {
     public static int sum(int n) {
        System.out.println("Calling method sum() with n = "+n);
        return sum(n - 1) + n;
}
}
