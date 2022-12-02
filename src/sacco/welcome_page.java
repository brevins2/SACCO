/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sacco;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author brevin
 */
public class welcome_page extends javax.swing.JFrame {

    /**
     * Creates new form welcome_page
     */
    public welcome_page() {
        initComponents();
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
//        Toolkit toolkit = getToolkit();
//        Dimension size = toolkit.getScreenSize();
//        setLocation(size.width/2 - getWidth()/2, size.height/2-getHeight()/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        admin_table = new javax.swing.JButton();
        loan_table = new javax.swing.JButton();
        client_table = new javax.swing.JButton();
        role_table = new javax.swing.JButton();
        main_menu = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        exit = new javax.swing.JMenuItem();
        settings = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();
        edit_admin = new javax.swing.JMenuItem();
        edit_customers = new javax.swing.JMenuItem();
        edit_role = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        Add = new javax.swing.JMenu();
        add_customer = new javax.swing.JMenuItem();
        add_admin = new javax.swing.JMenuItem();
        add_role = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        table_of_contents = new javax.swing.JMenu();
        show_table = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        refresh_table = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("welcome to Cash Money SACCO");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(0);
        setSize(new java.awt.Dimension(1, 1));

        Desktop.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 839, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        admin_table.setText("Admin");
        admin_table.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        admin_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_tableActionPerformed(evt);
            }
        });

        loan_table.setText("Loans");
        loan_table.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loan_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loan_tableActionPerformed(evt);
            }
        });

        client_table.setText("Clients");
        client_table.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        client_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                client_tableActionPerformed(evt);
            }
        });

        role_table.setText("Roles");
        role_table.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        role_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                role_tableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(client_table, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(loan_table, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(admin_table, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(role_table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(admin_table, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loan_table, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(client_table, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(role_table, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        File.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sacco/images/folder.png"))); // NOI18N
        File.setText("File");

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sacco/images/Pics/exit.png"))); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        File.add(exit);

        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sacco/images/Pics/job.png"))); // NOI18N
        settings.setText("Settings");
        File.add(settings);

        main_menu.add(File);

        Edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sacco/images/Pics/edit.png"))); // NOI18N
        Edit.setText("Edit");

        edit_admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sacco/images/Pics/edit.png"))); // NOI18N
        edit_admin.setText("Edit Admin");
        edit_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_adminActionPerformed(evt);
            }
        });
        Edit.add(edit_admin);

        edit_customers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sacco/images/Pics/edit.png"))); // NOI18N
        edit_customers.setText("Edit Customer");
        edit_customers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_customersActionPerformed(evt);
            }
        });
        Edit.add(edit_customers);

        edit_role.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sacco/images/Pics/edit.png"))); // NOI18N
        edit_role.setText("Edit Role");
        edit_role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_roleActionPerformed(evt);
            }
        });
        Edit.add(edit_role);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sacco/images/Pics/edit.png"))); // NOI18N
        jMenuItem3.setText("Clear Loan");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        Edit.add(jMenuItem3);

        main_menu.add(Edit);

        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sacco/images/Pics/add.png"))); // NOI18N
        Add.setText("Add");

        add_customer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sacco/images/Pics/addemployee.png"))); // NOI18N
        add_customer.setText("Add Customer");
        add_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_customerActionPerformed(evt);
            }
        });
        Add.add(add_customer);

        add_admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sacco/images/Pics/addemployee.png"))); // NOI18N
        add_admin.setText("Add Administrator");
        add_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_adminActionPerformed(evt);
            }
        });
        Add.add(add_admin);

        add_role.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sacco/images/Pics/add.png"))); // NOI18N
        add_role.setText("Add Role");
        add_role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_roleActionPerformed(evt);
            }
        });
        Add.add(add_role);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sacco/images/Pics/add.png"))); // NOI18N
        jMenuItem2.setText("Add Loan");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Add.add(jMenuItem2);

        main_menu.add(Add);

        table_of_contents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sacco/images/Pics/job.png"))); // NOI18N
        table_of_contents.setText("Table of Contents");

        show_table.setText("Role Table");
        show_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_tableActionPerformed(evt);
            }
        });
        table_of_contents.add(show_table);

        jMenuItem4.setText("Loan Table");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        table_of_contents.add(jMenuItem4);

        jMenuItem5.setText("Client Table");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        table_of_contents.add(jMenuItem5);

        refresh_table.setText("Admin Table");
        refresh_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_tableActionPerformed(evt);
            }
        });
        table_of_contents.add(refresh_table);

        main_menu.add(table_of_contents);

        setJMenuBar(main_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Desktop))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refresh_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_tableActionPerformed

        new admin_table().setVisible(true);

    }//GEN-LAST:event_refresh_tableActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        new client_table().setVisible(true);

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        new loan_table().setVisible(true);

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void show_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_tableActionPerformed

        new role_table().setVisible(true);

    }//GEN-LAST:event_show_tableActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        new Add_Loan().setVisible(true);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void add_roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_roleActionPerformed

        new Role().setVisible(true);

    }//GEN-LAST:event_add_roleActionPerformed

    private void add_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_adminActionPerformed

        new Add_admin().setVisible(true);

    }//GEN-LAST:event_add_adminActionPerformed

    private void add_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_customerActionPerformed

        new login().setVisible(true);
