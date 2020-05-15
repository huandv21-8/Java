package java1_Basic.javaBasic.Exercise1;

public class ConversionUtil {
    public double fahrenheitToCelsius(double fDegree) {
        double cDegree = 5 * (fDegree - 32) / 9;
        return cDegree;
    }

    public double celciusToFahrenheit(double cDegree) {
        double fDegree = (9 * cDegree / 5) + 32;
        return fDegree;
    }
}