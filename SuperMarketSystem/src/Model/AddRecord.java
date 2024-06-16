
package Model;

import java.sql.SQLException;
import java.sql.Statement;

public class AddRecord {
   
    Statement stmt;
    
    public void AddCashier(String Name, String NIC, int Tele, String ID, String pass){
        try {
            stmt =DBConnection.getStatementConnection();
            
            stmt.executeUpdate("INSERT INTO cashier VALUES ('"+Name+"', '"+NIC+"', '"+Tele+"',  '"+ID+"', '"+pass+"')");
            
        }
        catch (SQLException e){
    }
    }
    
    public void AddAdmin(String Name, String NIC, int Tele, String ID, String pass){
       try {
            stmt = DBConnection.getStatementConnection();
            
            stmt.executeUpdate("INSERT INTO adminl VALUES('"+Name+"', '"+NIC+"', '"+Tele+"', '"+ID+"','"+pass+"')");
        }
        catch(SQLException e){
        } 
 
    }
    
    public void AddProduct(String Pname, String pcode, String category, double wsp, double rp){
        try {
            stmt = DBConnection.getStatementConnection();
            
            stmt.executeUpdate("INSERT INTO product VALUES('"+Pname+"', '"+category+"', '"+wsp+"', '"+rp+"', '"+pcode+"')");
        }
        catch(SQLException e){
        }
    }
    
    public void AddSupplier(String Sname,String SID,String category,int Tele){
         try {
            stmt = DBConnection.getStatementConnection();
            
            stmt.executeUpdate("INSERT INTO supplier VALUES('"+Sname+"', '"+SID+"', '"+category+"', '"+Tele+"')");
        }
        catch(SQLException e){
        }
        
    }
    
    
    public void AddCustomer(String Name, String NIC ,int Tele){
        try {
            stmt = DBConnection.getStatementConnection();
            
            stmt.executeUpdate("INSERT INTO customer VALUES('"+Name+"', '"+NIC+"', '"+Tele+"')");
        }
        catch(SQLException e){
        }
    }
    
}
