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
  public class TravelBag extends Bags
  {
    private boolean hasnumberlock;
    private int wheels;

    public TravelBag(boolean hasnumberlock, int wheels, double height, double width, double depth, double costpercubicmeter, String brandname) {
        super(height, width, depth, costpercubicmeter, brandname);
        this.hasnumberlock = hasnumberlock;
        this.wheels = wheels;
    }

    public boolean isHasnumberlock() {
        return hasnumberlock;
    }

    public int getWheels() {
        return wheels;
    }

    @Override
    public double getvolume() {
        return getHeight()*getWidth()*getDepth();
    }

    @Override
    public double getprice() {
        return getvolume()*getCostpercubicmeter();
    }
}
   

  