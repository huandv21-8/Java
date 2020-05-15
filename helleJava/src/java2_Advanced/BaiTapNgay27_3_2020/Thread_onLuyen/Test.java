package java2_Advanced.BaiTapNgay27_3_2020.Thread_onLuyen;

public class Test {
    public static void main(String[] args) {
        Thread1 thread1= new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();

    }
}

