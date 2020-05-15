package BaiTapNgay16_3_2020.Quan_li_Bai_Do_Xe;

import java.util.ArrayList;

import java.util.Scanner;

public class Vehicle {
    String producer, bienSoXe, namSanXuat;
    int id_chuSoHuu, width, height;
    public Vehicle() {
    }

    public Vehicle(String producer, String bienSoXe, String namSanXuat, int id_chuSoHuu, int width, int height) {
        this.producer = producer;
        this.bienSoXe = bienSoXe;
        this.namSanXuat = namSanXuat;
        this.id_chuSoHuu = id_chuSoHuu;
        this.width = width;
        this.height = height;
    }

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap nha san xuat:");
        producer = scan.nextLine();
        System.out.println("Nhap bien so xe:");
        bienSoXe = scan.nextLine();
        System.out.println("Nhap nam san xuat: ");
        namSanXuat = scan.nextLine();
        System.out.println("Nhap id chu so huu: ");
        id_chuSoHuu = Integer.parseInt(scan.nextLine());
    }

    public void showInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "producer='" + producer + '\'' +
                ", bienSoXe='" + bienSoXe + '\'' +
                ", namSanXuat='" + namSanXuat + '\'' +
                ", id_chuSoHuu=" + id_chuSoHuu +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    float dienTich() {
        return (float) (width * height);
    }


    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getBienSoXe() {
        return bienSoXe;
    }

    public void setBienSoXe(String bienSoXe) {
        this.bienSoXe = bienSoXe;
    }

    public String getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(String namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public int getId_chuSoHuu() {
        return id_chuSoHuu;
    }

    public void setId_chuSoHuu(int id_chuSoHuu) {
        this.id_chuSoHuu = id_chuSoHuu;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
