/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Burgers.Dao.impls;
import BurgerDao.BeveragesDao;
import modal.Package.Burgers;
import BurgerDao.BurgersDao;
import modal.Package.Beverages;
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
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author tyson
 */
public class BurgersImpl implements BurgersDao{

    public BurgersFactory bfact;
    Connection con=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public BurgersImpl(BurgersFactory bfact) {
        this.bfact=bfact;
    }
    String query="INSERT INTO `burgers`(`burgerserial`, `burgername`, `components`, `burgertype`, `pricetag`, `beverageserial`) VALUES (?,?,?,?,?,?)";
    @Override
    public void create(Burgers burgers) {
       try{
           con=bfact.getConnection();
           //ps=con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
           ps=queryStatement(query, con);
           
           ps.setInt(1, burgers.getSerialnumber());
           ps.setString(2, burgers.getBurgername());
           ps.setString(3, burgers.getComponents());
           ps.setString(4, burgers.getBurgertype());
           ps.setString(5, burgers.getPricetag());
           ps.setInt(6, burgers.getDrinks().getSerialnumber());
           
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
   
    String update="UPDATE `burgers` SET burgerserial=?,`burgername`=?,`components`=?,`burgertype`=?,`pricetag`=?,`beverageserial`=? WHERE burgerserial=?";               
    @Override
    public void Update(Burgers burgers) {
         try{
              con=bfact.getConnection();
              //ps=con.prepareStatement(update,Statement.RETURN_GENERATED_KEYS,id);
              ps=queryStatement(update, con,burgers.getSerialnumber(),burgers.getBurgername(),burgers.getComponents(),burgers.getBurgertype(),burgers.getPricetag(),burgers.getDrinks().getSerialnumber(),burgers.getSerialnumber());
           int status=ps.executeUpdate();
           if(status==0){
               System.out.println("Error in updating database!");
           }
         }catch(Exception ex){
             System.out.print(ex);
         } finally{
                try {
                      BurgerUtilities.closeConnection(con);
                      BurgerUtilities.closeStatement(ps);
                    }catch (SQLException ex) {
                       System.out.println("Error:"+ex.getMessage());
                    }
            
                }   
    }

     String dquery="DELETE FROM `burgers` WHERE burgerserial=?";
    @Override
    public void Delete(int id) {
       try {
           con=bfact.getConnection();
           //PreparedStatement ps=con.prepareStatement(dquery,Statement.RETURN_GENERATED_KEYS,id);
           ps=queryStatement(dquery, con,id);
           
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
    String retr="SELECT * from burgers Left join beverages on burgers.beverageserial=beverages.beverageserial where burgerserial=?";
    @Override
    public Burgers availableburgers (int id){
        
//        List<Burgers> burgers=new ArrayList<>();
        Burgers bur=null;
        BeveragesDao bdao=bfact.registerdrink();
        try {
            con=bfact.getConnection();
            //ps=con.prepareStatement(retr,Statement.RETURN_GENERATED_KEYS,id);
            ps=queryStatement(retr, con,id);
            
            rs=ps.executeQuery();
            while(rs.next()){
              
                bur=new Burgers(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),new Beverages(rs.getString(2),rs.getString(3),rs.getString(4)));
//                burgers.add(bur);
            }
        } catch (Exception ex) {
           System.out.print(ex);
        }finally{
                try {
                      closeAll(rs, ps, con);
                    }catch (SQLException ex) {
                       System.out.println("Error:"+ex.getMessage());
                    }
            
                }
        return bur;
           
    }
//    private Burgers map(ResultSet res)throws SQLException{
//        Burgers b=new Burgers();
//        BeveragesImpl bevimpl;
//        BurgersImpl buimpl;
//        
//        buimpl=bfact.registerburger();
//        bevimpl=bfact.registerdrink();
//        
//        b.setSerialnumber(res.getInt("burgerserial"));
//        b.setBurgername(res.getString("burgername"));
//        b.setComponents(res.getString("components"));
//        b.setBurgertype(res.getString("burgertype"));
//        b.setPricetag(res.getString("pricetag"));
//        
//        b.setDrinks(bevimpl.drinksavailable(res.getString("beveragename")));
//        
//        
//    }

    @Override
    public List<Burgers> allburgers() {
       List<Burgers> burgers=new ArrayList<>();
   
        BeveragesDao bdao=bfact.registerdrink();
        try {
            con=bfact.getConnection();
            //ps=con.prepareStatement(retr,Statement.RETURN_GENERATED_KEYS,id);
            ps=queryStatement(retr, con);
            
            rs=ps.executeQuery();
            while(rs.next()){
                Burgers bur=new Burgers();
                bur=new Burgers(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),new Beverages(rs.getString(2),rs.getString(3),rs.getString(4)));
                burgers.add(bur);
            }
        } catch (Exception ex) {
           System.out.print(ex);
        }finally{
                try {
                      closeAll(rs, ps, con);
                    }catch (SQLException ex) {
                       System.out.println("Error:"+ex.getMessage());
                    }
            
                }
        return burgers;

    }

}
