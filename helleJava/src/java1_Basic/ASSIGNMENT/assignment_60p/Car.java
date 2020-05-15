package java1_Basic.ASSIGNMENT.assignment_60p;

import java.util.Scanner;

public class Car implements IInfor {
    String nameCar;
    String colorCar;

    public void input() {
        Scanner can = new Scanner(System.in);
        System.out.println("Nhap ten xe: ");
        nameCar = can.nextLine();
        System.out.println("Nhap mau xe: ");
        colorCar = can.nextLine();
        System.out.println("");
    }

    @Override
    public void showInpor() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Car{" +
                "nameCar='" + nameCar + '\'' +
                ", colorCar='" + colorCar + '\'' +
                '}';
    }
}