//      new add_Customer().setVisible(true);
    }//GEN-LAST:event_add_customerActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        new Clear_Loan().setVisible(true);

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void edit_roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_roleActionPerformed

        new edit_role().setVisible(true);

    }//GEN-LAST:event_edit_roleActionPerformed

    private void edit_customersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_customersActionPerformed

        new edit_customer().setVisible(true);

    }//GEN-LAST:event_edit_customersActionPerformed

    private void edit_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_adminActionPerformed

        new edit_admin().setVisible(true);

    }//GEN-LAST:event_edit_adminActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed

        System.exit(0);

    }//GEN-LAST:event_exitActionPerformed

    private void admin_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_tableActionPerformed
        
        Desktop.removeAll();
        admin_table_internal table = new admin_table_internal();
        Desktop.add(table).setVisible(true);
        
    }//GEN-LAST:event_admin_tableActionPerformed

    private void loan_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loan_tableActionPerformed
        
        Desktop.removeAll();
        loan_table_internal table = new loan_table_internal();
        Desktop.add(table).setVisible(true);
        
    }//GEN-LAST:event_loan_tableActionPerformed

    private void client_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_client_tableActionPerformed
        
        Desktop.removeAll();
        client_table_internal table = new client_table_internal();
        Desktop.add(table).setVisible(true);
        
    }//GEN-LAST:event_client_tableActionPerformed

    private void role_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_role_tableActionPerformed

        Desktop.removeAll();
        role_table_internal table = new role_table_internal();
        Desktop.add(table).setVisible(true);
        
    }//GEN-LAST:event_role_tableActionPerformed

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
            java.util.logging.Logger.getLogger(welcome_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcome_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcome_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcome_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcome_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Add;
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenu Edit;
    private javax.swing.JMenu File;
    private javax.swing.JMenuItem add_admin;
    private javax.swing.JMenuItem add_customer;
    private javax.swing.JMenuItem add_role;
    private javax.swing.JButton admin_table;
    private javax.swing.JButton client_table;
    private javax.swing.JMenuItem edit_admin;
    private javax.swing.JMenuItem edit_customers;
    private javax.swing.JMenuItem edit_role;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loan_table;
    private javax.swing.JMenuBar main_menu;
    private javax.swing.JMenuItem refresh_table;
    private javax.swing.JButton role_table;
    private javax.swing.JMenuItem settings;
    private javax.swing.JMenuItem show_table;
    private javax.swing.JMenu table_of_contents;
    // End of variables declaration//GEN-END:variables
}