/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BurgerDao;

import modal.Package.Beverages;
import modal.Package.Burgers;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author tyson
 */
public interface BurgersDao {
    public abstract void create(Burgers burgers);
    public abstract void Update(Burgers burgers);
    public abstract void Delete(int id);
    public abstract Burgers availableburgers(int id);
    public abstract List<Burgers> allburgers();
 
}
