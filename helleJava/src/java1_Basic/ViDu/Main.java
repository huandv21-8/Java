package ViDu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        hinhtron cir = new hinhtron();
        HinhChuNhat hcn = new HinhChuNhat();
        int choose;
        Scanner input = new Scanner(System.in);

        do {
            showMenu();
            choose = input.nextInt();

            switch (choose){
                case 1:
                    cir.input();
                    break;
                case 2:
                   cir.chuviht();
                    break;
                case 3:
                    cir.dientichht();
                    break;
                case 4:
                    hcn.input();
                    break;
                case 5:
                    hcn.chuvihcn();
                    break;
                case 6:
                    hcn.dientichhcn();
                    break;
                case 7:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Nhập lỗi!!!");
                    break;
            }
        }while (choose != 7);
    }
    static void showMenu(){
        System.out.println("1. Nhập thông tin hình tròn");
        System.out.println("2. Tính chu vi hình tròn");
        System.out.println("3. Tính diện tích hình tròn");
        System.out.println("4. Nhập thông tin hình chử nhật");
        System.out.println("5. Tính chu vi hình chữ nhật");
        System.out.println("6. Tính diện tích hình chữ nhật");
        System.out.println("7. Thoát");
        System.out.print("Choose: ");
    }

}
