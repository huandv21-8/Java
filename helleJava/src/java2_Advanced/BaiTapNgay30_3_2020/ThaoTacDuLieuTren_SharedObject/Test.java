package java2_Advanced.BaiTapNgay30_3_2020.ThaoTacDuLieuTren_SharedObject;

public class Test {
    public static void main(String[] args) {
        Data data = new Data();
        Thread1 thread1 = new Thread1(data);
        Thread2 thread2 = new Thread2(data);

        thread1.start();
        thread2.start();
    }
}
