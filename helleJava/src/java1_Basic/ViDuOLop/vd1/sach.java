package ViDuOLop.vd1;

import java.util.Scanner;

public class sach {
    String tenSach;
    String nhaXuatBan;

    public void book(){
        Scanner input = new Scanner(System.in);
        input.nextLine();
        System.out.println("nhập tên sách: ");
        tenSach = input.nextLine();
        System.out.println("nhập nhà xuất bản: ");
        nhaXuatBan = input.nextLine();
    }
}
