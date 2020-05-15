package BaiTapNgay6_3_2020.bai51.color;

import java.util.ArrayList;
import java.util.Scanner;

public class ColorManager  {
    ArrayList<String> colorList = new ArrayList<>();

    public void input() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhap so mau can them : ");
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap mau : ");
            String color = scan.nextLine();

            colorList.add(color);
        }
    }

    public void output() {
        for (String color : colorList) {
            System.out.println("color : " + color);
        }
    }

    public ArrayList<String> getColorList() {
        return colorList;
    }
}

