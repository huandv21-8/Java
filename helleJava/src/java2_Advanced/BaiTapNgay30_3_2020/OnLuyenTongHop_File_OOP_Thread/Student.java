package java2_Advanced.BaiTapNgay30_3_2020.OnLuyenTongHop_File_OOP_Thread;

import java.io.Serializable;
import java.util.regex.Pattern;

public class Student implements Serializable {
    String rollNo;

    public Student() {
    }

    public Student(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public static boolean checkRollNo(String rollNo) {                     // check xem rollNo theo kiểu Pattern
        String pattern = "[CTN][0-9]{4}[GHIKLM][V]?[0-9]{4}";
        boolean bol = Pattern.matches(pattern,rollNo);
        return bol;
    }
}
