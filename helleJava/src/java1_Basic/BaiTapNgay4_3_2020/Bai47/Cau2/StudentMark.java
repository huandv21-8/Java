package BaiTapNgay4_3_2020.Bai47.Cau2;

        import javax.swing.*;
        import java.util.Scanner;

public class StudentMark {
    int rollNumber;
    String fullName;
    String lop;
    String subjects;
    float point;

    public StudentMark() {
    }

    public StudentMark(int rollNumber, String fullName, String lop, String subjects, float point) {
        this.rollNumber = rollNumber;
        this.fullName = fullName;
        this.lop = lop;
        this.subjects = subjects;
        this.point = point;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    public void input() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thong tin:");

        System.out.println("Nhap rollNumber: ");
        rollNumber = Integer.parseInt(scan.nextLine());

        System.out.println("Nhap ten: ");
        fullName = scan.nextLine();

        System.out.println("Nhap lop: ");
        lop = scan.nextLine();

        System.out.println("Nhap mon hoc: ");
        subjects = scan.nextLine();

        System.out.println("Nhap diem: ");
        point = Float.parseFloat(scan.nextLine());
        System.out.println("");
    }

    @Override
    public String toString() {
        return "StudentMark{" +
                "rollNumber=" + rollNumber +
                ", fullName='" + fullName + '\'' +
                ", lop='" + lop + '\'' +
                ", subjects='" + subjects + '\'' +
                ", point=" + point +
                '}';
    }

    public void output() {
        System.out.println(toString());
    }

    public static void main(String[] args) {
        StudentMark std = new StudentMark();
        std.input();
        std.output();
        StudentMark std1 = new StudentMark(1, "Do Van Huan", "T1907A", "Lap Trinh", 10);
        std1.output();
        System.out.println("Thong tin nguoi co diem cau nhat la: ");
        if (std.point < std1.point) {
            std1.output();
        } else if (std.point > std1.point) {
            std.output();
        } else {
            System.out.println("2 nguoi bang diem.");
        }

    }

}
