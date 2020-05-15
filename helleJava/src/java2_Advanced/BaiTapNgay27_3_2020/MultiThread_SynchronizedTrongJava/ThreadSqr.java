package java2_Advanced.BaiTapNgay27_3_2020.MultiThread_SynchronizedTrongJava;

public class ThreadSqr extends Thread {
    ShareData shareData;

    public ThreadSqr(ShareData shareData) {
        this.shareData = shareData;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (; ; ) {
            synchronized (shareData) {
                try {
                    shareData.notifyAll();
                    shareData.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                int rad = shareData.getRad();
                rad *= rad;
                System.out.println("Square: " + rad);
                System.out.println("");

            }
        }
    }
}
