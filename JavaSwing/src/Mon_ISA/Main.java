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
public class Main {

    public static void main(String[] args) {
        Student stdA = new Student();
        Student stdB = new Student();

        stdA.nhap();
        stdB.nhap();
  
        stu(stdB);
        stu(stdA);
       
    }

    public static void stu( Student std) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap chuooi can tim");
        String a = scan.nextLine();
        String b = std.toString();
        if (b.contains(a)) {
           std.hienthi();
        }
    }
}
