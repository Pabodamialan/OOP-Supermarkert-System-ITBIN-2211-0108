/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author Agnar
 */
public class ChangeRecord {
    
    Statement stmt; 
    
    public void Resetpass(String ID, String pass){
      
        try{
            stmt =DBConnection.getStatementConnection();
            
            
            stmt.executeUpdate("UPDATE cashier SET Cpassword = '"+pass+"' WHERE CworkID='"+ID+"' ");
        
        }
        catch(SQLException e){
        } 
        
        
    
    }
    public void ResetAdminPass(String ID, String pass){
      
        try{
            stmt =DBConnection.getStatementConnection();
            
            
            stmt.executeUpdate("UPDATE adminl SET Apassword = '"+pass+"' WHERE AworkID='"+ID+"' ");
        
        }
        catch(SQLException e){
        } 
        
        
    
    }
    
}
