package BaiTapNgay26_2_2020;



import java.util.Scanner;

public class Bai40 {
    public static void main(String[] args) {
        String h[] = new String[5];
        int choose;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Nhập thông tin: ");
            System.out.println("2. Hiển thị thông tin: ");
            System.out.println("3. Thoát");
            System.out.print("Choose: ");
             choose = scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Vui lòng nhập thông tin: ");

                    System.out.println("Nhập tên của bạn: ");
                    h[0]= scanner.nextLine();

                    scanner.nextLine();
                    System.out.println("Nhập tuổi của bạn: ");
                    h[1] = scanner.nextLine();


                    System.out.println("Nhập địa chỉ của bạn: ");
                    h[2] = scanner.nextLine();


                    System.out.println("Nhập sđt của bạn: ");
                    h[3] = scanner.nextLine();


                    System.out.println("Nhập email của bạn: ");
                    h[4] = scanner.nextLine();
                    break;
                case 2:
                   System.out.println("Họ tên: " + h[0] + ", tuổi: " + h[1] + ",địa chỉ: " + h[2] + ", email:" + h[4] + ", sđt: " + h[3]);
                    break;
                case 3:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Lỗi!!!!");
                    break;
            }
        }while (choose !=3);
    }
}
