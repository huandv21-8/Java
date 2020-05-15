package BaiTapNgay16_3_2020.Quan_li_Bai_Do_Xe;

import java.util.ArrayList;
import java.util.Scanner;

public class People {
    int id, age;
    String name, addRess, sex, birthDay;
    Scanner scan = new Scanner(System.in);
    ArrayList<People> listPeople = new ArrayList<>();

    public People() {
    }

    public People(int id, int age, String name, String addRess, String sex, String birthDay) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.addRess = addRess;
        this.sex = sex;
        this.birthDay = birthDay;
    }

    public void input() {
        System.out.println("Nhap id: ");
        id = Integer.parseInt(scan.nextLine());
        System.out.println("Nhap ten: ");
        name = scan.nextLine();
        System.out.println("Nhap tuoi: ");
        age = Integer.parseInt(scan.nextLine());
        System.out.println("Nhap dia chi: ");
        addRess = scan.nextLine();
        System.out.println("Nhap gioi tinh: ");
        sex = scan.nextLine();
        System.out.println("Nhap nam sinh: ");
        birthDay = scan.nextLine();
        System.out.println("");
    }

    public void showInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", addRess='" + addRess + '\'' +
                ", sex='" + sex + '\'' +
                ", birthDay='" + birthDay + '\'' +
                '}';
    }


    public void InputPeople() {
        System.out.println("Nhap so chu so huu can them thong tin: ");
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap chu so huu thu " + (i + 1) + " :");
            People people = new People();
            people.input();
            listPeople.add(people);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddRess() {
        return addRess;
    }

    public void setAddRess(String addRess) {
        this.addRess = addRess;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
}
