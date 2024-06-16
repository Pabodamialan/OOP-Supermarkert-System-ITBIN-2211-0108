/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DBConnection;
import Model.DBSearch;
import View.AdminLogin;
import View.AdminMenu;
import View.CashierLogin;
import View.CashierMenu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class LoginController {
    public static void CashierLogin(String Cname, String pass) {
        try {
 
            String username = null; // initial value of the username
            String password = null; // initial value of the password
 
            ResultSet rs = new DBSearch().searchCashier(Cname);
            
            while (rs.next()) {
            username = rs.getString("CworkID"); //assign database login name to the variable
            password = rs.getString("Cpassword"); //assign database password to the variable
            }
 
            if (username != null && password != null) {
                if (password.equals(pass)) {
                System.out.println("Login Successfull");
                CashierLogin.getFrames()[0].dispose();
                new CashierMenu().setVisible(true);
                } 
                else {
                    JOptionPane.showMessageDialog(null, " Password is incorrect ", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } 
            else{
                JOptionPane.showMessageDialog(null, "Invalid Username & Password", "Error", JOptionPane.ERROR_MESSAGE);
            }
    
            DBConnection.closeCon();
        }
        catch (SQLException ex) { 
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public static void AdminLogin(String Aname, String pass) {
                try {
 
            String username = null; // initial value of the username
            String password = null; // initial value of the password
 
            ResultSet rs = new DBSearch().searchAdmin(Aname);
            
            while (rs.next()) {
            username = rs.getString("AworkID"); //assign database login name to the variable
            password = rs.getString("Apassword"); //assign database password to the variable
            }
 
            if (username != null && password != null) {
                if (password.equals(pass)) {
                System.out.println("Login Successfull");
                AdminLogin.getFrames()[0].dispose();
                new AdminMenu().setVisible(true);
                } 
                else {
                    JOptionPane.showMessageDialog(null, " Password is incorrect ", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } 
            else{
                JOptionPane.showMessageDialog(null, "Invalid Username & Password", "Error", JOptionPane.ERROR_MESSAGE);
            }
    
            DBConnection.closeCon();
        }
        catch (SQLException ex) { 
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
        
}
