/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.impl.pizzaBase;

/**
 *
 * @author tay
 */
public class Medium extends PizzaBase{

    @Override
    public Double setBasePrice() {
        return 2000.0;
    }

    @Override
    public String setname() {
        return "MEDIUM";
    }
    
}
