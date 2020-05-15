package BaiTapNgay11_3_2020.Kt_ChanLe;

import java.util.Scanner;

public class ChanLe {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        int n = Integer.parseInt(Scan.nextLine());
        if (n % 2 == 0) {
            System.out.println(n + " la so chan.");
        } else {
            System.out.println(n + " la so le.");
        }
    }
}
