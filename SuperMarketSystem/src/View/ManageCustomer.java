/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import Controller.DeleteController;
import Controller.UpdateController;
import Model.DBConnection;
import Model.DBSearch;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Nishan Fernando
 */
public class ManageCustomer extends javax.swing.JFrame {

    /**
     * Creates new form UpdateCustomer
     */
    public ManageCustomer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CustNameTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CustNICTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ContactTF = new javax.swing.JTextField();
        BackBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        MinBtn = new javax.swing.JLabel();
        CloseBtn = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 510, 60));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 140, 20));
        jPanel1.add(CustNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 233, 30));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer NIC");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 106, 20));

        CustNICTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CustNICTFKeyPressed(evt);
            }
        });
        jPanel1.add(CustNICTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 233, 30));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contact Number");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 140, 20));
        jPanel1.add(ContactTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 233, 30));

        BackBtn.setBackground(new java.awt.Color(255, 255, 255));
        BackBtn.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        BackBtn.setText("Back");
        BackBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 70, -1));

        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, -1));

        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, -1, -1));

        MinBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimize-2.png"))); // NOI18N
        MinBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinBtnMouseClicked(evt);
            }
        });
        jPanel1.add(MinBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 30, 30));

        CloseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close 2.png"))); // NOI18N
        CloseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseBtnMouseExited(evt);
            }
        });
        jPanel1.add(CloseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 30, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        super.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed
    
    String NIC1;
    
    private void CustNICTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CustNICTFKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            NIC1 = CustNICTF.getText();
            try {

                ResultSet rs = new DBSearch().searchCustomer(NIC1);
                if(rs.next() == false){
                    JOptionPane.showMessageDialog(this,"Customer Doesn't Exist");
                }
                else{
                    CustNICTF.setText(rs.getString("NIC"));
                    CustNameTF.setText(rs.getString("CustomerName"));
                    ContactTF.setText(rs.getString("Contact"));
                }
                DBConnection.closeCon();
            }
            catch (SQLException ex) {
            }
        }
    }//GEN-LAST:event_CustNICTFKeyPressed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
        
        UpdateController.UpdateCustomer(NIC1, CustNICTF.getText(), CustNameTF.getText(), ContactTF.getText());
        CustNICTF.setText("");
        CustNameTF.setText("");
        ContactTF.setText("");
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
        DeleteController.DeleteCustomer(CustNICTF.getText());
        CustNICTF.setText("");
        CustNameTF.setText("");
        ContactTF.setText("");

    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void MinBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinBtnMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(AddAdmin.ICONIFIED);
        /* if(this.getExtendedState()!= AddAdmin.MAXIMIZED_BOTH){
            this.setExtendedState(AddAdmin.MAXIMIZED_BOTH);
        }
        else{
            this.setExtendedState(AddAdmin.NORMAL);
        }*/
    }//GEN-LAST:event_MinBtnMouseClicked

    private void CloseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseBtnMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_CloseBtnMouseClicked

    private void CloseBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseBtnMouseEntered
        // TODO add your handling code here:
        // ColorChange(CloseBtn, new Color(255,51,51));
    }//GEN-LAST:event_CloseBtnMouseEntered

    private void CloseBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseBtnMouseExited
        // TODO add your handling code here:
        //ColorChange(CloseBtn, new Color(0,51,255));
    }//GEN-LAST:event_CloseBtnMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel CloseBtn;
    public javax.swing.JTextField ContactTF;
    public javax.swing.JTextField CustNICTF;
    public javax.swing.JTextField CustNameTF;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JLabel MinBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}