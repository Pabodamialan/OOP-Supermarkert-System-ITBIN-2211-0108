/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Nishan Fernando
 */
public class DeleteRecord {
    
    Statement stmt;
    
    public void DeleteProduct(String PCode){
         try {
            stmt = DBConnection.getStatementConnection();
            
            stmt.executeUpdate("DELETE FROM product WHERE ProductCode='"+PCode+"' ");
        }
        catch(SQLException e){
        } 
        
    }
    
    public void DeleteSupplier(String SID){
        try {
            stmt = DBConnection.getStatementConnection();
            
            stmt.executeUpdate("DELETE FROM supplier WHERE SupplierID='"+SID+"' ");
        }
        catch(SQLException e){
        }     
    }
    
    public void DeleteCustomer(String NIC){
         try {
            stmt = DBConnection.getStatementConnection();
            
            stmt.executeUpdate("DELETE FROM customer WHERE NIC='"+NIC+"' ");
        }
        catch(SQLException e){
        } 
        
    }

}
