package java_XML.BaiTapNgay15_4_2020.AptechClass;

import java.util.ArrayList;
import java.util.List;

public class Class {
    String classname;
    Teacher teacher;
    String addressclass;
    List<Student> studentList = new ArrayList<>();

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getAddressclass() {
        return addressclass;
    }

    public void setAddressclass(String addressclass) {
        this.addressclass = addressclass;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void output() {
        System.out.println("Class name: " + classname);
        System.out.println("Class address: " + addressclass);
        System.out.println(teacher);
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
