package BaiTapNgay11_3_2020.Luyen_Scanner;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner can = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String name = can.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = Integer.parseInt(can.nextLine());
        System.out.println("Nhap dia chi: ");
        String addRess = can.nextLine();
        System.out.println("Nhap email: ");
        String email = can.nextLine();
        System.out.println("Nhap sdt: ");
        int phone = Integer.parseInt(can.nextLine());


        System.out.println("ten la: " + name);
        System.out.println("tuoi la: " + age);
        System.out.println("dia chi la: " + addRess);
        System.out.println("email la: " + email);
        System.out.println("sdt la: " + phone);

    }
}
