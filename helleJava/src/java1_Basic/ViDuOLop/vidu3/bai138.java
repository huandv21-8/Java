package ViDuOLop.vidu3;

import java.util.Scanner;

public class bai138 {

        public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);
            String str ;
            str = scan.nextLine();
            StringBuilder stb = new StringBuilder(str);
            stb.reverse();
            System.out.println(stb);
        }
}
