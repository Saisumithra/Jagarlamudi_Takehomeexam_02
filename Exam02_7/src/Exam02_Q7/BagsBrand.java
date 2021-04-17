/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_Q7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Saisumithra Jagarlamudi
 */
public enum BagsBrand {

    /**
     *
     */
    GUCCI("ABC", 52436775, "Kansas", 3456),

    /**
     *
     */
    PRADA("CDA", 4095990, "Maryville", 1053),

    /**
     *
     */
    LOUISVUITTON( "FGH", 7655321, "Kansas", 54321);
   
    private final String Managername;
    private final long phonenumber;
    private final String city;
    private final long pincode;

    private BagsBrand(String Managername, long phonenumber, String city, long pincode) {
        this.Managername = Managername;
        this.phonenumber = phonenumber;
        this.city = city;
        this.pincode = pincode;
    }

    public static BagsBrand getGUCCI() {
        return GUCCI;
    }

    public static BagsBrand getPRADA() {
        return PRADA;
    }

    public static BagsBrand getLOUISVUITTON() {
        return LOUISVUITTON;
    }

    public String getManagername() {
        return Managername;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public String getCity() {
        return city;
    }

    public long getPincode() {
        return pincode;
    }
    public static List<BagsBrand> getListofShowrooms(String cityname)
    {
        List<BagsBrand> hs = new ArrayList<>();
        for(BagsBrand i :BagsBrand.values() )
        {
            if(i.getCity().equalsIgnoreCase(cityname)){
                hs.add(i);
            }
        }
        return hs;
    }

}