package BaiTapNgay16_3_2020.Cinema;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<IStatus> statusList = new ArrayList<>();
        inputStatus(statusList);
        followStatus(statusList);
    }

    public static void inputStatus(ArrayList<IStatus> statusList) {

        //3 quầy bán vé
        for (int i = 0; i < 3; i++) {
            System.out.println("Nhập thông tin phòng vé thứ " + (i + 1) + " :");
            Ticket_Counter tc = new Ticket_Counter();
            tc.input();
            statusList.add(tc);

        }
        // 2 bãi đỗ xe
        System.out.println("Nhập thông tin cho bãi đỗ xe 1: ");
        Parking parking1 = new Parking();
        parking1.input();
        statusList.add(parking1);
        System.out.println("Nhập thông tin cho bãi đỗ xe 2: ");
        Parking parking2 = new Parking();
        parking2.input();
        statusList.add(parking2);

        //2 quầy bán đồ ăn
        System.out.println("Nhập thông tin cho quầy đồ ăn 1: ");
        Food food1 = new Food();
        food1.input();
        statusList.add(food1);
        System.out.println("Nhập thông tin cho quầy đồ ăn 2: ");
        Food food2 = new Food();
        food2.input();
        statusList.add(food2);

        // 5 phòng chiếu phim
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin cho phòng chiếu phim " + (i + 1) + " :");
            MovieRoom movieRoom = new MovieRoom();
            statusList.add(movieRoom);
            movieRoom.input();
        }
    }

    public static void followStatus(ArrayList<IStatus> statusList) {
        for (IStatus iStatus : statusList) {
            iStatus.onStatus();
        }
    }
}

