package java2_Advanced.BaiTapNgay25_3_2020.SachVaLuuThongTinTrenFile;

import java.io.Serializable;
import java.util.Scanner;

public class Book implements Serializable {
    String nameBook, nameAuthor, price, publicationDate, publishingCompany;

    public Book() {
    }

    public Book(String nameBook, String nameAuthor, String price, String publicationDate, String publishingCompany) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.price = price;
        this.publicationDate = publicationDate;
        this.publishingCompany = publishingCompany;
    }

    public void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten sach: ");
        nameBook = scan.nextLine();
        System.out.println("Nhap ten tac gia: ");
        nameAuthor = scan.nextLine();
        System.out.println("Nhap gia ban: ");
        price = scan.nextLine();
        System.out.println("Nhap ngay xuat ban: ");
        publicationDate = scan.nextLine();
        System.out.println("Nhap nha xuat ban: ");
        publishingCompany = scan.nextLine();
    }

    public void hienThi() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", nameAuthor='" + nameAuthor + '\'' +
                ", price='" + price + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                ", publishingCompany='" + publishingCompany + '\'' +
                '}';
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public String getLine() {
        return nameBook + ", " + nameAuthor + ", " + price + ", " + publicationDate + ", " + publishingCompany + ", " + "\n";
    }
}
