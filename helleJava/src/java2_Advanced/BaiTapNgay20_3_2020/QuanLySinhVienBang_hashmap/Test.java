package java2_Advanced.BaiTapNgay20_3_2020.QuanLySinhVienBang_hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Student> ma = new HashMap<>();
        int choose;
        do {
            showMenu();
            System.out.print("Nhap lua chon: ");
            choose = Integer.parseInt(scan.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Nhap so sinh vien can them thong tin: ");
                    int n = Integer.parseInt(scan.nextLine());
                    for (int i = 0; i < n; i++) {
                        Student student = new Student();    //tao ra 1 doi tuong tinh vien
                        student.input();                    // nhap thong tin cho sinh vien
                        ma.put(student.RollNo, student);    // them ma sinh vien lam key cua sinh vien
                    }
                    break;
                case 2:
                    for (String s : ma.keySet()) {     // for chay qua cac ma sinh vien
                        Student student = ma.get(s);   // gan ma sinh vien vao cho sinh vien
                        student.output();              // hien thi thong tin sinh vien
                    }
                    break;
                case 3:
                    System.out.println("Nhap ma sinh vien can tim: ");
                    String rollNo = scan.nextLine();

                    // cach 1:
                    Student abc = ma.get(rollNo);
                    abc.output();

                    // cach 2:
                    for (String s : ma.keySet()) {                         // for chay qua cac ma sinh vien
                        if (ma.get(s).RollNo.equalsIgnoreCase(rollNo)) {    // tim ma sinh vien giong voi ma nhap vao
                            ma.get(rollNo).output();                        // hien thi thong tin sinh vien ca ma vua tim duoc
                        }
                    }
                    break;
                case 4:
                    System.out.println("Thoat.");
                    break;
                default:
                    System.err.println("Nhap loi !!!");
                    break;
            }
        } while (choose != 4);
    }

    public static void showMenu() {
        System.out.println("1.Nhap thong tin n sinh vien");
        System.out.println("2.Hien thi thong tin n sinh vien");
        System.out.println("3.Tìm kiếm sinh viên (nhap ma sinh vien).");
        System.out.println("4.Thoat");
    }
}
