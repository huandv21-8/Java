package BaiTapNgay11_3_2020.OnLuyenKt60p.Bai5;

import java.util.Scanner;

public class BikeCycle extends Vehicle {
    String name;
    int soBanhXe;

    @Override
    public void running() {
        System.out.println("BikeCycle is running");
    }

    @Override
    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = scan.nextLine();
        System.out.println("Nhap so banh xe: ");
        soBanhXe = Integer.parseInt(scan.nextLine());
        System.out.println();

    }

    @Override
    public void display() {
        System.out.println(toString());
        System.out.println("");
    }

    @Override
    public String toString() {
        return "BikeCycle{" +
                "name='" + name + '\'' +
                ", soBanhXe=" + soBanhXe +
                '}';
    }
}
