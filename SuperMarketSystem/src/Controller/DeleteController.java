

package Controller;

import Model.DBSearch;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DeleteController {
    
    public static void DeleteProduct(String PCodeNew){
        
        if(PCodeNew.length()==0){
            JOptionPane.showMessageDialog(null, "Please enter a prodcut code", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                ResultSet rs = new DBSearch().searchBill(PCodeNew);
                if(rs.next()==false){
                    JOptionPane.showMessageDialog(null, " Invalid product code", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    new Model.DeleteRecord().DeleteProduct(PCodeNew);
                    JOptionPane.showMessageDialog(null, "Product has been deleted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch (SQLException ex) {
            }
        }
    }
    
    
    
    public static void DeleteProductFromTable(String PCodeNew){
        new Model.DeleteRecord().DeleteProduct(PCodeNew);
        JOptionPane.showMessageDialog(null, "Product has been deleted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    
    public static void DeleteSupplier(String SupIDNew){
        if(SupIDNew.length()==0){
            JOptionPane.showMessageDialog(null, "Please enter a supplier ID ", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                ResultSet rs = new DBSearch().searchSupplier(SupIDNew);
                if(rs.next()==false){
                    JOptionPane.showMessageDialog(null, " Invalid supplier ID ", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    new Model.DeleteRecord().DeleteSupplier(SupIDNew);
                    JOptionPane.showMessageDialog(null, "Supplier has been deleted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
                }    
            }
            catch (SQLException ex) {
            }
        }        
    }
    
    
    public static void DeleteSupplierFromTable(String SupID){ 
        new Model.DeleteRecord().DeleteSupplier(SupID);
        JOptionPane.showMessageDialog(null, "Supplier has been deleted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
    }
        
        
    
    public static void DeleteCustomer(String NICNew){
        if(NICNew.length()==0){
            JOptionPane.showMessageDialog(null, "Please enter a NIC ", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                ResultSet rs = new DBSearch().searchCustomer(NICNew);
                if(rs.next()==false){
                    JOptionPane.showMessageDialog(null, " Invalid NIC", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    new Model.DeleteRecord().DeleteCustomer(NICNew);
                    JOptionPane.showMessageDialog(null, "Customer has been deleted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch (SQLException ex) {
            }
        }
    }
    
    
    public static void DeleteCustomerFromTable(String NIC){    
        new Model.DeleteRecord().DeleteCustomer(NIC);
        JOptionPane.showMessageDialog(null, "Customer has been deleted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
    }
    
        
}
