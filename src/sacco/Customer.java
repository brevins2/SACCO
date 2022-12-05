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
    
    private String CUSTNo;
    private String Name;
    private String Location;
    private String Amount;
    private String Duration;
    private String Date_of_entrance;

    public Customer(String CUSTNo, String Name, String Location, String Amount, String Duration, String Date_of_entrance) {
        this.CUSTNo = CUSTNo;
        this.Name = Name;
        this.Location = Location;
        this.Amount = Amount;
        this.Duration = Duration;
        this.Date_of_entrance = Date_of_entrance;
    }

    public String getCustNo() {
        return CUSTNo;
    }

    public void setCustNo(String CustNo) {
        this.CUSTNo = CustNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        this.Location = location;
    }

    public String getAmount_due() {
        return Amount;
    }

    public void setAmount_due(String amount_due) {
        this.Amount = amount_due;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        this.Duration = duration;
    }

    public String getDate_of_entrance() {
        return Date_of_entrance;
    }

    public void setDate_of_entry(String date_of_entrance) {
        this.Date_of_entrance = date_of_entrance;
    }   
}
