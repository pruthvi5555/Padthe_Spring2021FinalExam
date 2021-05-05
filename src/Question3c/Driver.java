/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3c;

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
        Rose rose = new Rose();
    rose.smell();
    
    Flower flower = (Flower) rose;
    flower.smell();
  }
}
