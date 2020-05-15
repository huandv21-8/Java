package BaiTapNgay16_3_2020.Quan_li_Bai_Do_Xe;

public class Container extends Vehicle {
    public Container() {
        width=3;
        height=5;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("chieu rong: "+width);
        System.out.println("chieu dai: "+height);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("chieu rong: "+width);
        System.out.println("chieu dai: "+height);
    }
}
