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
public class Loan implements Serializable {
    
    private String LoanNo;
    private String name;
    private String amount;
    private String mortage;
    private String duration;
    private String DEO;

    public Loan(String LoanNo, String name, String amount, String mortage, String duration, String DEO) {
        this.LoanNo = LoanNo;
        this.name = name;
        this.amount = amount;
        this.mortage = mortage;
        this.duration = duration;
        this.DEO = DEO;
    }

    public String getLoanNo() {
        return LoanNo;
    }

    public void setLoanNo(String LoanNo) {
        this.LoanNo = LoanNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getMortage() {
        return mortage;
    }

    public void setMortage(String mortage) {
        this.mortage = mortage;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDEO() {
        return DEO;
    }

    public void setDEO(String DEO) {
        this.DEO = DEO;
    }
}
