/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6b;

/**
 *
 * @author S542052
 */
public class UncheckedException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Integer integerHolder = Integer.parseInt("Non-Convertible Value");
          //System.out.println("Hello world")
          // In the above part we get number format exception becuase of incompatabile input which is handled using try catch using below
          
           try
        {
            Integer integerHolder = Integer.parseInt("Non-Convertible Value");
 
        }
        catch (NumberFormatException e)
        {
            System.out.println("NumberFormatException will be caught here");
        }
        
    }
}
    
    

