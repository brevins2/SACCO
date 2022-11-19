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
public class Loans implements Serializable {
    
    private String customerName;
    private int amount;
    private String mortage;
    private String date;
    private String duration;
    
    public Loans(String customerName, int amount, String mortage, String date, String duration) {
        this.customerName = customerName;
        this.amount = amount;
        this.mortage = mortage;
        this.date = date;
        this.duration = duration;
    }    

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getMortage() {
        return mortage;
    }

    public void setMortage(String mortage) {
        this.mortage = mortage;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
