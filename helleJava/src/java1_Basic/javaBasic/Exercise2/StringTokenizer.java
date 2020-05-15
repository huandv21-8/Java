package javaBasic.Exercise2;

import java.util.Scanner;

public class StringTokenizer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter text: ");
        String text = scan.nextLine();
        String[] name = text.split(" ");

        for (String mName: name) {
            System.out.println(mName);
        }
    }
}
