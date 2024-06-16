
package View;

import Controller.ChangeController;

public class ResetPWCashier extends javax.swing.JFrame {

    public ResetPWCashier() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Resetpw1TF = new javax.swing.JPasswordField();
        Resetpw2TF = new javax.swing.JPasswordField();
        OKBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        WorkIDTF = new javax.swing.JTextField();
        MinBtn = new javax.swing.JLabel();
        CloseBtn = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter New Password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 130, 30));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Reset Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 330, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 340, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Confirm New password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 150, 30));

        Resetpw1TF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Resetpw1TF.setForeground(new java.awt.Color(0, 0, 255));
        Resetpw1TF.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.add(Resetpw1TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 270, 30));

        Resetpw2TF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Resetpw2TF.setForeground(new java.awt.Color(0, 0, 255));
        Resetpw2TF.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.add(Resetpw2TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 270, 30));

        OKBtn.setBackground(new java.awt.Color(255, 255, 255));
        OKBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        OKBtn.setText("Ok");
        OKBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        OKBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKBtnActionPerformed(evt);
            }
        });
        jPanel1.add(OKBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 100, 40));

        BackBtn.setBackground(new java.awt.Color(255, 255, 255));
        BackBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 100, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter Work ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 160, 30));

        WorkIDTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        WorkIDTF.setForeground(new java.awt.Color(0, 0, 255));
        WorkIDTF.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        WorkIDTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkIDTFActionPerformed(evt);
            }
        });
        jPanel1.add(WorkIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 270, 30));

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

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/2.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OKBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKBtnActionPerformed
        // TODO add your handling code here:
        ChangeController.CasierReset(WorkIDTF.getText(), Resetpw1TF.getText(), Resetpw2TF.getText());
        WorkIDTF.setText("");
        Resetpw1TF.setText("");
        Resetpw2TF.setText("");
    }//GEN-LAST:event_OKBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        super.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    private void WorkIDTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkIDTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WorkIDTFActionPerformed

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
            java.util.logging.Logger.getLogger(ResetPWCashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResetPWCashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResetPWCashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResetPWCashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResetPWCashier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel CloseBtn;
    private javax.swing.JLabel MinBtn;
    private javax.swing.JButton OKBtn;
    private javax.swing.JPasswordField Resetpw1TF;
    private javax.swing.JPasswordField Resetpw2TF;
    private javax.swing.JTextField WorkIDTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
