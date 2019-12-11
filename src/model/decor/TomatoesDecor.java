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
public class TomatoesDecor extends PizzaDecor{
    protected TomatoesOptions tomatoes;
    public TomatoesDecor(Pizzaconf pizza,TomatoesOptions tomatoes) {
        super(pizza);
        this.tomatoes=tomatoes;
    }

    @Override
    public String setname() {
        System.out.println("Tomatoes chosen: "+ tomatoes);
        return super.setname(); 
    }

    @Override
    public Double setBasePrice() {
        double price;
        if(tomatoes.toString().equals("GREEN")){
            price=500.0;
            System.out.println(tomatoes.toString()+" TOMATOES: "+price);
        }
        else{
            price=1000.0;
            System.out.println(tomatoes.toString()+" TOMATOES: "+price);
        }
        return super.setBasePrice() + price; 
    }

    @Override
    public String toString() {
        return ""+ tomatoes;
    }

}
