/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetcatm;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Manage {
    
    public static List<Withdrawal> selectWithdrawal(int acc){
        List<Withdrawal> listwWithdrawals = new ArrayList<>();
        Statement stm = null;
        Connection con = null;
        
        
        try {
            String sql = "SELECT `amounMoneyWithdrawal`, `charge`, `date` FROM `withdrawal` WHERE accountNumber = "+ acc;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm?serverTimezone=UTC", "root", "");
            stm = con.createStatement();
            ResultSet resultSet = stm.executeQuery(sql);
            
            while (resultSet.next()) {

                Withdrawal w = new Withdrawal();
                w.setAmountMoneyWithdrawal(resultSet.getDouble("amounMoneyWithdrawal"));
                w.setCharge(resultSet.getFloat("charge"));
                w.setDate(resultSet.getString("date"));
                listwWithdrawals.add(w);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if (stm!=null) {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
              if (con!=null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
       return listwWithdrawals;
               
    }
    
    public static List<Transfers> selectTransfres(){
        List<Transfers> TransfersList = new ArrayList<>();
        Statement stm = null;
        Connection con = null;
        
        
        try {
            String sql = "SELECT  `nameAccountTransfers`, `accountNumberTransfers`, "
                    + "`bankTransfers`, `amountMoneyTransfers`, `charge`, `date` FROM `transfers`";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm?serverTimezone=UTC", "root", "");
            stm = con.createStatement();
            ResultSet resultSet = stm.executeQuery(sql);
            
            while (resultSet.next()) {
                Transfers transfers = new Transfers();
                transfers.setNameAccountTransfers(resultSet.getString("nameAccountTransfers"));
                transfers.setAccountNumberTransfers(resultSet.getInt("accountNumberTransfers"));
                transfers.setBankTransfers(resultSet.getString("bankTransfers"));
                transfers.setAmountMoneyTransfers(resultSet.getDouble("amountMoneyTransfers"));
                transfers.setCharge(resultSet.getFloat("charge"));
                transfers.setDate(resultSet.getString("date"));
               
                TransfersList.add(transfers);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if (stm!=null) {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
              if (con!=null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
       return TransfersList ;
               
    }
     
     public static List<User> selectUser(){
        List<User> listUser = new ArrayList<>();
        Statement stm = null;
        Connection con = null;
        
        
        try {
            String sql = "SELECT `accountNumber`, `pass` FROM `user`";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm?serverTimezone=UTC", "root", "");
            stm = con.createStatement();
            ResultSet resultSet = stm.executeQuery(sql);
            
            while (resultSet.next()) {

               User user = new User();
               user.setAccountNumber(resultSet.getInt("accountNumber"));
               user.setPass(resultSet.getInt("pass"));
               listUser.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if (stm!=null) {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
              if (con!=null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
       return listUser;
               
    } 
     
      public void updateUser(User us) {
        Connection conn = null;
        Statement statement = null;

        try {
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm?serverTimezone=UTC", "root", "");
            String sql = "UPDATE user SET pass =" + "'" + us.getPass()+ "'";
            System.out.println(sql);

            statement = conn.createStatement();

            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }
      
      public static String accountBalance(int accountNumber){

        String b = null;
        Statement stm = null;
        Connection con = null;
        
        
        try {

            String sql = "SELECT  `surplus` FROM `accountinformation` WHERE accountNumber = " + accountNumber ;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm?serverTimezone=UTC", "root", "");
            stm = con.createStatement();
            ResultSet resultSet = stm.executeQuery(sql);
            
            while (resultSet.next()) {
                b = resultSet.getString("surplus");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if (stm!=null) {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
              if (con!=null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
       return b;
               
    } 
     
      public void updateBalance(String surplus, int accountNumber) {
        Connection conn = null;
        Statement statement = null;

        try {
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm?serverTimezone=UTC", "root", "");
            String sql = "UPDATE accountinformation SET surplus = "  + '"' + surplus +'"'  + " WHERE `accountinformation`.`accountNumber` = "+ accountNumber ;
            System.out.println(sql);
 
            statement = conn.createStatement();

            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }
      
}
