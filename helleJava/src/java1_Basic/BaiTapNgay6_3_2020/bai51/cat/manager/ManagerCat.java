package BaiTapNgay6_3_2020.bai51.cat.manager;

import BaiTapNgay6_3_2020.bai51.exam.CatDetail;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ManagerCat {
    ArrayList<CatDetail> listCat = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void input() {

        System.out.println("Nhap vao so meo: ");
        int c = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < c; i++) {
            System.out.println("Nhap thong tin con meo thu: " + (i + 1));
            CatDetail catDetail = new CatDetail();
            listCat.add(catDetail);
            catDetail.input();
        }
    }

    public void output() {
        for (int i = 0; i < listCat.size(); i++) {
            listCat.get(i).output();
        }
    }

    public void sapxep() {
        Collections.sort(listCat, new Comparator<CatDetail>() {
            @Override
            public int compare(CatDetail catDetail, CatDetail t1) {
                return catDetail.getColor().compareToIgnoreCase(t1.getColor());
            }
        });
        output();
    }

    public void seach() {
        System.out.println("Nhap loai ban muon tim kiem: ");
        String loai = scan.nextLine();
        for (int i = 0; i < listCat.size(); i++) {
            if (listCat.get(i).getSpecies().equalsIgnoreCase(loai)) {
                listCat.get(i).output();
            }
        }
    }

}
