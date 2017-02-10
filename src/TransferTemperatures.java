import java.util.Scanner;

public class TransferTemperatures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру в градусах Цельсия: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = convertToFahrenheit(celsius);
        System.out.printf("Температура в градусах Фаренгейта: %.2f%n", fahrenheit);
        double kelvin = convertToKelvin(celsius);
        System.out.printf("Температура в градусах Кельвинах: %.2f%n", kelvin);
    }

    public static double convertToFahrenheit(double celsiusToFahrenheit) {
        return celsiusToFahrenheit * 1.8 + 32;
    }

    public static double convertToKelvin(double celsiusToKelvin) {
        return celsiusToKelvin + 273.15;
    }
}
