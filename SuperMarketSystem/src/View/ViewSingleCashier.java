
package View;


public class ViewSingleCashier extends javax.swing.JFrame {

   
    public ViewSingleCashier() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CashNameTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CashNICTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ContactTF = new javax.swing.JTextField();
        BackBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        MinBtn = new javax.swing.JLabel();
        CloseBtn = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cashier Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 106, 20));

        CashNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashNameTFActionPerformed(evt);
            }
        });
        jPanel1.add(CashNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 233, 30));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cashier NIC");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 106, 20));

        CashNICTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashNICTFActionPerformed(evt);
            }
        });
        jPanel1.add(CashNICTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 233, 30));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contact No ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 130, 20));
        jPanel1.add(ContactTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 233, 30));

        BackBtn.setBackground(new java.awt.Color(255, 255, 255));
        BackBtn.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        BackBtn.setText("Back");
        BackBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 64, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cashier Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 360, 70));

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

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

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

    private void CashNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CashNameTFActionPerformed

    private void CashNICTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashNICTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CashNICTFActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        AdminMenu back = new AdminMenu();
        back.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ViewSingleCashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSingleCashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSingleCashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSingleCashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSingleCashier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    public javax.swing.JTextField CashNICTF;
    public javax.swing.JTextField CashNameTF;
    private javax.swing.JLabel CloseBtn;
    public javax.swing.JTextField ContactTF;
    private javax.swing.JLabel MinBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
