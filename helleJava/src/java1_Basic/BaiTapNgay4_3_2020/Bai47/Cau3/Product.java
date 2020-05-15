package BaiTapNgay4_3_2020.Bai47.Cau3;

import java.util.ArrayList;
import java.util.Scanner;

public class Product {
    private String maHH;
    private String tenHH;
    private float soLuong;
    private float giaSP;

    public Product() {
    }

    public Product(String maHH, String tenHH, float soLuong, float giaSP) {
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.soLuong = soLuong;
        this.giaSP = giaSP;
    }

    public String getMaHH() {
        return maHH;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public float getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(float giaSP) {
        this.giaSP = giaSP;
    }

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ma: ");
        maHH = scan.nextLine();
        System.out.println("Nhap ten: ");
        tenHH = scan.nextLine();
        System.out.println("Nhap so luong: ");
        soLuong = Float.parseFloat(scan.nextLine());
        System.out.println("Nhap gia: ");
        giaSP = Float.parseFloat(scan.nextLine());
        System.out.println("");
    }

    public void output() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Product{" +
                "maHH='" + maHH + '\'' +
                ", tenHH='" + tenHH + '\'' +
                ", soLuong=" + soLuong +
                ", giaSP=" + giaSP +
                '}';
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Product> list = new ArrayList<>();
        System.out.println("Nhap so luong: ");
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            Product product = new Product();
            System.out.println("Nhap thong tin SP thu " + (i + 1) + " :");
            product.input();
            list.add(product);
        }

        float max = list.get(0).giaSP;  // giả sử giá lớn nhất là phần tử thứ 1 trong arraylist
        for (int i =1 ; i<n;i++){
            if (list.get(i).giaSP > max) {
                max = list.get(i).giaSP; //tìm ra giá lớn nhất và gán cho max

            }
        }
        System.out.println("Thông tin san pham co gia cao nhat la: ");
        for (int j=0; j<n ;j++){
            if (list.get(j).giaSP==max){  //nếu phần tử thứ j có giá lớn nhất
                list.get(j).output();   //thì hiển thị thông tin của phần tử lớn nhất (phần tử thứ j)
            }
        }
    }
}
