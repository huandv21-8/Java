package BaiTapNgay4_3_2020.Bai47.Cau1;

        import java.util.Scanner;

public class Employee {
    String name;
    String sex;
    String addRess;
    String position;
    double salary;

    public Employee() {
    }

    public Employee(String name, String sex, String addRess, String position, double salary) {
        this.name = name;
        this.sex = sex;
        this.addRess = addRess;
        this.position = position;
        this.salary = salary;
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

    public String getAddRess() {
        return addRess;
    }

    public void setAddRess(String addRess) {
        this.addRess = addRess;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = scan.nextLine();
        System.out.println("Nhap gioi tinh: ");
        sex = scan.nextLine();
        System.out.println("Nhap dia chi: ");
        addRess = scan.nextLine();
        System.out.println("Nhap chuc vu: ");
        position = scan.nextLine();
        System.out.println("Nhap luong: ");
        salary = Double.parseDouble(scan.nextLine());
        System.out.println("");
    }

    public void output() {
        System.out.println("Ten la: " + name);
        System.out.println("Gioi tinh la: " + sex);
        System.out.println("Dia chi la: " + addRess);
        System.out.println("Chuc vu la: " + position);
        System.out.println("Luong la: " + salary);
        System.out.println("");
    }
}
