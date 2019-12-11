/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilPackage;

import BurgerDao.BeveragesDao;
import Burgers.Dao.impls.BeveragesImpl;
import Burgers.Dao.impls.BurgersImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author tyson
 */
public class BurgersFactory {
    
    private String url;
    private String username;
    private String password;

    public BurgersFactory(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }
    
    public static BurgersFactory getInstance(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        }catch(Exception e){
            System.out.print(e);
        }
        String url="jdbc:mysql://localhost:3306/burgerhouse";
        String username="root";
        String password="";
        
        BurgersFactory bfact=new BurgersFactory(url, username, password);
        System.out.println("Connected Successfully!");
        return bfact; 
    }
    
    public Connection getConnection() throws SQLException{
        
        return DriverManager.getConnection(url,username,password);
    }
    
    public BeveragesImpl registerdrink(){
        
        return new BeveragesImpl(this);
    }
    
    public BurgersImpl registerburger(){
        return new BurgersImpl(this);
    }
}
