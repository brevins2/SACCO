/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sacco;

import java.io.*;

/**
 *
 * @author brevin
 */
public class Roles implements Serializable {
    
    private int ROLENo;

    public int getROLENo() {
        return ROLENo;
    }

    public void setROLENo(int ROLENo) {
        this.ROLENo = ROLENo;
    }

    public Roles(int ROLENo, String Role, String Salary) {
        this.ROLENo = ROLENo;
        this.Role = Role;
        this.Salary = Salary;
    }
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
