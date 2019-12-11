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
public class deliveryDecor extends PizzaDecor{
    protected DeliveryOptions delivery;
    public deliveryDecor(Pizzaconf pizza,DeliveryOptions delivery) {
        super(pizza);
        this.delivery=delivery;
    }

    @Override
    public String setname() {
        System.out.println("delivery mode:" + delivery);
        return super.setname(); 
    }

    @Override
    public Double setBasePrice() {
         double price;
        if(delivery.toString().equals("EATIN")){
            price= 0.0;
            System.out.println(delivery.toString()+" DELIVERY:"+price);
        }
        else{
            price= 1000.0;
            System.out.println(delivery.toString()+" DELIVERY:"+price);
        }
        return super.setBasePrice() + price;
    }

    @Override
    public String toString() {
        return ""+ delivery;
    }
    
    
    
}
