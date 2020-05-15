package ViDuOLop.vd1;

import java.util.Scanner;

public class TacGia {
    String name;
    String danhBut;
    String ngaySinh;

    public void tacgia(){
        Scanner input = new Scanner(System.in);

        input.nextLine();
        System.out.println("nhập tên tác giả: ");
        name= input.nextLine();

        input.nextLine();
        System.out.println("nhập danh bút: ");
        danhBut= input.nextLine();

        input.nextLine();
        System.out.println("nhập ngày sinh: ");
        ngaySinh= input.nextLine();

    }
}
