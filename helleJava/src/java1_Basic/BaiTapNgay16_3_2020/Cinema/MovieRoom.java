package BaiTapNgay16_3_2020.Cinema;

import java.util.Scanner;

public class MovieRoom implements IStatus {

    int seats, seatsUse;
    String time;

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tổng số ghế: ");
        seats = Integer.parseInt(scan.nextLine());
        for (; ; ) {

            System.out.println("Số ghế đang dùng : ");
            seatsUse = Integer.parseInt(scan.nextLine());
            if (seatsUse > seats) {
                System.err.println("Số ghế đang dùng không được lớn hơn tổng số ghế !!!");
            } else {
                break;
            }
        }
        System.out.println("Nhập thời điểm : ");
        time = scan.nextLine();
        System.out.println("");

    }

    @Override
    public void onStatus() {
        System.out.println("thông tin phòng chiếu phim:");
        System.out.println("Tổng số ghế là:  " + seats);
        System.out.println("Số ghế đã dùng  là: " + seatsUse);
        System.out.println("Thời điểm là : " + time);
        System.out.println("");
    }

}
