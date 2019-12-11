/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal.Package;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tyson
 */
public class Beverages {
    private int serialnumber;
    private String beveragename;
    private String flavourtype;
    private String pricetag;
    

    public Beverages(int serialnumber, String beveragename, String flavourtype, String pricetag) {
        this.serialnumber = serialnumber;
        this.beveragename = beveragename;
        this.flavourtype = flavourtype;
        this.pricetag = pricetag;
    }

    public Beverages(String string, String string0, String string1) {
        
    }

    public Beverages() {

    }

    public Beverages(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Beverages(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public int getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(int serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getBeveragename() {
        return beveragename;
    }

    public void setBeveragename(String beveragename) {
        this.beveragename = beveragename;
    }

    public String getFlavourtype() {
        return flavourtype;
    }

    public void setFlavourtype(String flavourtype) {
        this.flavourtype = flavourtype;
    }

    public String getPricetag() {
        return pricetag;
    }

    public void setPricetag(String pricetag) {
        this.pricetag = pricetag;
    }

    @Override
    public String toString() {
        return "Beverages{" + "serialnumber=" + serialnumber + ", beveragename=" + beveragename + ", flavourtype=" + flavourtype + ", pricetag=" + pricetag + '}';
    }
   
    

    
}
