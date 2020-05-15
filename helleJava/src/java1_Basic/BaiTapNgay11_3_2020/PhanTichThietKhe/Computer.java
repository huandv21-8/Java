package BaiTapNgay11_3_2020.PhanTichThietKhe;

import java.util.Scanner;

public class Computer {
    String ten;
    String hang;
    String mauSac;
    String boNho;

    public Computer() {
    }

    public Computer(String ten, String hang, String mauSac, String boNho) {
        this.ten = ten;
        this.hang = hang;
        this.mauSac = mauSac;
        this.boNho = boNho;
    }
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten may:");
        ten = scan.nextLine();
        System.out.println("Nhap hang may:");
        hang = scan.nextLine();
        System.out.println("Nhap mau sac may:");
        mauSac = scan.nextLine();
        System.out.println("Nhap bo nho may:");
        boNho = scan.nextLine();
        System.out.println("");
    }
    public void display(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ten='" + ten + '\'' +
                ", hang='" + hang + '\'' +
                ", mauSac='" + mauSac + '\'' +
                ", boNho='" + boNho + '\'' +
                '}';
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getBoNho() {
        return boNho;
    }

    public void setBoNho(String boNho) {
        this.boNho = boNho;
    }


}
