package java2_Advanced.BaiTapNgay30_3_2020.OnLuyenTongHop_File_OOP_Thread;

public class Test {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();
        Thread1 thread1 = new Thread1(sharedData);
        Thread2 thread2 = new Thread2(sharedData);
        Thread3 thread3 = new Thread3(sharedData);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
