package BaiTapNgay6_3_2020.Bai58;

import java.util.Scanner;

public class Cat extends Animal {
    private String color;

    public Cat() {
    }

    public Cat(String name, double weigth, String color) {
        super(name, weigth);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void input() {
        System.out.println("Nhap thong tin meo:");
        super.input();
        Scanner can = new Scanner(System.in);
        System.out.println("Nhap color: ");
        color = can.nextLine();
        System.out.println("");
    }

    @Override
    public void output() {
        super.output();
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                '}';
    }
}
