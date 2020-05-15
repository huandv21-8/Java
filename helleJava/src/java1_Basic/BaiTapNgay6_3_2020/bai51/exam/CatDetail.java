package BaiTapNgay6_3_2020.bai51.exam;

import java.util.Scanner;

public class CatDetail implements Icat {
    String species, color, noisong;

    public CatDetail() {
    }

    public CatDetail(String species, String color, String noisong) {
        this.species = species;
        this.color = color;
        this.noisong = noisong;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNoisong() {
        return noisong;
    }

    public void setNoisong(String noisong) {
        this.noisong = noisong;
    }

    @Override
    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap loai: ");
        species = scan.nextLine();

        System.out.println("Nhap mau: ");
        color = scan.nextLine();

        System.out.println("Nhap noi song: ");
        noisong = scan.nextLine();
        System.out.println("");
    }

    @Override
    public void output() {
        System.out.println("ten: " + name);
        System.out.println("loai: " + species);
        System.out.println("mau: " + color);
        System.out.println("noisong: " + noisong);
        System.out.println("");
    }

}