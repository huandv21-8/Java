package java1_Basic.BaiTapNgay2_3_2020.Bai52;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class AptechBook extends Book {
    String language;
    int semester;

    public AptechBook() {

    }

    public AptechBook(String language, int semester) {
        this.language = language;
        this.semester = semester;
    }

    public AptechBook(String bookName, String bookAuthor, String bookProduccer, int yearPublishing, float price, String language, int semester) {
        super(bookName, bookAuthor, bookProduccer, yearPublishing, price);
        this.language = language;
        this.semester = semester;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public void input() {
        Scanner scan = new Scanner(System.in);
        super.input();
        System.out.print("nhập ngôn ngữ: ");
        language = scan.nextLine();


        System.out.print("nhập học kì: ");
        semester = Integer.parseInt(scan.nextLine());
        System.out.println();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("ngôn ngữ: " + language);
        System.out.println("học kì: " + semester);
        System.out.println("");
    }
    ArrayList<AptechBook> list = new ArrayList<>();
    public void choose1(){
        System.out.println("Nhap so sach: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            AptechBook ap = new AptechBook();
            System.out.println("Nhập cuốn sách thứ: " + (i + 1));
            ap.input();
            list.add(ap);
        }
    }
    public void choose2(){
        for (int i = 0; i < list.size(); i++) {
            list.get(i).display();
        }
    }
    public void choose3(){
        Collections.sort(list, new Comparator<AptechBook>() {
            @Override
            public int compare(AptechBook aptechBook, AptechBook t1) {
                if (aptechBook.yearPublishing < t1.yearPublishing) {
                    return 1;
                }
                return -1;
            }
        });
        for (int i = 0; i < list.size(); i++) {
            list.get(i).display();
        }
    }
    public void choose4(){
        System.out.println("Nhap ten sach can tim: ");
        String tenSach = scan.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getBookName().equalsIgnoreCase(tenSach)) {
                list.get(i).display();
            }
        }
    }
    public void choose5(){
        System.out.println("Nhập tên tác giả cần tìm: ");
        String tenTacGia = scan.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getBookAuthor().equalsIgnoreCase(tenTacGia)) {
                list.get(i).display();
            }
        }
    }
}
