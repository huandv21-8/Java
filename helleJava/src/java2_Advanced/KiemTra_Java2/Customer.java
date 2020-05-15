package java2_Advanced.KiemTra_Java2;

import java.util.Scanner;

public class Customer {
    String name, email;
    int phone;

    public Customer() {
    }

    public Customer(String name, String email, int phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = scan.nextLine();
        System.out.println("Enter email: ");
        email = scan.nextLine();
        System.out.println("Enter phone: ");
        phone = Integer.parseInt(scan.nextLine());
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("");
    }


}
