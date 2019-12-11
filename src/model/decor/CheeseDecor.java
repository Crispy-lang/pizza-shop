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
public class CheeseDecor extends PizzaDecor{
    protected CheeseOptions cheese;
    public CheeseDecor(Pizzaconf pizza,CheeseOptions cheese) {
        super(pizza);
        this.cheese = cheese;
    }

    @Override
    public String setname() {
        System.out.println("added cheese: "+ cheese);
        return super.setname();
    }

    @Override
    public Double setBasePrice() {
         double price;
        if(cheese.toString().equals("REGULAR")){
            price= 1000.0;
            System.out.println(cheese.toString()+" CHEESE:"+price);
        }
        else if(cheese.toString().equals("EXTRACHEESE")){
            price= 2500.0;
            System.out.println(cheese.toString()+" CHEESE:"+price);
        }
        else{
            price= 0.0;
            System.out.println(cheese.toString()+" CHEESE:"+price);
        }
        return super.setBasePrice() + price; 
    }

    @Override
    public String toString() {
        return ""+cheese;
    }
    
    
}
