package ViDuOLop.vd1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        NhaSanXuat nsx = new NhaSanXuat();
        sach s =new sach();
        TacGia tg = new TacGia();

        int a;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("hiển thị thông tin nhà sản xuất");
            System.out.println("hiển thị thông tin tác giả");
            System.out.println("hiển thị thông tin sách");
            System.out.print("Nhập lựa chọn: ");
            a = input.nextInt();

            switch (a){
                case 1:
                    nsx.nhapSanXuat();
                    nsx.XuatNhaSanXuat();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        }while (a!=3);
    }
}
