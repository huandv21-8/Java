package java2_Advanced.BaiTapNgay27_3_2020.DongBo3Thread;

public class ShareData {
    int rad;
    int tong;
    int indext;
    public ShareData() {
        tong = 0;
        indext = 1;
    }

    public int getIndext() {
        return indext;
    }

    public void setIndext(int indext) {
        this.indext = indext;
    }


    public void setTong(int tong) {
        this.tong = tong;
    }

    public int getTong() {
        return tong;
    }


    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public synchronized void tong(int value) {
        tong += value;
    }

    public synchronized boolean checkTong() {
        if (tong >= 200) {
            return false;
        }
        return true;
    }

}
