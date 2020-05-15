package BaiTapNgay26_2_2020.bai45;

import java.util.Scanner;

public class bai45_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choose;
        int n[]= new int[1];
        do{
            System.out.println("1.Nhập vào số nguyên dương n");
            System.out.println("2.Tính tổng: 1 + 1/2 + 1/3 + ... + 1/n");
            System.out.println("3.Tính tổng: 1 + 1/2! + 1/3! + ... + 1/n!");
            System.out.println("4.Thoát.");
            System.out.print("Choose: ");
            choose = scan.nextInt();

            switch (choose){
                case 1:
                        System.out.print("Nhập số nguyên dương n: ");
                        n[0] = scan.nextInt();
                        if (n[0]<=0){
                            System.out.println("Nhập sai");
                        }
                    break;
                case 2:
                    float h = 1;
                    for (float i=2;i<=n[0];i++){
                        h =h+(1/i);
                    }
                    System.out.printf("Tổng là: %-10.2f \n",h);
                    break;
                case 3:
                    float k=0;
                    float t= 1;
                    for (float j=1;j<=n[0];j++){
                        t = t*j;
                        k= k+ 1/t ;
                    }
                    System.out.printf("Tổng là : %f \n",k);
                    break;
                case 4:
                    System.out.println("Thoát...");
                    break;
                default:
                    System.out.println("Lỗi...");
                    break;
            }

        }while(choose!=4);
        System.out.println("The end.");
    }
}
