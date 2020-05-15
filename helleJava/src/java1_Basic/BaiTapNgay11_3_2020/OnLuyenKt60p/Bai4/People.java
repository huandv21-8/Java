package BaiTapNgay11_3_2020.OnLuyenKt60p.Bai4;

import java.util.Scanner;

public class People {
    String name,addRess;

    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = scan.nextLine();
        System.out.println("Nhap dia chi: ");
        addRess = scan.nextLine();
    }
    public void output(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", addRess='" + addRess + '\'' +
                '}';
    }
}
