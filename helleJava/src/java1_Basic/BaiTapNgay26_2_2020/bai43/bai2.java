package BaiTapNgay26_2_2020.bai43;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số nguyên: ");
        int a = input.nextInt();
        System.out.println("Nhập số double: ");
        double b =input.nextDouble();
        System.out.println("Nhập 1 kí tự: ");
        char c =input.next().charAt(0);
        input.nextLine();
        System.out.println("Nhập số chuỗi: ");
        String d =input.nextLine();

        System.out.println("số nguyên : "+a);
        System.out.println("số double : "+b);
        System.out.println("kí tự : "+c);
        System.out.println("chuỗi : "+d);

    }
}
