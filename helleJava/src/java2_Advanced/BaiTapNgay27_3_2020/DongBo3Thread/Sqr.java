package java2_Advanced.BaiTapNgay27_3_2020.DongBo3Thread;

public class Sqr extends Thread {
    ShareData shareData;

    public Sqr(ShareData shareData) {
        this.shareData = shareData;
    }

    @Override
    public void run() {
        while (shareData.checkTong()) {

            synchronized (shareData) {
                shareData.notifyAll();
                try {
                    while (shareData.getIndext() != 2 && shareData.checkTong()) {
                        shareData.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                int rad = shareData.getRad();
                if (rad % 3 == 0) {
                    rad *= rad;
                    System.out.println("Sqr: " + rad);
                } else {
                    System.out.println(rad + " khong chia het cho 3.");
                }
                System.out.println("tong la: " + shareData.getTong());

                shareData.setIndext(1);          // chạy lại luồng 1
            }
        }
        synchronized (shareData) {
            shareData.notifyAll();
        }
    }
}
