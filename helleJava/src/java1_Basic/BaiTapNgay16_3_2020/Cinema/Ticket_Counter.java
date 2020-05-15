package BaiTapNgay16_3_2020.Cinema;

import java.util.Scanner;

public class Ticket_Counter implements IStatus {
    static enum Status {
        Trong, it_Khach, binh_thuong, rat_dong;
    }

    ;
    Status status;
    String thoi_diem;

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Chọn trạng thái : ");
        System.out.println("1.Vắng khách");
        System.out.println("2.khách hàng ít");
        System.out.println("3.Lượng khách vừa phải");
        System.out.println("4.Đang rất đông");

        int choose = Integer.parseInt(scan.nextLine());

            switch (choose) {
                case 1:
                    status = Status.Trong;
                    break;
                case 2:
                    status = Status.it_Khach;
                    break;
                case 3:
                    status = Status.binh_thuong;
                    break;
                case 4:
                    status = Status.rat_dong;
                    break;
                default:
                    System.err.println("Bạn nhập sai trạng thái !!!");
                    break;
            }

        System.out.println("Nhập thời điểm: ");
        thoi_diem = scan.nextLine();
    }

    @Override
    public void onStatus() {
        System.out.println("thông tin quầy bán vé :");
        switch (status) {
            case Trong:
                System.out.println(" Trống");
                break;
            case it_Khach:
                System.out.println("khách hàng it");
                break;
            case binh_thuong:
                System.out.println("Khách hàng vừa phải");
                break;
            case rat_dong:
                System.out.println("Đang rất đông");
                break;
            default:
                break;
        }
        System.out.println(" Thời điểm là: " + thoi_diem);
        System.out.println("");
    }
}
