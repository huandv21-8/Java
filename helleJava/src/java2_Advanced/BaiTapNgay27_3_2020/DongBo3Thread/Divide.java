package java2_Advanced.BaiTapNgay27_3_2020.DongBo3Thread;

public class Divide extends Thread {
    ShareData shareData;

    public Divide(ShareData shareData) {
        this.shareData = shareData;
    }

    @Override
    public void run() {

        while (shareData.checkTong()) {
            synchronized (shareData) {
                shareData.notifyAll();
                try {
                    while (shareData.getIndext() != 3 && shareData.checkTong() ) {
                        shareData.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int rad = shareData.getRad();
                if (rad % 2 == 0) {
                    if (rad % 4 == 4) {
                        System.out.println(rad + " chia het cho 4.");
                    } else {
                        System.out.println(rad + " khong chia het cho 4.");
                    }
                } else {
                    System.out.println(rad + " khong chia het cho 2");
                }
                System.out.println("tong la: " + shareData.getTong());
                shareData.setIndext(1);             // chạy lại luồng 1
            }

        }
        synchronized (shareData) {
            shareData.notifyAll();
        }
    }
}
