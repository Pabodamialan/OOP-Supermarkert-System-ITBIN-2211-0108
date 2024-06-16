
package View;

import Controller.InsertController;
import Model.DBConnection;
import Model.DBSearch;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CashierMenu extends javax.swing.JFrame {

    public CashierMenu() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ProcodeTF = new javax.swing.JTextField();
        ProNameTF = new javax.swing.JTextField();
        QuntySP = new javax.swing.JSpinner();
        ProPriceTF = new javax.swing.JTextField();
        TotalTF = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BillTableTD = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Total2TF = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        PayTF = new javax.swing.JTextField();
        BalanceLbl = new javax.swing.JLabel();
        BalanceTF = new javax.swing.JTextField();
        PayMethodCMB = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        PreviewBillBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        LogOutBtn = new javax.swing.JButton();
        MinBtn = new javax.swing.JLabel();
        CloseBtn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        SearchNICTF = new javax.swing.JTextField();
        CustSearchBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CustNameTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        NICTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CustTeleTF = new javax.swing.JTextField();
        CustSubmitBtn = new javax.swing.JButton();
        CustClearBtn = new javax.swing.JButton();
        ViewAllCustBtn = new javax.swing.JButton();
        UpdateCustBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(0, 255, 0));

        jPanel1.setForeground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel13.setText("Product Code");

        jLabel14.setText("Total");

        jLabel15.setText("Quantity");

        jLabel16.setText("Product Name");

        jLabel17.setText("Price");

        ProcodeTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ProcodeTFKeyPressed(evt);
            }
        });

        ProNameTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ProNameTFKeyPressed(evt);
            }
        });

        QuntySP.setValue(1);
        QuntySP.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                QuntySPStateChanged(evt);
            }
        });

        AddBtn.setText("Add");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProcodeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(ProNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(QuntySP, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ProPriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TotalTF, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(ProcodeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TotalTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProPriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(QuntySP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 480, 150));

        BillTableTD.setBorder(new javax.swing.border.MatteBorder(null));
        BillTableTD.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        BillTableTD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Code", "Product Name", "Quntity", "Unit Price", "Total"
            }
        ));
        jScrollPane1.setViewportView(BillTableTD);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 722, 230));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Total");

        jLabel19.setBackground(new java.awt.Color(204, 204, 255));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 102));
        jLabel19.setText("Pay");

        BalanceLbl.setBackground(new java.awt.Color(204, 204, 255));
        BalanceLbl.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        BalanceLbl.setForeground(new java.awt.Color(0, 0, 102));
        BalanceLbl.setText("Balance");

        BalanceTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BalanceTFKeyPressed(evt);
            }
        });

        PayMethodCMB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Card", " " }));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 102));
        jLabel26.setText("Payment Method");

        PreviewBillBtn.setText("Preview Bill");
        PreviewBillBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviewBillBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PreviewBillBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PayMethodCMB, 0, 77, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Total2TF))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BalanceLbl)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PayTF)
                            .addComponent(BalanceTF))))
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Total2TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PayTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BalanceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BalanceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PayMethodCMB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PreviewBillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, 170));

        jPanel4.setBackground(new java.awt.Color(51, 255, 51));
        jPanel4.setForeground(new java.awt.Color(0, 255, 51));

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("pbd Super Market");
        jLabel8.setAlignmentX(0.5F);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 450, 50));

        LogOutBtn.setText("Log Out");
        LogOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(LogOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, 104, -1));

        MinBtn.setBackground(new java.awt.Color(0, 0, 0));
        MinBtn.setForeground(new java.awt.Color(255, 102, 0));
        MinBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimize-2.png"))); // NOI18N
        MinBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinBtnMouseClicked(evt);
            }
        });
        jPanel1.add(MinBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 30, 30));

        CloseBtn.setBackground(new java.awt.Color(255, 0, 0));
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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/2.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

        jLabel9.setBackground(new java.awt.Color(0, 204, 51));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N
        jLabel9.setText("BG");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

        jTabbedPane1.addTab("Bill", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("Search Customer NIC");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 160, 30));
        jPanel2.add(SearchNICTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 180, 30));

        CustSearchBtn.setText("Search");
        CustSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustSearchBtnActionPerformed(evt);
            }
        });
        jPanel2.add(CustSearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, -1, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("Add New Customer");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 153, 33));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Name:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 80, 27));

        CustNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustNameTFActionPerformed(evt);
            }
        });
        jPanel2.add(CustNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 180, 200, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("NIC :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 52, 33));
        jPanel2.add(NICTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 230, 200, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Contact:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 90, 26));
        jPanel2.add(CustTeleTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 280, 200, 30));

        CustSubmitBtn.setText("Submit");
        CustSubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustSubmitBtnActionPerformed(evt);
            }
        });
        jPanel2.add(CustSubmitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 80, 30));

        CustClearBtn.setText("Clear");
        CustClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustClearBtnActionPerformed(evt);
            }
        });
        jPanel2.add(CustClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 340, 80, 30));

        ViewAllCustBtn.setText("View all Customers");
        ViewAllCustBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAllCustBtnActionPerformed(evt);
            }
        });
        jPanel2.add(ViewAllCustBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 153, 30));

        UpdateCustBtn.setText("Manage Customer");
        UpdateCustBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateCustBtnActionPerformed(evt);
            }
        });
        jPanel2.add(UpdateCustBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 153, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

        jTabbedPane1.addTab("Customers", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateCustBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateCustBtnActionPerformed
        // TODO add your handling code here:
        ManageCustomer update = new ManageCustomer();
        update.setVisible(true);
    }//GEN-LAST:event_UpdateCustBtnActionPerformed
    
    public void ViewAllCustomers(){
        ResultSet r = new DBSearch().searchAllCustomers();
        ViewAllCustomers cust2 = new ViewAllCustomers();
        DefaultTableModel dtm = (DefaultTableModel)cust2.ViewAllCustTB.getModel();
        dtm.setRowCount(0);
        try{
            Vector V;
            while (r.next()){
                V = new Vector();
                V.add(r.getString("CustomerName"));
                V.add(r.getString("NIC"));
                V.add(r.getInt("Contact"));
                dtm.addRow(V);
            }
            DBConnection.closeCon();
        }
        catch (SQLException e){
        }

        cust2.setVisible(true);
        super.dispose();

    } 

    private void ViewAllCustBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAllCustBtnActionPerformed
        ViewAllCustomers();
        

    }//GEN-LAST:event_ViewAllCustBtnActionPerformed

    private void CustClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustClearBtnActionPerformed
        // TODO add your handling code here:
        CustNameTF.setText("");
        NICTF.setText("");
        CustTeleTF.setText("");
    }//GEN-LAST:event_CustClearBtnActionPerformed

    private void CustSubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustSubmitBtnActionPerformed
        // TODO add your handling code here:
        InsertController.InsertCustomer(CustNameTF.getText(), NICTF.getText(), CustTeleTF.getText());
        CustNameTF.setText("");
        NICTF.setText("");
        CustTeleTF.setText("");
    }//GEN-LAST:event_CustSubmitBtnActionPerformed

    private void CustNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustNameTFActionPerformed

    private void CustSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustSearchBtnActionPerformed
        // TODO add your handling code here:
        ResultSet rs = new DBSearch().searchCustomer(SearchNICTF.getText());

        try {
            if(rs.next() == false){
                JOptionPane.showMessageDialog(this,"Customer Doesn't Exist");
            }
            else{
                ViewSingleCustomer cust = new ViewSingleCustomer();
                cust.CustNameTF.setText(rs.getString("CustomerName"));
                cust.CustNameTF.setEditable(false);
                cust.CustNICTF.setText(rs.getString("NIC"));
                cust.CustNICTF.setEditable(false);
                cust.ContactTF.setText(String.valueOf(rs.getInt("Contact")));
                cust.ContactTF.setEditable(false);
                cust.setVisible(true);
                super.dispose();
            }
        }
        catch (SQLException ex) {
        }

    }//GEN-LAST:event_CustSearchBtnActionPerformed

    private void LogOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBtnActionPerformed
        // TODO add your handling code here:
        CashierLogin logout = new CashierLogin();
        logout.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_LogOutBtnActionPerformed

    private void PreviewBillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviewBillBtnActionPerformed
        // TODO add your handling code here:
        ViewBill view = new ViewBill();

        DefaultTableModel tbl = (DefaultTableModel)BillTableTD.getModel();
        view.BillTA.setText(view.BillTA.getText()+"==========================================================\n");
        view.BillTA.setText(view.BillTA.getText()+"---------------------------------Fernando's SuperMarket-----------------------------------\n");
        view.BillTA.setText(view.BillTA.getText()+"==========================================================\n");
        view.BillTA.setText(view.BillTA.getText()+"No"+"\t"+"Product"+"\t"+"Quantity"+"\t"+"Unit Price"+"\t"+"Total\n\n");

        for(int p = 0;p<BillTableTD.getRowCount(); p++){
            String PName = BillTableTD.getValueAt(p, 1).toString();
            int Qty = Integer.parseInt((String) BillTableTD.getValueAt(p, 2));
            String Uprice = BillTableTD.getValueAt(p, 3).toString();
            String Tprice = BillTableTD.getValueAt(p, 4).toString();
            view.BillTA.setText(view.BillTA.getText()+(p+1)+"\t"+PName+"\t"+Qty+"\t"+Uprice+"\t"+Tprice+"\n");
        }
        view.BillTA.setText(view.BillTA.getText()+"==========================================================\n");

        double Total = Double.parseDouble(Total2TF.getText());
        double Payment = Double.parseDouble(PayTF.getText());
        double Balance = Double.parseDouble(BalanceTF.getText());
        String PMethod = PayMethodCMB.getSelectedItem().toString();

        view.BillTA.setText(view.BillTA.getText()+"Total"+"\t\t\t\t"+Total+"\n");
        view.BillTA.setText(view.BillTA.getText()+"Pay"+"\t\t"+PMethod+"\t\t"+Payment+ "\n");
        view.BillTA.setText(view.BillTA.getText()+"Balance"+"\t\t\t\t"+Balance+"\n");
        view.BillTA.setText(view.BillTA.getText()+"==========================================================\n");
        view.BillTA.setText(view.BillTA.getText()+"\t\tTHANK YOU!\t\t\n");
        view.BillTA.setText(view.BillTA.getText()+"\t\tCOME AGAIN\t\t\n");
        view.BillTA.setText(view.BillTA.getText()+"==========================================================\n");

        view.BillTA.setEditable(false);
        view.setVisible(true);

    }//GEN-LAST:event_PreviewBillBtnActionPerformed

    private void BalanceTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BalanceTFKeyPressed
        // TODO add your handling code here:
        double Total = Double.parseDouble(Total2TF.getText());
        double Pay = Double.parseDouble(PayTF.getText());
        double Balance = Pay - Total;
        BalanceTF.setText(String.valueOf(Balance));
    }//GEN-LAST:event_BalanceTFKeyPressed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tb = (DefaultTableModel)BillTableTD.getModel();
        int RowIndex = BillTableTD.getSelectedRow();
        if(RowIndex>=0){
            tb.removeRow(BillTableTD.getSelectedRow());
            sum=0;
            for(int p = 0;p<BillTableTD.getRowCount(); p++){

                sum = sum + Double.parseDouble(BillTableTD.getValueAt(p, 4).toString());
            }
            Total2TF.setText(Double.toString(sum));
        }
        else{
            JOptionPane.showMessageDialog(this,"Select a row ");
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tb = (DefaultTableModel)BillTableTD.getModel();
        tb.setRowCount(0);
        ProcodeTF.setText("");
        ProNameTF.setText("");
        QuntySP.setValue(1);
        ProPriceTF.setText("");
        TotalTF.setText("");
        Total2TF.setText("");
        BalanceTF.setText("");
        PayTF.setText("");
        sum=0;
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)BillTableTD.getModel();
        if(ProcodeTF.getText().length()==0){
            JOptionPane.showMessageDialog(this,"Please Enter a product");
        }
        else{
            dtm.addRow(new Object[]{
                ProcodeTF.getText(),
                ProNameTF.getText(),
                QuntySP.getValue().toString(),
                ProPriceTF.getText(),
                TotalTF.getText()
            });
        }
        sum=0;
        for(int p = 0;p<BillTableTD.getRowCount(); p++){

            sum = sum + Double.parseDouble(BillTableTD.getValueAt(p, 4).toString());
        }
        Total2TF.setText(Double.toString(sum));
    }//GEN-LAST:event_AddBtnActionPerformed

    private void QuntySPStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_QuntySPStateChanged
        // TODO add your handling code here:
        double Qty =Double.parseDouble(QuntySP.getValue().toString());
        double prc =Double.parseDouble(ProPriceTF.getText());

        double total = Qty*prc;

        TotalTF.setText(String.valueOf(total));
        //Total2TF.setText(String.valueOf(total));
    }//GEN-LAST:event_QuntySPStateChanged

    private void ProcodeTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProcodeTFKeyPressed
        // TODO add your handling code here:
                if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String pcode = ProcodeTF.getText();
            try {

                String pname = null; 
                double price; 

                ResultSet rs = new DBSearch().searchBill(pcode);

                if(rs.next() == false){
                    JOptionPane.showMessageDialog(this,"Product Code Note Found");
                }
                else{

                    pname = rs.getString("ProductName"); //assign database login name to the variable
                    price = rs.getDouble("RetailPrice");//assign database password to the variable

                    ProNameTF.setText(pname);
                    ProPriceTF.setText(String.valueOf(price));
                    TotalTF.setText(String.valueOf(price));
                }

                DBConnection.closeCon();
            }
            catch (SQLException ex) {
            }
        }

    }//GEN-LAST:event_ProcodeTFKeyPressed

    private void ProNameTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProNameTFKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        String pname = ProNameTF.getText();
            try {

                String pcode = null; // initial value of the username
                double price; // initial value of the password

                ResultSet rs = new DBSearch().searchBillName(pname);

                if(rs.next() == false){

                    JOptionPane.showMessageDialog(this,"Product Note Found");
                }
                else{

                    pcode = rs.getString("ProductCode"); 
                    price = rs.getDouble("RetailPrice");
                    ProcodeTF.setText(pcode);
                    ProPriceTF.setText(String.valueOf(price));
                    TotalTF.setText(String.valueOf(price));
                }

                DBConnection.closeCon();
            }
            catch (SQLException ex) {
            }
        }
    }//GEN-LAST:event_ProNameTFKeyPressed

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

    double sum = 0;
        
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
            java.util.logging.Logger.getLogger(CashierMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JLabel BalanceLbl;
    private javax.swing.JTextField BalanceTF;
    public javax.swing.JTable BillTableTD;
    private javax.swing.JLabel CloseBtn;
    private javax.swing.JButton CustClearBtn;
    private javax.swing.JTextField CustNameTF;
    private javax.swing.JButton CustSearchBtn;
    private javax.swing.JButton CustSubmitBtn;
    private javax.swing.JTextField CustTeleTF;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JLabel MinBtn;
    private javax.swing.JTextField NICTF;
    private javax.swing.JComboBox<String> PayMethodCMB;
    private javax.swing.JTextField PayTF;
    private javax.swing.JButton PreviewBillBtn;
    private javax.swing.JTextField ProNameTF;
    private javax.swing.JTextField ProPriceTF;
    private javax.swing.JTextField ProcodeTF;
    private javax.swing.JSpinner QuntySP;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JTextField SearchNICTF;
    private javax.swing.JTextField Total2TF;
    private javax.swing.JTextField TotalTF;
    private javax.swing.JButton UpdateCustBtn;
    private javax.swing.JButton ViewAllCustBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
