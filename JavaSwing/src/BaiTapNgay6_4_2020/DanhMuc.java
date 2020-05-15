/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapNgay6_4_2020;

/**
 *
 * @author Admin
 */
public class DanhMuc {
    int id_danhmuc;
    String tenDanhMuc;

    public DanhMuc() {
    }

    public DanhMuc(int id_danhmuc, String tenDanhMuc) {
        this.id_danhmuc = id_danhmuc;
        this.tenDanhMuc = tenDanhMuc;
    }

    public int getId_danhmuc() {
        return id_danhmuc;
    }

    public void setId_danhmuc(int id_danhmuc) {
        this.id_danhmuc = id_danhmuc;
    }

    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }
    
}
