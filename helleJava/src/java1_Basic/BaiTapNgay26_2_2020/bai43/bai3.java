package BaiTapNgay26_2_2020.bai43;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = input.nextInt();
        System.out.print("Nhập số b: ");
        int b = input.nextInt();

        if (a>b){
            System.out.println(a+" lớn hơn " + b);
        }
        else{
            System.out.println(b + " lớn hơn "+a);
        }
    }
}
