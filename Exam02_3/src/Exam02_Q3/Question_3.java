/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_Q3;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Saisumithra Jagarlamudi
 */
public class Question_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer For Question3: Saisumithra Jagarlamudi");
        ArrayList<Object> o = new ArrayList<Object>();
        Loan loan = new Loan(25000);
        Circle circle = new Circle();
        Date date = new Date();
        String string = new String("New String");
                o.add(date);		
		o.add(string);
		o.add(loan);			
		o.add(circle);	
            for (int i = 0; i < o.size(); i++) 
            {
			System.out.println((o.get(i)).toString());
	    }
	}
}

