/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 *
 * @author tay
 */
public class OptionSet{
   private String name;
   private List<Option> choices;

    public OptionSet() {
    }
   
   
   public class Option{
     private String name;
     private double price;

        public Option() {
        }

     
        public Option(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "\n"+"optionName:" + name +"\t\n"+ "price:" + price+"\n";
        }
     
     
   }

    public OptionSet(String name, List<Option> choices) {
        this.name = name;
        this.choices = choices;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Option> getChoices() {
        return choices;
    }

    public void setChoices(List<Option> choices) {
        this.choices = choices;
    }

    

    @Override
    public String toString() {
        return "\n\n"+"OpsetName:" + name +"\n"+"options:" + choices + "\n\n";
    }
   
   
    
}
