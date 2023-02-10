package sacco;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class withdraw extends javax.swing.JInternalFrame {

    public withdraw() {
        initComponents();
        
        CustomerSelect();
    }
    
    public final void CustomerSelect(){    
        
        try{
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306/sacco";
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection(url, user, pass);

            String sql="SELECT * FROM customer";
            Statement pst=conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            jComboBox1.removeAllItems();
            while(rs.next()){
                String customers = rs.getString("Name");
                
                String result = customers;
                
                jComboBox1.addItem(result);
            }
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(edit_role.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        save2 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        input_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        initial_amount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        location = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        save2.setBackground(new java.awt.Color(0, 0, 204));
        save2.setForeground(new java.awt.Color(255, 255, 255));
        save2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sacco/images/Pics/save.png"))); // NOI18N
        save2.setText("Save");
        save2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        save2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save2ActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(255, 0, 0));
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("Reset");
        reset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Withdraw money");

        jLabel2.setText("Name:");

        jLabel5.setText("Initial amount:");

        jLabel4.setText("Customer Name");

        name.setText("Amount:");

        location.setText("Date:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(save2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(location, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(initial_amount, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(input_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 318, Short.MAX_VALUE)
                                        .addComponent(amount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)))))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(initial_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void save2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save2ActionPerformed

        try{
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306/sacco";

            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, user, pass);
            String state = "Withdraw";

            if(!amount.getText().isEmpty() || !date.getText().isEmpty()){
                String query1 = "INSERT INTO transactions(Name, Amount, Date, State) "
                + "VALUES (?,?,?,'"+ state +"')";

                int total = Integer.parseInt(initial_amount.getText()) - Integer.parseInt(amount.getText());
                
                String query2 = "UPDATE customer SET Amount= '"+total+
                        "'WHERE Name= '"+ input_name.getText()+"'";
                PreparedStatement pst = conn.prepareStatement(query1);
                PreparedStatement pst2 = conn.prepareStatement(query2);

                pst.setString(1, input_name.getText());
                pst.setString(2, amount.getText());
                pst.setString(3, date.getText());

                pst.execute();
                pst2.execute();
                
                JOptionPane.showMessageDialog(null, total);

                JOptionPane.showMessageDialog(null, "data inserted successfully");

                input_name.setText("");
                amount.setText("");
                date.setText("");
            }
            else {
                JOptionPane.showMessageDialog(null, "Empty fields");
            }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        dispose();       
    }//GEN-LAST:event_save2ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed

        amount.setText("");
        date.setText("");

    }//GEN-LAST:event_resetActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        try{
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306/sacco";

            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, user, pass);
            String selectedItem = (String) jComboBox1.getSelectedItem();

            String query = "select * from customer where Name = '"+ selectedItem+ "'";

            Statement pst=conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery(query);

            while(rs.next()){
                String names = rs.getString("Name");
                String initial = rs.getString("Amount");

                input_name.setText(names);
                initial_amount.setText(initial);
            }
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(edit_role.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JTextField date;
    private javax.swing.JTextField initial_amount;
    private javax.swing.JTextField input_name;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel location;
    private javax.swing.JLabel name;
    private javax.swing.JButton reset;
    private javax.swing.JButton save2;
    // End of variables declaration//GEN-END:variables
}