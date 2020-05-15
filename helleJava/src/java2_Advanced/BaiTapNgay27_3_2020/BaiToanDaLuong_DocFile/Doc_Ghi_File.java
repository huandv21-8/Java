package java2_Advanced.BaiTapNgay27_3_2020.BaiToanDaLuong_DocFile;

import java.io.*;
import java.util.Random;

public class Doc_Ghi_File {

    Random random = new Random();
    Data data;

    public void ghiFile() {
        FileWriter fos = null;
        BufferedWriter bos = null;

        {
            try {
                fos = new FileWriter("d:/Admin/Java2_advanced/number.txt");
                bos = new BufferedWriter(fos);


                int rad = random.nextInt(91) + 10;

                for (int i = 0; i < rad ; i++) {
                    int rad2 = random.nextInt(499) + 1;
                }

                String line = data.Line(rad,5);
                    byte[] bytes = line.getBytes("UTF-8");
                    bos.write(String.valueOf(bytes));

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (bos != null) {
                    try {
                        bos.close();
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
        }
    }


}
