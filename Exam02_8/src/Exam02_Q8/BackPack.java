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
public class BackPack extends Bags  {

    public BackPack(double height, double width, double depth, double costpercubicmeter, String brandname) {
        super(height, width, depth, costpercubicmeter, brandname);
    }

    @Override
    public double getvolume() {
        return 21; 
    }

    @Override
    public double getprice() {
        return getvolume()*getCostpercubicmeter() ;
    }
    
    
}
