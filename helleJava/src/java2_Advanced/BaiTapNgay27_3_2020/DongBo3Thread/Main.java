package java2_Advanced.BaiTapNgay27_3_2020.DongBo3Thread;


public class Main {
    public static void main(String[] args) {

        ShareData shareData = new ShareData();

        IntRandom intRandom = new IntRandom(shareData);
        Sqr sqr = new Sqr(shareData);
        Divide divide = new Divide(shareData);


        intRandom.start();
        sqr.start();
        divide.start();


    }
}
