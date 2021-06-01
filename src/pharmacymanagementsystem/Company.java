/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Anja
 */
public class Company extends javax.swing.JFrame {

    /**
     * Creates new form Company
     */
    public Company() {
        initComponents();
        GetAllCompanies();
    }

    
     /* Connection with db*/
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tbCompanyAddress = new javax.swing.JTextField();
        tbCompanyId = new javax.swing.JTextField();
        tbCompanyName = new javax.swing.JTextField();
        tbExp = new javax.swing.JTextField();
        btnAddCompany = new javax.swing.JButton();
        btnUpdateCompany = new javax.swing.JButton();
        btnDeleteCompany = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CompanyTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        tbCompanyPhone = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        lblAgents = new javax.swing.JLabel();
        lblMedicines = new javax.swing.JLabel();
        lblSelling = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE COMPANY");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 0));
        jLabel5.setText("ID");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 0));
        jLabel6.setText("NAME");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 0));
        jLabel7.setText("ADDRESS");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 0));
        jLabel8.setText("EXPERIENCE");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 0));
        jLabel9.setText("PHONE");

        tbCompanyAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbCompanyAddress.setForeground(new java.awt.Color(0, 153, 0));

        tbCompanyId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbCompanyId.setForeground(new java.awt.Color(0, 153, 0));

        tbCompanyName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbCompanyName.setForeground(new java.awt.Color(0, 153, 0));

        tbExp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbExp.setForeground(new java.awt.Color(0, 153, 0));

        btnAddCompany.setBackground(new java.awt.Color(51, 204, 0));
        btnAddCompany.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddCompany.setForeground(new java.awt.Color(255, 255, 255));
        btnAddCompany.setText("ADD");
        btnAddCompany.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddCompanyMouseClicked(evt);
            }
        });

        btnUpdateCompany.setBackground(new java.awt.Color(51, 204, 0));
        btnUpdateCompany.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdateCompany.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateCompany.setText("UPDATE");
        btnUpdateCompany.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateCompanyMouseClicked(evt);
            }
        });

        btnDeleteCompany.setBackground(new java.awt.Color(51, 204, 0));
        btnDeleteCompany.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDeleteCompany.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteCompany.setText("DELETE");
        btnDeleteCompany.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteCompanyMouseClicked(evt);
            }
        });

        CompanyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "COMPANY", "ADDRESS", "EXPERIENCE", "PHONE"
            }
        ));
        CompanyTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        CompanyTable.setRowHeight(25);
        CompanyTable.setSelectionBackground(new java.awt.Color(0, 153, 0));
        CompanyTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CompanyTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CompanyTable);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 153, 0));
        jLabel12.setText("COMPANIES LIST");

        tbCompanyPhone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbCompanyPhone.setForeground(new java.awt.Color(0, 153, 0));

        btnClear.setBackground(new java.awt.Color(51, 204, 0));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(btnAddCompany)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateCompany)
                        .addGap(27, 27, 27)
                        .addComponent(btnDeleteCompany)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tbCompanyName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tbCompanyId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(tbCompanyAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(96, 96, 96)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbExp, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbCompanyPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(366, 366, 366))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbCompanyId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(tbCompanyPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tbCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(tbExp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbCompanyAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(70, 70, 70)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblAgents.setBackground(new java.awt.Color(255, 255, 255));
        lblAgents.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAgents.setForeground(new java.awt.Color(255, 255, 255));
        lblAgents.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAgents.setText("AGENTS");
        lblAgents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgentsMouseClicked(evt);
            }
        });

        lblMedicines.setBackground(new java.awt.Color(255, 255, 255));
        lblMedicines.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMedicines.setForeground(new java.awt.Color(255, 255, 255));
        lblMedicines.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMedicines.setText("MEDICINES");
        lblMedicines.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMedicinesMouseClicked(evt);
            }
        });

        lblSelling.setBackground(new java.awt.Color(255, 255, 255));
        lblSelling.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSelling.setForeground(new java.awt.Color(255, 255, 255));
        lblSelling.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSelling.setText("SELLING");
        lblSelling.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSellingMouseClicked(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("X");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSelling)
                            .addComponent(lblMedicines))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAgents)
                        .addGap(35, 35, 35)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(btnExit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(lblAgents, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMedicines, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSelling, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void GetAllCompanies()
    {
        try {
           conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pharmacy","user1","User123!");
           st = conn.createStatement();
           rs = st.executeQuery("Select * from user1.companies");
           CompanyTable.setModel(DbUtils.resultSetToTableModel(rs));      
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    
     /* insert new company */
    private void btnAddCompanyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCompanyMouseClicked

         try {          
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pharmacy","user1","User123!");
            PreparedStatement ps = conn.prepareStatement("insert into companies values(?,?,?,?,?)");
            
            ps.setInt(1, Integer.valueOf(tbCompanyId.getText()));
            ps.setString(2, tbCompanyName.getText());
            ps.setString(3, tbCompanyAddress.getText());
            ps.setInt(4, Integer.valueOf(tbExp.getText()));
            ps.setString(5, tbCompanyPhone.getText());
        
            
            int row =  ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Company Successfully Added!");
            conn.close();
            GetAllCompanies();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }       
    }//GEN-LAST:event_btnAddCompanyMouseClicked

    
      /* clear fields */
    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
         
            tbCompanyId.setText("");
            tbCompanyName.setText("");
            tbCompanyAddress.setText("");
            tbExp.setText("");
            tbCompanyPhone.setText("");
    }//GEN-LAST:event_btnClearMouseClicked

     /* delete existing company */
    private void btnDeleteCompanyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteCompanyMouseClicked
        if (tbCompanyId.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Enter ID of The Company To Be Deleted....");
        }
        else
        {
            try {
                conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pharmacy","user1","User123!");
                String id = tbCompanyId.getText();
                String query = "Delete from user1.companies where id = " + id;
                Statement st = conn.createStatement();
                st.executeUpdate(query);
                
                GetAllCompanies();
                JOptionPane.showMessageDialog(this, "Company Successfully Deleted!");
           
                
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }      
    }//GEN-LAST:event_btnDeleteCompanyMouseClicked

     /* update existing company by click on wanted table row*/
    private void CompanyTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CompanyTableMouseClicked
        
        DefaultTableModel model = (DefaultTableModel)CompanyTable.getModel();
        int myIndex = CompanyTable.getSelectedRow();
        tbCompanyId.setText(model.getValueAt(myIndex, 0).toString());
        tbCompanyName.setText(model.getValueAt(myIndex, 1).toString());
        tbCompanyAddress.setText(model.getValueAt(myIndex, 2).toString());
        tbExp.setText(model.getValueAt(myIndex, 3).toString());
        tbCompanyPhone.setText(model.getValueAt(myIndex, 4).toString());
        
    }//GEN-LAST:event_CompanyTableMouseClicked

    /* update existing company */
    private void btnUpdateCompanyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateCompanyMouseClicked
        if (tbCompanyId.getText().isEmpty() || tbCompanyName.getText().isEmpty() || tbCompanyAddress.getText().isEmpty() || tbExp.getText().isEmpty() || tbCompanyPhone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information about Company");
        }
        else
        {
            try {
                conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pharmacy","user1","User123!");                
                PreparedStatement ps = conn.prepareStatement("update companies set name=?, address=?, companyExp=?, phone=? where id=?");

                ps.setString(1, tbCompanyName.getText());
                ps.setString(2, tbCompanyAddress.getText());
                ps.setInt(3, Integer.valueOf(tbExp.getText()));
                ps.setString(4, tbCompanyPhone.getText());
                ps.setInt(5, Integer.valueOf(tbCompanyId.getText()));
        
               
                ps.executeUpdate();
                
                GetAllCompanies();
                JOptionPane.showMessageDialog(this, "Company Successfully Updated!");
                
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }   
    }//GEN-LAST:event_btnUpdateCompanyMouseClicked

    private void lblAgentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgentsMouseClicked
        new Agents().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblAgentsMouseClicked

    private void lblMedicinesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMedicinesMouseClicked
        new Medicine().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblMedicinesMouseClicked

    private void lblSellingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSellingMouseClicked
       new Selling().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblSellingMouseClicked

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

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
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Company().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CompanyTable;
    private javax.swing.JButton btnAddCompany;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDeleteCompany;
    private javax.swing.JLabel btnExit;
    private javax.swing.JButton btnUpdateCompany;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgents;
    private javax.swing.JLabel lblMedicines;
    private javax.swing.JLabel lblSelling;
    private javax.swing.JTextField tbCompanyAddress;
    private javax.swing.JTextField tbCompanyId;
    private javax.swing.JTextField tbCompanyName;
    private javax.swing.JTextField tbCompanyPhone;
    private javax.swing.JTextField tbExp;
    // End of variables declaration//GEN-END:variables
}
