package BaiTapNgay11_3_2020.OnLuyenKt60p;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = Integer.parseInt(scan.nextLine());
        if (n <= 0) {
            System.out.println("Moi nhap n > 0.");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                int a = i;
                sum = sum + a;
            }
            System.out.println("tong la: " + sum);
        }
    }
}
