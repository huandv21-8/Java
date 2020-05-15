package java1_Basic.javaBasic.Exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double temperature;
        ConversionUtil conversionUtil = new ConversionUtil();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit: ");
        temperature = Double.parseDouble(scan.nextLine());

        temperature = conversionUtil.fahrenheitToCelsius(temperature);
        System.out.println("Celsius: " + temperature);

        System.out.println("Enter temperature in Celsius: ");
        temperature = Double.parseDouble(scan.nextLine());
        temperature = conversionUtil.celciusToFahrenheit(temperature);
        System.out.println("Fahrenheit: " + temperature);
    }
}
