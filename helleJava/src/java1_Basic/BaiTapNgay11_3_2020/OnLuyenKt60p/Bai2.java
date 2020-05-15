package BaiTapNgay11_3_2020.OnLuyenKt60p;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap vao so cac so nguyen: ");
        int n = Integer.parseInt(scan.nextLine());
        Integer[] soNguyen = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap vao phan tu thu "+(i+1)+" :");
            soNguyen[i] = Integer.parseInt(scan.nextLine());
        }
        for (int i = 0; i <soNguyen.length ; i++) {
            if (soNguyen[i] %2 ==0){
                System.out.println("cac phan tu chia het cho 2 la: "+ soNguyen[i]);
            }
        }
    }
}
