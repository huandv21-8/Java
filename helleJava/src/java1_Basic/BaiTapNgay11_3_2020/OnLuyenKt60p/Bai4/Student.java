package BaiTapNgay11_3_2020.OnLuyenKt60p.Bai4;

import java.util.Scanner;

public class Student extends People {
    String rollNo;

    @Override
    public void input() {
        super.input();
        Scanner can = new Scanner(System.in);
        System.out.println("Nhap ma: ");
        rollNo = can.nextLine();
    }

    @Override
    public void output() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo='" + rollNo + '\'' +
                ", name='" + name + '\'' +
                ", addRess='" + addRess + '\'' +
                '}';
    }
}
