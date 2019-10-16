/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaconfigapp;

import java.util.ArrayList;
import java.util.List;
import model.OptionSet;
import model.PizzaConfig;

/**
 *
 * @author tay
 */
public class PizzaConfigApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OptionSet opset=new OptionSet();
        OptionSet.Option opt= opset.new Option();
        
        opt.setName("beef");
        opt.setPrice(1000);
        
        List<OptionSet.Option> optionlist=new ArrayList<>();
        
        optionlist.add(opt);
             
        
//        create OptionSet
        opset.setName("Meat-Choice");
        opset.setChoices(optionlist);
        
        List<OptionSet> oplist=new ArrayList<>();
        oplist.add(opset);
//        Create PizzaConfig
       PizzaConfig pizza=new PizzaConfig();
       
       pizza.setPizzanName("Meat Pizza");
       pizza.setBaseprice(1500);
       pizza.setOptions(oplist);
       
       System.out.println(pizza.getPizzanName());
       System.out.println(pizza.getBaseprice());
       System.out.println(pizza.getOptions());
       
 
       
        
    }
    
}
