/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6a;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author S542052
 */
public class CheckedException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //File file = new File("E://file.txt");
      //FileReader fr = new FileReader(file);    
      // The above part raises exception. we handle that exception exception using try catch given below in the following manner.
       try{
      File file = new File("E://file.txt");
      FileReader fr = new FileReader(file);    
       } catch(IOException fileNotFoundException) {
           System.out.println("Question 6(a) by Pruthvi Raj Padthe");
           System.out.println("File not found");
       }
   }
}
    
    

