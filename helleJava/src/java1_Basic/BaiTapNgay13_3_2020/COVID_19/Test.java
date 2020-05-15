package java1_Basic.BaiTapNgay13_3_2020.COVID_19;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ABC abc = new ABC();
        Scanner scan = new Scanner(System.in);
        int choose;
        do {
            showmenu();
            System.out.println("Nhap lua chon: ");
            choose = Integer.parseInt(scan.nextLine());
            switch (choose) {
                case 1:
                    abc.input();
                    break;
                case 2:
                    abc.searchName();
                    break;
                case 3:
                    abc.searchCMND();
                    break;
                case 4:
                    abc.ThietLapTinhTrang();
                    break;
                case 5:
                    abc.ThietLapLoTrinh();
                    break;
                case 6:
                    abc.case6();
                    break;
                case 7:
                    abc.display();
                    break;
                case 8:
                    abc.display1();
                    break;
                case 9:
                    System.out.println("Thoat.");
                    break;
                default:
                    System.err.println("Nhap loi!!!");
                    break;
            }
        } while (choose != 9);

    }

    static void showmenu() {
        System.out.println("1. Lập danh sách tất cả công dân tại Việt Nam");
        System.out.println("2. Tìm kiếm thông tin bệnh nhân theo tên");
        System.out.println("3. Tìm kiếm bệnh nhân theo CMTND");
        System.out.println("4. Thiết lập tình trạng sức khoẻ");
        System.out.println("5. Thiết lập lộ trình di chuyển của 1 bệnh nhân.");
        System.out.println("6. Thiết lập trạng thái bệnh nhân đã tiếp xúc vs một bệnh nhân dương tính COVID-19");
        System.out.println("7. Hiển thị danh sách bệnh nhân dương tính COVID-19");
        System.out.println("8. Hiển thị danh sách bệnh nhân đang theo dõi");
        System.out.println("9. Thoat.");

    }
}
