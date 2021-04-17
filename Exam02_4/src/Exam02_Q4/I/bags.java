/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_Q4.I;

/**
 *
 * @author Saisumithra Jagarlamudi
 */
    public class bags {
    private String BrandName;
    private String year;

    public bags(String BrandName, String year) {
        this.BrandName = BrandName;
        this.year = year;
    }

    public String getBrandName() {
        return BrandName;
    }

    public String getYear() {
        return year;
    }

    public String toString() {
        return "Bags:" + "\nBrandName: " + BrandName + "\nyear: " + year ;
    }
    public void isAvailable()
    {
        System.out.println("Bags are available");
    }
}
