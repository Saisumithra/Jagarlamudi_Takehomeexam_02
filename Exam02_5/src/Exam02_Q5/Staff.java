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
public class Staff extends Employee {
	
	private String title;

    public Staff(String title, String office, double salary, String dateHired, String name, String address, String phoneNumber, String emailAddress) {
        super(office, salary, dateHired, name, address, phoneNumber, emailAddress);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Staff Name: "+super.getName();
    }
}
