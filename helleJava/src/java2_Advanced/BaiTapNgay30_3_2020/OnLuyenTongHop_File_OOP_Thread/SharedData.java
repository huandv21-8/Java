package java2_Advanced.BaiTapNgay30_3_2020.OnLuyenTongHop_File_OOP_Thread;

import java.util.ArrayList;
import java.util.List;

public class SharedData {
    int index;            // biến index để xem chạy xonh luông 1 thì luồng nào sẽ được chạy tiếp
    boolean alive;           // alive để kiểm tra nếu file student.txt rỗng thì vòng lặp while ở luồng 1,2,3 sẽ dừng.
    List<Student> validRollNumber = new ArrayList<>();
    List<String> unvalidRollNumber = new ArrayList<>();

    public SharedData() {
        index = 1;
        alive = true;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public List<Student> getValidRollNumber() {
        return validRollNumber;
    }

    public void setValidRollNumber(List<Student> validRollNumber) {
        this.validRollNumber = validRollNumber;
    }

    public List<String> getUnvalidRollNumber() {
        return unvalidRollNumber;
    }

    public void setUnvalidRollNumber(List<String> unvalidRollNumber) {
        this.unvalidRollNumber = unvalidRollNumber;
    }
}
