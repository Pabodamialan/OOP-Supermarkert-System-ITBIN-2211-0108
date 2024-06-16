
package View;

import Controller.LoginController;
import Model.DBSearch;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class CashierLogin extends javax.swing.JFrame {

   
    public CashierLogin() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CloseBtn = new javax.swing.JLabel();
        MinBtn = new javax.swing.JLabel();
        LabelUname = new javax.swing.JLabel();
        LabelPassword = new javax.swing.JLabel();
        Pwtf = new javax.swing.JPasswordField();
        UsernameTF = new javax.swing.JTextField();
        LoginBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        ForgetPwLbl = new javax.swing.JLabel();
        NewULabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AdminLlabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setFocusTraversalPolicyProvider(true);
        jPanel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.setInheritsPopupMenu(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        MinBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimize-2.png"))); // NOI18N
        MinBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinBtnMouseClicked(evt);
            }
        });
        jPanel1.add(MinBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 30, 30));

        LabelUname.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LabelUname.setForeground(new java.awt.Color(255, 255, 51));
        LabelUname.setText("Username:");
        jPanel1.add(LabelUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 110, 30));

        LabelPassword.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LabelPassword.setForeground(new java.awt.Color(255, 255, 51));
        LabelPassword.setText("Password:");
        jPanel1.add(LabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 110, 28));

        Pwtf.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.add(Pwtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 270, 28));

        UsernameTF.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        UsernameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTFActionPerformed(evt);
            }
        });
        jPanel1.add(UsernameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 270, 30));

        LoginBtn.setBackground(new java.awt.Color(51, 255, 204));
        LoginBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(51, 51, 51));
        LoginBtn.setText("Login");
        LoginBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LoginBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        LoginBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LoginBtnKeyPressed(evt);
            }
        });
        jPanel1.add(LoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 100, 40));

        CancelBtn.setBackground(new java.awt.Color(51, 255, 204));
        CancelBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CancelBtn.setForeground(new java.awt.Color(255, 0, 0));
        CancelBtn.setText("Cancel");
        CancelBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CancelBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });
        jPanel1.add(CancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 100, 40));

        ForgetPwLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ForgetPwLbl.setForeground(new java.awt.Color(255, 0, 0));
        ForgetPwLbl.setText("Forget Password ?");
        ForgetPwLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForgetPwLblMouseClicked(evt);
            }
        });
        jPanel1.add(ForgetPwLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 120, -1));

        NewULabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NewULabel.setForeground(new java.awt.Color(255, 0, 0));
        NewULabel.setText("Create New Account");
        NewULabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewULabelMouseClicked(evt);
            }
        });
        jPanel1.add(NewULabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 150, 22));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 451, 111, -1));

        AdminLlabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AdminLlabel.setForeground(new java.awt.Color(255, 0, 0));
        AdminLlabel.setText("Admin login");
        AdminLlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminLlabelMouseClicked(evt);
            }
        });
        jPanel1.add(AdminLlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 115, 22));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.jpg"))); // NOI18N
        jLabel1.setText("Login");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Cashier Login");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, 50));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        // TODO add your handling code here:
        super.dispose();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void LoginBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoginBtnKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_LoginBtnKeyPressed

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        // TODO add your handling code here:
        LoginController.CashierLogin(UsernameTF.getText(), Pwtf.getText());
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void UsernameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTFActionPerformed

    private void NewULabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewULabelMouseClicked
       AddCashier add  = new AddCashier();
       add.setVisible(true);
       super.dispose();
        
    }//GEN-LAST:event_NewULabelMouseClicked

    private void AdminLlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminLlabelMouseClicked
        // TODO add your handling code here:
       AdminLogin login  = new AdminLogin();
       login.setVisible(true);
       super.dispose();
    }//GEN-LAST:event_AdminLlabelMouseClicked

    private void ForgetPwLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgetPwLblMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, " Contact Administrator \n 0112 580 580 ","Message",JOptionPane.INFORMATION_MESSAGE);
  
    }//GEN-LAST:event_ForgetPwLblMouseClicked

    private void MinBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinBtnMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(AddAdmin.ICONIFIED);
      
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
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminLlabel;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JLabel CloseBtn;
    private javax.swing.JLabel ForgetPwLbl;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel LabelUname;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JLabel MinBtn;
    private javax.swing.JLabel NewULabel;
    private javax.swing.JPasswordField Pwtf;
    private javax.swing.JTextField UsernameTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
