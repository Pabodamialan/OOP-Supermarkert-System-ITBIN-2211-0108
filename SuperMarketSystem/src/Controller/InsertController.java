/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import View.AddAdmin;
import View.AddCashier;
import View.AdminLogin;
import View.CashierLogin;
import javax.swing.JOptionPane;

public class InsertController {
    
    public static void InsertAdmin(String Name, String NIC, String Contact, String ID, String pass1 , String pass2 ){
        
        if(Name.length()==0 || NIC.length()==0 || Contact.length()==0 || ID.length()==0 || pass1.length()==0 || pass2.length()==0){
            JOptionPane.showMessageDialog(null, " Insufficient values ","Error", JOptionPane.ERROR_MESSAGE); 
        }
        
        else if(pass1.equals(pass2)){
            String pass = pass2;
            int Tele = Integer.parseInt(Contact);
            new Model.AddRecord().AddAdmin(Name, NIC,Tele, ID, pass); 
            JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Login Successfull");
            AddAdmin.getFrames()[1].dispose();
            new AdminLogin().setVisible(true);
        }
        else{    
            JOptionPane.showMessageDialog(null, " Invalid Password ","Error", JOptionPane.ERROR_MESSAGE); 
        }        
    }

    public static void InsertCashier(String Name, String NIC, String Contact, String ID, String pass1 , String pass2 ){
        
        
        if(Name.length()==0 || NIC.length()==0 || Contact.length()==0 || ID.length()==0 || pass1.length()==0 || pass2.length()==0){
            JOptionPane.showMessageDialog(null, " Insufficient values ","Error", JOptionPane.ERROR_MESSAGE); 
        }
        else if (pass1.equals(pass2)){
            String pass= pass2;
            int Tele = Integer.parseInt(Contact);
            new Model.AddRecord().AddCashier(Name,NIC,Tele,ID,pass);
            JOptionPane.showMessageDialog(null,"New Record has been inserted","Successfull",JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Login Successfull");
            AddCashier.getFrames()[1].dispose();
            new CashierLogin().setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalid Password","Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public static void InsertProduct(String pname, String pcode, String category, String wsprice, String retailprice){
        
        if(pname.length()==0 || category.length()==0 || pcode.length()==0 || wsprice.length()==0 || retailprice.length()==0){
            JOptionPane.showMessageDialog(null, " Insufficient values ","Error", JOptionPane.ERROR_MESSAGE); 
        }
        else{        
            double wsp = Double.parseDouble(wsprice);
            double rp = Double.parseDouble(retailprice);
            new Model.AddRecord().AddProduct(pname ,pcode ,category ,wsp ,rp);    
            JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    
    public static void InsertSupplier(String Sname,String SID,String category,String Contact){
        
        if(Sname.length()==0 || SID.length()==0 || category.length()==0 || Contact.length()==0 ){
            JOptionPane.showMessageDialog(null, " Insufficient values ","Error", JOptionPane.ERROR_MESSAGE); 
        }
        else{
            int Tele = Integer.parseInt(Contact);
            new Model.AddRecord().AddSupplier(Sname,SID,category,Tele);
            JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
        }    
    }
    
    public static void InsertCustomer(String Name, String NIC, String Contact){
        if(Name.length()==0 || NIC.length()==0 || Contact.length()==0 ){
            JOptionPane.showMessageDialog(null, " Insufficient values ","Error", JOptionPane.ERROR_MESSAGE); 
        }
        else{
            int Tele = Integer.parseInt(Contact);
            new Model.AddRecord().AddCustomer(Name, NIC, Tele);
            JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
