package BaiTapNgay6_3_2020.Bai58;

public class AnimalTest {

    public static void main(String[] args) {
        inputDataForAnimal();
        displayDataForAnimal();
    }

    private static void inputDataForAnimal() {
        Animal[] animals = new Animal[3];
        animals[0] = new Animal();
        animals[0].input();

        animals[1] = new Chicken();
        animals[1].input();

        animals[2] = new Cat();
        animals[2].input();
    }

    private static void displayDataForAnimal() {
        Animal[] animals = new Animal[3];
        animals[0].output();
        animals[1].output();
        animals[2].output();

    }


}