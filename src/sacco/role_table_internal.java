/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sacco;

import java.awt.HeadlessException;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.text.*;
import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author brevin
 */
public class role_table_internal extends javax.swing.JInternalFrame {

    /**
     * Creates new form role_table_internal
     */
    public role_table_internal() {
        initComponents();
        
        JInternalFrame internal = new JInternalFrame();
        internal.setSize(600, 800);
        show_roles();
    }
    
    public ArrayList<Roles> roleList(){
        ArrayList<Roles> roleList = new ArrayList<>();
        
        try{
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306/sacco?zeroDateTimeBehavior=CONVERT_TO_NULL";
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection(url, user, pass);
            
            String query1 = "select * from role";
            Statement st = conn.createStatement();
            ResultSet rset = st.executeQuery(query1);
            
            Roles role;
            while(rset.next()){
                role = new Roles(rset.getString("ROLENo"), rset.getString("Role"), rset.getString("Salary"));
                roleList.add(role);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return roleList;
    }
    
    public ArrayList<Roles> saveRoleList(){
        ArrayList<Roles> saveRoleList = new ArrayList<>();
        
        try{
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306/sacco?zeroDateTimeBehavior=CONVERT_TO_NULL";
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection(url, user, pass);
            
            String query1 = "INSERT INTO role VALUES(ROLENo, Role, Salary)";
            Statement st = conn.createStatement();
            ResultSet rset = st.executeQuery(query1);
            
            Roles roles;
            while(rset.next()){
                roles = new Roles(rset.getString("ROLENo"), rset.getString("Role"), rset.getString("Salary"));
                saveRoleList.add(roles);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return saveRoleList;
    }
    
    public void show_roles(){
        ArrayList<Roles> list = roleList();
        
        DefaultTableModel model = (DefaultTableModel) jTable_Role.getModel();
        
        Object[] row = new Object[3];
        for(int i=0; i<list.size(); i++){
            row[0] = list.get(i).getROLENo();
            row[1] = list.get(i).getRole();
            row[2] = list.get(i).getSalary();
            
            model.addRow(row);
        }
    }   
    
    public void save_roles(){
        ArrayList<Roles> list = saveRoleList();
        
        DefaultTableModel model = (DefaultTableModel) jTable_Role.getModel();
        
        Object[] row = new Object[3];
        for(int i=0; i<list.size(); i++){
            row[0] = list.get(i).getROLENo();
            row[1] = list.get(i).getRole();
            row[2] = list.get(i).getSalary();
            
            model.addRow(row);
        }
    }
    
    public ArrayList<Roles> roleSearchtList(){
        ArrayList<Roles> roleSearchtList = new ArrayList<>();
        
        try{
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306/sacco?zeroDateTimeBehavior=CONVERT_TO_NULL";
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection(url, user, pass);
            
            String query1 = "select * from role where Role = '"+ input_search.getText()+"'";
            Statement st = conn.createStatement();
            ResultSet rset = st.executeQuery(query1);
            
            Roles roles;
            
            while(rset.next()){
                roles = new Roles(rset.getString("ROLENo"), rset.getString("Role"), rset.getString("Salary"));
                roleSearchtList.add(roles);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return roleSearchtList;
    }
    
    public void show_searched_role(){
        ArrayList<Roles> list = roleSearchtList();
        
        String searches = input_search.getText();
        
        DefaultTableModel model = (DefaultTableModel) jTable_Role.getModel();
        
        Object[] row = new Object[6];
        
        for(int i=0; i<list.size(); i++){
            if(searches.equals(list.get(i).getRole())){
                roleno.setText(list.get(i).getROLENo());
                role.setText(list.get(i).getRole());
                salary.setText(list.get(i).getSalary());
        
                row[0] = list.get(i).getROLENo();
                row[1] = list.get(i).getRole();
                row[2] = list.get(i).getSalary();

//                model.addRow(row);
            }
            else{
                JOptionPane.showMessageDialog(null, "role does not exist");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Role = new javax.swing.JTable();
        view = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        input_search = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        print = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        roleno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        role = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        salary = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Roles Table");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(900, 667));

        jTable_Role.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ROLENo", "Role", "Salary"
            }
        ));
        jTable_Role.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_RoleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Role);

        view.setText("view");
        view.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        clear.setText("clear");
        clear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jLabel7.setText("Search");

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
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

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sacco/images/Pics/edit.png"))); // NOI18N
        update.setText("Update");
        update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        print.setText("Print");
        print.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        jLabel1.setText("ROLENo:");

        roleno.setMinimumSize(new java.awt.Dimension(118, 34));

        jLabel2.setText("Role:");

        jLabel3.setText("Salary:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(198, 198, 198))
                            .addComponent(input_search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(roleno, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                            .addComponent(role)
                            .addComponent(salary))))
                .addContainerGap(358, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(role, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_RoleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_RoleMouseClicked
        
        int row = jTable_Role.getSelectedRow(); // get selected row
        DefaultTableModel model = (DefaultTableModel) jTable_Role.getModel();
        // getValueAt(row index, column index)
        
        roleno.setText(model.getValueAt(row, 0).toString());
        role.setText(model.getValueAt(row, 1).toString());
        salary.setText(model.getValueAt(row, 2).toString());
        
    }//GEN-LAST:event_jTable_RoleMouseClicked

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        
        JOptionPane.showMessageDialog(null, "Details of "+ roleno.getText()+ "\n\n\n"+
                "RoleNo:   "+ roleno.getText() + "\n\n"+
                "Role:     "+ role.getText()+ "\n\n"+
                "Salary:   "+ salary.getText());
        
    }//GEN-LAST:event_viewActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        
        roleno.setText("");
        role.setText("");
        salary.setText("");
        
    }//GEN-LAST:event_clearActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        
        try{
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306/sacco?zeroDateTimeBehavior=CONVERT_TO_NULL";
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection(url, user, pass);
            
            if(!roleno.getText().isEmpty()||!role.getText().isEmpty()||!salary.getText().isEmpty()){
                int row = jTable_Role.getSelectedRow();
                String value = (jTable_Role.getModel().getValueAt(row, 0).toString());
                String query1 = "UPDATE role SET ROLENo='"+roleno.getText()+"', Role='"+role.getText()+"', Salary='"+salary.getText()+
                        "'WHERE ROLENo='"+ value+"'";
                PreparedStatement pst = conn.prepareStatement(query1);
                pst.execute();

                DefaultTableModel model = (DefaultTableModel) jTable_Role.getModel();
                model.setRowCount(0);
                show_roles();

                JOptionPane.showMessageDialog(null, "data updated successfully");

                roleno.setText("");
                role.setText("");
                salary.setText("");
                
//                dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "fields empty");
            }
            
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(role_table_internal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_updateActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        show_searched_role();
    }//GEN-LAST:event_searchActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
        try{
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306/sacco?zeroDateTimeBehavior=CONVERT_TO_NULL";
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection(url, user, pass);
            
            int row = jTable_Role.getSelectedRow();
            String value = (jTable_Role.getModel().getValueAt(row, 0).toString());
            String query1 = "DELETE FROM role WHERE ROLENo = '"+value+"'";
            PreparedStatement pst = conn.prepareStatement(query1);
            pst.execute();
            
            DefaultTableModel model = (DefaultTableModel) jTable_Role.getModel();
            model.setRowCount(0);
            show_roles();
            
                JOptionPane.showMessageDialog(null, "data updated successfully");

                roleno.setText("");
                role.setText("");
                salary.setText("");
                
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(client_table_internal.class.getName()).log(Level.SEVERE, null, ex);
        }
//        dispose();
        
    }//GEN-LAST:event_deleteActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        
        MessageFormat yourHeader = new MessageFormat("Report print");
        MessageFormat yourFooter = new MessageFormat("Page{1,number,integer}");
        try
        {
            jTable_Role.print(JTable.PrintMode.NORMAL, yourHeader, yourFooter);
        }
        catch(java.awt.print.PrinterException e){
            System.err.format("Cannot print", e.getMessage());
        }
    }//GEN-LAST:event_printActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JTextField input_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Role;
    private javax.swing.JButton print;
    private javax.swing.JTextField role;
    private javax.swing.JTextField roleno;
    private javax.swing.JTextField salary;
    private javax.swing.JButton search;
    private javax.swing.JButton update;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
