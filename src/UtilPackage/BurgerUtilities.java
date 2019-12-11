/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author tyson
 */
public class BurgerUtilities {
   
    public static  PreparedStatement queryStatement(String QUERY ,Connection connection,Object ... object) throws SQLException{
         
        PreparedStatement statement = connection.prepareStatement(QUERY);
    
        for(int i=0;i<object.length;i++){
            statement.setObject(i+1, object[i]);
        
         }
    
         return statement;
    }
    
    public static void closeResult(ResultSet rs) throws SQLException {
        rs.close();
    }
    public static void closeStatement(Statement st) throws SQLException{
        st.close();
    }
    public static void closeConnection(Connection connection) throws SQLException{
        connection.close();
    }
    public static void closeAll(ResultSet rs,Statement st,Connection con) throws SQLException{
        closeConnection(con);
        closeResult(rs);
        closeStatement(st);
    }

}
