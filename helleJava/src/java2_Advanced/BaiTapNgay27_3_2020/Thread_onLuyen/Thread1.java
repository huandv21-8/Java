package java2_Advanced.BaiTapNgay27_3_2020.Thread_onLuyen;

import java.util.ArrayList;
import java.util.Random;

public class Thread1 extends Thread {
    ArrayList<Integer> list1 = new ArrayList<>();

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Random random = new Random();
                int n = random.nextInt(101);
                Thread.sleep(1000);
                list1.add(n);
                System.out.println("T1: " + n);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
