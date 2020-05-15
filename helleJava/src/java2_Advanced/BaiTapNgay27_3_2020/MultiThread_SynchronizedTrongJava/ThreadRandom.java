package java2_Advanced.BaiTapNgay27_3_2020.MultiThread_SynchronizedTrongJava;

import java.util.Random;

public class ThreadRandom extends Thread {
    ShareData shareData;


    public ThreadRandom(ShareData shareData) {
        this.shareData = shareData;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Random random = new Random();

        for (; ; ) {
            synchronized (shareData) {
                int rad = random.nextInt(20) + 1;
                shareData.setRad(rad);
                System.out.println("Rad : " + rad);

                try {
                    shareData.notifyAll();
                    shareData.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

