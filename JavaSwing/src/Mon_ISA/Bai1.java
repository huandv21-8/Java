/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mon_ISA;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai1 {

    public static void main(String[] args) {
        int n, a=0, b=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so n phan tu: ");
        n = Integer.parseInt(scan.nextLine());
        int[] t = new int[n];
        int sochan[] = new int[n];
        int sole[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + " : ");
            t[i] = Integer.parseInt(scan.nextLine());         
        }
        for (int i = 0; i < n; i++) {          
            if (t[i] % 2 == 0) {
                sochan[a] = t[i];
                a++;
            } else {
                sole[b] = t[i];
                b++;
            }
        }
        sapxep(sochan,a);
        sapxep(sole,b);
        System.out.print("Mang da sap xep la : ");
              
        hienthi(sochan);
        hienthi(sole);
    }

    public static void sapxep(int[] arr, int m) {
        int c = arr[0];
        for (int i = 0; i < m - 1; i++) {
            for (int j = i + 1; j < m; j++) {
                if (arr[i] > arr[j]) {
                    c = arr[j];
                    arr[j] = arr[i];
                    arr[i] = c;
                }
            }
        }
    }
    
    // cach 2 là dung collection.sort

    public static void hienthi(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
