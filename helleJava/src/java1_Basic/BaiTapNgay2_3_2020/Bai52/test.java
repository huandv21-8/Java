package java1_Basic.BaiTapNgay2_3_2020.Bai52;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

         AptechBook aptech = new AptechBook();
        int choose;
        Scanner scan = new Scanner(System.in);

        do {
            showMenu();

            System.out.print("Nhập lựa chọn: ");
            choose = scan.nextInt();
            switch (choose) {
                case 1:
                    aptech.choose1();
                    break;
                case 2:
                    aptech.choose2();
                    break;
                case 3:
                    aptech.choose3();
                    break;
                case 4:
                    aptech.choose4();
                    break;
                case 5:
                    aptech.choose5();
                    break;
                case 6:
                    System.out.println("thoát.");
                    break;
                default:
                    System.err.println("Nhập lỗi !!!");
                    break;
            }


        } while (choose != 6);
    }

    static void showMenu() {
        System.out.println("1. Nhập thông tin n cuốn sách của Aptech");
        System.out.println("2. Hiển thị thông tin vừa nhập");
        System.out.println("3. Sắp xếp thông tin giảm dần theo năm xuất bản và hiển thị");
        System.out.println("4. Tìm kiếm theo tên sách");
        System.out.println("5. Tìm kiếm theo tên tác giả");
        System.out.println("6. Thoát.");
    }
}
