package BaiTapNgay2_3_2020.Bai7.BaiTap1;

import java.util.Scanner;

public class Person {
    String name;
    String sex;
    String birthday;
    String addRess;

    public Person() {
    }

    public Person(String name, String sex, String birthday, String addRess) {
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.addRess = addRess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddRess() {
        return addRess;
    }

    public void setAddRess(String addRess) {
        this.addRess = addRess;
    }


    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = scan.nextLine();
        System.out.println("Nhap gioi tinh: ");
        sex = scan.nextLine();
        System.out.println("Nhap ngay sinh: ");
        birthday = scan.nextLine();
        System.out.println("Nhap dia chi: ");
        addRess = scan.nextLine();
    }

    public void output() {
        System.out.println("Ten la: " + name);
        System.out.println("Gioi tinh la: " + sex);
        System.out.println("Ngay sinh la: " + birthday);
        System.out.println("Dia chi la: " + addRess);
    }
}
