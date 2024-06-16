
package View;

import Controller.InsertController;
import Model.DBConnection;
import Model.DBSearch;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import javax.swing.JOptionPane;


public class AdminMenu extends javax.swing.JFrame {

 
    public AdminMenu() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ProNameTF = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        CateNumCMB = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        WSPrice = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        RetailPrice = new javax.swing.JTextField();
        ProSearchBtn = new javax.swing.JButton();
        ProAddBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ProCodeTF = new javax.swing.JTextField();
        ProViewBtn = new javax.swing.JButton();
        SearchCateCMB = new javax.swing.JComboBox<>();
        ManageProductBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        MinBtn = new javax.swing.JLabel();
        CloseBtn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        SupIDTF = new javax.swing.JTextField();
        ViewAllSupBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ComNameTF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        IDTF = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        SupTeleTF = new javax.swing.JTextField();
        SupClearBtn = new javax.swing.JButton();
        SupAddBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        CateCMB = new javax.swing.JComboBox<>();
        SupSearchBtn = new javax.swing.JButton();
        ManageSupBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        CashierSearchBtn = new javax.swing.JButton();
        SearchCashierTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ChangeCPwBtn = new javax.swing.JButton();
        CashierMenuBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Add Product");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 260, 32));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Product Name:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 110, 27));
        jPanel4.add(ProNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 190, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Product Category:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 130, 27));

        CateNumCMB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fruits", "Vegetables", "Groceries", "Beverages", "Dairy Products", "Meat", "Pharmaceuticals", "Baby Products", "Cosmetics", "Detergents", "Stationaries", "Liquer", "Other", "" }));
        jPanel4.add(CateNumCMB, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 190, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Wholesale Price:");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 120, 29));

        WSPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WSPriceActionPerformed(evt);
            }
        });
        jPanel4.add(WSPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 200, 50));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Retail Price:");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 100, 30));

        RetailPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetailPriceActionPerformed(evt);
            }
        });
        jPanel4.add(RetailPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 190, 30));

        ProSearchBtn.setText("Search");
        ProSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProSearchBtnActionPerformed(evt);
            }
        });
        jPanel4.add(ProSearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 90, 30));

        ProAddBtn.setText("Add");
        ProAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProAddBtnActionPerformed(evt);
            }
        });
        jPanel4.add(ProAddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 70, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Product Code: ");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 110, 20));
        jPanel4.add(ProCodeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 190, 30));

        ProViewBtn.setText("View All Products");
        ProViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProViewBtnActionPerformed(evt);
            }
        });
        jPanel4.add(ProViewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 160, 30));

        SearchCateCMB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fruits", "Vegetables", "Groceries", "Beverages", "Dairy Products", "Meat", "Pharmaceuticals", "Baby Products", "Cosmetics", "Detergents", "Stationaries", "Liquer", "Other", " " }));
        jPanel4.add(SearchCateCMB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 160, 30));

        ManageProductBtn.setText("Manage Product");
        ManageProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageProductBtnActionPerformed(evt);
            }
        });
        jPanel4.add(ManageProductBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 160, 30));

        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 110, 30));

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 70, 30));

        MinBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimize-2.png"))); // NOI18N
        MinBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinBtnMouseClicked(evt);
            }
        });
        jPanel4.add(MinBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 30, 30));

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
        jPanel4.add(CloseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 30, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/3.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 470));

        jTabbedPane1.addTab("Products", jPanel4);

        jPanel3.setPreferredSize(new java.awt.Dimension(750, 500));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(SupIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 188, 30));

        ViewAllSupBtn.setText("View all Suppliers");
        ViewAllSupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAllSupBtnActionPerformed(evt);
            }
        });
        jPanel3.add(ViewAllSupBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 190, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 255));
        jLabel9.setText("Add New Supplier");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 153, 33));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("Search Supplier ID :");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 180, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Company Name :");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 110, 27));

        ComNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComNameTFActionPerformed(evt);
            }
        });
        jPanel3.add(ComNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 220, 27));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Supplier ID :");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 110, 33));
        jPanel3.add(IDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 220, 28));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Contact:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 79, 26));
        jPanel3.add(SupTeleTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 220, 30));

        SupClearBtn.setText("Clear");
        jPanel3.add(SupClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 70, 30));

        SupAddBtn.setText("Add");
        SupAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupAddBtnActionPerformed(evt);
            }
        });
        jPanel3.add(SupAddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 70, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Product Category:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 120, 26));

        CateCMB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fruits and Vegetables", "Groceries", "Beverages", "Dairy Products", "Meat", "Pharmaceuticals", "Baby Products", "Cosmetics ", "Detergents", "Stationaries", "Liquer", "Other" }));
        jPanel3.add(CateCMB, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 220, 30));

        SupSearchBtn.setText("Search");
        SupSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupSearchBtnActionPerformed(evt);
            }
        });
        jPanel3.add(SupSearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, -1, 30));

        ManageSupBtn.setText("Manage Supplier");
        ManageSupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageSupBtnActionPerformed(evt);
            }
        });
        jPanel3.add(ManageSupBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 190, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 470));

        jTabbedPane1.addTab("Suppliers", jPanel3);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CashierSearchBtn.setText("Search ");
        CashierSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashierSearchBtnActionPerformed(evt);
            }
        });
        jPanel2.add(CashierSearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, 30));
        jPanel2.add(SearchCashierTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 188, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("Search Cashier");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 120, -1));

        ChangeCPwBtn.setText("Change Cashier Password");
        ChangeCPwBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeCPwBtnActionPerformed(evt);
            }
        });
        jPanel2.add(ChangeCPwBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 188, 30));

        CashierMenuBtn.setText("Cashier Menu");
        CashierMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashierMenuBtnActionPerformed(evt);
            }
        });
        jPanel2.add(CashierMenuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 188, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 470));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cashier", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ComNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComNameTFActionPerformed
    
    }//GEN-LAST:event_ComNameTFActionPerformed

    private void SupAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupAddBtnActionPerformed
        
        String category=CateCMB.getSelectedItem().toString();
        InsertController.InsertSupplier(ComNameTF.getText(),IDTF.getText(), category, SupTeleTF.getText());
        ComNameTF.setText("");
        IDTF.setText("");
        SupTeleTF.setText("");
       
    }//GEN-LAST:event_SupAddBtnActionPerformed

    private void SupSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupSearchBtnActionPerformed
        // TODO add your handling code here: 
        if(SupIDTF.getText().length()==0){
            JOptionPane.showMessageDialog(this," Please enter a supplier ID ");
        }
        else{
            ResultSet rs = new DBSearch().searchSupplier(SupIDTF.getText());
            try { 
                if(rs.next() == false){
                    JOptionPane.showMessageDialog(this," Supplier Doesn't Exist");
                }
                else{
                    ViewSingleSupplier sup1 = new ViewSingleSupplier();
                    sup1.SupNameTF.setText(rs.getString("SupplierName"));
                    sup1.SupNameTF.setEditable(false);
                    sup1.SupIDTF.setText(rs.getString("SupplierID"));
                    sup1.SupIDTF.setEditable(false);
                    sup1.CategoryTF.setText(rs.getString("ProductCategory"));
                    sup1.CategoryTF.setEditable(false);
                    sup1.ContactTF.setText(String.valueOf(rs.getInt("SupplierContact")));
                    sup1.ContactTF.setEditable(false);
                    sup1.setVisible(true);
                    super.dispose();
                }     
            } 
            catch (SQLException ex) {
            }
        }
    }//GEN-LAST:event_SupSearchBtnActionPerformed

    
    private void ProAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProAddBtnActionPerformed
        String category = CateNumCMB.getSelectedItem().toString();
        InsertController.InsertProduct(ProNameTF.getText(), ProCodeTF.getText(), category, WSPrice.getText(), RetailPrice.getText() );
        ProNameTF.setText("");
        ProCodeTF.setText("");
        WSPrice.setText("");
        RetailPrice.setText("");
        
    }//GEN-LAST:event_ProAddBtnActionPerformed
    
    public void ViewAllProducts(){
        ResultSet r= new DBSearch().searchProduct();
        ViewAllProducts pro2 = new ViewAllProducts();
        DefaultTableModel dtm = (DefaultTableModel)pro2.ProViewTB.getModel();
        dtm.setRowCount(0);
         try{
             Vector V;
             while (r.next()){
                 V = new Vector();
                 V.add(r.getString("ProductCode"));
                 V.add(r.getString("ProductName"));
                 V.add(r.getString("Category"));
                 V.add(r.getDouble("WholesalePrice"));
                 V.add(r.getDouble("RetailPrice"));
                 dtm.addRow(V);
             }
             DBConnection.closeCon();
         }
         catch (SQLException e){
         }
        pro2.setVisible(true);
        super.dispose();
    }
      
    private void ProViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProViewBtnActionPerformed
        // TODO add your handling code here:
        ViewAllProducts();

    }//GEN-LAST:event_ProViewBtnActionPerformed

    private void ProSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProSearchBtnActionPerformed
        // TODO add your handling code here:
        String cate = SearchCateCMB.getSelectedItem().toString();
        ResultSet r= new DBSearch().searchCategory(cate);

        ViewProductCategories pro1 = new ViewProductCategories();
        DefaultTableModel dtm = (DefaultTableModel)pro1.ProCateTB.getModel();
        dtm.setRowCount(0);
        try{
            Vector V;
            while (r.next()){
                V = new Vector();
                V.add(r.getString("ProductCode"));
                V.add(r.getString("ProductName"));
                V.add(r.getDouble("WholesalePrice"));
                V.add(r.getDouble("RetailPrice")); 
                dtm.addRow(V);
            }
            DBConnection.closeCon();
        }
        catch (SQLException e){
        }
        pro1.setVisible(true);
        super.dispose();
        
    }//GEN-LAST:event_ProSearchBtnActionPerformed
    
    public void ViewAllSuppliers(){            
        ResultSet r= new DBSearch().searchAllSuppliers();
        ViewAllSuppliers sup2 = new ViewAllSuppliers();
        DefaultTableModel dtm = (DefaultTableModel)sup2.SupViewTable.getModel();
        dtm.setRowCount(0);
         try{
             Vector V;
             while (r.next()){
                 V = new Vector();
                 V.add(r.getString("SupplierName"));
                 V.add(r.getString("SupplierID"));
                 V.add(r.getString("ProductCategory"));
                 V.add(r.getInt("SupplierContact"));
                 dtm.addRow(V);
             }
             DBConnection.closeCon();
         }
         catch (SQLException e){
         }
        sup2.setVisible(true);
        super.dispose();  
    }
       
    private void ViewAllSupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAllSupBtnActionPerformed
        // TODO add your handling code here:
        ViewAllSuppliers();
    }//GEN-LAST:event_ViewAllSupBtnActionPerformed

    private void ChangeCPwBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeCPwBtnActionPerformed
        // TODO add your handling code here:
        ResetPWCashier reset = new ResetPWCashier();
        reset.setVisible(true);
        
    }//GEN-LAST:event_ChangeCPwBtnActionPerformed

    private void CashierSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashierSearchBtnActionPerformed
        // TODO add your handling code here:
        if(SupIDTF.getText().length()==0){
            JOptionPane.showMessageDialog(this," Please enter a work ID ");
        }
        else{
            ResultSet rs = new DBSearch().searchCashier(SearchCashierTF.getText());
            try { 
                if(rs.next() == false){
                    JOptionPane.showMessageDialog(this,"Cashier Doesn't Exist");
                }
                else{
                    ViewSingleCashier cash = new ViewSingleCashier();
                    cash.CashNameTF.setText(rs.getString("Name"));
                    cash.CashNameTF.setEditable(false);
                    cash.CashNICTF.setText(rs.getString("NIC"));
                    cash.CashNICTF.setEditable(false);
                    cash.ContactTF.setText(String.valueOf(rs.getInt("ContactNo")));
                    cash.ContactTF.setEditable(false);
                    cash.setVisible(true);
                    //super.dispose();
                }     
            } 
            catch (SQLException ex) {
            } 
        }
    }//GEN-LAST:event_CashierSearchBtnActionPerformed

    private void CashierMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashierMenuBtnActionPerformed
        // TODO add your handling code here:
        CashierMenu cmenu = new CashierMenu();
        cmenu.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_CashierMenuBtnActionPerformed

    private void ManageProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageProductBtnActionPerformed
        // TODO add your handling code here:
        ManageProduct update = new ManageProduct();
        update.setVisible(true);
    }//GEN-LAST:event_ManageProductBtnActionPerformed

    private void ManageSupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageSupBtnActionPerformed
        // TODO add your handling code here:
        ManageSupplier update = new ManageSupplier();
        update.setVisible(true);
        
    }//GEN-LAST:event_ManageSupBtnActionPerformed

    private void WSPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WSPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WSPriceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdminLogin logout = new AdminLogin();
        logout.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ProNameTF.setText("");
        ProCodeTF.setText("");
        CateNumCMB.setSelectedIndex(0);
        WSPrice.setText("");
        RetailPrice.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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

    private void RetailPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetailPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RetailPriceActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CashierMenuBtn;
    private javax.swing.JButton CashierSearchBtn;
    private javax.swing.JComboBox<String> CateCMB;
    private javax.swing.JComboBox<String> CateNumCMB;
    private javax.swing.JButton ChangeCPwBtn;
    private javax.swing.JLabel CloseBtn;
    private javax.swing.JTextField ComNameTF;
    private javax.swing.JTextField IDTF;
    private javax.swing.JButton ManageProductBtn;
    private javax.swing.JButton ManageSupBtn;
    private javax.swing.JLabel MinBtn;
    private javax.swing.JButton ProAddBtn;
    private javax.swing.JTextField ProCodeTF;
    private javax.swing.JTextField ProNameTF;
    private javax.swing.JButton ProSearchBtn;
    private javax.swing.JButton ProViewBtn;
    private javax.swing.JTextField RetailPrice;
    private javax.swing.JTextField SearchCashierTF;
    private javax.swing.JComboBox<String> SearchCateCMB;
    private javax.swing.JButton SupAddBtn;
    private javax.swing.JButton SupClearBtn;
    private javax.swing.JTextField SupIDTF;
    private javax.swing.JButton SupSearchBtn;
    private javax.swing.JTextField SupTeleTF;
    private javax.swing.JButton ViewAllSupBtn;
    private javax.swing.JTextField WSPrice;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
