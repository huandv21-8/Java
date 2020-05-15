package BaiTapNgay24_2_2020;

import java.util.Scanner;

public class BAI30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Bài 1.
       /* System.out.println("bai1: giai pt bac nhat ax+b=0");
        System.out.println("Nhập vào số a: ");
        float a = scanner.nextFloat();
        System.out.println("Nhập vào số b: ");
        float b = scanner.nextFloat();
        float x;
        if(a==0){
            if(b==0){
                System.out.println("Phương trình vố số nghiệm.");
            }
            else{
                System.out.println("Phương trình vô nghiệm.");
            }
        }
        else{
            System.out.println("Phương trình có 1 nghiệm x = "+ (-1*b)/a); */

        //bài 2.
       /* System.out.println("Mời bạn nhập số nguyên x: ");
        int x = scanner.nextInt();
        if(x%2==0){
            System.out.println(x +" là số chẵn.");
        }
        else{
            System.out.println(x +" là số lẻ.");
        }*/

       //bài 3.
        System.out.println("Nhập tên của bạn: ");
        String a = scanner.nextLine();

        System.out.println("Nhập tuổi của bạn: ");
        int b = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Nhập địa chỉ của bạn: ");
        String c = scanner.nextLine();

        System.out.println("Nhập sđt của bạn: ");
        long e = scanner.nextLong();

        scanner.nextLine();
        System.out.println("Nhập email của bạn: ");
        String d = scanner.nextLine();

        System.out.println("Họ tên: " + a + ", tuổi: " + b + ",địa chỉ: " + c + ", email:" + d + ", sđt: " + e);
    }
}


