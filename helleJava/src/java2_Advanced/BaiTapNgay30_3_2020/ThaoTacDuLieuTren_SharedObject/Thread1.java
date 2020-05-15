package java2_Advanced.BaiTapNgay30_3_2020.ThaoTacDuLieuTren_SharedObject;

import java.util.Random;

public class Thread1 extends Thread {
    Data data;

    public Thread1(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (data.checkTotal()) {
            synchronized (data){
                int rad = random.nextInt(99) + 1;
                System.out.println(" rad 1: " + rad);
                data.tinhTotal(rad);

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
