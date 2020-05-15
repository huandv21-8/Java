package ViDu;

import java.util.Scanner;

public class HinhChuNhat {
    float width;
    float height;



    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chiều rộng:");
        float width = input.nextFloat();
        System.out.println("Nhập chiều dài");
        float height = input.nextFloat();
    }

    void dientichhcn() {
        float a = width * height;
        System.out.format("diện tích hình chữ nhật: %f\n", a);
    }

    void chuvihcn() {
        float b = 2 * (width + height);
        System.out.format("chu vi hình chữ nhật: %f \n", b);
    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
    
//        System.out.println("Nhập chiều rộng:");
//        float width = input.nextFloat();
//        System.out.println("Nhập chiều dài");
//        float height = input.nextFloat();

//        float a =  (float) width*height;
//        System.out.format("diện tích hình chữ nhật: %f\n" , a);

//        float b = (float) 2*(width+height);
//        System.out.format("chu vi hình chữ nhật: %f \n" , b);
//    }
}

