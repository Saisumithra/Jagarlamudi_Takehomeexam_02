/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_Q4_I;

/**
 *
 * @author Saisumithra Jagarlamudi
 */
public class Bags {
    public int cost = 500;
    private double discount = 25;

    public Bags() {
    }

    public int getCost() {
        return cost;
    }

    public double getDiscount() {
        return discount;
    }

    public double getpriceAfterDiscount()
    {
        return cost - (cost*discount/100);
    }
    
}
