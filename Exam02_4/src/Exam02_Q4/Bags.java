/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_Q4;

/**
 *
 * @author Saisumithra Jagarlamudi
 */
public class Bags {
    public static class bags
    {
        public static void bag()
        {
            System.out.println("Bag Models");
        }
    }

    public static class TravelBag extends bags
    {
       
        public static void bag()
        {
            System.out.println("TravelBag is a kind of bag");
        }
    }
    public static class BackpackBag extends bags
    {
       
        public static void bag()
        {
            System.out.println("Backpack Bag is a type of bag");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Answer for Question4:Saisumithra Jagarlamudi");
        bags b1=new bags();
        bags b2=new TravelBag();
        bags b3=new BackpackBag();
        b1.bag();
        b2.bag();
        b3.bag();
    }
    
}
