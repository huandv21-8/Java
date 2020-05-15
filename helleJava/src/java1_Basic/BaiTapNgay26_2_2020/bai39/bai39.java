package BaiTapNgay26_2_2020.bai39;

import java.util.Scanner;

public class bai39 {

    //bài 1
  /*  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0;
        int array[] = new int[10];
        System.out.println("Nhập giá trị cho từng phần tử: ");
        for (int i=0;i<10;i++){
            System.out.print("Phần tử thứ "+ i +": " );
            array[i] = input.nextInt();
            sum += array[i];
        }
        System.out.println("Tổng các phần tử của mảng là :" +sum);
    }*/

    //bài 2
   /* public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int n, sum = 0, i = 0;
        System.out.print("Nhập vào số phần tử của mảng: ");
        n = input.nextInt();
        int array[] = new int[n];
        if (n <= 0) {
            System.out.println("Nhập lỗi !!!");
        } else {
            System.out.println("Nhập giá trị cho từng phần tử:");
            for (i = 0; i < n; i++) {
                System.out.print("Phần tử thứ " + i + ": ");
                array[i] = input.nextInt();
            }

            for (int j = 0; j < n; j++) {
                if (array[j] % 3 == 0) {
                    sum += array[j];
                }
            }
            System.out.println("Tổng các sổ chia hết cho 3 là: "+sum);
        }
    }*/

   //bài 3
   /*public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n, i , j ;
       System.out.print("Nhập số n: ");
       n = input.nextInt();
       for (i=0;i<n;i++){
           for (j=0;j<=i;j++){
           System.out.print("*");
           }
           System.out.println("");

       }
   }*/
}

