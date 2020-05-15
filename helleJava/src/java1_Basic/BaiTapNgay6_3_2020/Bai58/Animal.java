package BaiTapNgay6_3_2020.Bai58;

import java.util.Scanner;

public class Animal implements IAnimal {
   private String name;
   private double weigth;

    public Animal() {
    }

    public Animal(String name, double weigth) {
        this.name = name;
        this.weigth = weigth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    @Override
    public void input() {

        Scanner can = new Scanner(System.in);
        System.out.println("nhap name:" );
        name = can.nextLine();
        System.out.println("Nhap weidth: ");
        weigth = Double.parseDouble(can.nextLine());
        System.out.println("");
    }

    @Override
    public void output() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weigth=" + weigth +
                '}';
    }
}
