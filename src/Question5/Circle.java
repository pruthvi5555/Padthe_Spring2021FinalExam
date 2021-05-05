/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author S542052
 */
public class Circle {
    private double radius;

	public Circle() {
	}

	public Circle(double radius) {
            this.radius = radius;
	}

	public double getRadius() {
            return radius;
	}



	public double getArea() {
            return radius * radius * Math.PI;
	}

	
}

