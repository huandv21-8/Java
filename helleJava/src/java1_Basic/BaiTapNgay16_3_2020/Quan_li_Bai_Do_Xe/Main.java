package BaiTapNgay16_3_2020.Quan_li_Bai_Do_Xe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        People people = new People();
        Zone zone = new Zone();
        int choose;

        do {
            showMenu();
            System.out.print("Nhap vao lua chon cua ban: ");
            choose = Integer.parseInt(scan.nextLine());
            switch (choose) {
                case 1:
                    people.InputPeople();
                    break;
                case 2:
                    zone.inputArea();
                    break;
                case 3:
                    zone.inputVehicle();
                    break;
                case 4:
                    zone.showVehicle();
                    break;
                case 5:
                    zone.sort();
                    break;
                case 6:
                    zone.output_Vehicle_DienTich();
                    break;
                case 7:
                    System.out.println("Thoat.");
                    break;
                default:
                    System.err.println("Nhap loi !!!");
                    break;
            }
        } while (choose != 7);

    }

    static void showMenu() {
        System.out.println("1. Nhap thong tin cho n  chu so huu.");
        System.out.println("2. Nhap thong tin cho n khu vuc. ");
        System.out.println("3. Nhap thong tin cho n xe va tu dong tim kiem khu vuc phu hop de luu tru.");
        System.out.println("4. Hien thi thong tin cac xe duoc so huu boi mot ten.");
        System.out.println("5. Dung giai thuat Quick Sort de xap xep thu tu giam dan theo dien tich cua xe trong tung khu vuc.");
        System.out.println("6. Su dung ket 5 de hien thong tin xe co trong khu vuc do.");
        System.out.println("7. Thoat.");
    }
}
