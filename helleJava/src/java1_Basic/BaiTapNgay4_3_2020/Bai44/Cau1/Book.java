package BaiTapNgay4_3_2020.Bai44.Cau1;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    String nameBook;
    String nameAuthor;
    int numberPage;
    float price;

    public Book() {
    }

    public Book(String nameBook, String nameAuthor, int numberPage, float price) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.numberPage = numberPage;
        this.price = price;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void input() {
        Scanner scan = new Scanner(System.in);

        System.out.println("nhap ten sach: ");
        nameBook = scan.nextLine();

        System.out.println("nhap ten tac gia: ");
        nameAuthor = scan.nextLine();

        System.out.println("nhap so trang sach: ");
        numberPage = Integer.parseInt(scan.nextLine());

        System.out.println("nhap gia: ");
        price = Float.parseFloat(scan.nextLine());
    }


    public void output() {
        System.out.println("ten sach: "+nameBook);
        System.out.println("ten tac gia: "+nameAuthor);
        System.out.println("so trang: "+numberPage);
        System.out.println("gia tien: "+price);
    }
}

