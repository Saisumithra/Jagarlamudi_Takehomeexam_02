/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_Q9;

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
        System.out.println("Answer For Question9: Saisumithra Jagarlamudi");
        TravelBag hs = new TravelBag(1,2,3,"bs",23,2020);
       
        System.out.println("Quality of TravelBag:"+hs.Quality());
        System.out.println("Size of the Travelbag:"+hs.Size());
        System.out.println("Volume of the Travelbag:"+hs.getVolume());
        
        HandBag sh = new HandBag(1,3,4,"gs",56,2015,"leather");
        
         System.out.println("Quality of HandBag:"+sh.Quality());
         System.out.println("Size of HandBag:"+sh.Size());
         System.out.println("Volume of HandBag:"+sh.getVolume());
         System.out.println("Material of HandBag:"+sh.getMaterial());
        
    }
    
}
