/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DBConnection;
import Model.DBSearch;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Nishan Fernando
 */
public class UpdateController {
    
    public static void UpdateProduct(String PCode1, String PCodeNew, String PName, String WSPrice, String RetPrice){
        if(PCode1==null ){
            JOptionPane.showMessageDialog(null, " Please enter a supplier ID ", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            if(PCodeNew.length()==0 || PName.length()==0 || WSPrice.length()==0 || RetPrice.length()==0){
                JOptionPane.showMessageDialog(null, " Insufficient values ", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                try {    
                    String ProCode = null;
                    ResultSet rs = new DBSearch().searchBill(PCode1);

                    while (rs.next()) {
                        ProCode= rs.getString("ProductCode");
                    }
                    if (ProCode != null) {
                        if(ProCode.equals(PCode1)){
                            double wholesalep =  Double.parseDouble(WSPrice);
                            double retailp = Double.parseDouble(RetPrice);
                            new Model.UpdateRecord().UpdatePro(PCode1, PCodeNew, PName, wholesalep, retailp);
                            JOptionPane.showMessageDialog(null, "Product details has been updated", "Successfull", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Please Enter a product code ", "Error", JOptionPane.INFORMATION_MESSAGE);
                        } 
                    }
                    DBConnection.closeCon();
                }
                catch (SQLException ex) {
                }
            }    
        }
    }
    
    
    
    
    public static void UpdateCustomer(String NIC1, String NICNew, String CName, String Contact){
        if(NIC1==null ){
            JOptionPane.showMessageDialog(null, " Please enter a supplier ID ", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            if(NICNew.length()==0 || CName.length()==0 || Contact.length()==0 ){
                JOptionPane.showMessageDialog(null, " Insufficient values ", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                try{
                    String Nic = null;
            
                    ResultSet rs = new DBSearch().searchCustomer(NIC1);
                
                    while (rs.next()) {
                        Nic= rs.getString("NIC");
                    }
 
                    if (Nic != null) {
                        if(Nic.equals(NIC1)){
                            new Model.UpdateRecord().UpdateCust(NIC1, NICNew, CName, Contact);
                            JOptionPane.showMessageDialog(null, "Customer details has been updated", "Successfull", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Invalid NIC ", "Error", JOptionPane.ERROR_MESSAGE);
                        } 
                    }
                    else{
                        JOptionPane.showMessageDialog(null, " Please enter a NIC ", "Error", JOptionPane.ERROR_MESSAGE);
                    }
            
                    DBConnection.closeCon();
                }
                catch(SQLException ex){
                }
            }
        }    
    }
    
    public static void UpdateSupplier(String ID1, String SupIDNew, String SName, String Contact){
        if(ID1==null ){
            JOptionPane.showMessageDialog(null, " Please enter a supplier ID ", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{ 
            if(SupIDNew.length()==0 || SName.length()==0 || Contact.length()==0 ){
                JOptionPane.showMessageDialog(null, " Insufficient values ", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                try {
                    String SupplierID = null;
                    ResultSet rs = new DBSearch().searchSupplier(ID1);
            
                    while (rs.next()) {
                        SupplierID= rs.getString("SupplierID");
                    }
 
                    if (SupplierID != null) {
                        if(SupplierID.equals(ID1)){
                            int Tele =  Integer.parseInt(Contact);
                            new Model.UpdateRecord().UpdateSup(ID1, SupIDNew, SName, Tele);
                            JOptionPane.showMessageDialog(null, "Supplier details has been updated", "Successfull", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Please Enter a supplier ID ", "Error", JOptionPane.ERROR_MESSAGE);
                        } 
                    }
                    DBConnection.closeCon();
                }
                catch (SQLException ex) {
                }
            }
        }
    }
    
    
    
}
