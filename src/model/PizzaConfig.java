/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;



/**
 *
 * @author tay
 */
public class PizzaConfig implements Serializable{
    private String pizzanName;
    private double baseprice;
    private List<OptionSet> options;

    public PizzaConfig() {
    }

    
    public PizzaConfig(String pizzanName, double baseprice, List<OptionSet> options) {
        this.pizzanName = pizzanName;
        this.baseprice = baseprice;
        this.options = options;
    }


    public String getPizzanName() {
        return pizzanName;
    }

    public void setPizzanName(String pizzanName) {
        this.pizzanName = pizzanName;
    }

    public double getBaseprice() {
        return baseprice;
    }

    public void setBaseprice(double baseprice) {
        this.baseprice = baseprice;
    }

    public List<OptionSet> getOptions() {
        return options;
    }

    public void setOptions(List<OptionSet> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "\n"+"PizzaConfig:" +"\n"+ "pizzanName:" + pizzanName +"\n"+"baseprice:" + baseprice +"\n"+"options=" + options +"\n";
    }

    
    
    
}
