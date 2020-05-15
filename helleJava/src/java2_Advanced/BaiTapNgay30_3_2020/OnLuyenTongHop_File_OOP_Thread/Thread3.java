package java2_Advanced.BaiTapNgay30_3_2020.OnLuyenTongHop_File_OOP_Thread;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Thread3 extends Thread {
    SharedData sharedData;

    public Thread3(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        while (sharedData.isAlive()) {
            synchronized (sharedData) {
                sharedData.notifyAll();
                try {
                    while (sharedData.getIndex() != 3 && sharedData.isAlive()) {
                        sharedData.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                int leng = sharedData.getUnvalidRollNumber().size();
                String roll = sharedData.getUnvalidRollNumber().get(leng - 1);
                System.out.println("Unvalid roll number: " + roll);

                // ghi file
                FileOutputStream fos = null;
                BufferedOutputStream bfos = null;
                try {
                    fos = new FileOutputStream("d:/Admin/Java2_advanced/unvalid.txt");
                    bfos = new BufferedOutputStream(fos);
                    roll = roll + "\n";
                    byte[] bytes = roll.getBytes();
                    bfos.write(bytes);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (bfos != null) {
                        try {
                            bfos.close();
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
                sharedData.setIndex(1);
            }
            synchronized (sharedData) {
                sharedData.notifyAll();
            }
        }
    }
}
