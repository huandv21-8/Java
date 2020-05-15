/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mon_ISA;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Student {

    String ten, diachi, email;
    int tuoi, sdt;

    public Student() {
    }

    public Student(String ten, String diachi, String email, int tuoi, int sdt) {
        this.ten = ten;
        this.diachi = diachi;
        this.email = email;
        this.tuoi = tuoi;
        this.sdt = sdt;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thong tin sinh vien:");
        System.out.print("Nhap ten: ");
        ten = scan.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = Integer.parseInt(scan.nextLine());
        System.out.print("Nhap dia chi: ");
        diachi = scan.nextLine();
        System.out.print("Nhap email: ");
        email = scan.nextLine();
        System.out.print("Nhap so dien thoai: ");
        sdt = Integer.parseInt(scan.nextLine());
    }

    public void hienthi() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String a = "Student{" +
                "ten='" + ten + '\'' +
                ", diachi='" + diachi + '\'' +
                ", email='" + email + '\'' +
                ", tuoi=" + tuoi +
                ", sdt=" + sdt +
                '}';
        return a;
    }
    
}
