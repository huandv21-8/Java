package java2_Advanced.BaiTapNgay30_3_2020.KyTuTuAZ;

public class Thread2 extends Thread {
    Data data;

    public Thread2(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        while (data.chekTime()) {
            synchronized (data){
                data.notifyAll();
                try {
                    data.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                int rad = data.getRad();
                char b = (char) (rad - 32);
                System.out.println("t2:" + b);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                data.addtime(1000);
            }

        }
        synchronized (data){
           data.notifyAll();
        }
    }
}
