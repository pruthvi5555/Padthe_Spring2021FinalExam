/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8b;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author S542052
 */
public class HandlingMultiException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ArithmeticException {
        // TODO code application logic here
        String filename = "non-exist filename";
        try{
            BufferedReader rd = new BufferedReader(new FileReader(new File(filename)));
            rd.readLine();
            System.out.println(10/0);
        }
        catch(ArithmeticException ex){
            System.out.println(ex.getMessage()); 
        }
        catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    } 
}

