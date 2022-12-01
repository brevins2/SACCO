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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author brevin
 */
public class client_table_internal extends javax.swing.JInternalFrame {

    /**
     * Creates new form client_table_internal
     */
    public client_table_internal() {
        initComponents();
        
        show_client();
    }
    
    public ArrayList<Customer> clientList(){
        ArrayList<Customer> clientList = new ArrayList<>();
        
        try{
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306/sacco";
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection(url, user, pass);
            
            String query1 = "select * from customer";
            Statement st = conn.createStatement();
            ResultSet rset = st.executeQuery(query1);
            
            Customer clients;
            while(rset.next()){
                clients = new Customer(rset.getString("CUSTNo"), rset.getString("Name"), rset.getString("Location"), 
                        rset.getString("Amount"), rset.getString("Duration"), rset.getString("Date_of_entrance"));
                clientList.add(clients);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return clientList;
    }
    
    public void show_client(){
        ArrayList<Customer> list = clientList();
        
        DefaultTableModel model = (DefaultTableModel) jTable_customer.getModel();
        
        Object[] row = new Object[6];
        for(int i=0; i<list.size(); i++){
            row[0] = list.get(i).getCustNo();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getLocation();
            row[3] = list.get(i).getAmount_due();
            row[4] = list.get(i).getDuration();
            row[5] = list.get(i).getDate_of_entrance();
            
            model.addRow(row);
        }
    }
    
    public ArrayList<Customer> clienSearchtList(){
        ArrayList<Customer> clienSearchtList = new ArrayList<>();
        
        try{
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306/sacco";
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection(url, user, pass);
            
            String query1 = "select * from customer where Name = '"+ input_search.getText()+"'";
            Statement st = conn.createStatement();
            ResultSet rset = st.executeQuery(query1);
            
            Customer clients;
            
            if(input_search.getText().equals(query1)){
                while(rset.next()){
                    clients = new Customer(rset.getString("CUSTNo"), rset.getString("Name"), rset.getString("Location"), 
                            rset.getString("Amount"), rset.getString("Duration"), rset.getString("Date_of_entrance"));
                    clienSearchtList.add(clients);
                }
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return clienSearchtList;
    }
    
    public void show_searched_client(){
        ArrayList<Customer> list = clienSearchtList();
        
        String searches = input_search.getText();
        
        DefaultTableModel model = (DefaultTableModel) jTable_customer.getModel();
        
        Object[] row = new Object[6];
        
        for(int i=0; i<list.size(); i++){
            if(searches.equals(list.get(i).getName())){
                input_no.setText(list.get(i).getCustNo());
                input_name.setText(list.get(i).getName());
                input_location.setText(list.get(i).getLocation());
                input_amount.setText(list.get(i).getAmount_due());
                input_duration.setText(list.get(i).getDuration());
                input_date_of_entrance.setText(list.get(i).getDate_of_entrance());
                
                row[0] = list.get(i).getCustNo();
                row[1] = list.get(i).getName();
                row[2] = list.get(i).getLocation();
                row[3] = list.get(i).getAmount_due();
                row[4] = list.get(i).getDuration();
                row[5] = list.get(i).getDate_of_entrance();

                model.addRow(row);
            }
            else{
                JOptionPane.showMessageDialog(null, "Client does not exist");
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

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_customer = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        input_location = new javax.swing.JTextField();
        input_name = new javax.swing.JTextField();
        input_no = new javax.swing.JTextField();
        input_amount = new javax.swing.JTextField();
        input_duration = new javax.swing.JTextField();
        input_date_of_entrance = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        view = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        input_search = new javax.swing.JTextField();
        search = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Client's Table");

        jTable_customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CUSTNo", "Name", "Location", "Amount", "Duration", "Date_of_entrance"
            }
        ));
        jTable_customer.setMinimumSize(new java.awt.Dimension(45, 0));
        jTable_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_customerMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_customer);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setText("CUSTNo:");

        jLabel2.setText("Name:");

        jLabel3.setText("Location:");

        jLabel4.setText("Amount:");

        jLabel5.setText("Duration:");

        jLabel6.setText("DEO");

        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sacco/images/Pics/edit.png"))); // NOI18N
        save.setText("Update");
        save.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sacco/images/Pics/exit.png"))); // NOI18N
        delete.setText("Delete");
        delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addComponent(input_name, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input_no, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(input_location)
                            .addComponent(input_amount, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(input_duration)
                            .addComponent(input_date_of_entrance))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input_location, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(input_no, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(input_duration, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(input_date_of_entrance, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        clear.setText("clear");
        clear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        view.setText("view");
        view.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(548, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(198, 198, 198))
                            .addComponent(input_search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                    .addGap(337, 337, 337)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed

        JOptionPane.showMessageDialog(null, "Details of "+ input_no.getText()+ "\n\n\n"+
            "CUSTNo:     "+ input_no.getText() + "\n\n"+
            "Name:       "+ input_name.getText()+ "\n\n"+
            "Location:   "+ input_location.getText()+ "\n\n"+
            "Amount:     "+ input_amount.getText() + "\n\n"+
            "Duration:   "+ input_duration.getText() + "\n\n" +
            "DEO:        "+ input_date_of_entrance.getText());
    }//GEN-LAST:event_viewActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        
        try{
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306/sacco";
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection(url, user, pass);
            
            int row = jTable_customer.getSelectedRow();
            String value = (jTable_customer.getModel().getValueAt(row, 0).toString());
            String query1 = "UPDATE customer SET CUSTNo='"+input_no.getText()+
                    "', Name='"+input_name.getText()+"', Location='"+input_location.getText()+
                    "', Amount='"+input_amount.getText()+"', Duration='"+input_duration.getText()+
                    "', Date_of_entrance='"+input_date_of_entrance.getText()+"' where CUSTNo = '"+
                    value+"'";
            PreparedStatement pst = conn.prepareStatement(query1);
            pst.execute();
            
            DefaultTableModel model = (DefaultTableModel) jTable_customer.getModel();
            model.setRowCount(0);
            show_client();
            
                JOptionPane.showMessageDialog(null, "data updated successfully");

                input_no.setText("");
                input_name.setText("");
                input_location.setText("");
                input_amount.setText("");
                input_duration.setText("");
                input_date_of_entrance.setText("");
            
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(client_table_internal.class.getName()).log(Level.SEVERE, null, ex);
        }
//        dispose();        
    }//GEN-LAST:event_saveActionPerformed
    
    private void jTable_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_customerMouseClicked
        
        int row = jTable_customer.getSelectedRow(); // get selected row
        DefaultTableModel model = (DefaultTableModel) jTable_customer.getModel();
        // getValueAt(row index, column index)
        
        input_no.setText(model.getValueAt(row, 0).toString());
        input_name.setText(model.getValueAt(row, 1).toString());
        input_location.setText(model.getValueAt(row, 2).toString());
        input_amount.setText(model.getValueAt(row, 3).toString());
        input_duration.setText(model.getValueAt(row, 4).toString());
        input_date_of_entrance.setText(model.getValueAt(row, 5).toString());
        
    }//GEN-LAST:event_jTable_customerMouseClicked

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        
        input_no.setText("");
        input_name.setText("");
        input_location.setText("");
        input_amount.setText("");
        input_duration.setText("");
        input_date_of_entrance.setText("");
        
    }//GEN-LAST:event_clearActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        show_searched_client();
        
    }//GEN-LAST:event_searchActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
        try{
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306/sacco";
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection(url, user, pass);
            
            int row = jTable_customer.getSelectedRow();
            String value = (jTable_customer.getModel().getValueAt(row, 0).toString());
            String query1 = "DELETE FROM customer WHERE CUSTNo = '"+value+"'";
            PreparedStatement pst = conn.prepareStatement(query1);
            pst.executeUpdate();
            
            DefaultTableModel model = (DefaultTableModel) jTable_customer.getModel();
            model.setRowCount(0);
            show_client();
            
            JOptionPane.showMessageDialog(null, "data deleted successfully");

                input_no.setText("");
                input_name.setText("");
                input_location.setText("");
                input_amount.setText("");
                input_duration.setText("");
                input_date_of_entrance.setText("");
            
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(client_table_internal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_deleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JTextField input_amount;
    private javax.swing.JTextField input_date_of_entrance;
    private javax.swing.JTextField input_duration;
    private javax.swing.JTextField input_location;
    private javax.swing.JTextField input_name;
    private javax.swing.JTextField input_no;
    private javax.swing.JTextField input_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable_customer;
    private javax.swing.JButton save;
    private javax.swing.JButton search;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
