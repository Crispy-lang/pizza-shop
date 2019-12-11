/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.decor;

import model.Interface.Pizzaconf;

/**
 *
 * @author tay
 */
public class VegDecor extends PizzaDecor{
    protected VegetablesOptions vegs;
    public VegDecor(Pizzaconf pizza, VegetablesOptions vegs) {
        super(pizza);
        this.vegs=vegs;
    }

    @Override
    public String setname() {
        System.out.println("Vegs added: "+ vegs);
        return super.setname(); 
    }

    @Override
    public Double setBasePrice() {
         double price;
        if(vegs.toString().equals("BLACKOLIVES")){
            price= 500.0;
            System.out.println(vegs.toString()+" VEGS:"+price);
        }
        else if(vegs.toString().equals("MUSHROOM")){
            price= 500.0;
            System.out.println(vegs.toString()+" VEGS:"+price);
        }
        else if(vegs.toString().equals("ONION")){
            price= 500.0;
            System.out.println(vegs.toString()+" VEGS:"+price);
        }
        else{
            price= 1500.0;
            System.out.println(vegs.toString()+" VEGS:"+price);
        }
        return super.setBasePrice() + price;
    }

    @Override
    public String toString() {
        return ""+ vegs;
    }
    
}
