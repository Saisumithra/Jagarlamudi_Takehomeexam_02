/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_Q5;

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
        System.out.println("Answer for Question 5: Saisumithra Jagarlamudi");
        Person p = new Person("Sai", "1215 West,Apt:29","1234567898","Sumithra@gmail.com");
        Employee E = new Employee("IBM",2000,"21-3-2019","Sumithra","Maryville","3446778787","Cbs@gmail.com");
        Faculty F = new Faculty("2:00 to 3:20",3,"professor",5000,"3/4/2015","Jagarlamudi","nashville","8387883654","sj@gmail.com");
        Staff s = new Staff("Admin","TCS",60000,"4/23/2018","Harish","Texas","7366553765","efg@gmail.com");
        Student d = new Student("A","Varsha","Virginia","8373674673","Ammu@gmail.com");
        System.out.println(p.toString());
        System.out.println(E.toString());
        System.out.println(d.toString());
        System.out.println(F.toString());
        System.out.println(s.toString());
       
    }
}

        
        
    

