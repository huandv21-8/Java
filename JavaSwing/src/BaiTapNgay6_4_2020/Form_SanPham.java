    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapNgay6_4_2020;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Form_SanPham extends javax.swing.JFrame {

    List<SanPham> list = new ArrayList<>();
    List<DanhMuc>  list12 = new ArrayList<>();
    DefaultTableModel tableModel;

    /**
     * Creates new form Form_SanPham
     */
    public Form_SanPham() {
        initComponents();
        tableModel = (DefaultTableModel) jTable1.getModel();
        showhanghoa();
    }

    public void showhanghoa() {
        list = SanPhamtModify.findAll();
        list.stream().forEach((list1) -> {
            tableModel.addRow(new Object[]{
                list1.getId_danhmuc(),
                list1.getTenDanhMuc(),
                list1.getId_sanpham(),
                list1.getTenSanPhamString(),
                list1.getGia(),
                list1.getNgayNhap(),
                list1.getNgayban(),
                list1.getNgayHetHan(),
                list1.getMoTa()
            });
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtIDdanhmuc = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtdanhmuc = new javax.swing.JTextField();
        txtTensanpham = new javax.swing.JTextField();
        txtIDsanpham = new javax.swing.JTextField();
        txtgiaban = new javax.swing.JTextField();
        txtmota = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        them = new javax.swing.JButton();
        xoa = new javax.swing.JButton();
        timkiem1 = new javax.swing.JButton();
        txtngayban = new javax.swing.JFormattedTextField();
        txtngayhethan = new javax.swing.JFormattedTextField();
        txtngaynhap = new javax.swing.JFormattedTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thong tin san pham");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nhap thong tin cho san pham"));

        jLabel1.setText("ID danh muc");

        jLabel2.setText("Ten danh muc");

        jLabel3.setText("ID san pham");

        jLabel4.setText("Ten san pham");

        jLabel5.setText("Gia ban");

        jLabel6.setText("Mo ta");

        jLabel7.setText("Ngay ban");

        jLabel8.setText("Ngay nhap");

        jLabel9.setText("Ngay het han");

        txtIDdanhmuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDdanhmucActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID danh muc", "Ten danh muc", "ID san pham", "Ten san pham", "Gia ban", "Ngay nhap", "Ngay ban", "Ngay het han", "mota"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        txtdanhmuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdanhmucActionPerformed(evt);
            }
        });

        txtTensanpham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTensanphamActionPerformed(evt);
            }
        });

        txtIDsanpham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDsanphamActionPerformed(evt);
            }
        });

        txtgiaban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgiabanActionPerformed(evt);
            }
        });

        txtmota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmotaActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Chon chuc nang"));

        them.setText("Them san pham");
        them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themActionPerformed(evt);
            }
        });

        xoa.setText("Xoa san pham");
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });

        timkiem1.setText("Tim kiem san pham");
        timkiem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timkiem1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timkiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(them, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(them)
                .addGap(37, 37, 37)
                .addComponent(xoa)
                .addGap(37, 37, 37)
                .addComponent(timkiem1)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        txtngayban.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-mm-dd"))));
        txtngayban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtngaybanActionPerformed(evt);
            }
        });

        txtngayhethan.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-mm-dd"))));
        txtngayhethan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtngayhethanActionPerformed(evt);
            }
        });

        try {
            txtngaynhap.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtngaynhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtngaynhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIDsanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIDdanhmuc, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTensanpham, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                                    .addComponent(txtmota, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                                    .addComponent(txtgiaban, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                                    .addComponent(txtngayban)
                                    .addComponent(txtngayhethan)
                                    .addComponent(txtngaynhap, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(115, 115, 115)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtdanhmuc, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIDdanhmuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdanhmuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDsanpham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtTensanpham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtgiaban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtngaynhap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtngayban, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtngayhethan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtmota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jMenu11.setText("File");
        jMenuBar2.add(jMenu11);

        jMenu12.setText("Edit");
        jMenuBar2.add(jMenu12);

        jMenu13.setText("Hien thi");

        jMenuItem2.setText("San pham con han su dung");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem2);

        jMenuItem3.setText("San pham het han su dung");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem3);

        jMenuItem4.setText("San pham da ban");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem4);

        jMenuItem5.setText("San pham ton kho");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem5);

        jMenuItem6.setText("San pham ban trong ngay");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem6);

        jMenuItem7.setText("san pham ban trong tuan");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem7);

        jMenuItem8.setText("San pham ban trong thang");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem8);

        jMenuItem9.setText("Cac danh muc");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem9);

        jMenuBar2.add(jMenu13);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed
        int selec = jTable1.getSelectedRow();
        if (selec >= 0) {
            SanPham sp = list.get(selec);
            DanhMuc dm = list.get(selec);
            int op = JOptionPane.showConfirmDialog(this, "ban co muon xoa san pham ???");
            if (op == 0) {
                SanPhamtModify.deletesanpham(sp.getId_sanpham());
                SanPhamtModify.deletedanhmuc(dm.getId_danhmuc());
                showhanghoa();
            }
        }

    }//GEN-LAST:event_xoaActionPerformed

    private void txtmotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmotaActionPerformed

    private void txtgiabanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgiabanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgiabanActionPerformed

    private void txtIDsanphamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDsanphamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDsanphamActionPerformed

    private void txtTensanphamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTensanphamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTensanphamActionPerformed

    private void txtdanhmucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdanhmucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdanhmucActionPerformed

    private void txtIDdanhmucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDdanhmucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDdanhmucActionPerformed

    private void themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themActionPerformed
        int id_danhmuc = Integer.parseInt(txtIDdanhmuc.getText());
        String tendanhuc = txtdanhmuc.getText();
        int id_sanpham = Integer.parseInt(txtIDsanpham.getText());
        String tensanpham = txtTensanpham.getText();
        float gia = Float.parseFloat(txtgiaban.getText());
        String ngaynhap = txtngaynhap.getText();
        String ngayban = txtngayban.getText();
        String hansudung = txtngayhethan.getText();
        String mota = txtmota.getText();

        DanhMuc danhMuc = new DanhMuc(id_danhmuc, tendanhuc);
        SanPhamtModify.insertdanhmuc(danhMuc);

        SanPham sanPham = new SanPham(id_sanpham, gia, tensanpham, ngaynhap, ngayban, hansudung, mota);
        SanPhamtModify.insertsanpham(sanPham, danhMuc);

        showhanghoa();
    }//GEN-LAST:event_themActionPerformed

    private void timkiem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timkiem1ActionPerformed
        String input = JOptionPane.showInputDialog(this, "Nhap ten cua san pham can tim: ");

        if ( input != null && input.length()>0) {
            list = SanPhamtModify.timkiem(input);
            list.stream().forEach((list1) -> {
                tableModel.addRow(new Object[]{
                    list1.getId_danhmuc(),
                    list1.getTenDanhMuc(),
                    list1.getId_sanpham(),
                    list1.getTenSanPhamString(),
                    list1.getGia(),
                    list1.getNgayNhap(),
                    list1.getNgayban(),
                    list1.getNgayHetHan(),
                    list1.getMoTa()
                });
            });
        }else{
            showhanghoa();
        }
    }//GEN-LAST:event_timkiem1ActionPerformed

    private void txtngaybanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtngaybanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtngaybanActionPerformed

    private void txtngayhethanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtngayhethanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtngayhethanActionPerformed

    private void txtngaynhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtngaynhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtngaynhapActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
         list = SanPhamtModify.conhansudung();
        list.stream().forEach((list1) -> {
            tableModel.addRow(new Object[]{
                list1.getId_danhmuc(),
                list1.getTenDanhMuc(),
                list1.getId_sanpham(),
                list1.getTenSanPhamString(),
                list1.getGia(),
                list1.getNgayNhap(),
                list1.getNgayban(),
                list1.getNgayHetHan(),
                list1.getMoTa()
            });
        });
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        list = SanPhamtModify.daban();
        list.stream().forEach((list1) -> {
            tableModel.addRow(new Object[]{
                list1.getId_danhmuc(),
                list1.getTenDanhMuc(),
                list1.getId_sanpham(),
                list1.getTenSanPhamString(),
                list1.getGia(),
                list1.getNgayNhap(),
                list1.getNgayban(),
                list1.getNgayHetHan(),
                list1.getMoTa()
            });
        });
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       
        list = SanPhamtModify.tonkho();
        list.stream().forEach((list1) -> {
            tableModel.addRow(new Object[]{
                list1.getId_danhmuc(),
                list1.getTenDanhMuc(),
                list1.getId_sanpham(),
                list1.getTenSanPhamString(),
                list1.getGia(),
                list1.getNgayNhap(),
                list1.getNgayban(),
                list1.getNgayHetHan(),
                list1.getMoTa()
            });
        });
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
      list = SanPhamtModify.hethansudung();
        list.stream().forEach((list1) -> {
            tableModel.addRow(new Object[]{
                list1.getId_danhmuc(),
                list1.getTenDanhMuc(),
                list1.getId_sanpham(),
                list1.getTenSanPhamString(),
                list1.getGia(),
                list1.getNgayNhap(),
                list1.getNgayban(),
                list1.getNgayHetHan(),
                list1.getMoTa()
            });
        });       
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
       list = SanPhamtModify.bantrongtuan();
        list.stream().forEach((list1) -> {
            tableModel.addRow(new Object[]{
                list1.getId_danhmuc(),
                list1.getTenDanhMuc(),
                list1.getId_sanpham(),
                list1.getTenSanPhamString(),
                list1.getGia(),
                list1.getNgayNhap(),
                list1.getNgayban(),
                list1.getNgayHetHan(),
                list1.getMoTa()
            });
        });      
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       list = SanPhamtModify.bantrongngay();
        list.stream().forEach((list1) -> {
            tableModel.addRow(new Object[]{
                list1.getId_danhmuc(),
                list1.getTenDanhMuc(),
                list1.getId_sanpham(),
                list1.getTenSanPhamString(),
                list1.getGia(),
                list1.getNgayNhap(),
                list1.getNgayban(),
                list1.getNgayHetHan(),
                list1.getMoTa()
            });
        });       
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
         list = SanPhamtModify.bantrongthang();
        list.stream().forEach((list1) -> {
            tableModel.addRow(new Object[]{
                list1.getId_danhmuc(),
                list1.getTenDanhMuc(),
                list1.getId_sanpham(),
                list1.getTenSanPhamString(),
                list1.getGia(),
                list1.getNgayNhap(),
                list1.getNgayban(),
                list1.getNgayHetHan(),
                list1.getMoTa()
            });
        });       
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        list12 = SanPhamtModify.danhmuc();
        list12.stream().forEach((list1) -> {
            tableModel.addRow(new Object[]{
                list1.getId_danhmuc(),
                list1.getTenDanhMuc(),
            });
        });  
        
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

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
            java.util.logging.Logger.getLogger(Form_SanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Form_SanPham().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton them;
    private javax.swing.JButton timkiem1;
    private javax.swing.JTextField txtIDdanhmuc;
    private javax.swing.JTextField txtIDsanpham;
    private javax.swing.JTextField txtTensanpham;
    private javax.swing.JTextField txtdanhmuc;
    private javax.swing.JTextField txtgiaban;
    private javax.swing.JTextField txtmota;
    private javax.swing.JFormattedTextField txtngayban;
    private javax.swing.JFormattedTextField txtngayhethan;
    private javax.swing.JFormattedTextField txtngaynhap;
    private javax.swing.JButton xoa;
    // End of variables declaration//GEN-END:variables
}
