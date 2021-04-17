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
public class driver 
{
    public static void main(String[] args)
    {
    System.out.println("Answer for Question4:Saisumithra Jagarlamudi");
    bags h1=new HandBag("Overland","2105","Louisvuitton");
    bags b1 = new bags("Guicc","2020");
    System.out.println( h1);
    System.out.println(b1);
    b1.isAvailable();
    h1.isAvailable();
    
    }
    
}
