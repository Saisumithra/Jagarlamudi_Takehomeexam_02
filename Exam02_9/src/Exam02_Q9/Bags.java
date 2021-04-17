/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_Q9;

/**
 *
 * @author Saisumithra Jagarlamudi
 */
public interface Bags {
    public enum Quality {
        old,
        moderate,
        latest;
    }
    public enum Size {
         large,small,medium;
     }
    public String Quality();
    public String Size();
    public double getVolume();
}
