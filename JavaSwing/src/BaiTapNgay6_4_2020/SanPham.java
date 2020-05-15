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
public class SanPham extends DanhMuc{
   int id_sanpham;
   float gia;
   String tenSanPhamString, ngayNhap,ngayban,ngayHetHan,moTa;

    public SanPham() {
    }

    public SanPham(int id_sanpham, float gia, String tenSanPhamString, String ngayNhap, String ngayban, String ngayHetHan, String moTa, int id_danhmuc, String tenDanhMuc) {
        super(id_danhmuc, tenDanhMuc);
        this.id_sanpham = id_sanpham;
        this.gia = gia;
        this.tenSanPhamString = tenSanPhamString;
        this.ngayNhap = ngayNhap;
        this.ngayban = ngayban;
        this.ngayHetHan = ngayHetHan;
        this.moTa = moTa;
    }

    public SanPham(int id_sanpham, float gia, String tenSanPhamString, String ngayNhap, String ngayban, String ngayHetHan, String moTa) {
        this.id_sanpham = id_sanpham;
        this.gia = gia;
        this.tenSanPhamString = tenSanPhamString;
        this.ngayNhap = ngayNhap;
        this.ngayban = ngayban;
        this.ngayHetHan = ngayHetHan;
        this.moTa = moTa;
    }
    

    public int getId_sanpham() {
        return id_sanpham;
    }

    public void setId_sanpham(int id_sanpham) {
        this.id_sanpham = id_sanpham;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public String getTenSanPhamString() {
        return tenSanPhamString;
    }

    public void setTenSanPhamString(String tenSanPhamString) {
        this.tenSanPhamString = tenSanPhamString;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getNgayban() {
        return ngayban;
    }

    public void setNgayban(String ngayban) {
        this.ngayban = ngayban;
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
   
}
