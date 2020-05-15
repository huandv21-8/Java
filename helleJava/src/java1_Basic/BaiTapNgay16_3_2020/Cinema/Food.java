package BaiTapNgay16_3_2020.Cinema;

import java.util.Scanner;

public class Food implements IStatus {


    static enum Status {
        trong, it_khach, vua_phai, rat_dong
    }

    ;


    Status status;
    String thoi_diem;

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Chọn trạng thái : ");
        System.out.println("1.Vắng khách");
        System.out.println("2.Khách hàng it");
        System.out.println("3.Lượng khách vừa phải");
        System.out.println("4.Rất đông");
        int c;
        c = Integer.parseInt(scan.nextLine());
        switch (c) {
            case 1:
                status = Status.trong;
                break;
            case 2:
                status = Status.it_khach;
                break;
            case 3:
                status = Status.vua_phai;
                break;
            case 4:
                status = Status.rat_dong;
                break;
            default:
                break;
        }
        System.out.println("Nhập thời điểm : ");
        thoi_diem = scan.nextLine();
        System.out.println("");
    }

    @Override
    public void onStatus() {

        System.out.println("thông tin quầy bán đồ ăn:");
        switch (status) {
            case trong:
                System.out.println("Vắng khách");
                break;
            case it_khach:
                System.out.println("Khách hàng it");
                break;
            case vua_phai:
                System.out.println("Lượng khách vừa phải");
                break;
            case rat_dong:
                System.out.println("Đang rất đông");
                break;
            default:
                System.err.println("Bạn nhập sai trạng thái !!!");
                break;
        }
        System.out.print("Thời điểm là: " + thoi_diem);
    }
}
