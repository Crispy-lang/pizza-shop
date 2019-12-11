/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BurgerDao;

import modal.Package.Beverages;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author tyson
 */
public interface BeveragesDao {
    public abstract void create(Beverages beverages);
    public abstract void Update(Beverages beverages);
    public abstract void Delete(int id);
    public abstract Beverages drinksavailable(int id);
     public abstract Beverages alldrinksavailable();
    
}
