package java2_Advanced.BaiTapNgay27_3_2020.MultiThread_SynchronizedTrongJava;

public class Test {
    public static void main(String[] args) {
        ShareData shareData = new ShareData();

        ThreadRandom threadRandom = new ThreadRandom(shareData);
        ThreadSqr threadSqr = new ThreadSqr(shareData);

        threadRandom.start();
        threadSqr.start();

    }
}
