package java2_Advanced.BaiTapNgay27_3_2020.OnLuyenFile_MultiThread.Bai2;

import java.io.Serializable;
import java.util.Scanner;
import java.util.regex.Pattern;

public class VeMayBay  implements Serializable {
    String ma, tenChuyenBay, ngayBay, hanhLyKiGui;
    float giave;


    public VeMayBay() {
    }

    public VeMayBay(String ma, String tenChuyenBay, String ngayBay, String hanhLyKiGui, Float giave) {
        this.ma = ma;
        this.tenChuyenBay = tenChuyenBay;
        this.ngayBay = ngayBay;
        this.hanhLyKiGui = hanhLyKiGui;
        this.giave = giave;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }


    public String getTenChuyenBay() {
        return tenChuyenBay;
    }

    public void setTenChuyenBay(String tenChuyenBay) {
        this.tenChuyenBay = tenChuyenBay;
    }

    public String getNgayBay() {
        return ngayBay;
    }

    public void setNgayBay(String ngayBay) {
        this.ngayBay = ngayBay;
    }

    public String getHanhLyKiGui() {
        return hanhLyKiGui;
    }

    public void setHanhLyKiGui(String hanhLyKiGui) {
        this.hanhLyKiGui = hanhLyKiGui;
    }

    public float getGiave() {
        return giave;
    }

    public void setGiave(float giave) {
        this.giave = giave;
    }

    public static boolean checkMa1(String roll) {
        String VJABB = "[V][J][1-9][0-9]{2}";
        boolean check1 = Pattern.matches(VJABB, roll);
        return check1;
    }

    public static boolean checkMa2(String roll) {
        String VNABBC = "[V][N][1-9][0-9]{2}[0-9]?";
        boolean check2 = Pattern.matches(VNABBC, roll);
        return check2;
    }

    public static boolean checkMa3(String roll) {
        String JETABB = "[J][E][T][0-9][0-9]{2}";
        boolean check3 = Pattern.matches(JETABB, roll);
        return check3;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tên chuyen bay: ");
        tenChuyenBay = scanner.nextLine();
        System.out.println("Nhap ngay bay");
        ngayBay = scanner.nextLine();
        System.out.println("Nhap hanh ly ki gui: ");
        hanhLyKiGui = scanner.nextLine();
        System.out.println("Nhap gia ve: ");
        giave = Float.parseFloat(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "VeMayBay{" +
                "ma='" + ma + '\'' +
                ", tenChuyenBay='" + tenChuyenBay + '\'' +
                ", ngayBay='" + ngayBay + '\'' +
                ", hanhLyKiGui='" + hanhLyKiGui + '\'' +
                ", giave='" + giave + '\'' +
                '}';
    }

    public void display() {
        System.out.println(toString());
    }

    public String getline() {
        return ma + ", " + tenChuyenBay + ", " + ngayBay + ", " + hanhLyKiGui + ", " + giave + "\n";
    }

}

