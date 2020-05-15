package BaiTapNgay4_3_2020.Bai44.Cau1;

import java.util.ArrayList;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.input();
        book.output();
        Book book1 = new Book("tri thuc cuoc song","HuanDv",1000,5000000);
        book1.output();
    }
}
