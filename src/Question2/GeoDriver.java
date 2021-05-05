/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

/**
 *
 * @author S542052
 */
public class GeoDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GeometricObject[] squares = {new Square(5.6), new Square(16), 
			new Square(6.3), new Square(10), new Square(12)};
		for (int i = 0; i < squares.length; i++) {
		 	System.out.println("\nSquare #" + (i + 1));
		 	System.out.println("Area: " + squares[i].getArea());
		 	System.out.print("How to color: ");
                        ((Colorable) squares[i]).howToColor();
		 } 
	}
}
    
    

