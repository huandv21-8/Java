package ViDuOLop.vd1;

import java.util.Scanner;

public class NhaSanXuat {
    String NhaSanXuat;
    int founding;
    String name;
    int year;

    public void nhapSanXuat(){
        Scanner input= new Scanner(System.in);

        input.nextLine();
        System.out.print("Nhập nhà sản xuất: ");
        NhaSanXuat = input.nextLine();

        System.out.print("nhập ngày sản xuất: ");
        founding = input.nextInt();

        input.nextLine();
        System.out.print("Nhập người đại diện: ");
        name = input.nextLine();

        System.out.print("Nhập năm thành lập: ");
        year = input.nextInt();

    }

    void XuatNhaSanXuat(){
        System.out.println("nhà xản xuất:"+ NhaSanXuat +"ngày sản xuất:" + founding + "người đại diện: "+ name + "năm thành lập:"+ year);
    }
}
