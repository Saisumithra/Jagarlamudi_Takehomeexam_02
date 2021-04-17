/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_Q4.I;

/**
 *
 * @author Saisumithra Jagarlamudi
 */
public class HandBag extends bags {
    private String Availblemall;

    public HandBag(String Availblemall, String BrandName, String year) {
        super(BrandName, year);
        this.Availblemall = Availblemall;
    }

    public String getAvailblemall() {
        return Availblemall;
    }

   
    @Override
    public String toString() {
        return "HandBag" + "\nAvailblemall: " + Availblemall ;
    }

    @Override
   public void isAvailable()
    {
        System.out.println("HandBag is Available");
    }
    
    
    
}
