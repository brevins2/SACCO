/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sacco;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author brevin
 */
public class admin_table_internal extends javax.swing.JInternalFrame {

    /**
     * Creates new form admin_table_internal
     */
    public admin_table_internal() {
        initComponents();
        
        show_admins();
    }
    
    public ArrayList<Admin> adminList(){
        ArrayList<Admin> adminList = new ArrayList<>();
        
        try{
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306/sacco";
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection(url, user, pass);
            
            String query1 = "select * from admin";
            Statement st = conn.createStatement();
            ResultSet rset = st.executeQuery(query1);
            
            Admin admin;
            while(rset.next()){
                admin = new Admin(rset.getString("AdminNo"), rset.getString("Name"), 
                        rset.getString("Location"), rset.getString("Role"), 
                        rset.getString("Password"), rset.getString("DEO"));
                adminList.add(admin);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return adminList;
    }
    
    public void show_admins(){
        ArrayList<Admin> list = adminList();
        
        DefaultTableModel model = (DefaultTableModel) jTable_admin.getModel();
        
        Object[] row = new Object[6];
        for(int i=0; i<list.size(); i++){
            row[0] = list.get(i).getAdminNo();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getLocation();
            row[3] = list.get(i).getRole();
            row[4] = list.get(i).getPassword();
            row[5] = list.get(i).getDEO();
            
            model.addRow(row);
        }
    }    
    
    public ArrayList<Admin> adminSearchtList(){
        ArrayList<Admin> adminSearchtList = new ArrayList<>();
        
        try{
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306/sacco";
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection(url, user, pass);
            
            String query1 = "select * from admin where Name = '"+ input_search.getText()+"'";
            Statement st = conn.createStatement();
            ResultSet rset = st.executeQuery(query1);
            
            Admin admins;
            
            if(input_search.getText().equals(query1)){
                while(rset.next()){
                    admins = new Admin(rset.getString("AdminNo"), rset.getString("Name"), rset.getString("Location"), 
                            rset.getString("Role"), rset.getString("Password"), rset.getString("DEO"));
                    adminSearchtList.add(admins);
                }
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return adminSearchtList;
    }
    
    public void show_searched_client(){
        ArrayList<Admin> list = adminSearchtList();
        
        String searches = input_search.getText();
        
        DefaultTableModel model = (DefaultTableModel) jTable_admin.getModel();
        
        Object[] row = new Object[6];
        for(int i=0; i<list.size(); i++){
            if(searches.equals(list.get(i).getName())){
                adminno.setText("");
                name.setText("");
                location.setText("");
                role.setText("");
                password.setText("");
                deo.setText("");

                row[0] = list.get(i).getAdminNo();
                row[1] = list.get(i).getName();
                row[2] = list.get(i).getLocation();
                row[3] = list.get(i).getRole();
                row[4] = list.get(i).getPassword();
                row[5] = list.get(i).getDEO();

                model.addRow(row);
            }
            else{
                JOptionPane.showMessageDialog(null, "Admin does not exist");
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_admin = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        adminno = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        location = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        deo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        role = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        input_search = new javax.swing.JTextField();
        search = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Administration Table");

        jTable_admin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AdminNo", "Name", "Location", "Roles", "Password", "DEO"
            }
        ));
        jTable_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_adminMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_admin);

        jButton1.setText("view");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setText("AdminNo:");

        jLabel2.setText("Name:");

        jLabel3.setText("Location:");

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sacco/images/Pics/edit.png"))); // NOI18N
        update.setText("Update");
        update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sacco/images/Pics/exit.png"))); // NOI18N
        delete.setText("delete");
        delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel4.setText("DEO");

        jLabel5.setText("Password");

        jLabel6.setText("Role:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password)
                            .addComponent(deo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adminno, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(location, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(role, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 116, Short.MAX_VALUE)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(role, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(deo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton2.setText("clear");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Search");

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(524, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(198, 198, 198))
                            .addComponent(input_search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(110, 110, 110)))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                    .addGap(367, 367, 367)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        JOptionPane.showMessageDialog(null, "Details of "+ adminno.getText()+ "\n\n\n"+
            "AdminNo:     "+ adminno.getText() + "\n\n"+
            "Name:        "+ name.getText()+ "\n\n"+
            "Location:    "+ location.getText()+ "\n\n"+
            "Role:        "+ role.getText() + "\n\n"+
            "Password:    "+ password.getText()+ "\n\n"+
            "DEO:         "+ deo.getText() );

    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
        try{
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306/sacco";
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection(url, user, pass);
            
            int row = jTable_admin.getSelectedRow();
            String value = (jTable_admin.getModel().getValueAt(row, 0).toString());
            String query1 = "DELETE FROM admin WHERE AdminNo = '"+value+"'";
            PreparedStatement pst = conn.prepareStatement(query1);
            pst.execute();
            
            DefaultTableModel model = (DefaultTableModel) jTable_admin.getModel();
            model.setRowCount(0);
            show_admins();
            
                JOptionPane.showMessageDialog(null, "data updated successfully");

                adminno.setText("");
                name.setText("");
                location.setText("");
                role.setText("");
                password.setText("");
                deo.setText("");
            
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(client_table_internal.class.getName()).log(Level.SEVERE, null, ex);
        }
//        dispose();
        
    }//GEN-LAST:event_deleteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        adminno.setText("");
        name.setText("");
        location.setText("");
        role.setText("");
        password.setText("");
        deo.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_adminMouseClicked
        
        int row = jTable_admin.getSelectedRow(); // get selected row
        DefaultTableModel model = (DefaultTableModel) jTable_admin.getModel();
        // getValueAt(row index, column index)
        
        adminno.setText(model.getValueAt(row, 0).toString());
        name.setText(model.getValueAt(row, 1).toString());
        location.setText(model.getValueAt(row, 2).toString());
        role.setText(model.getValueAt(row, 2).toString());
        password.setText(model.getValueAt(row, 2).toString());
        deo.setText(model.getValueAt(row, 2).toString());
        
    }//GEN-LAST:event_jTable_adminMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        
        try{
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306/sacco";
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection(url, user, pass);
            
            int row = jTable_admin.getSelectedRow();
            String value = (jTable_admin.getModel().getValueAt(row, 0).toString());
            String query1 = "UPDATE admin SET AdminNo='"+adminno.getText()+
                    "', Name='"+name.getText()+"', Location='"+location.getText()+
                    "', Role='"+role.getText()+"', Password='"+password.getText()+
                    "', DEO='"+deo.getText()+"' where AdminNo = '"+value+"'";
            PreparedStatement pst = conn.prepareStatement(query1);
            pst.execute();
            
            DefaultTableModel model = (DefaultTableModel) jTable_admin.getModel();
            model.setRowCount(0);
            show_admins();
            
                JOptionPane.showMessageDialog(null, "data updated successfully");

                adminno.setText("");
                name.setText("");
                location.setText("");
                role.setText("");
                password.setText("");
                deo.setText("");
            
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(client_table_internal.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
        
    }//GEN-LAST:event_updateActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        show_searched_client();

    }//GEN-LAST:event_searchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adminno;
    private javax.swing.JButton delete;
    private javax.swing.JTextField deo;
    private javax.swing.JTextField input_search;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_admin;
    private javax.swing.JTextField location;
    private javax.swing.JTextField name;
    private javax.swing.JTextField password;
    private javax.swing.JTextField role;
    private javax.swing.JButton search;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
