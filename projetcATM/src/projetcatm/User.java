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
public class User {

    int accountNumber;
    int pass;
    String accountName;
    String surplus;

    public User() {
    }

    public User(int accountNumber, int pass) {
        this.accountNumber = accountNumber;
        this.pass = pass;
    }

    public User(int pass) {
        this.pass = pass;
    }
    public  User(String  surplus){
        this.surplus = surplus;
    }

    public User(int accountNumber, int pass, String accountName, String surplus) {
        this.accountNumber = accountNumber;
        this.pass = pass;
        this.accountName = accountName;
        this.surplus = surplus;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getSurplus() {
        return surplus;
    }

    public void setSurplus(String surplus) {
        this.surplus = surplus;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "so tai khoan: " + accountNumber + ", pass: " + pass
                + ", ten tai khoan: " + accountName + ", so du: " + surplus;
    }

}
