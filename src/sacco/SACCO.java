/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sacco;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author brevin
 */
public class SACCO {

    public static Connection connectsql(){
        try{
            String user = "root";
            String pass = "";
            String connection = "jdbc:mysql://localhost:3306/sacco";
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(connection, pass, user);
            
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("connection established\n");
        
        System.out.print("welcome to cash money sacco");
        
        new first_page().setVisible(true);

    }
    
}
