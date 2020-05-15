package java2_Advanced.BaiTapNgay23_3_2020.File_quanLiSinhVien;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable {
    String id, name,addRess;
    int age;
    Float gpa;

    public Student() {
    }

    public Student(String id, String name, String addRess, int age, Float gpa) {
        this.id = id;
        this.name = name;
        this.addRess = addRess;
        this.age = age;
        this.gpa = gpa;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id:");
        id = scanner.nextLine();
        System.out.println("Nhap ten:");
        name = scanner.nextLine();
        System.out.println("Nhap tuoi:");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap dia chi:");
        addRess = scanner.nextLine();
        System.out.println("Nhap diem trung binh:");
        gpa = Float.parseFloat(scanner.nextLine());
    }
    public void output(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Student {" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", addRess='" + addRess + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Float getGpa() {
        return gpa;
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }
}
