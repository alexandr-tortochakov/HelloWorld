import java.util.Locale;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Введите длину прямоугольника: ");
        double length = scanner.nextDouble();
        System.out.print("Введите ширину прямоугольника: ");
        double width = scanner.nextDouble();

        double perimeter = (length + width) * 2;
        double area = length * width;
        System.out.printf("Периметр прямоугольника = %.2f. Площадь прямоугольника = %.2f", perimeter, area);
    }
}
