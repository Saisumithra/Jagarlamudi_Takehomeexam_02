/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_Q7;

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
        System.out.println("Answer for Question 7: Saisumithra Jagarlamudi\n");
        for(BagsBrand hs : BagsBrand.values())
        {
           System.out.println(hs+ "\nBag Brand is:"+hs.toString()+"\n"+"Manager name: "+hs.getManagername() + "\n"+"PhonrNumber: "+hs.getPhonenumber()+"\n"+"pincode: "+hs.getPincode()+"\ncity: "+hs.getCity()+"\n");
        }
        System.out.println("*******************");
        System.out.println("ListofBrandsinKAnsas"+BagsBrand.getListofShowrooms("kansas").toString());
    }
}
