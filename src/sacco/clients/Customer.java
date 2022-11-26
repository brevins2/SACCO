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
public class Customer implements Serializable {
    
    private String name;
    private String location;
    private String amount_due;
    private String duration;
    private String date_of_entrance;

    public Customer(String name, String location, String amount_due, String duration, String date_of_entrance) {
        this.name = name;
        this.location = location;
        this.amount_due = amount_due;
        this.duration = duration;
        this.date_of_entrance = date_of_entrance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAmount_due() {
        return amount_due;
    }

    public void setAmount_due(String amount_due) {
        this.amount_due = amount_due;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDate_of_entrance() {
        return date_of_entrance;
    }

    public void setDate_of_entry(String date_of_entrance) {
        this.date_of_entrance = date_of_entrance;
    }   
}
