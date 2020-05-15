package java1_Basic.BaiTapNgay2_3_2020.Bai52;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    Scanner scan = new Scanner(System.in);
     String bookName;
     String bookAuthor;
     String bookProduccer;
     int yearPublishing;
     float price;

    public Book() {
    }

    public Book(String bookName, String bookAuthor, String bookProduccer, int yearPublishing, float price) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookProduccer = bookProduccer;
        this.yearPublishing = yearPublishing;
        this.price = price;
    }


    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookProduccer() {
        return bookProduccer;
    }

    public void setBookProduccer(String bookProduccer) {
        this.bookProduccer = bookProduccer;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void input() {


        System.out.print("Nhập tên sách: ");
        bookName = scan.nextLine();

        System.out.print("Nhập tác giả: ");
        bookAuthor = scan.nextLine();

        System.out.print("nhập nhà sản xuất: ");
        bookProduccer = scan.nextLine();

        System.out.print("Năm xuất bản: ");
        yearPublishing = Integer.parseInt(scan.nextLine());

        System.out.print("Giá bán: ");
        price = Float.parseFloat(scan.nextLine());
    }

    public void display() {
        System.out.println("tên sách là: " + bookName);
        System.out.println("tên tác giả là: " + bookAuthor);
        System.out.println("nhà sản xuất là: " + bookProduccer);
        System.out.println("năm xuất bản là: " + yearPublishing);
        System.out.println("giá bán là : " + price);

    }
}

