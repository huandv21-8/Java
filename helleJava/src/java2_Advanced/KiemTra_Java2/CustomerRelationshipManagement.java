package java2_Advanced.KiemTra_Java2;


import java.util.HashMap;
import java.util.Scanner;

public class CustomerRelationshipManagement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Customer> ma = new HashMap<>();
        int choose;
        do {
            showMenu();
            System.out.println("Enter choose: ");
            choose = Integer.parseInt(scan.nextLine());
            switch (choose) {
                case 1:
                    Customer cus = new Customer();
                    cus.input();
                    ma.put(cus.getName(), cus);
                    break;
                case 2:
                    System.out.println("Enter the name to search: ");
                    String name = scan.nextLine();
                    for (String s : ma.keySet()) {
                        if (ma.get(s).name.equalsIgnoreCase(name)) {
                            ma.get(name).display();
                        } else {
                            System.out.println("No customer found");
                        }
                    }
                    break;
                case 3:
                    for (String s : ma.keySet()) {
                        Customer customer = ma.get(s);
                        customer.display();
                    }
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.err.println("error");
                    break;
            }

        } while (choose != 4);
    }

    public static void showMenu() {
        System.out.println("1. Add new customer");
        System.out.println("2. Find by name");
        System.out.println("3. Display all");
        System.out.println("4. Exit");
    }

}
