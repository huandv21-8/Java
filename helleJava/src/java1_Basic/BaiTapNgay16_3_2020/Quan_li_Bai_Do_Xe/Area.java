package BaiTapNgay16_3_2020.Quan_li_Bai_Do_Xe;

import java.util.ArrayList;
import java.util.Scanner;

public class Area {
    String location;
    int width, height;
    ArrayList<Vehicle> listVehicle = new ArrayList<>();

    public Area() {
    }

    public Area(String location, int width, int height) {
        this.location = location;
        this.width = width;
        this.height = height;
    }

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vi tri:");
        location = scan.nextLine();
        System.out.println("Nhap chieu rong:");
        width = Integer.parseInt(scan.nextLine());
        System.out.println("Nhap chieu dai:");
        height = Integer.parseInt(scan.nextLine());
    }

    public void showInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Area{" +
                "location='" + location + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", listVehicle=" + listVehicle +
                '}';
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
