package ViDuOLop.vd2;

import java.util.Scanner;

public class CongTruNhanChia {
    float a;
    float b;
    public void input(){
        Scanner abc = new Scanner(System.in);
        System.out.print("Nhập 2 số a và b: ");
        a = abc.nextFloat();
        b = abc.nextFloat();
    }
    void cong(){
        System.out.println("tổng là : " + (a+b));

    }
    void tru(){
        if (a>b){
            System.out.println("hiệu là : " + (a-b));

        }else{
            System.out.println("hiệu là : " + (b-a));
        }
    }
    void nhan(){
        System.out.println("tích là : " + (a*b));
    }
    void chia(){
        System.out.println("thương là : " + (a/b));
    }
}
