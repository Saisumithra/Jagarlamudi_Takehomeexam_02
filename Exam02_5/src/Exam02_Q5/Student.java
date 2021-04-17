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
public class Student extends Person{
    private String grade;
    private final String classStatus= "Graduate";

    public Student(String grade, String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public String getclassStatus() {
        return classStatus;
    }

    @Override
    public String toString() {
        return "Student Name: " +super.getName();
    }
}
   