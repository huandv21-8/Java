package java2_Advanced.BaiTapNgay20_3_2020.QuanLySinhVienBang_hashmap;


import java.util.Scanner;

public class Student {
    String RollNo, Name, Sex, Email, Address;
    int age;
    public Student() {
    }

    public Student(String rollNo, String name, String sex, String email, String address, int age) {
        RollNo = rollNo;
        Name = name;
        Sex = sex;
        Email = email;
        Address = address;
        this.age = age;
    }

    public void input(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ");
        RollNo = scan.nextLine();
        System.out.println("Nhap ten sinh  vien: ");
        Name = scan.nextLine();
        System.out.println("Nhap gioi tinh: ");
        Sex = scan.nextLine();
        System.out.println("Nhap email: ");
        Email = scan.nextLine();
        System.out.println("Nhap tuoi: ");
        age = Integer.parseInt(scan.nextLine());
        System.out.println("Nhap dia chi: ");
        Address = scan.nextLine();
        System.out.println("");
    }

    public void output(){
        System.out.println(toString());
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Student{" +
                "RollNo='" + RollNo + '\'' +
                ", Name='" + Name + '\'' +
                ", Sex='" + Sex + '\'' +
                ", Email='" + Email + '\'' +
                ", Address='" + Address + '\'' +
                ", age=" + age +
                '}';
    }
}
