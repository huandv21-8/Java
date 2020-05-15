package java1_Basic.ASSIGNMENT.assignment1.house.hanoi;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ManagerHouse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int choose;
        ArrayList<HaNoiHouse> list = new ArrayList<>();
        do {
            showMenu();
            System.out.print("Nhập lựa chọn: ");
            choose = Integer.parseInt(scan.nextLine());
            switch (choose) {
                case 1:
                    System.out.print("Nhap n ngoi nha: ");
                    int n = Integer.parseInt(scan.nextLine());
                    for (int i = 0; i < n; i++) {
                        HaNoiHouse hn = new HaNoiHouse();
                        System.out.println("Nhap thong tin ngoi nha thu " + (i + 1) + " :");
                        hn.input();
                        list.add(hn);
                    }
                    break;
                case 2:
                    for (int j = 0; j < list.size(); j++) {
                        System.out.println("Thong tin ngoi nha thu " + (j + 1) + " la: ");
                        list.get(j).display();
                    }
                    break;
                case 3:
                    Collections.sort(list, new Comparator<HaNoiHouse>() {
                        @Override
                        public int compare(HaNoiHouse o1, HaNoiHouse o2) {
                            if (o1.getDiaChi().equalsIgnoreCase(o2.getDiaChi())) {
                                return 1;
                            }
                            return -1;
                        }
                    });
                    for (int i = 0; i < list.size(); i++) {
                        list.get(i).display();
                    }
                    break;
                case 4:
                    System.out.println("Nhap ten dia chi nha can tim: ");
                    String diachi = scan.nextLine();
                    System.out.println("Thong tin ngoi nha can tim la: ");
                    for (int k = 0; k < list.size(); k++) {
                        if (list.get(k).getDiaChi().equalsIgnoreCase(diachi)) {
                            list.get(k).display();
                        } else {
                            System.out.println("Khong tim thay thong tin ngoi nha co dia chi: " + diachi);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Thoat.");
                    break;
                default:
                    System.err.println("Nhap loi !!!");
                    break;
            }
        } while (choose != 5);


    }

    public static void showMenu() {
        System.out.println("*==================*");
        System.out.println("1. Nhập thông tin n ngôi nhà ở Hà Nội.");
        System.out.println("2. Hiển thị thông tin của n ngôi nhà đó.");
        System.out.println("3. Sắp xếp theo trường địa chỉ và hiển thị thông tin sau khi sắp xếp.");
        System.out.println("4. Tìm kiếm nhà theo địa chỉ nhập vào.");
        System.out.println("5. Thoát.");
        System.out.println("*==================*");

    }

}
