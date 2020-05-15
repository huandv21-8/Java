package BaiTapNgay2_3_2020.Bai7.BaiTap1;

import java.util.Scanner;

public class Student extends Person {
    String id;
    float point;
    String email;

    public Student() {
    }

    public Student(String name, String sex, String birthday, String addRess, String id, float point, String email) {
        super(name, sex, birthday, addRess);
        this.id = id;
        this.point = point;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public boolean setId(String id) {
        if (id.length() != 8 && id.contains(" ")) {
            System.err.println("Mã sinh viên phải đủ 8 kí tự.");
        } else {
            return true;
        }
        return false;
    }

    public float getPoint() {
        return point;
    }

    public boolean setPoint(float point) {
        if (0.0>point && point>10.0){
            System.err.println("Nhập sai điểm.");
        }else {
            return true;
        }
        return false;
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (!email.contains("@") && email.contains(" ")){
            System.err.println("Nhập sai email.");
        }else {
            return true;
        }
        return false;
    }

    @Override
    public void input() {
        super.input();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap id: ");
        id= scan.nextLine();
        System.out.println("Nhap diem trung binh: ");
        point= Float.parseFloat(scan.nextLine());
        System.out.println("Nhap email: ");
        email=scan.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("id la: ");
        System.out.println("Diem trung binh la: ");
        System.out.println("email la: ");
    }
}
