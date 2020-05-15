package BaiTapNgay6_3_2020.Bai58;

import java.util.Scanner;

public class Chicken extends Animal {
    private int numberOfLeg;

    public Chicken() {
    }

    public Chicken(String name, double weigth, int numberOfLeg) {
        super(name, weigth);
        this.numberOfLeg = numberOfLeg;
    }

    public int getNumberOfLeg() {
        return numberOfLeg;
    }

    public void setNumberOfLeg(int numberOfLeg) {
        this.numberOfLeg = numberOfLeg;
    }
    @Override
    public void input() {
        System.out.println("thong tin ga:");
        super.input();
        Scanner can = new Scanner(System.in);
        System.out.println("Nhap numberOfLeg: ");
        numberOfLeg = Integer.parseInt(can.nextLine());
        System.out.println("");
    }

    @Override
    public void output() {
        super.output();
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "numberOfLeg=" + numberOfLeg +
                '}';
    }
}
