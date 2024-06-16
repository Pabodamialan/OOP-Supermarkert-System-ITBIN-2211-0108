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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Agnar
 */
public class ChangeController {
    

    
    public static void CasierReset(String ID, String pass1, String pass2){
        try {
            String CID = null;
 
            ResultSet rs = new DBSearch().searchCashier(ID);
            //Process the Query
            while (rs.next()) {
            CID= rs.getString("CworkID");
            }
 
            if (CID != null) {
                if(pass1.equals(pass2)){
                    String pass = pass2;            
                    new Model.ChangeRecord().Resetpass(ID, pass);
                    JOptionPane.showMessageDialog(null, "Password has been reset", "Succesfull",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Passwords Doesn't match", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } 
            else {
                JOptionPane.showMessageDialog(null, "Invalid Username", "Error", JOptionPane.ERROR_MESSAGE);
            }
            DBConnection.closeCon();
        }
        catch (SQLException ex) {
        }
    }   
    
    
    
    
    
    public static void AdminReset(String ID, String pass1, String pass2){
        try{
            String AdminID = null;
 
            ResultSet rs = new DBSearch().searchAdmin(ID);
            
            while (rs.next()) {
            AdminID = rs.getString("AworkID");
            }
 
            if (AdminID != null) {
                if(pass1.equals(pass2)){
                    String pass = pass2;            
                    new Model.ChangeRecord().ResetAdminPass(ID, pass);
                    JOptionPane.showMessageDialog(null, "Password has been reset", "Succesfull",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Passwords Doesn't match", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } 
            else {
                JOptionPane.showMessageDialog(null, "Invalid Username", "Error", JOptionPane.ERROR_MESSAGE);
            }
            DBConnection.closeCon();
        }
        catch (SQLException ex) {
        }
    }  
}
   

