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
public abstract class PizzaDecor implements Pizzaconf{
    protected Pizzaconf pizza;

    public PizzaDecor(Pizzaconf pizza) {
        this.pizza = pizza;
    }

    
    @Override
    public Double setBasePrice() {
        return pizza.setBasePrice();
       
    }

    @Override
    public String setname() {
        return pizza.setname();
       
    }
 
}
