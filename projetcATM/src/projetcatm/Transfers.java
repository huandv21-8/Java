/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetcatm;

/**
 *
 * @author Admin
 */
public class Transfers extends User{
    String nameAccountTransfers,date,bankTransfers;
    int accountNumberTransfers;
    double amountMoneyTransfers;
    float charge;

    public Transfers() {
    }

    public Transfers(int accountNumber,String nameAccountTransfers, String date, String bankTransfers, int accountNumberTransfers, double amountMoneyTransfers, float charge) {
        this.accountNumber = accountNumber;
        this.nameAccountTransfers = nameAccountTransfers;
        this.date = date;
        this.bankTransfers = bankTransfers;
        this.accountNumberTransfers = accountNumberTransfers;
        this.amountMoneyTransfers = amountMoneyTransfers;
        this.charge = charge;
    }

    public String getNameAccountTransfers() {
        return nameAccountTransfers;
    }

    public void setNameAccountTransfers(String nameAccountTransfers) {
        this.nameAccountTransfers = nameAccountTransfers;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBankTransfers() {
        return bankTransfers;
    }

    public void setBankTransfers(String bankTransfers) {
        this.bankTransfers = bankTransfers;
    }

    public int getAccountNumberTransfers() {
        return accountNumberTransfers;
    }

    public void setAccountNumberTransfers(int accountNumberTransfers) {
        this.accountNumberTransfers = accountNumberTransfers;
    }

    public double getAmountMoneyTransfers() {
        return amountMoneyTransfers;
    }

    public void setAmountMoneyTransfers(double amountMoneyTransfers) {
        this.amountMoneyTransfers = amountMoneyTransfers;
    }

    public float getCharge() {
        return charge;
    }

    public void setCharge(float charge) {
        this.charge = charge;
    }

    @Override
    public String toString() {
        return "so tai khoan: "+ accountNumber+", ten ngan hang can chuyen: "+bankTransfers
                +", ten tai khoan can chuyen: "+nameAccountTransfers+
                ", so tai khoan can chuyen: "+ accountNumberTransfers+", so tien chuyen: "+ amountMoneyTransfers
                + " phi chuyen: "+ charge+ ", ngay chuyen: "+ date;
    }
    
}
