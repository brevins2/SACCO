/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sacco;

import java.io.*;
//import java.util.Date;
import java.sql.Date;

/**
 *
 * @author brevin
 */

public class Admin implements Serializable {
    
    private String AdminNo;
    private String name;
    private String Location;
    private String Role;
    private String password;
    private Date DEO; // date data type

    public Admin(String AdminNo, String name, String Location, String Role, String password, Date DEO) {
        this.AdminNo = AdminNo;
        this.name = name;
        this.Location = Location;
        this.Role = Role;
        this.password = password;
        this.DEO = DEO;
    }
    
    public String getAdminNo() {
        return AdminNo;
    }

    public void setAdminNo(String AdminNo) {
        this.AdminNo = AdminNo;
    }
    
    public boolean equals(Admin Admin){
        return this.Role.equals(Admin.Role);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDEO() {
        return DEO;
    }

    public void setDate_of_entrance(Date DEO) {
        this.DEO = DEO;
    }    
}