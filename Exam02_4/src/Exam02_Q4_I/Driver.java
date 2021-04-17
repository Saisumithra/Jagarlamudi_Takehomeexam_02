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
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Handbag h = new Handbag();
        System.out.println("Answer for Question4: Saisumithra Jagarlamudi");
        System.out.println("Cost of Bag:"+h.cost);
        System.out.println("Price After discount: "+h.getpriceAfterDiscount());
    }
    
}
