/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Burgers.Dao.impls;

import UtilPackage.BurgersFactory;

/**
 *
 * @author tyson
 */
public class test {
    public static void main(String[] args) {
        BurgersFactory bfactory=BurgersFactory.getInstance();
        BurgersImpl b=bfactory.registerburger();
        BeveragesImpl be=bfactory.registerdrink();
        
        //System.out.println(be.drinksavailable(1230));
        System.out.println(b.availableburgers(123));
        
        
        
    }
}
