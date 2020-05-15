package BaiTapNgay26_2_2020.bai45;

import java.util.Scanner;

public class bai45_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choose;
        int a[] = new int[3];
        String h[] = new String[1];
        do {
            System.out.println("1.Nhập vào họ tên của bạn: ");
            System.out.println("2.Nhập vào điểm toán lý hóa: ");
            System.out.println("3.Tính tổng 3 môn: ");
            System.out.println("4.Tính trung bình 3 môn: ");
            System.out.println("5.Thoát.");
            System.out.print("Choose: ");
            choose = input.nextInt();

            switch (choose){
                case 1:
                    System.out.println("Nhập họ tên: ");
                    h[0] = input.nextLine();
                    input.nextLine();
                    break;
                case 2:
                    System.out.println("Nhập điểm toán lý hóa: ");
                     a[0] = input.nextInt();
                     a[1] = input.nextInt();
                     a[2] = input.nextInt();
                    break;
                case 3:
                    System.out.println("==>Tổng 3 môn là : "+ (a[0]+a[1]+a[2]));
                    break;
                case 4:
                    System.out.println("==>Trung bình 3 môn là : "+ (double)((a[0]+a[1]+a[2])/3));
                    break;
                case 5:
                    System.out.println("==>Thoát.");
                    break;
                default:
                    System.out.println("Lỗi...");
                    break;

            }
        }while (choose!=5);
    }
}
