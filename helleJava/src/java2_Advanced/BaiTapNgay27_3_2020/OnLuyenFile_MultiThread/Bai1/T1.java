package java2_Advanced.BaiTapNgay27_3_2020.OnLuyenFile_MultiThread.Bai1;

public class T1 extends Thread {
    Data data;


    public T1(Data data) {
        this.data = data;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 5; i++) {
            synchronized (data) {

                System.out.println("Ho va ten: " + data.t1[i]);

                try {
                    data.notifyAll();
                    data.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        synchronized (data) {
            data.notifyAll();
        }

    }
}
