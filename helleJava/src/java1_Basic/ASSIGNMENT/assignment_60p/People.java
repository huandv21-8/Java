package java1_Basic.ASSIGNMENT.assignment_60p;

import java.util.Scanner;

public class People implements IInfor {
    String name, age, Address;

    public void input() {
        Scanner can = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = can.nextLine();
        System.out.println("Nhap tuoi : ");
        age = can.nextLine();
        System.out.println("Nhap dia chi : ");
        Address = can.nextLine();
        System.out.println("");
    }

    @Override
    public void showInpor() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
