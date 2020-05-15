package BaiTapNgay26_2_2020.bai43;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n = abc.nextInt();
        int s=0;
        for (int i =1; i<=n;i++){
            s=s+i;
        }
        System.out.println("tổng là: "+s);
    }
}
