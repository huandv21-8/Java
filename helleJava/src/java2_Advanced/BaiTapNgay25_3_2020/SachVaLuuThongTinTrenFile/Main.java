package java2_Advanced.BaiTapNgay25_3_2020.SachVaLuuThongTinTrenFile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Perform perform = new Perform();
        Scanner scan = new Scanner(System.in);
        int choose;
        do {
            System.out.println("Nhap choose:");
            choose = Integer.parseInt(scan.nextLine());
            switch (choose) {
                case 1:
                    perform.input();
                    break;
                case 2:
                    perform.display();
                    break;
                case 3:
                    perform.sortAuthor();
                    break;
                case 4:
                    perform.saveBook1_Object();
                    break;
                case 5:
                    perform.saveBook_buffered();
                    break;
                case 6:
                    perform.zipFile();
                    break;
                case 7:
                    perform.showBook1_Object();
                    break;
                case 8:
                    System.out.println("thoat");
                    break;
                default:
                    System.err.println("Nhap sai !!!");
                    break;
            }
        } while (choose != 8);
    }

    static void showMenu() {
        System.out.println("1. Nhập thông tin N quấn sách");
        System.out.println("2. Hiển thị thông tin sách");
        System.out.println("3. Sắp xếp theo tên tác giả");
        System.out.println("4. Lưu thông tin sách vào file data.obj");
        System.out.println("5. Lưu thông tin mỗi quyển sách vào file data.txt (mỗi quyển sách trên một dòng)");
        System.out.println("6. Nén file data.txt thành file data.dfl");
        System.out.println("7. Đọc dữ liệu từ file data.obj và hiển thị ra màn hình");
        System.out.println("8. Thoát");
    }
}
