package java2_Advanced.BaiTapNgay27_3_2020.OnLuyenFile_MultiThread.Bai1;

public class T2 extends Thread {
    Data data;

    public T2(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        for (int i = 0; i < data.t2.length; i++) {
            synchronized (data) {
                try {
                    data.notifyAll();
                    data.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Dia chi: " + data.t2[i]);
            }
        }
        synchronized (data) {
            data.notifyAll();
        }

    }
}
