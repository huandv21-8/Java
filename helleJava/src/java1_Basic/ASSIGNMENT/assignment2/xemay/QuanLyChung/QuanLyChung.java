package java1_Basic.ASSIGNMENT.assignment2.xemay.QuanLyChung;
import java1_Basic.ASSIGNMENT.assignment2.xemay.hanoi.XeMayHaNoi;
import java1_Basic.ASSIGNMENT.assignment2.xemay.hoabinh.XeMayHoaBinh;
import java.util.Scanner;
public class QuanLyChung {
    public static void main(String[] args) {
        XeMayHoaBinh xmhb = new XeMayHoaBinh();
        XeMayHaNoi xmhn = new XeMayHaNoi();
        Scanner scan = new Scanner(System.in);
        int choose;
        do {
            showMenu();
            System.out.print(" Nhap lua chon :");
            choose = Integer.parseInt(scan.nextLine());
            switch (choose) {
                case 1:
                    xmhb.nhap();
                    break;
                case 2:
                    xmhn.nhap();
                    break;
                case 3:
                    System.out.println("1.Ha Noi");
                    System.out.println("2.Hoa Binh");
                    System.out.print(" Nhap lua chon :");
                    choose = Integer.parseInt(scan.nextLine());
                    switch (choose) {
                        case 1:
                            xmhn.sapxep();
                            break;
                        case 2:
                            xmhb.sapxep();
                            break;
                        default:
                            break;
                    }
                    break;
                case 4:
                    System.out.println("1.Ha Noi");
                    System.out.println("2.Hoa Binh");
                    System.out.print(" Nhap lua chon :");
                    choose = Integer.parseInt(scan.nextLine());
                    switch (choose) {
                        case 1:
                            xmhn.timkiem();
                            break;
                        case 2:
                            xmhb.timkiem();
                            break;
                        default:
                            break;
                    }
                    break;
                case 5:
                    System.out.println("1.Ha Noi");
                    System.out.println("2.Hoa Binh");
                    System.out.print(" Nhap lua chon :");
                    choose = Integer.parseInt(scan.nextLine());
                    switch (choose) {
                        case 1:
                            xmhn.thongKe();
                            break;
                        case 2:
                            xmhb.thongKe();
                            break;
                        default:
                            break;
                    }
                    break;
                case 6:
                    System.out.println("Thoat..");
                    break;
                default:
                    System.err.println("Nhap sai !!!");
                    break;
            }
        } while (choose != 6);
    }

    public static void showMenu() {
        System.out.println("*================*");
        System.out.println("1. Nhập thông tin cho n xe máy tại tỉnh Hòa Bình.");
        System.out.println("2. Nhập thông tin cho n xe máy tại tỉnh Hà Nội.");
        System.out.println("3. Sắp xếp danh sách tăng theo biển số xe.");
        System.out.println("4. Tìm kiếm thông tin xe theo biển số xe.");
        System.out.println("5. Thống kê số lượng xe đang quản lý. ");
        System.out.println("6. Thoát");
        System.out.println("*================*");

    }
}