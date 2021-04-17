/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_Q9_2;

/**
 *
 * @author Saisumithra Jagarlamudi
 */
public class Benz implements Cars{
    private static final String year="2020";
    private static final String model="AAA";
    
    
    public void model()
    {
        System.out.println("Benz Car manufactured year:"+model);
    }

    @Override
    public void Year() {
         System.out.println("Benz Car manufactured year:"+year);
    
    }
}
