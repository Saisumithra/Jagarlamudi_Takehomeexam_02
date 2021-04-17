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
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer For Question8: Saisumithra Jagarlamudi");
        AmericanTourist sh = new AmericanTourist(12,34,54,1);
        sh.getprice();
        sh.getBrandname();
        sh.getvolume();
        
        TravelBag hs = new TravelBag(true,4,1,2,3,4,"totbag");
        hs.getvolume();
        hs.isHasnumberlock();
        hs.getWheels();
        hs.getprice();
        
        System.out.println("Number of Wheels for Travel bag: "+hs.getWheels());
        System.out.println("Price of TravelBag:"+hs.getprice());
        System.out.println( "Volume of Travelbag:"+hs.getvolume());
        System.out.println("Is Number Lock available:"+hs.isHasnumberlock());
        System.out.println("*****************");
        System.out.println("Brand name of AmericanTourist:"+sh.getBrandname());
        System.out.println("Volume of AmericanTourist:"+sh.getvolume());
        
    }
    
}
