/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_Q8;

/**
 *
 * @author Saisumithra Jagarlamudi
 */
public abstract class Bags {

    private double height;
    private double width;
    private double depth;
    private double costpercubicmeter;
    private String brandname;
    
    public Bags(double height, double width, double depth, double costpercubicmeter, String brandname) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.costpercubicmeter = costpercubicmeter;
        this.brandname = brandname;
    }
    
    public abstract double getvolume();
    public abstract double getprice();

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public double getCostpercubicmeter() {
        return costpercubicmeter;
    }

    public String getBrandname() {
        return brandname;
    }
}



