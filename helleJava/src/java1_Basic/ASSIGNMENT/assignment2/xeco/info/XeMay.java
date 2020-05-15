package java1_Basic.ASSIGNMENT.assignment2.xeco.info;

import java.util.Scanner;

public class XeMay implements IXe {

    String bienso;
    String loaixe;
    String mauxe;
    float giatien;

    public XeMay() {
    }

    public XeMay(String bienso, String loaixe, String mauxe, float giatien) {
        this.bienso = bienso;
        this.loaixe = loaixe;
        this.mauxe = mauxe;
        this.giatien = giatien;
    }

    public String getBienso() {
        return bienso;
    }

    public void setBienso(String bienso) {
        this.bienso = bienso;
    }

    public String getLoaixe() {
        return loaixe;
    }

    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }

    public String getMauxe() {
        return mauxe;
    }

    public void setMauxe(String mauxe) {
        this.mauxe = mauxe;
    }

    public float getGiatien() {
        return giatien;
    }

    public void setGiatien(float giatien) {
        this.giatien = giatien;
    }

    @Override
    public void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap bien so: ");
        bienso = scan.nextLine();
        System.out.println("Nhap loai xe: ");
        loaixe = scan.nextLine();
        System.out.println("Nhap mau xe: ");
        mauxe = scan.nextLine();
        System.out.println("Nhap gia tien");
        giatien = Float.parseFloat(scan.nextLine());
        System.out.println("");
    }

    @Override
    public void hienthi() {
        System.out.println("Bien so la:" + bienso);
        System.out.println("Loai xe la:" + loaixe);
        System.out.println("Mau xe la:" + mauxe);
        System.out.println("Gia tien la:" + giatien);
        System.out.println("");
    }
}
