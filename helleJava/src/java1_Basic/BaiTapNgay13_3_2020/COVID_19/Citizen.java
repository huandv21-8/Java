package java1_Basic.BaiTapNgay13_3_2020.COVID_19;

import java.util.Arrays;
import java.util.Scanner;

public class Citizen {
    String name;
    String cmnd;
    String age;
    String sex;
    String diaChiThuongChu;
    String diaChiTamChu;
    String tinhTrang ;
    String[] loTrinh;


    public Citizen() {
        tinhTrang = "bình thường";
        loTrinh = null;
    }

    public void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = scan.nextLine();
        System.out.println("Nhap cmnd: ");
        cmnd = scan.nextLine();
        System.out.println("Nhap tuoi: ");
        age = scan.nextLine();
        System.out.println("Nhap gioi tinh: ");
        sex = scan.nextLine();
        System.out.println("Nhap dia chi thuong chu: ");
        diaChiThuongChu = scan.nextLine();
        System.out.println("Nhap dia chi tam chu: ");
        diaChiTamChu = scan.nextLine();
//        System.out.println("Nhap tinh trang suc khoe: " + tinhTrang);
//        System.out.println("Nhap lo trinh: " + loTrinh);
    }
    public void hienThi(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", cmnd='" + cmnd + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", diaChiThuongChu='" + diaChiThuongChu + '\'' +
                ", diaChiTamChu='" + diaChiTamChu + '\'' +
                ", tinhTrang='" + tinhTrang + '\'' +
                ", loTrinh=" + Arrays.toString(loTrinh) +
                '}';
    }

    public Citizen(String name, String cmnd, String age, String sex,
                   String diaChiThuongChu, String diaChiTamChu,
                   String tinhTrang, String[] loTrinh) {
        this.name = name;
        this.cmnd = cmnd;
        this.age = age;
        this.sex = sex;
        this.diaChiThuongChu = diaChiThuongChu;
        this.diaChiTamChu = diaChiTamChu;
        this.tinhTrang = tinhTrang;
        this.loTrinh = loTrinh;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDiaChiThuongChu() {
        return diaChiThuongChu;
    }

    public void setDiaChiThuongChu(String diaChiThuongChu) {
        this.diaChiThuongChu = diaChiThuongChu;
    }

    public String getDiaChiTamChu() {
        return diaChiTamChu;
    }

    public void setDiaChiTamChu(String diaChiTamChu) {
        this.diaChiTamChu = diaChiTamChu;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String[] getLoTrinh() {
        return loTrinh;
    }

    public void setLoTrinh(String[] loTrinh) {
        this.loTrinh = loTrinh;
    }


}
