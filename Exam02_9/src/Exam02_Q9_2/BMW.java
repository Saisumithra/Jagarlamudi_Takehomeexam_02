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
public class BMW implements Cars {
    private static final String year="2021";
    private static final String model="AA";
    private static final String address="Nashville"; 
    
    
    public void model()
    {
        System.out.println("BMW Car manufactured model:"+model);
    }

    @Override
    public void Year() {
         System.out.println("BMW Car manufactured year:"+year);
    }
    public void address()
    {
        System.out.println("BMW Car manufactured address:"+address);
        
    }
}
