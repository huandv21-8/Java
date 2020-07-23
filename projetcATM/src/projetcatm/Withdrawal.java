/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetcatm;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Withdrawal extends User {

    double amountMoneyWithdrawal;
    float charge;
    String date;

    public Withdrawal() {
        
    }

    public Withdrawal(double amountMoneyWithdrawal, float charge, String date) {
        this.amountMoneyWithdrawal = amountMoneyWithdrawal;
        this.charge = charge;
        this.date = date;
    }
    

    public Withdrawal(int accountNumber, double amountMoneyWithdrawal, float charge, String date) {
        this.accountNumber = accountNumber;
        this.amountMoneyWithdrawal = amountMoneyWithdrawal;
        this.charge = charge;
        this.date = date;
    }

    public double getAmountMoneyWithdrawal() {
        return amountMoneyWithdrawal;
    }

    public void setAmountMoneyWithdrawal(double amountMoneyWithdrawal) {
        this.amountMoneyWithdrawal = amountMoneyWithdrawal;
    }

    public float getCharge() {
        return charge;
    }

    public void setCharge(float charge) {
        this.charge = charge;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "so tai khoan: " + accountNumber + ", so tien rut: " + 
                amountMoneyWithdrawal + ", phi: " + charge + "ngay rut: " + date;
    }

}
