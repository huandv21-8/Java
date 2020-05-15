package ViDu;

import java.util.Scanner;

public class hinhtron {
    float radius;
    public double getPI(){
        return Math.PI;
    }

    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập bán kính:");
        float radius = input.nextFloat();
    }

    void chuviht(){
        float v;
        v =(float) (2*getPI()*radius);
        System.out.format("chu vi hình tròn : %f \n", v);
    }
    void dientichht(){
        float s;
        s = (float) (getPI()*radius*radius);
        System.out.format("diện tích hình tròn : %f\n", s);
    }

}
