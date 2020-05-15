package BaiTapNgay16_3_2020.Cinema;

import java.util.Scanner;

public class Parking implements IStatus {
    static enum Status {
        trong, it, vua, full
    }

    ;
    Status status;
    String thoi_diem;

    public void input() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Chọn trạng thái : ");
        System.out.println("1.Vắng khách");
        System.out.println("2.Còn ít chỗ");
        System.out.println("3.Bình thường");
        System.out.println("4.Hết chỗ");

       int choose = Integer.parseInt(scan.nextLine());
        switch (choose) {
            case 1:
                status = Status.trong;
                break;
            case 2:
                status = Status.it;
                break;
            case 3:
                status = Status.vua;
                break;
            case 4:
                status = Status.full;
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
        System.out.println("thông tin chỗ gửi xe: ");
        switch (status) {
            case trong:
                System.out.println("Trống");
                break;
            case it:
                System.out.println("Còn ít chỗ");
                break;
            case vua:
                System.out.println("Bình thường");
                break;
            case full:
                System.out.println("Hết chỗ");
                break;
            default:
                System.err.println("Bạn nhập sai trạng thái !!!");
                break;
        }
        System.out.print("Thời điểm là: " + thoi_diem);
        System.out.println("");
    }
}
