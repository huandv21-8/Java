package java2_Advanced.BaiTapNgay27_3_2020.Thread_onLuyen;

import java.util.ArrayList;
import java.util.Random;

public class Thread2 extends Thread {

    ArrayList<Character> list2 = new ArrayList<>();

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread2.sleep(2000);
                Random a = new Random();
                int char1 = a.nextInt(25) + 97;
                char char2 = (char) char1;
                list2.add(char2);
                System.out.println("T2: " + char2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
