package java2_Advanced.BaiTapNgay23_3_2020.File_quanLiSinhVien;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manipulation manipulation = new Manipulation();
        int choose;

        do {
            showMenu();
            System.out.println("Nhap lua chon: ");
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    manipulation.addStudent();
                    break;
                case 2:
                    manipulation.editStudent();
                    break;
                case 3:
                    manipulation.deleteStudent();
                    break;
                case 4:
                    manipulation.sortStudent_gpa();
                    break;
                case 5:
                    manipulation.sortStudent_name();
                    break;
                case 6:
                    manipulation.display();
                    break;
                case 7:
                    manipulation.saveStudent();
                    break;
                case 8:
                    manipulation.showStudent();
                    break;
                case 9:
                    System.out.println("Thoat.");
                    break;
                default:
                    System.err.println("Nhap sai");
                    break;
            }

        } while (choose != 9);

    }

    static void showMenu() {
        System.out.println("/****************************************/");
        System.out.println("1. Thêm sinh viên");
        System.out.println("2. Chỉnh sửa học sinh theo id.");
        System.out.println("3. Xóa sinh viên theo id.");
        System.out.println("4. Sắp xếp học sinh bằng diem trung binh.");
        System.out.println("5. Sắp xếp học sinh theo tên.");
        System.out.println("6. Hiển thị học sinh.");
        System.out.println("7. Lưu thông tin sv vào file student.txt");
        System.out.println("8. Đọc thông tin sv từ file student.txt và hiển thị ra màn hình");
        System.out.println("9. Exit.");
        System.out.println("/****************************************/");
    }
}
