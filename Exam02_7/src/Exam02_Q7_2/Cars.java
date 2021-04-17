/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_Q7_2;

/**
 *
 * @author Saisumithra Jagarlamudi
 */
public enum Cars {
    BENZ("Excellent"),AUDI("Average"),BMW("Good");
    private final String Model;

    private Cars(String Model) {
        this.Model = Model;
    }

    public String getModel() {
        return Model;
    }
}


   
    
    