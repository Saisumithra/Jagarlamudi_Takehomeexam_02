/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_Q9;

import static Exam02_Q9.Bags.Quality.latest;
import static Exam02_Q9.Bags.Quality.moderate;
import static Exam02_Q9.Bags.Quality.old;
import static Exam02_Q9.Bags.Size.small;

/**
 *
 * @author Saisumithra Jagarlamudi
 */
public class HandBag implements Bags{
    private double height;
    private double width;
    private double depth;
    private String brandname;
    private double price;
    private int manufactureyear;
    private String material;

    public HandBag(double height, double width, double depth, String brandname, double price, int manufactureyear, String material) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.brandname = brandname;
        this.price = price;
        this.manufactureyear = manufactureyear;
        this.material = material;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public String getBrandname() {
        return brandname;
    }

    public double getPrice() {
        return price;
    }

    public int getManufactureyear() {
        return manufactureyear;
    }

    public String getMaterial() {
        return material;
    }
    
    @Override
    public String Quality() {
        if(material.equalsIgnoreCase("Leather"))
        {
             if(manufactureyear > 2018)
       {
           return latest.toString();
       }else if(manufactureyear > 2012)
       {
           return moderate.toString();
       }
       else 
           return old.toString(); 
        }else
        {
          if(manufactureyear > 2020)
       {
           return latest.toString();
       }else if(manufactureyear > 2015)
       {
           return moderate.toString();
       }
       else 
           return old.toString();    
        }
    }

    @Override
    public String Size() {
        return small.toString();
    }

    @Override
    public double getVolume() {
       return height*width*depth;
    }
    
    
}
