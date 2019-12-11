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
public class Large extends PizzaBase{
     @Override
    public Double setBasePrice() {
        return 3500.0;
    }

    @Override
    public String setname() {
        return "LARGE";
    }
}
