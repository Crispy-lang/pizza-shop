/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal.Package;

import java.util.List;

/**
 *
 * @author tyson
 */
public class Burgers {
    private int serialnumber;
    private String burgername;
    private String components;
    private String burgertype;
    private String pricetag;
    private Beverages drinks;

    public Burgers(int serialnumber, String burgername, String components, String burgertype, String pricetag, Beverages drinks) {
        this.serialnumber = serialnumber;
        this.burgername = burgername;
        this.components = components;
        this.burgertype = burgertype;
        this.pricetag = pricetag;
        this.drinks = drinks;
    }

    
    public Burgers(int aInt, String string, String string0, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Burgers() {
        
    }

    public int getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(int serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getBurgername() {
        return burgername;
    }

    public void setBurgername(String burgername) {
        this.burgername = burgername;
    }

    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    public String getBurgertype() {
        return burgertype;
    }

    public void setBurgertype(String burgertype) {
        this.burgertype = burgertype;
    }

    public String getPricetag() {
        return pricetag;
    }

    public void setPricetag(String pricetag) {
        this.pricetag = pricetag;
    }

    public Beverages getDrinks() {
        return (Beverages) drinks;
    }

    public void setDrinks(Beverages drinks) {
        this.drinks = drinks;
    }
    
    @Override
    public String toString() {
        return serialnumber +" "+burgername +" "+components +" "+ burgertype +" "+ pricetag +" "+drinks;
    }
    
}
