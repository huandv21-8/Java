package java2_Advanced.BaiTapNgay30_3_2020.KyTuTuAZ;

import java.util.Random;

public class Thread1 extends Thread {
    Data data;

    public Thread1(Data data) {
        this.data = data;
    }

    Random random = new Random();

    @Override
    public void run() {

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (data.chekTime()) {
            synchronized (data) {

                int minrad = (int) 'a';
                int maxrad = (int) 'z';
                int b = maxrad - minrad;

                int rad = random.nextInt(b) + minrad;
                char c = (char) rad;                            // ép sang kí tự
                System.out.println("rad: " + c);
                data.setRad(rad);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                data.addtime(2000);                            // thêm thời gian vào addTime


                data.notifyAll();
                try {
                    data.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
