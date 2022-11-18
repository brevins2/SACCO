/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sacco;

import java.io.*;
import java.util.Date;

/**
 *
 * @author brevin
 */

public class Admin implements Serializable {
    
    private String name;
    private String Location;
    private Roles Role;
    private String password;
    private String Date_of_entrance;

    public Admin(String name, String Location, Roles Role, String password, String Date_of_entrance) {
        this.name = name;
        this.Location = Location;
        this.Role = Role;
        this.password = password;
        this.Date_of_entrance = Date_of_entrance;
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

    public Roles getRole() {
        return Role;
    }

    public void setRole(Roles Role) {
        this.Role = Role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDate_of_entrance() {
        return Date_of_entrance;
    }

    public void setDate_of_entrance(String Date_of_entrance) {
        this.Date_of_entrance = Date_of_entrance;
    }    
}