package java2_Advanced.BaiTapNgay27_3_2020.BaiToanDaLuong_DocFile;

public class Data {
    int rad1;
    int rad2;

    public Data(int rad1, int rad2) {
        this.rad1 = rad1;
        this.rad2 = rad2;
    }

    public int getRad1() {
        return rad1;
    }

    public void setRad1(int rad1) {
        this.rad1 = rad1;
    }

    public int getRad2() {
        return rad2;
    }

    public void setRad2(int rad2) {
        this.rad2 = rad2;
    }

    public String Line( int rad1, int rad2) {
        return rad1 + "\n" + rad2;
    }
}
