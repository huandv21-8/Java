package java2_Advanced.BaiTapNgay30_3_2020.OnLuyenTongHop_File_OOP_Thread;


import java.io.*;

public class Thread2 extends Thread {
    SharedData sharedData;

    public Thread2(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        while (sharedData.isAlive()) {
            synchronized (sharedData) {
                sharedData.notifyAll();
                try {
                    while (sharedData.getIndex() != 2 && sharedData.isAlive()) {
                        sharedData.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int leng = sharedData.validRollNumber.size();     // khai báo độ dài của chuỗi validRollNoNumber
                if (leng > 0) {
                    Student std = sharedData.getValidRollNumber().get(leng - 1);     // gọi ra thông tin rollNo và chuyền vào Student
                    System.out.println("Welcome student has roll number is : " + std.getRollNo());
                    System.out.println("Valid collection has length : " + leng);

                    // lưu file dạng object
                    FileOutputStream fos = null;
                    ObjectOutputStream oos = null;

                    try {
                        fos = new FileOutputStream("d:/Admin/Java2_advanced/" + std.getRollNo() + ".dat");
                        oos = new ObjectOutputStream(fos);

                        oos.writeObject(std);

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        if (oos != null) {
                            try {
                                oos.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        if (fos != null) {
                            try {
                                fos.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                } else {
                    System.err.println(" khong co rollNo nao hoac lay thong tin tu file loi");
                }
                sharedData.setIndex(1);

            }
            synchronized (sharedData) {
                sharedData.notifyAll();
            }
        }
    }
}
