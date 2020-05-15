package java2_Advanced.BaiTapNgay30_3_2020.OnLuyenTongHop_File_OOP_Thread;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Thread1 extends Thread{
    SharedData sharedData;

    public Thread1(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String line = null;
        FileReader fr = null;
        BufferedReader bf = null;
        try {
            fr = new FileReader("d:/Admin/Java2_advanced/student.txt");
            bf = new BufferedReader(fr);
            while (sharedData.isAlive()){
                synchronized (sharedData){
                    line = bf.readLine();             // đọc dữ liệu từ file

                    if (line == null) {              // nếu file rỗng  thì sẽ dừng vòng lặp k đọc nữa.
                        sharedData.setAlive(false);
                        break;
                    }

                    boolean check = Student.checkRollNo(line);      // kiểm tra xem rollNo có đúng k
                    if (check) {                                      // nếu đúng sẽ lưu vào validRollNoNumber và chạy luồng 2
                        Student student = new Student(line);
                        sharedData.getValidRollNumber().add(student);
                        sharedData.setIndex(2);
                    } else {                                       // nếu ko đúng sẽ lưu vào unvalidRollNoNumber và chạy luồng 3

                        sharedData.getUnvalidRollNumber().add(line);
                        sharedData.setIndex(3);
                    }
                    sharedData.notifyAll();
                    try {
                        sharedData.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                synchronized (sharedData){
                    sharedData.notifyAll();
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //đóng file
            if (bf != null) {
                try {
                    bf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
