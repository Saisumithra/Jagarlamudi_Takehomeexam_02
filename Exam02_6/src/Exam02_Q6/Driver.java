/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_Q6;

import java.util.Scanner;
/**
 *
 * @author Saisumithra Jagarlamudi
 */
public class Driver {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		
                System.out.println("Answer For Question6: Saisumithra Jagarlamudi");
		System.out.print("Enter a value of the triangle: ");
		double a = input.nextDouble();
                System.out.print("Enter b value of the triangle: ");
		double b = input.nextDouble();
                System.out.print("Enter c value of the triangle: ");
		double c = input.nextDouble();

		System.out.print("Enter a color: ");
		String color = input.next();

		System.out.print("Is the triangle filled (true / false)? ");
		boolean filled = input.nextBoolean();

		
		Triangle triangle = new Triangle(a, b, c, color, filled);

		System.out.println(triangle);
	}
}