/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sacco;

import java.io.*;
import javax.swing.JTextField;

/**
 *
 * @author brevin
 */
public class Roles implements Serializable {
//
//    static Object parseRoles(JTextField role) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
    private String Role;
    private String Salary;

    public Roles(String Role, String Salary) {
        this.Role = Role;
        this.Salary = Salary;
    }

    public String getRole() {
        return Role;
    }

    public String getSalary() {
        return Salary;
    }
    
    public void setSalary(String Salary) {
        this.Salary = Salary;
    }
    
    public void setRole(String Role) {
        this.Role = Role;
    }
}
