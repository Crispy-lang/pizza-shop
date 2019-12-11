/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.impl.pizzaBase;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tay
 */
public class Small extends PizzaBase{

    @Override
    public Double setBasePrice() {
        return 1000.0;
    }

    @Override
    public String setname() {
        return "SMALL";
    }
    
}
