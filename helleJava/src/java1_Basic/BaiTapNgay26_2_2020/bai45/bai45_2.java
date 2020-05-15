package BaiTapNgay26_2_2020.bai45;

import java.util.Scanner;

public class bai45_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choose;
        int a[] = new int[2];
        do {
            System.out.println("1.Nhập vào 2 số nguyên: ");
            System.out.println("2.Hiển thị 2 số vừa nhập: ");
            System.out.println("3.Tổng 2 số: ");
            System.out.println("4.Tích 2 số: ");
            System.out.println("5.Hiệu 2 số: ");
            System.out.println("6.Thương 2 số: ");
            System.out.println("7.Thoát.");
            System.out.print("Choose:");
            choose = input.nextInt();
            switch (choose){
                case 1:
                    System.out.print("Nhập vào  số nguyên a: ");
                    a[0] = input.nextInt();
                    System.out.print("Nhập vào  số nguyên b: ");
                    a[1] = input.nextInt();
                    break;
                case 2:
                    System.out.println("2 số nguyên vừa nhập là: "+a[0] +" và "+a[1]);
                    break;
                case 3:
                    System.out.println("Tổng là: "+ (a[0]+a[1]));
                    break;
                case 4:
                    System.out.println("Tích là: "+ (a[0]*a[1]));
                    break;
                case 5:
                    System.out.println("Hiệu là: "+ (a[0]-a[1]));
                    break;
                case 6:
                    System.out.println("Thương là: "+ (float)(a[0]/a[1]));
                    break;
                case 7:
                    System.out.println("Thoát.");
                    break;
                default:
                    System.out.println("Lỗi..");
                    break;
            }
        }while (choose!=7);
    }
}
