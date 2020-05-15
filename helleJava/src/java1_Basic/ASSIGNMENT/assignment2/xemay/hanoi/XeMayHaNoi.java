package java1_Basic.ASSIGNMENT.assignment2.xemay.hanoi;
import java1_Basic.ASSIGNMENT.assignment2.xeco.info.XeMay;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class XeMayHaNoi extends XeMay {
    Scanner scan = new Scanner(System.in);
    int n;
    ArrayList<XeMay> list = new ArrayList<>();

    public XeMayHaNoi() {
    }

    public XeMayHaNoi(String bienso, String loaixe, String mauxe, float giatien, Scanner scan, int n, ArrayList<XeMay> list) {
        super(bienso, loaixe, mauxe, giatien);
        this.scan = scan;
        this.n = n;
        this.list = list;
    }

    @Override
    public void nhap() {
        System.out.print("Nhap so xe: ");
        n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            XeMay xm = new XeMay();
            System.out.println("Nhap thong tin xe thu " + (i + 1) + " :");
            xm.nhap();
            list.add(xm);
        }
    }

    @Override
    public void hienthi() {
        for (int j = 0; j < list.size(); j++) {
            System.out.println("xe thu: "+(j+1));
            list.get(j).hienthi();
        }
    }

    public void sapxep() {
        Collections.sort(list, new Comparator<XeMay>() {
            @Override
            public int compare(XeMay xeMay, XeMay t1) {
                if (xeMay.getBienso().equalsIgnoreCase(t1.getBienso())) {
                    return -1;
                }
                return 1;
            }
        });
        hienthi();
    }

    public void timkiem(){
        System.out.println("Nhap bien so xe can tim: ");
        String biensoxe=scan.nextLine();
        for (int k = 0 ; k<list.size();k++){
            if (list.get(k).getBienso().equalsIgnoreCase(biensoxe)){
                list.get(k).hienthi();
            }
            System.out.println("Khong tim thay xe co bien so "+biensoxe);
        }
    }

    public void thongKe(){
        System.out.println("Thong ke thong tin cac xe dang quan ly tai Ha Noi: ");
        hienthi();
    }
}
