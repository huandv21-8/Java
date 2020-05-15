package java2_Advanced.BaiTapNgay30_3_2020.KyTuTuAZ;

public class Data {
    int rad;
    int time = 0;

    public Data() {
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public synchronized void addtime(int a) {
        time += a;
    }

    public synchronized boolean chekTime() {
        if (time >= 20000) {
            return false;
        }
        return true;
    }
}
