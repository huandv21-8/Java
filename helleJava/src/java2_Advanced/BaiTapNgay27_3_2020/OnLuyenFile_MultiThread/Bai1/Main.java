package java2_Advanced.BaiTapNgay27_3_2020.OnLuyenFile_MultiThread.Bai1;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        T1 t1= new T1(data);
        T2 t2 = new T2(data);

        t1.start();
        t2.start();

    }
}
