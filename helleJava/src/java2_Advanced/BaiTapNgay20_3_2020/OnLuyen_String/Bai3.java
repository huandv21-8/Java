package java2_Advanced.BaiTapNgay20_3_2020.OnLuyen_String;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<StringBuilder> stringBuilders = new ArrayList<>();

        System.out.println("Nhap vap so chuoi: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap chuoi thu " + (i + 1) + " :");
            StringBuilder string = new StringBuilder(scanner.nextLine());
            stringBuilders.add(string);
        }

        for (StringBuilder abc : stringBuilders) {
            if (abc.toString().contains("searching")) {
                System.out.println(abc);
            }
        }
    }
}
