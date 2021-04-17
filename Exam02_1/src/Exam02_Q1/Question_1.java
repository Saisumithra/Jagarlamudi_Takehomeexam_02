/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_Q1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author Saisumithra Jagarlamudi
 */
public class Question_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner hs = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Answer for Question 1: Saisumithra Jagarlamudi\n");
        System.out.print("Enter 10 integers: ");
	for (int k = 0 ; k < 10 ; k++)  
        {
	    list.add(hs.nextInt());
	}
        removeDuplicate(list);
        System.out.print("The distinct integers are ");
	for (Integer sh : list) 
        {
	    System.out.print(sh + " ");
	}
	System.out.println();
	}
        public static void removeDuplicate(ArrayList<Integer> list)
        {
	    List<Integer> indexToRemove = new ArrayList<>();
            for (int i = 0; i < list.size() - 1; i++) 
            {
              for (int j = i + 1; j <  list.size(); j++)
              {
                if (!indexToRemove.contains(j) && list.get(i).equals(list.get(j)))
                {
                    indexToRemove.add(j);
                }
            }
        }
        Collections.sort(indexToRemove);
        for (int i = 0; i < indexToRemove.size(); i++) 
        {
            list.remove(indexToRemove.get(i) - i);
        }
    }
}