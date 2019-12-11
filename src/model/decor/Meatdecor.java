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
public class Meatdecor extends PizzaDecor{
    protected MeatOptions meat;
    public Meatdecor(Pizzaconf pizza,MeatOptions meat) {
        super(pizza);
        this.meat = meat;
    }

    @Override
    public String setname() {
        System.out.println("Meat added:" + meat);
        return super.setname(); 
    }

    @Override
    public Double setBasePrice() {
         double price;
        if(meat.toString().equals("BEEF")){
            price= 1500.0;
            System.out.println(meat.toString()+" MEAT:"+price);
        }
        else if(meat.toString().equals("FISH")){
            price= 2500.0;
            System.out.println(meat.toString()+" MEAT:"+price);
        }
        else{
            price= 3500.0;
            System.out.println(meat.toString()+" MEAT:"+price);
        }
        return super.setBasePrice() + price; 
    }

    @Override
    public String toString() {
        return  ""+ meat;
    }
    
}
