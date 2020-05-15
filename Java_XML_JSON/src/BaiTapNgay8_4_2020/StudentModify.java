/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapNgay8_4_2020;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
public class StudentModify {

    public static List<Student> showAll() {
        List<Student> list = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysinhvien?serverTimezone=UTC", "root", "");
            String sql = "Select * from sinhvien";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);  //lay du lieu tra ve
            
            while (resultSet.next()) {
                Student st = new Student(resultSet.getInt("id"),
                        resultSet.getString("fullname"),
                        resultSet.getString("gender"),
                        resultSet.getString("email"),
                        resultSet.getString("address"));
                list.add(st);
            }
                 
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return list;
    }

    public static void update(Student st) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysinhvien?serverTimezone=UTC", "root", "");

            String sql = "update sinhvien set  fullname=?,gender=?,email=?,address=? where id = ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, st.getFullname());
            statement.setString(2, st.getGender());
            statement.setString(3, st.getEmail());
            statement.setString(4, st.getAddress());
            statement.setInt(5, st.getId());
            
            statement.execute();            // insert du lieu vaof database
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public static void insert(Student st) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysinhvien?serverTimezone=UTC", "root", "");

            String sql = "insert into sinhvien(id,fullname,gender,email,address) values (?,?,?,?,?)";
            statement = connection.prepareCall(sql);
            statement.setInt(1, st.getId());
            statement.setString(2, st.getFullname());
            statement.setString(3, st.getGender());
            statement.setString(4, st.getEmail());
            statement.setString(5, st.getAddress()); 
            
            statement.execute();            // insert du lieu vao database
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
  
        
}
