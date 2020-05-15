package java2_Advanced.BaiTapNgay20_3_2020.OnLuyen_String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Nhap n so muon them: ");
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap so thu " + (i + 1) + " :");
            list.add(scan.nextInt());
        }

        for (Integer number : list) {
            System.out.println("Danh sach cac so vua nhap: " + number);
        }
    }
}
