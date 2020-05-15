package java2_Advanced.BaiTapNgay27_3_2020.DongBo3Thread;


import java.util.Random;

public class IntRandom extends Thread {
    ShareData shareData;


    public IntRandom(ShareData shareData) {
        this.shareData = shareData;
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (shareData.checkTong()) {
            synchronized (shareData) {
                int rad = random.nextInt(100) + 1;
                shareData.setRad(rad);
                System.out.println("Rad: " + rad);
                shareData.tong(rad);

                if (rad % 3 == 0) {                  // nếu rad chia hết cho 3 thì luồng 2 đc chạy và luồng 3 k đc chạy
                    shareData.setIndext(2);
                } else {                              // nếu rad k chia hết cho 3 thì luồng 3 đc chạy
                    shareData.setIndext(3);
                }

                shareData.notifyAll();
                try {
                    shareData.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        synchronized (shareData) {
            shareData.notifyAll();
        }
    }
}
