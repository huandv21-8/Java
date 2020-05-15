package BaiTapNgay4_3_2020.Bai44.Cau2;

import java.util.Scanner;

public class Product {
    String nameProduct;
    String producer;
    float price;

    public Product() {
    }

    public Product(String nameProduct, String producer, float price) {
        this.nameProduct = nameProduct;
        this.producer = producer;
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap ten san pham: ");
        nameProduct = scan.nextLine();
        System.out.println("nhap nha san xuat: ");
        producer = scan.nextLine();
        System.out.println("nhap gia ban");
        price = Float.parseFloat(scan.nextLine());
        System.out.println("");
    }

    public void output() {
        System.out.println("ten san pham la: " + nameProduct);
        System.out.println("nha san xuat la: " + producer);
        System.out.println("gia ban la: " + price);
        System.out.println("");
    }
}
