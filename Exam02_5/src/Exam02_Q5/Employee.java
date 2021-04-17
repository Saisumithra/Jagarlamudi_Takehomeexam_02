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
public class Employee extends Person {
	private String office;
	private double salary;
	private String dateHired;

    public Employee(String office, double salary, String dateHired, String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public String getDateHired() {
        return dateHired;
    }

    @Override
    public String toString() {
        return "Employee Name: "+super.getName();
    
    }

}
