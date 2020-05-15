package BaiTapNgay26_2_2020.bai45;

import java.util.Scanner;

public class Bai45_1 {
    public static void main(String[] args) {
        String h[] = new String[1];
        int choose;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Nhập thông tin: ");
            System.out.println("2. Hiển thị thông tin: ");
            System.out.println("3. Thoát");
            System.out.print("Choose: ");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Nhập tên của bạn: ");
                    scanner.nextLine();
                    h[0]= scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Tên bạn là : "+h[0]);
                    break;
                case 3:
                    System.out.println("Thoát.");
                    break;
                default:
                    System.out.println("Lỗi!!!");
                    break;
            }
        }while (choose!=3);

    }
}
