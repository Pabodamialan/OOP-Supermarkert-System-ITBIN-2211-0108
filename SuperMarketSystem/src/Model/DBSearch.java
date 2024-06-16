/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBSearch {
 
    Statement stmt;
    ResultSet rs;

    
    public ResultSet searchCashier(String CID){
        try{
            stmt=DBConnection.getStatementConnection();
            rs=stmt.executeQuery("SELECT * FROM cashier WHERE CworkID= '"+CID+"' ");
        }
        catch(SQLException e){            
        }   
    return rs;
    }
    
    
    public ResultSet searchAdmin(String AID){
        try{
            stmt=DBConnection.getStatementConnection();
            rs=stmt.executeQuery("SELECT * FROM adminl WHERE AworkID = '"+AID+"' ");
        
        }
        catch(SQLException e){
        
        }
    return rs;
    }

    public ResultSet searchAllAdmins(){
        try{
            stmt=DBConnection.getStatementConnection();
            rs=stmt.executeQuery("SELECT * FROM adminl");
        
        }
        catch(SQLException e){
        
        }
    return rs;
    }
  
    public ResultSet searchProduct(){
        try{
            stmt=DBConnection.getStatementConnection();
            rs=stmt.executeQuery("SELECT * FROM product");
        }
        catch(SQLException e){           
        }    
    return rs;
    }
    

    public ResultSet searchCategory(String cate){
        try{
            stmt=DBConnection.getStatementConnection();
            rs=stmt.executeQuery("SELECT * FROM product WHERE Category = '"+cate+"' ");
        }
        catch(SQLException e){            
        }   
    return rs;
    }
    

    public ResultSet searchSupplier(String ID){
        try{
            stmt=DBConnection.getStatementConnection();
            rs=stmt.executeQuery("SELECT * FROM supplier WHERE SupplierID = '"+ID+"' ");
        }
        catch(SQLException e){          
        } 
    return rs;
    }
    
        
    public ResultSet searchAllSuppliers(){
        try{
            stmt=DBConnection.getStatementConnection();
            rs=stmt.executeQuery("SELECT * FROM supplier");
        }
        catch(SQLException e){           
        }   
    return rs;
    }
    
    
    public ResultSet searchCustomer(String NIC){
        try{
            stmt=DBConnection.getStatementConnection();
            rs=stmt.executeQuery("SELECT * FROM customer WHERE NIC = '"+NIC+"' ");
        }
        catch(SQLException e){     
        }    
    return rs;
    }
    
    public ResultSet searchAllCustomers(){
        try{
            stmt=DBConnection.getStatementConnection();
            rs=stmt.executeQuery("SELECT * FROM customer");
        }
        catch(SQLException e){     
        }    
    return rs;
    }

       
    public ResultSet searchBill(String pcode){
        try{
            stmt=DBConnection.getStatementConnection();
            String code = pcode;
            rs=stmt.executeQuery("SELECT * FROM product WHERE ProductCode = '"+code+"' ");
        }
        catch(SQLException e){
            
        }    
    return rs;   
    }
        
    
    public ResultSet searchBillName(String PName){
        try{
            stmt=DBConnection.getStatementConnection();
            rs=stmt.executeQuery("SELECT * FROM product WHERE ProductName= '"+PName+"' ");        
        }
        catch(SQLException e){
        
        }
    return rs;
    }

}    


      
    





