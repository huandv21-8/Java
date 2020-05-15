package BaiTapNgay16_3_2020.Quan_li_Bai_Do_Xe;

import java.util.*;

public class Zone extends Area {
    ArrayList<Vehicle> listVehicle = new ArrayList<>();
    ArrayList<Area> listArea = new ArrayList<>();
    ArrayList<People> listPeople = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void inputArea() {
        System.out.print("Nhap so khu vuc can them thong tin: ");
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            Area area = new Area();
            area.input();
            listArea.add(area);
        }
    }

    public void inputVehicle() {
        System.out.println("Nhap so xe can them thong tin:");
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("1. nhap thong tin xe Car.");
            System.out.println("2. nhap thong tin xe Container.");
            System.out.print("Chon loai xe: ");
            int a = Integer.parseInt(scan.nextLine());
            Vehicle vehicle;               // tinh da hinh
            if (a == 1) {                    // neu chon 1 thi tao ra 1 xe loai Car
                vehicle = new Car();
            } else {                      // neu ko chon 1 thi tao ra 1 xem loai Container
                vehicle = new Container();
            }
            vehicle.input();               // nhap thong tin cho xe
            listVehicle.add(vehicle);         // va add vao mang
        }
    }

    public void showVehicle() {
        System.out.println("Nhap ten cua chu xe: ");
        String name = scan.nextLine();
        for (int i = 0; i < listPeople.size(); i++) {
            if (listPeople.get(i).name.equalsIgnoreCase(name)) {  //tim nguoi co ten giong ten nhap vao
                for (int j = 0; j < listVehicle.size(); j++) {     // vog for chay qua cac phan tu cua lop xe
                    if (listPeople.get(i).id == listVehicle.get(j).id_chuSoHuu) {
                        // neu id ten nhap trung voi id_chusohuu thi hien thi thong tin xe
                        System.out.println("thong tin xe cua chu so huu cos ten la " + name + " :");
                        listVehicle.get(j).showInfo();
                    }
                }
            }
        }
    }

    public void sapXepTheoDienTich() {   //sap xep theo dien tich xe giam dan
        Collections.sort(listVehicle, new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle vehicle, Vehicle t1) {
                if (vehicle.dienTich() > t1.dienTich()) {
                    return 1;
                }
                return -1;
            }
        });
    }


    public void sort() {     //trong tung khu vuc thi sap xep  giam dan theo dien tich cua xe
        for (int i = 0; i < listArea.size(); i++) {
            sapXepTheoDienTich();
        }
    }


    public void output_Vehicle_DienTich() {   // hien thi thong tin xe cua khu vuc theo thu tu giam dan
        for (int i = 0; i < listArea.size(); i++) {  // vong for chay qua tung khu vuc
            listVehicle.get(i).showInfo();             // hien thi thong tin xe cua khu vuc do
        }
    }
}
