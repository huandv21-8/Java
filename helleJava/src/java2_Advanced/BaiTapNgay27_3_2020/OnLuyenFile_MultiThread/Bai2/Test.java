package java2_Advanced.BaiTapNgay27_3_2020.OnLuyenFile_MultiThread.Bai2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Abc abc = new Abc();
        Scanner scan = new Scanner(System.in);
        int choose;
        do {
            showMenu();
            System.out.println("Nhap choose:");
            choose = Integer.parseInt(scan.nextLine());
            switch (choose) {
                case 1:
                    abc.input();
                    break;
                case 2:
                    abc.saveDuLieuBay();
                    break;
                case 3:
                    abc.readDuLieuBay();
                    break;
                case 4:
                    abc.sortGiaVe();
                    break;
                case 5:
                    abc.SaveFile_Ma();
                    break;
                default:
                    System.err.println("Nhap sai !!!");
                    break;
            }
        } while (choose != 5);

    }

    static void showMenu() {
        System.out.println("1.Nhập vào thông tin cho n chuyến bay với mã chuyến bay theo quy ước");
        System.out.println("2.Lưu thông tin vừa nhập vào file : DuLieuBay.txt");
        System.out.println("3.Đọc thông tin  từ DuLieuBay.txt và hiển thị tất cả thông tin ra màn hình");
        System.out.println("4.Hiển thị thong tin sau khi đã sắp xếp giảm dần theo giá vé.");
        System.out.println("5.In ra thông tin  của mỗi hãng bay ra một file tương ứng.");
    }
}
