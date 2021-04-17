/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_Q3;

/**
 *
 * @author Saisumithra Jagarlamudi
 */
public class Circle {
       private int radius = 5;
       private static final double pi=3.14;

    public Circle() {
    }
       

    public int getRadius() {
        return radius;
    }

    public static double getPi() {
        return pi;
    }

    public Circle(int radius) {
        this.radius = radius;
        
    }
    public double getArea()
    {
        return pi*radius*radius;
    }
    public double getPerimeter()
    {
        return 2*pi*radius;
    }

    @Override
    public String toString() {
          
        return "Area of Circle: " +getArea() + "\nPerimeter of circle: "+getPerimeter();
    }
}

    

  