/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9a;

/**
 *
 * @author S542052
 */
public class MultiThrowStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception  {
        // TODO code application logic here
        try {
            
            System.out.println(1/0);
        
        } catch(ArithmeticException e) {
        
	        System.out.println("Exception while arithmetic operation");
            throw new ArithmeticException();
        } catch(Exception e) {
        
        	System.out.println("Exception");
            throw new Exception();
        }

    }
}
    
