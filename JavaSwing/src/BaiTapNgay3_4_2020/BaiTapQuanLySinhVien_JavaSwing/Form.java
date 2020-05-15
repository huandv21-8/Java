/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapNgay3_4_2020.BaiTapQuanLySinhVien_JavaSwing;

import java.awt.Component;
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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Form extends javax.swing.JFrame {

    /**
     * Creates new form Form
     */
    List<Student> list = new ArrayList<>();
    DefaultTableModel defaultTableModel;

    public Form() {
        initComponents();
        defaultTableModel = (DefaultTableModel) jTable1.getModel();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NhapThongTIN = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtFullname = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtGender = new javax.swing.JComboBox();
        save = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        find = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Sinh Viên");

        NhapThongTIN.setBorder(javax.swing.BorderFactory.createTitledBorder("Nhap thong tin vao form"));

        name.setText("FullName");

        gender.setText("Gender");

        phone.setText("Phone");

        email.setText("Email");

        age.setText("Age");

        txtFullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullnameActionPerformed(evt);
            }
        });

        txtGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "female", "male" }));

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        find.setText("Find");

        javax.swing.GroupLayout NhapThongTINLayout = new javax.swing.GroupLayout(NhapThongTIN);
        NhapThongTIN.setLayout(NhapThongTINLayout);
        NhapThongTINLayout.setHorizontalGroup(
            NhapThongTINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NhapThongTINLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(NhapThongTINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(NhapThongTINLayout.createSequentialGroup()
                        .addComponent(save)
                        .addGap(40, 40, 40)
                        .addComponent(reset)
                        .addGap(40, 40, 40)
                        .addComponent(delete)
                        .addGap(40, 40, 40)
                        .addComponent(find))
                    .addGroup(NhapThongTINLayout.createSequentialGroup()
                        .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPhone))
                    .addGroup(NhapThongTINLayout.createSequentialGroup()
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFullname))
                    .addGroup(NhapThongTINLayout.createSequentialGroup()
                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NhapThongTINLayout.createSequentialGroup()
                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAge))
                    .addGroup(NhapThongTINLayout.createSequentialGroup()
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmail)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NhapThongTINLayout.setVerticalGroup(
            NhapThongTINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NhapThongTINLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(NhapThongTINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(name)
                    .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(NhapThongTINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gender)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(NhapThongTINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(age, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(NhapThongTINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(NhapThongTINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phone, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(NhapThongTINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset)
                    .addComponent(delete)
                    .addComponent(find)
                    .addComponent(save))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Full Name", "Gender", "Age", "Email", "Phone"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NhapThongTIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(NhapThongTIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Reset() {
        txtAge.setText("");
        txtEmail.setText("");
        txtFullname.setText("");
        txtGender.setSelectedIndex(0);
        txtPhone.setText("");
        System.out.println("Reset...");
    }
    private void txtFullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullnameActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        Connection conn = null;
        PreparedStatement statement = null;

        Student st = new Student();
        st.setFullname(txtFullname.getText());
        st.setGender((String) txtGender.getSelectedItem());
        st.setAge(Integer.parseInt(txtAge.getText()));
        st.setEmail(txtAge.getText());
        st.setPhone(txtAge.getText());
        try {

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/t1907a?serverTimezone=UTC", "root", "");

            String sql = "insert into student (fullname,gender,age,email,phone)" + "values(?,?,?,?,?)";
            statement = conn.prepareStatement(sql);
            statement.setString(1, st.getFullname());
            statement.setString(2, st.getGender());
            statement.setInt(3, st.getAge());
            statement.setString(4, st.getEmail());
            statement.setString(5, st.getPhone());

            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
      
        displayTable();
        Reset();
    }//GEN-LAST:event_saveActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        Reset();
    }//GEN-LAST:event_resetActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if (txtFullname.getText() == null) {
            Component panel = null;
            JOptionPane.showConfirmDialog(panel, "khong duoc de trong fullname", "About", JOptionPane.INFORMATION_MESSAGE);
        } else {

            Connection connection = null;
            Statement statement = null;
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/t1907a?serverTimezone=UTC", "root", "");
                statement = connection.createStatement();
                String sql = "delete from student where fullname =" + "'" + txtFullname.getText() + "'";
                statement = connection.createStatement();
                statement.executeUpdate(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if (statement != null) {
                    try {
                        statement.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            displayTable();
        }

    }//GEN-LAST:event_deleteActionPerformed

    public void displayTable() {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/t1907a?serverTimezone=UTC", "root", "");
            statement = connection.createStatement();
            String sql = "select * from student";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int age = Integer.parseInt(resultSet.getString("age"));
                Student st = new Student(
                        resultSet.getString("fullname"),
                        resultSet.getString("gender"),
                        resultSet.getString("email"),
                        resultSet.getString("phone"),
                        age);
                list.add(st);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        table();
    }

    public void table() {
        list.stream().forEach((list1) -> {
            defaultTableModel.addRow(new Object[]{
                defaultTableModel.getRowCount() + 1,
                list1.getFullname(),
                list1.getGender(),
                list1.getAge(),
                list1.getEmail(),
                list1.getPhone()
            });
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold> 

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Form().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel NhapThongTIN;
    private javax.swing.JLabel age;
    private javax.swing.JButton delete;
    private javax.swing.JLabel email;
    private javax.swing.JButton find;
    private javax.swing.JLabel gender;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel phone;
    private javax.swing.JButton reset;
    private javax.swing.JButton save;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JComboBox txtGender;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
