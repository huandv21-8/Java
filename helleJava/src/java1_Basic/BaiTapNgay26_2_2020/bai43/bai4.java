package BaiTapNgay26_2_2020.bai43;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bai1: giai pt bac nhat ax+b=0");
        System.out.println("Nhập vào số a: ");
        float a = scanner.nextFloat();
        System.out.println("Nhập vào số b: ");
        float b = scanner.nextFloat();
        float x;
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vố số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            System.out.println("Phương trình có 1 nghiệm x = " + (-1 * b) / a);
        }
    }
}
