/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_Q6;

/**
 *
 * @author Saisumithra Jagarlamudi
 */
public abstract class GeometricObject {
        private String color;
	private boolean filled;

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Color: " + color + "\nFilled: " + filled ;
    }
}
