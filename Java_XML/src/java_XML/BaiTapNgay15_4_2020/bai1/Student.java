package java_XML.BaiTapNgay15_4_2020.bai1;

public class Student {
    //Khai báo các thuộc tính của đối tượng
    String fullname, address, email, rollNo;
    int age;

    // tạo các hàm tạo
    public Student() {
    }

    public Student(String fullname, String address, String email, String rollNo, int age) {
        this.fullname = fullname;
        this.address = address;
        this.email = email;
        this.rollNo = rollNo;
        this.age = age;
    }



    // tạo các bộ get/set để lấy giá trị và gán giá trị.
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {       // hàm hiển thị toString
        return "Student{" +
                "fullname='" + fullname + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", age=" + age +
                '}';
    }

    public void display() {
        System.out.println(toString());         // hiển thị các thuộc tính ra màn hình ( có thể thay toString thành this)
    }
}
