
package View;

import Controller.InsertController;

public class AddCashier extends javax.swing.JFrame {

    /**
     * Creates new form AddUser
     */
    public AddCashier() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NewUserTF = new javax.swing.JTextField();
        NICTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        WorkIDTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        OKBtn = new javax.swing.JButton();
        ResteBtn = new javax.swing.JButton();
        CanelBtn = new javax.swing.JButton();
        TeleTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        NewPw1TF = new javax.swing.JPasswordField();
        NewPw2TF = new javax.swing.JPasswordField();
        MinBtn = new javax.swing.JLabel();
        CloseBtn = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add cashier");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 270, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NIC");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contact No");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));
        jPanel1.add(NewUserTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 167, 30));

        NICTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NICTFActionPerformed(evt);
            }
        });
        jPanel1.add(NICTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 167, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Work ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        WorkIDTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkIDTFActionPerformed(evt);
            }
        });
        jPanel1.add(WorkIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 167, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enter Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 170, -1));

        OKBtn.setText("OK");
        OKBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKBtnActionPerformed(evt);
            }
        });
        jPanel1.add(OKBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 70, 20));

        ResteBtn.setText("Reset");
        ResteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ResteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 70, -1));

        CanelBtn.setText("Cancel");
        CanelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CanelBtnActionPerformed(evt);
            }
        });
        jPanel1.add(CanelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, -1, -1));
        jPanel1.add(TeleTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 167, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Confirm Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 190, -1));
        jPanel1.add(NewPw1TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 167, 30));

        NewPw2TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPw2TFActionPerformed(evt);
            }
        });
        jPanel1.add(NewPw2TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 167, 30));

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

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

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

    private void NICTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NICTFActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_NICTFActionPerformed

    private void ResteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResteBtnActionPerformed
        // TODO add your handling code here:
        clearField();
    }//GEN-LAST:event_ResteBtnActionPerformed
    
    public void clearField(){
        NewUserTF.setText("");
        NICTF.setText("");
        TeleTF.setText("");
        WorkIDTF.setText("");
        NewPw1TF.setText("");
        NewPw2TF.setText("");
    }
    
    private void OKBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKBtnActionPerformed

        InsertController.InsertCashier(NewUserTF.getText(), NICTF.getText(), TeleTF.getText(), WorkIDTF.getText(), NewPw1TF.getText(), NewPw2TF.getText());
        CashierLogin log = new CashierLogin();
        log.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_OKBtnActionPerformed

    private void CanelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CanelBtnActionPerformed
        // TODO add your handling code here:
        CashierLogin cancel = new CashierLogin();
        cancel.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_CanelBtnActionPerformed

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
       // ColorChange(CloseBtn, new Color(0,51,255));
    }//GEN-LAST:event_CloseBtnMouseExited

    private void NewPw2TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPw2TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewPw2TFActionPerformed

    private void WorkIDTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkIDTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WorkIDTFActionPerformed

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
            java.util.logging.Logger.getLogger(AddCashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCashier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CanelBtn;
    private javax.swing.JLabel CloseBtn;
    private javax.swing.JLabel MinBtn;
    private javax.swing.JTextField NICTF;
    private javax.swing.JPasswordField NewPw1TF;
    private javax.swing.JPasswordField NewPw2TF;
    private javax.swing.JTextField NewUserTF;
    private javax.swing.JButton OKBtn;
    private javax.swing.JButton ResteBtn;
    private javax.swing.JTextField TeleTF;
    private javax.swing.JTextField WorkIDTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
