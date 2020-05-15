package BaiTapNgay4_3_2020.Bai44.Cau2;

import java.util.*;

public class ProductMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choose;
        ArrayList<Product> list = new ArrayList<>();
        do {
            showMenu();
            choose = scan.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("nhập số sản phẩm N: ");
                    int n = scan.nextInt();
                    for (int i = 0; i < n; i++) {
                        Product product = new Product();
                        System.out.println("Them san pham thu " + (i+1) + " : ");
                        product.input();
                        list.add(product);
                    }
                    break;
                case 2:
                    for (int i = 0; i < list.size(); i++) {
                        list.get(i).output();
                    }
                    break;
                case 3:
                    Collections.sort(list, new Comparator<Product>() {
                        @Override
                        public int compare(Product t0, Product t1) {
                            if (t0.getPrice() < t1.getPrice()) {
                                return 1;
                            }
                            return -1;
                        }
                    });
                    for (int i = 0; i < list.size(); i++) {
                        list.get(i).output();
                    }
                    break;
                case 4:
                    System.out.println("thoat..");
                    break;
                default:
                    System.err.println("nhap loi !!!");
                    break;
            }

        } while (choose != 4);

    }

    public static void showMenu() {
        System.out.println("1.Nhập thông tin cho n sản phẩm");
        System.out.println("2.Hiển thị thông tin vừa nhập");
        System.out.println("3.Sắp xếp thông tin giảm dần theo giá và hiển thị");
        System.out.println("4. Thoát.");
        System.out.print("Nhap lua chon: ");
    }
}
