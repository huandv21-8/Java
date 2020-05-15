package java1_Basic.ASSIGNMENT.assignment_15p;


public class Main {
    public static void main(String[] agrs) {
        HinhTRon hinhtron = new HinhTRon(2);
        HinhChuNhat HCN = new HinhChuNhat(3, 4);
        Shape[] list = new Shape[2];

        list[0] = hinhtron;
        list[1] = HCN;

        float tong = tongDienTich(list);

        System.out.println("Tong dien tich = " + tong);
    }

    public static float tongDienTich(Shape[] list) {
        float tongDienTich = 0;
        for (int i = 0; i < list.length; i++) {
            tongDienTich += list[i].tinhDienTich();
        }
        return tongDienTich;
    }
}

