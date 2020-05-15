package BaiTapNgay6_3_2020.bai51;

import BaiTapNgay6_3_2020.bai51.color.ColorManager;
import BaiTapNgay6_3_2020.bai51.cat.manager.ManagerCat;

import java.util.Scanner;

public class UsingManagerCat {
    public static void main(String[] args) {
        ManagerCat managerCat = new ManagerCat();
        Scanner scan = new Scanner(System.in);
        int choose;
        do {
            System.out.print("Nhap vao lua chon: ");
            choose = Integer.parseInt(scan.nextLine());
            switch (choose) {
                case 0:
                    ColorManager color = new ColorManager();
                    color.input();
                    break;
                case 1:
                    managerCat.input();
                    break;
                case 2:
                    managerCat.output();
                    break;
                case 3:
                    managerCat.sapxep();
                    break;
                case 4:
                    managerCat.seach();
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Thoat.");
                    break;
                default:
                    System.err.println("Nhap sai !!!");
                    break;
            }
        } while (choose != 6);
    }

    public static void showMenu() {
        System.out.println("0.Nhập danh sách mã màu");
        System.out.println("1.Nhập thông tin của n con mèo");
        System.out.println("2.Hiển thị thông tin");
        System.out.println("3.Sắp xếp danh sách theo mau");
        System.out.println("4.Tìm kiếm thông tin theo loai");
        System.out.println("5.Sắp xếp danh sách màu theo bảng màu trong lớp ColorManager");
        System.out.println("6.Thoát.");
    }
}
