/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Burgers.Dao.impls;
import BurgerDao.BeveragesDao;
import BurgerDao.BurgersDao;
import modal.Package.Beverages;
import modal.Package.Burgers;
import UtilPackage.BurgerUtilities;
import static UtilPackage.BurgerUtilities.closeAll;
import static UtilPackage.BurgerUtilities.queryStatement;
import UtilPackage.BurgersFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author tyson
 */
public class BeveragesImpl implements BeveragesDao {
  
    public BurgersFactory bfactory;
    Connection con=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public BeveragesImpl(BurgersFactory bfactory) {
        this.bfactory = bfactory;
    }
    String insert="INSERT INTO `beverages`(`beverageserial`, `beveragename`, `flavourtype`, `pricetag`) VALUES (?,?,?,?)";
    @Override
    public void create(Beverages beverages) {
       try{
           con=bfactory.getConnection();
           //ps=con.prepareStatement(insert,Statement.RETURN_GENERATED_KEYS);
           ps=queryStatement(insert, con); 
           
           ps.setInt(1, beverages.getSerialnumber());
           ps.setString(2, beverages.getBeveragename());
           ps.setString(3, beverages.getFlavourtype());
           ps.setString(4, beverages.getPricetag());
           
           ps.executeUpdate();
       }catch(Exception ex){
           System.out.print(ex);
       }finally{
                try {
                      BurgerUtilities.closeConnection(con);
                      BurgerUtilities.closeStatement(ps);
                    }catch (SQLException ex) {
                       System.out.println("Error:"+ex.getMessage());
                    }
            
                }
      
    }
    
    String retrieve="SELECT * from beverages where beverageserial=?";
    @Override
    public  Beverages drinksavailable(int id) {
        
         ResultSet res=null;
         
         Beverages b=null;
         BurgersDao dao=bfactory.registerburger();
         //List<Beverages> bev=new ArrayList();
        
        try{
           con=bfactory.getConnection();
           //ps=con.prepareStatement(retrieve,Statement.RETURN_GENERATED_KEYS);
           ps=queryStatement(retrieve, con,id);
           
           res=ps.executeQuery();
           if(res.next()){
              b=map(res);
       }
       }catch(Exception ex){
           ex.printStackTrace();
       }finally{
                try {
                      BurgerUtilities.closeConnection(con);
                      BurgerUtilities.closeStatement(ps);
                    }catch (SQLException ex) {
                       System.out.println("Error:"+ex.getMessage());
                    }
            
                }
       
        return b;
    }
    private Beverages map(ResultSet res)throws SQLException{
        Beverages b=new Beverages();
        BeveragesImpl bevimpl;
       
        bevimpl=bfactory.registerdrink();
        
        b.setSerialnumber(res.getInt("beverageserial"));
        b.setBeveragename(res.getString("beveragename"));
        b.setFlavourtype(res.getString("flavourtype"));
        b.setPricetag(res.getString("pricetag"));
       
        return b;
    }
    String update="UPDATE `beverages` SET `beverageserial`=?,`beveragename`=?,`flavourtype`=?,`pricetag`=? WHERE beverageserial=?";
    @Override
    public void Update(Beverages beverages) {
         try{
              con=bfactory.getConnection();
              //ps=con.prepareStatement(update,Statement.RETURN_GENERATED_KEYS,id);
              ps=queryStatement(update, con,beverages.getSerialnumber(),beverages.getBeveragename(),beverages.getFlavourtype(),beverages.getPricetag(),beverages.getSerialnumber());      
           ps.executeUpdate();
         }catch(Exception ex){
             System.out.print(ex);
         }finally{
                try {
                      BurgerUtilities.closeConnection(con);
                      BurgerUtilities.closeStatement(ps);
                    }catch (Exception ex) {
                       System.out.println("Error:"+ex);
                    }
            
                }
       
    }
  
    String delete="DELETE from beverages where beverageserial=?";
    @Override
    public void Delete(int id) {
        try {
           con=bfactory.getConnection();
           //PreparedStatement ps=con.prepareStatement(delete,Statement.RETURN_GENERATED_KEYS,id);
           ps=queryStatement(delete, con,id);
           
           ps.executeUpdate();
        } catch (Exception ex) {
            System.out.print(ex);
        }finally{
                try {
                      BurgerUtilities.closeConnection(con);
                      BurgerUtilities.closeStatement(ps);
                    }catch (SQLException ex) {
                       System.out.println("Error:"+ex.getMessage());
                    }
            
                }
    }
    String retrieveall="SELECT * from beverages";
    @Override
    public  Beverages alldrinksavailable() {
         ResultSet res=null;
         
         Beverages b=null;
         BurgersDao dao=bfactory.registerburger();
         //List<Beverages> bev=new ArrayList();
        
        try{
           con=bfactory.getConnection();
           //ps=con.prepareStatement(retrieve,Statement.RETURN_GENERATED_KEYS);
           ps=queryStatement(retrieve, con);
           
           res=ps.executeQuery();
           if(res.next()){
              b=map(res);
       }
       }catch(Exception ex){
           ex.printStackTrace();
       }finally{
                try {
                      BurgerUtilities.closeConnection(con);
                      BurgerUtilities.closeStatement(ps);
                    }catch (SQLException ex) {
                       System.out.println("Error:"+ex.getMessage());
                    }
            
                }
     return b; 
    }
   
}
