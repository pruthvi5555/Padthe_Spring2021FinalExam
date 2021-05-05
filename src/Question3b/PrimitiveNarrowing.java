/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3b;

/**
 *
 * @author S542052
 */
public class PrimitiveNarrowing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double d=2567834.38;
        //as narrowing required explicitly type casting
        float floatHolder=(float)d;
        long longHolder=(long)d;
        int intHolder=(int)d;
        short shortHolder=(short)d;
        byte byteHolder=(byte)d;
        System.out.println("Question 3b by Pruthvi Raj Padthe");
        System.out.println("Double value:"+d);
        System.out.println("Float value:"+floatHolder);
        System.out.println("Long value:"+longHolder);
        System.out.println("Int value:"+intHolder);
        System.out.println("Short value:"+shortHolder);
        System.out.println("Byte value:"+byteHolder);
    }
}
    