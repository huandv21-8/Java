package java2_Advanced.BaiTapNgay25_3_2020.GiaiNen_File.Bai1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterInputStream;
import java.util.zip.InflaterInputStream;

public class ZipFile {
    public static void main(String[] args) throws IOException {
        deflaterFile();
        intlaterFile();
    }

    static void deflaterFile() throws IOException {
        FileInputStream fis = new FileInputStream("D://FPT.txt");
        DeflaterInputStream dis = new DeflaterInputStream(fis);
        FileOutputStream fos = new FileOutputStream("d:/vidu.data");

        int a;
        while ((a = dis.read()) != -1) {
            fos.write(a);
        }

        fis.close();
        dis.close();
        fos.close();

        System.out.println("Nen file ket thuc.");
    }

    static void intlaterFile() throws IOException {
        FileInputStream fis = new FileInputStream("d:/vidu.data");
        InflaterInputStream iis = new InflaterInputStream(fis);
        FileOutputStream fos = new FileOutputStream("D://FPT.txt");

        int a;
        while ((a = iis.read()) != -1) {
            fos.write(a);
        }

        fis.close();
        iis.close();
        fos.close();

        System.out.println("Giai nen file ket thuc.");
    }
}
