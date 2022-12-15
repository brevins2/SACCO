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
public class loan_table_internal extends javax.swing.JInternalFrame {

    /**
     * Creates new form loan_table_internal
     */
    public loan_table_internal() {
        initComponents();
        
        show_loan();
    }
    
    public ArrayList<Loan> loanList(){
        ArrayList<Loan> loanList = new ArrayList<>();
        
        try{
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306/sacco";
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection(url, user, pass);
            
            String query1 = "select * from loans";
            Statement st = conn.createStatement();
            ResultSet rset = st.executeQuery(query1);
            
            Loan loans;
            while(rset.next()){
                loans = new Loan(rset.getString("LoanNo"), rset.getString("Name"), rset.getString("Amount"), 
                        rset.getString("Mortage"), rset.getString("Duration"), rset.getString("DEO"));
                loanList.add(loans);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return loanList;
    }
    
    public void show_loan(){
        ArrayList<Loan> list = loanList();
        
        DefaultTableModel model = (DefaultTableModel) jTable_loan.getModel();
        
        Object[] row = new Object[6];
        for(int i=0; i<list.size(); i++){
            row[0] = list.get(i).getLoanNo();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getAmount();
            row[3] = list.get(i).getMortage();
            row[4] = list.get(i).getDuration();
            row[5] = list.get(i).getDEO();
            
            model.addRow(row);
        }
    }
    
    public ArrayList<Loan> loanSearchtList(){
        ArrayList<Loan> loanSearchtList = new ArrayList<>();
        
        try{
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306/sacco";
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection(url, user, pass);
            
            String query1 = "select * from loans where Name = '"+ input_search.getText()+"'";
            Statement st = conn.createStatement();
            ResultSet rset = st.executeQuery(query1);
            
            Loan loans;
            
            while(rset.next()){
                loans = new Loan(rset.getString("LoanNo"), rset.getString("Name"), rset.getString("Amount"), 
                        rset.getString("Mortage"), rset.getString("Duration"), rset.getString("DEO"));
                loanSearchtList.add(loans);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return loanSearchtList;
    }
    
    public void show_searched_loan(){
        ArrayList<Loan> list = loanSearchtList();
        
        String searches = input_search.getText();
        
        DefaultTableModel model = (DefaultTableModel) jTable_loan.getModel();

        Object[] row = new Object[6];
        
        for(int i=0; i<list.size(); i++){
            if(searches.equals(list.get(i).getName())){
                loanno.setText(list.get(i).getLoanNo());
                name.setText(list.get(i).getName());
                amount.setText(list.get(i).getAmount());
                mortage.setText(list.get(i).getMortage());
                duration.setText(list.get(i).getDuration());
                deo.setDateFormatString(list.get(i).getDEO());
                
                
                row[0] = list.get(i).getLoanNo();
                row[1] = list.get(i).getName();
                row[2] = list.get(i).getAmount();
                row[3] = list.get(i).getMortage();
                row[4] = list.get(i).getDuration();
                row[5] = list.get(i).getDEO();    
            
//                model.addRow(row);
                
            }
            else {
                JOptionPane.showMessageDialog(null, "loan doesnot exist.");
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

        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_loan = new javax.swing.JTable();
        clear = new javax.swing.JButton();
        view = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        loanno = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        mortage = new javax.swing.JTextField();
        duration = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        print = new javax.swing.JButton();
        deo = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        input_search = new javax.swing.JTextField();
        search = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Loan's Table");

        jTable_loan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LoanNo", "Name", "Amount", "Mortage", "Duration", "DEO"
            }
        ));
        jTable_loan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_loanMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable_loan);

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("LoanNo:");

        jLabel2.setText("Name:");

        jLabel3.setText("Amount:");

        jLabel4.setText("Mortage:");

        jLabel5.setText("Duration:");

        jLabel6.setText("DEO:");

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sacco/images/Pics/edit.png"))); // NOI18N
        update.setText("Update");
        update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
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

        print.setText("Print");
        print.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(mortage, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amount)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loanno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(duration, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loanno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mortage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(deo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

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
                .addContainerGap(554, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(198, 198, 198))
                            .addComponent(input_search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                    .addGap(334, 334, 334)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed

        JOptionPane.showMessageDialog(null, "Details of "+ loanno.getText()+ "\n\n\n"+
            "LoanNo:    "+ loanno.getText() + "\n\n"+
            "Name:      "+ name.getText()+ "\n\n"+
            "Amount:    "+ amount.getText() + "\n\n"+
            "Mortage:   "+ mortage.getText()+ "\n\n"+
            "Duration:  "+ duration.getText() + "\n\n" +
            "DEO:       "+ deo.getDate());
    }//GEN-LAST:event_viewActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        
        try{
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306/sacco";
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection(url, user, pass);
            
            int row = jTable_loan.getSelectedRow();
            String value = (jTable_loan.getModel().getValueAt(row, 0).toString());
            String query1 = "UPDATE loans SET LoanNo='"+loanno.getText()+
                    "', Name='"+name.getText()+"', Amount='"+amount.getText()+
                    "', Mortage='"+mortage.getText()+"', Duration='"+duration.getText()+
                    "', DEO='"+deo.getDate()+"'WHERE LoanNo='"+ value+"'";
            PreparedStatement pst = conn.prepareStatement(query1);
            pst.execute();
            
            DefaultTableModel model = (DefaultTableModel) jTable_loan.getModel();
            model.setRowCount(0);
            show_loan();
            
            JOptionPane.showMessageDialog(null, "data updated successfully");

            loanno.setText("");
            name.setText("");
            mortage.setText("");
            amount.setText("");
            duration.setText("");
            deo.setDateFormatString("");
            
            dispose();
            
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(client_table_internal.class.getName()).log(Level.SEVERE, null, ex);
        }
//        dispose();
        
    }//GEN-LAST:event_updateActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        
        loanno.setText("");
        name.setText("");
        amount.setText("");
        mortage.setText("");
        duration.setText("");
        deo.setDateFormatString("");
        
    }//GEN-LAST:event_clearActionPerformed

    private void jTable_loanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_loanMouseClicked
        
        int row = jTable_loan.getSelectedRow(); // get selected row
        DefaultTableModel model = (DefaultTableModel) jTable_loan.getModel();
        // getValueAt(row index, column index)
        
        loanno.setText(model.getValueAt(row, 0).toString());
        name.setText(model.getValueAt(row, 1).toString());
        amount.setText(model.getValueAt(row, 2).toString());
        mortage.setText(model.getValueAt(row, 3).toString());
        duration.setText(model.getValueAt(row, 4).toString());
        deo.setDateFormatString(model.getValueAt(row, 5).toString());
        
    }//GEN-LAST:event_jTable_loanMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        show_searched_loan();
    }//GEN-LAST:event_searchActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
        try{
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306/sacco";
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection(url, user, pass);
            
            int row = jTable_loan.getSelectedRow();
            String value = (jTable_loan.getModel().getValueAt(row, 0).toString());
            String query1 = "DELETE FROM loans WHERE LoanNo = '"+value+"'";
            PreparedStatement pst = conn.prepareStatement(query1);
            pst.execute();
            
            DefaultTableModel model = (DefaultTableModel) jTable_loan.getModel();
            model.setRowCount(0);
            show_loan();
            
                JOptionPane.showMessageDialog(null, "data updated successfully");

                loanno.setText("");
                name.setText("");
                mortage.setText("");
                amount.setText("");
                duration.setText("");
                deo.setDateFormatString("");
            dispose();
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(client_table_internal.class.getName()).log(Level.SEVERE, null, ex);
        }
//        dispose();
    }//GEN-LAST:event_deleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private com.toedter.calendar.JDateChooser deo;
    private javax.swing.JTextField duration;
    private javax.swing.JTextField input_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable_loan;
    private javax.swing.JTextField loanno;
    private javax.swing.JTextField mortage;
    private javax.swing.JTextField name;
    private javax.swing.JButton print;
    private javax.swing.JButton search;
    private javax.swing.JButton update;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
