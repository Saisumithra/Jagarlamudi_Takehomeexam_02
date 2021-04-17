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
public class Faculty extends Employee {
	
	private String officeHours;
	private int numberofteachingsubjects;

    public Faculty(String officeHours, int numberofTeachingHours, String office, double salary, String dateHired, String name, String address, String phoneNumber, String emailAddress) {
        super(office, salary, dateHired, name, address, phoneNumber, emailAddress);
        this.officeHours = officeHours;
        this.numberofteachingsubjects = numberofTeachingHours;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public int getNumberofteachingsubjects() {
        return numberofteachingsubjects;
    }

    @Override
    public String toString() {
        return "Faculty Name: " +super.getName();
    }
}
    