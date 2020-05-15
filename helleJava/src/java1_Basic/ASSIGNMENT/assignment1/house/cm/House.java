package java1_Basic.ASSIGNMENT.assignment1.house.cm;

import java.util.Scanner;

public class House implements IHouse {

    
    private String soNha;
    private String diaChi;
    private String loaiNha;

    public House() {
    }

    public House(String soNha, String diaChi, String loaiNha) {
        this.soNha = soNha;
        this.diaChi = diaChi;
        this.loaiNha = loaiNha;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    @Override
    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so nha: ");
        soNha = scan.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = scan.nextLine();
        System.out.println("Nhap loai nha: ");
        loaiNha = scan.nextLine();
    }

    @Override
    public void display() {
        System.out.println("So nha la: " + soNha);
        System.out.println("Dia chi nha la: " + diaChi);
        System.out.println("Loai nha la: " + loaiNha);
    }
}
