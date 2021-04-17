/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_Q6;
import java.lang.*;

/**
 *
 * @author Saisumithra Jagarlamudi
 */
public class Triangle extends GeometricObject {
	private double a; 
	private double b; 
	private double c;

    public Triangle(String color, boolean filled) {
        super(color, filled);
    }

    public Triangle(double a, double b, double c, String color, boolean filled) {
        super(color, filled);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getArea() {
        double s = (a+b+c) / 2;
	return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double getPerimeter() {
	return a + b + c;
    }

    public String toString() {
		return super.toString() + "\nArea:" + getArea() + 
			"\nPerimeter:" + getPerimeter(); 
}
}