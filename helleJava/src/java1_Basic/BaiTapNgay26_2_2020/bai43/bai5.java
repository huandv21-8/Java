package BaiTapNgay26_2_2020.bai43;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("giải pt bậc 2.");
        System.out.print("Nhập lần lượt a,b,c:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a == 0) {
            if (b==0){
                System.out.println("pt vô nghiệm");
            }else {
                System.out.println("pt có 1 nghiệm x = "+ ((-1*c)/b));
            }
        }else {
            int h = b*b-4*a*c;

            if (h>0){
                System.out.println("x1=" + (float) ((-b + Math.sqrt(h)) / (2*a)));
                System.out.println("x2=" + (float) ((-b - Math.sqrt(h)) / (2*a)));
            }else if (h==0){
                System.out.println("pt có nghiệm kép x1 = x2 = " + (float) (-b / (2 * a)));
            }else {
                System.out.println("pt vô nghiệm");
            }

        }
    }
}
