package java1_Basic.ASSIGNMENT.assignment1.house.hanoi;

import java1_Basic.ASSIGNMENT.assignment1.house.cm.House;

import java.util.Scanner;

public class HaNoiHouse extends House {
    private String tenQuan;

    public HaNoiHouse() {
    }

    public HaNoiHouse(String soNha, String diaChi, String loaiNha, String tenQuan) {
        super(soNha, diaChi, loaiNha);
        this.tenQuan = tenQuan;
    }

    public String getTenQuan() {
        return tenQuan;
    }

    public void setTenQuan(String tenQuan) {
        this.tenQuan = tenQuan;
    }

    @Override
    public void input() {
        Scanner scan = new Scanner(System.in);
        super.input();
        System.out.println("Nhap ten quan: ");
        tenQuan = scan.nextLine();
        System.out.println("");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Ten quan la: " + tenQuan);
        System.out.println("");
    }
}
