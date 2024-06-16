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
public class UpdateRecord {
    
    Statement stmt;
    
    public void UpdatePro(String PCode1, String PCodeNew,String PName, double wsPrice, double retPrice){
       try {
            stmt =DBConnection.getStatementConnection();
            
            stmt.executeUpdate("Update product SET ProductCode='"+PCodeNew+"',ProductName='"+PName+"',WholesalePrice='"+wsPrice+"',RetailPrice='"+retPrice+"' WHERE  ProductCode='"+PCode1+"' ");
            
        }
        catch (SQLException e){ 
    
        }
    }
    
    public void UpdateCust(String NIC1, String NICNew,String CName, String Contact){
       try {
            stmt =DBConnection.getStatementConnection();
            
            stmt.executeUpdate("Update customer SET CustomerName='"+CName+"',NIC='"+NICNew+"',Contact='"+Contact+"' WHERE  NIC='"+NIC1+"' ");
            
        }
        catch (SQLException e){ 
    
        }
    }
    
    public void UpdateSup(String SupID1, String SupIDNew,String SName, int Contact){
       try {
            stmt =DBConnection.getStatementConnection();
            
            stmt.executeUpdate("Update supplier SET SupplierName='"+SName+"',SupplierID='"+SupIDNew+"',SupplierContact='"+Contact+"' WHERE  SupplierID='"+SupID1+"'  ");
            
        }
        catch (SQLException e){ 
    
        }
    } 
    
}
