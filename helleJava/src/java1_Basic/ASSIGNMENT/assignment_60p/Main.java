package java1_Basic.ASSIGNMENT.assignment_60p;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<IInfor> list = new ArrayList<>();
        People people = new People();
        people.input();
        list.add(people);
        Car car = new Car();
        car.input();
        list.add(car);
        showInfor(list);
    }

    public static void showInfor(ArrayList<IInfor> a) {
        for (int i = 0; i < a.size(); i++) {
            a.get(i).showInpor();
        }
    }
}
