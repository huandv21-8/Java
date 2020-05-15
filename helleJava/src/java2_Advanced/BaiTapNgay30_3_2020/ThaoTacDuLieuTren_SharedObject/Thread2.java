package java2_Advanced.BaiTapNgay30_3_2020.ThaoTacDuLieuTren_SharedObject;

import java.util.Random;

public class Thread2 extends Thread {
    Data data;

    public Thread2(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (data.checkTotal()) {
            synchronized (data){
                data.notifyAll();
                try {
                    data.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int rad2 = random.nextInt(100) -100;
                System.out.println(" rad 2: " + rad2);
                data.tinhTotal(rad2);
            }
        }
        synchronized (data){
            data.notifyAll();
        }
    }
}
