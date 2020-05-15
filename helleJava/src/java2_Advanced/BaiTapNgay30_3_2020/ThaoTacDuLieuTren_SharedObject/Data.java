package java2_Advanced.BaiTapNgay30_3_2020.ThaoTacDuLieuTren_SharedObject;

public class Data {
    int total;

    public Data() {
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public synchronized void tinhTotal( int rad){
        total += rad;
    }
    public synchronized boolean checkTotal(){
        if( -100 >= total || total >= 100){
            return false;
        }
        return true;
    }
}
