package java1_Basic.BaiTapNgay13_3_2020.COVID_19;

import java.util.ArrayList;
import java.util.Scanner;

public class ABC {
    Scanner scan = new Scanner(System.in);
    ArrayList<Citizen> list = new ArrayList<>();

    public void input() {

        System.out.println("Nhap so nguoi muon them: ");
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin nguoi thu " + (i + 1) + " :");
            Citizen citizen = new Citizen();
            list.add(citizen);
            citizen.nhap();
        }
    }

    public void searchName() {
        System.out.println("Nhap ten can tim: ");
        String name = scan.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.equalsIgnoreCase(name)) {
                list.get(i).hienThi();
                break;
            } else {
                System.out.println("Khong tim thay.");
            }
        }
    }

    public void searchCMND() {
        System.out.println("Nhap cmnd can tim: ");
        String cmnd = scan.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).cmnd.equalsIgnoreCase(cmnd)) {
                list.get(i).hienThi();
            } else {
                System.out.println("khong tim thay.");
            }
        }
    }

    public void ThietLapTinhTrang() {
        System.out.println("Nhap so cmnd can thiet lap: ");
        String cmnd = scan.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).cmnd.equalsIgnoreCase(cmnd)) {
                System.out.println("1.Binh Thuong");
                System.out.println("2.Tiếp xúc vs bệnh nhân");
                System.out.println("3.Dương tính vs COVID-19");
                System.out.println("Chọn tình trạng sức khỏe: ");
                int n = Integer.parseInt(scan.nextLine());
                switch (n) {
                    case 1:
                        list.get(i).tinhTrang = "Binh Thuong";
                        break;
                    case 2:
                        list.get(i).tinhTrang = "tiếp xúc vs bệnh nhân";
                        break;
                    case 3:
                        list.get(i).tinhTrang = "dương tính vs COVID-19";
                        break;
                    default:
                        System.out.println("loi..");
                        break;
                }
            } else {
                System.out.println("Ko tim thay.");
            }
        }
    }

    public void ThietLapLoTrinh() {
        System.out.println("Nhap so cmnd can thiet lap: ");
        String cmnd = scan.nextLine();
        for (int i = 0; i < list.size(); i++) {
            Citizen citizen = new Citizen();
            if (list.get(i).cmnd.equalsIgnoreCase(cmnd) && list.get(i).tinhTrang == "dương tính vs COVID-19") {
                System.out.println("Nhap so dia danh đa tung toi: ");
                int n = Integer.parseInt(scan.nextLine());
                for (int j = 0; j <n ; j++) {
                    list.get(i).loTrinh[j] = scan.nextLine();
                }
            }
        }
    }

    public void display() {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).tinhTrang == "dương tính vs COVID-19") {
                System.out.println("Danh sách nguoi duong tinh voi COVID-19: ");
                list.get(i).hienThi();
            }
        }
    }

    public void display1() {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).tinhTrang == "tiếp xúc vs bệnh nhân") {
                System.out.println("Danh sách nguoi dang duoc theo doi: ");
                list.get(i).hienThi();
            }
        }
    }

    public void case6() {
        System.out.println("Nhap cmnd can tim: ");
        String cmnd = scan.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).cmnd.equalsIgnoreCase(cmnd)) {
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(i).diaChiThuongChu == list.get(j).loTrinh[j]) {
                        list.get(i).tinhTrang = "Dang theo doi";
                    }
                }
            }
        }
    }
}
